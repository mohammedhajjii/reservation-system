package hajji.mohammed.backend.web;


import hajji.mohammed.backend.dtos.JurorRequestDTO;
import hajji.mohammed.backend.dtos.JurorResponseDTO;
import hajji.mohammed.backend.dtos.MemberDTO;
import hajji.mohammed.backend.dtos.SessionDTO;
import hajji.mohammed.backend.services.SessionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@AllArgsConstructor
@CrossOrigin("*")
public class AdminRestController {
    private final SessionService sessionService;


    @PostMapping("/sessions/add")
    public SessionDTO saveSession(@RequestBody SessionDTO sessionDTO){
        return sessionService.saveNewSession(sessionDTO);
    }

    @PostMapping("/juror/add")
    public JurorResponseDTO saveJuror(@RequestBody JurorRequestDTO jurorRequestDTO){
        return sessionService.saveNewJuror(jurorRequestDTO);
    }


    @PostMapping("/sessions/add-member")
    public MemberDTO addMember(@RequestBody MemberDTO memberDTO){
        return sessionService.addJurorToSession(memberDTO);
    }


    @PutMapping("reservations/confirm/{id}")
    public void confirmReservation(@PathVariable("id") Long reservationId){
        sessionService.ConfirmReservation(reservationId);
    }
}
