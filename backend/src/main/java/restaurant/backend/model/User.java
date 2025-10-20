package restaurant.backend.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class User {
    
    @Id
    @GeneratedValue
    private Long userId;

    private String name;
    private String address;
    private String phoneNumber;

    @OneToOne(mappedBy = "user",cascade=CascadeType.ALL)
    private Cart cart;
}
