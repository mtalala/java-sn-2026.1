package br.projeto.nuvem;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.Map;

@RestController
@RequestMapping("/api/mission")
@CrossOrigin(origins = "http://localhost:3000")
public class MissionController {

    @PostMapping
    public Map<String, String> sendMission() throws InterruptedException {

        return Map.of(
            "message", "Olá, Terra! Recebemos sua mensagem e estamos prontos para conhecê-los!"
        );
    }
}