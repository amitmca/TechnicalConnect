package net.javaguides.springboot.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String email;

}
