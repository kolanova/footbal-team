package service;

import org.springframework.stereotype.Service;
import repository.ShoeRepository;

@Service
public class ShoeService {
    private final ShoeRepository shoeRepository;

    public ShoeService(ShoeRepository shoeRepository) {
        this.shoeRepository = shoeRepository;
    }
}
