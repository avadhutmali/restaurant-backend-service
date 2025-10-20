package restaurant.backend.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Cart {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
        name="cart_items",
        joinColumns= @JoinColumn(name="cart_id"),
        inverseJoinColumns= @JoinColumn(name = "menu_item_id")
        
    )
    private List<MenuItems> items;

}
