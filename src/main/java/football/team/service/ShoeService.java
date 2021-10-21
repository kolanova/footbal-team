package football.team.service;

import football.team.repository.ShoeRepository;
import org.springframework.stereotype.Service;

@Service
public class ShoeService {
    private final ShoeRepository shoeRepository;

    public ShoeService(ShoeRepository shoeRepository) {
        this.shoeRepository = shoeRepository;
    }
}
