package hajji.mohammed.backend.services;

import hajji.mohammed.backend.dtos.*;
import hajji.mohammed.backend.entities.Session;

import java.util.List;

public interface SessionService {
    SessionDTO saveNewSession(SessionDTO sessionDTO);
    JurorResponseDTO saveNewJuror(JurorRequestDTO jurorRequestDTO);

    MemberDTO addJurorToSession(MemberDTO memberDTO);

    InterimDTO saveNewSlot(InterimDTO slotDTO);

    void ConfirmReservation(Long reservationId);

    List<Session> getSessionList();

    SessionDTO getSessionById(Long sessionId);
}
