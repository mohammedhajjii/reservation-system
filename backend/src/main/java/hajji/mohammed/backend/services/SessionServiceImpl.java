package hajji.mohammed.backend.services;

import hajji.mohammed.backend.dtos.*;
import hajji.mohammed.backend.entities.*;
import hajji.mohammed.backend.enums.ReservationStatus;
import hajji.mohammed.backend.enums.UserRole;
import hajji.mohammed.backend.repositories.*;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Comparator;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class SessionServiceImpl implements SessionService {

    private final SessionRepository sessionRepository;
    private final InterimRepository interimRepository;
    private final JurorRepository jurorRepository;
    private final ReservationRepository reservationRepository;
    private final ModelMapper modelMapper;
    private final MemberRepository memberRepository;

    @Override
    public SessionDTO saveNewSession(SessionDTO sessionDTO)  {
        Session session = modelMapper.map(sessionDTO, Session.class);
        sessionRepository.save(session);
        return modelMapper.map(session, SessionDTO.class);
    }

    @Override
    public JurorResponseDTO saveNewJuror(JurorRequestDTO jurorRequestDTO) {
        Juror juror = modelMapper.map(jurorRequestDTO, Juror.class);
        juror.setUsername(juror.getName());
        juror.setPassword("6777");
        juror.setUserRole(UserRole.JUROR);
        jurorRepository.save(juror);
        return modelMapper.map(juror, JurorResponseDTO.class);
    }

    @Override
    public MemberDTO addJurorToSession(MemberDTO memberDTO) {
        Session session = sessionRepository.findById(memberDTO.getSessionId()).orElseThrow(() -> new RuntimeException("no session present"));
        Juror juror = jurorRepository.findById(memberDTO.getJurorId()).orElseThrow(() -> new RuntimeException("no juror"));

        Member member = Member.builder()
                .session(session)
                .juror(juror)
                .jurorJurorRole(memberDTO.getJurorRole())
                .build();

        memberRepository.save(member);

        return memberDTO;
    }

    @Override
    public InterimDTO saveNewSlot(InterimDTO slotDTO) {
        Session session = sessionRepository.findById(slotDTO.getSessionId()).orElseThrow(() -> new RuntimeException("no session present"));
        Interim interim = Interim.builder()
                .session(session)
                .startTime(slotDTO.getStartTime())
                .endTime(slotDTO.getEndTime())
                .maxReservation(slotDTO.getMaxReservation())
                .build();

        interimRepository.save(interim);
        slotDTO.setSlotId(interim.getId());
        return slotDTO;
    }

    @Override
    public void ConfirmReservation(Long reservationId) {
        Reservation reservation = reservationRepository.findById(reservationId).orElseThrow(() -> new RuntimeException("No reservation"));
        reservation.setReservationStatus(ReservationStatus.CONFIRMED);
    }


    @Override
    public List<Session> getSessionList(){
        return sessionRepository.findAll()
                .stream()
                .sorted(Comparator.comparing(Session::getSessionDate))
                .toList();
    }


    @Override
    public SessionDTO getSessionById(Long sessionId){
        Session session = sessionRepository.findById(sessionId).orElseThrow(() -> new RuntimeException("no session"));
        return modelMapper.map(session, SessionDTO.class);
    }
}
