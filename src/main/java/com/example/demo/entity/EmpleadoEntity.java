package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "tb_empleado")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoEntity {

	
	@Id
	@Column(name = "dni_empleado", nullable = false, length = 8, unique = true)
	private String empleadoDni;
	
	@Column(name = "nombre_empleado", nullable = false, length = 45)
	private String nomEmpleado;
	
	@Column(name = "apellido_empleado", nullable = false, length = 45)
	private String apellidoEmpleado;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	@DateTimeFormat(iso = ISO.DATE)
	private LocalDate fechNac;
	
	@Column(name = "direccion", nullable = false)
	private String dirEmpleado;
	
	@Column(name = "correo", nullable = false)
	private String correoEmpleado;
	
	@ManyToOne
	@JoinColumn(name = "fk_area", nullable = false)
	private AreaEntity idArea;
	
	
}
