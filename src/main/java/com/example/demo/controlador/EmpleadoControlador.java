package com.example.demo.controlador;



import java.util.List;

import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.AreaEntity;
import com.example.demo.entity.EmpleadoEntity;
import com.example.demo.repositorio.AreaRepositorio;
import com.example.demo.repositorio.EmpleadoRepositorio;


@Controller
public class EmpleadoControlador {
	
	
	@Autowired
	private AreaRepositorio areaRepositorio;
	
	@Autowired
	private EmpleadoRepositorio empleadoRepositorio;
	
	
	@GetMapping("/empleados")
	public String home(Model model) {
		List<EmpleadoEntity> listaEmpleado = empleadoRepositorio.findAll();
		
		model.addAttribute("listarEmpleado", listaEmpleado);
		
		return "home";
		
	}
	
	
	@GetMapping("/registrar_empleado")
	public String showRegistrarEmpleado(Model model) {
		
		List<AreaEntity> listaArea = areaRepositorio.findAll();
		
		model.addAttribute("empleado", new EmpleadoEntity());
		
		model.addAttribute("listaArea", listaArea);
		
		
		return "registrar_empleado";
	}
	
	
	@PostMapping("/registrar_empleado")
	public String registrarEmpleado(@ModelAttribute EmpleadoEntity empleado, Model model) {
		
		empleadoRepositorio.save(empleado);
		
		return "redirect:/empleados";
	}
	
	
	
	@GetMapping("/editar_empleado/{dni}")
	public String showeditarEmpleado(Model model, @PathVariable("dni") String dni) {
		
		
		EmpleadoEntity encontrarEmpleado = empleadoRepositorio.findById(dni).get();
		
		model.addAttribute("empleado", encontrarEmpleado);
		
		return "registrar_empleado";
		
	}
	
	
	
	@GetMapping("/eliminar_empleado/{dni}")
	public String eliminarUsuario(@PathVariable("dni") String dni) {
		empleadoRepositorio.deleteById(dni);
		
		return "redirect:/empleados";
	}
	
	
}
