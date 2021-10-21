package football.team.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import football.team.service.PlayerService;


@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;
    public PlayerController(PlayerService playerService) {this.playerService = playerService;}

}
