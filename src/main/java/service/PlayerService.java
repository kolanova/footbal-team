package service;

import controller.request.PlayerRQ;
import model.Player;
import org.springframework.stereotype.Service;
import repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }
    public List<Player> findAll(){return playerRepository.findAll();}
    public Optional<Player> findById(Long id) {return playerRepository.findById(id);}

}
