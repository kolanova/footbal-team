package football.team.service;

import football.team.model.Player;
import football.team.repository.PlayerRepository;
import org.springframework.stereotype.Service;

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
