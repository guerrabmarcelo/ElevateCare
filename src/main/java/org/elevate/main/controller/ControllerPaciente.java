package org.elevate.main.controller;

import java.util.List;

import javax.validation.Valid;

import org.elevate.main.entity.Paciente;
import org.elevate.main.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ControllerPaciente {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	
	@PostMapping("/cadastrarPaciente")
	public String cadastrarPaciente(@RequestParam(required = false) String nomeCompleto, @RequestParam (required = false) String cpf,
			@RequestParam (required = false) String dataNasc, @RequestParam (required = false) char sexo, @RequestParam (required = false) String rg,
			@RequestParam (required = false) String orgaoExp, @RequestParam (required = false) String ufOE, @RequestParam (required = false) String endereco,
			@RequestParam (required = false)String numero, @RequestParam (required = false)String complemento, @RequestParam (required = false) String bairro,
			@RequestParam (required = false)String municipio, @RequestParam (required = false) String uf, @RequestParam (required = false) String cep,
			@RequestParam (required = false) String telefone, @RequestParam (required = false) String telefone2, @RequestParam (required = false) String email,
			@RequestParam (required = false) String mae, @RequestParam  (required = false) String pai) {
		Paciente paciente = new Paciente(nomeCompleto, cpf, dataNasc, sexo, rg, orgaoExp, ufOE, endereco,
				numero, complemento, bairro, municipio, uf, cep, telefone, telefone2, email, mae, pai);
				
		pacienteRepository.save(paciente);
		
		return "redirect:/listar";
	}
	
	@GetMapping("/")
	public String home() {
		
		return "home";
	}

	@GetMapping("/cadastrar")
	public String cadastrarPaciente() {
		
		return "cadastrar";
	}

	//Lista os pacientes
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Paciente> pacientes = pacienteRepository.findAll();
    	
        model.addAttribute("pacientes", pacientes);
		
		return "listar";
	}
	//Deleta o paciente
	@GetMapping("delete/{id}")
    public String delete(@PathVariable(name = "id") int id, Model model) {

        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid person Id:" + id));
        
        pacienteRepository.delete(paciente);
        return "redirect:/listar";
	}

	// Acessa o formulario de edição
    @GetMapping("form/{id}")
    public String mostrarPaciente(Model model, @PathVariable(name = "id") int id) {

        Paciente paciente = pacienteRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid person Id:" + id));
       
        model.addAttribute("paciente", paciente);
        return "atualizar";
	}

	// Atualiza o paciente
    @PostMapping("update/{id}")
    public String alterarPaciente(@Valid Paciente paciente, BindingResult result, @PathVariable int id) {

        if (result.hasErrors()) {
            return "redirect:/listar";
        }
        
        pacienteRepository.save(paciente);
        return "redirect:/listar";
    }
}
