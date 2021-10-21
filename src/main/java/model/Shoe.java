package model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name ="Shoe")
@Entity
public class Shoe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToMany
    @JoinTable(
            name="players_shoes",
            joinColumns = @JoinColumn(name="shoe_id"),
            inverseJoinColumns = @JoinColumn(name="player_id")
    )
    private String name;
    private Set<Player> playerShoes = new HashSet<>();
}
