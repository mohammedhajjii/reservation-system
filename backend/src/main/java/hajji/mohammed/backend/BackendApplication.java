package hajji.mohammed.backend;

import hajji.mohammed.backend.dtos.JurorRequestDTO;
import hajji.mohammed.backend.dtos.JurorResponseDTO;
import hajji.mohammed.backend.dtos.SessionDTO;
import hajji.mohammed.backend.enums.SessionPeriod;
import hajji.mohammed.backend.services.SessionService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }


    @Bean
    CommandLineRunner start(SessionService sessionService){
        return args -> {

            SessionDTO sessionDTO = new SessionDTO();
            sessionDTO.setSessionDate(new Date());
            sessionDTO.setSessionPeriod(SessionPeriod.MORNING);
            sessionService.saveNewSession(sessionDTO);

            System.out.println(sessionDTO);

            JurorRequestDTO requestDTO = new JurorRequestDTO();
            requestDTO.setName("AZeddine");
            requestDTO.setEmail("azz@gmail.com");
            requestDTO.setSpeciality("Blockchain");
            JurorResponseDTO jurorResponseDTO = sessionService.saveNewJuror(requestDTO);
            System.out.println(jurorResponseDTO);





        };
    }

}
