package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.*;
import java.util.List;


@Entity
@Table(name = "tb_area")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AreaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "area_id", nullable = false)
	private int idArea;
	
	
	@Column(name = "nombre_area", nullable = false, length = 45)
	private String nomArea;
	
}
