package com.example.demo.entity;

import java.util.Date;

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
	@Column(name = "dni_empleado", nullable = false, length = 8)
	private String empleadoDni;
	
	@Column(name = "nombre_empleado", nullable = false, length = 45)
	private String nomEmpleado;
	
	@Column(name = "apellido_empleado", nullable = false, length = 45)
	private String apellidoEmpleado;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechNac;
	
	@Column(name = "direccion", nullable = false)
	private String dirEmpleado;
	
	@Column(name = "correo", nullable = false)
	private String correoEmpleado;
	
	@ManyToOne
	@JoinColumn(name = "fk_area", nullable = false)
	private AreaEntity idArea;
	
	
}
