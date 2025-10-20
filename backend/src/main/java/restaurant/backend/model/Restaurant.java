package restaurant.backend.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Restaurant {
    
    private String restuarantName;
    private String address;

    @OneToMany(mappedBy="restaurant",cascade=CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MenuItems> menu;
}
