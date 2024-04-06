package pl.coderslab;


import lombok.*;
import lombok.Data;

@AllArgsConstructor
@Data
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
}
