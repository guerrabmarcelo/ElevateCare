package org.elevate.main.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class Paciente {
	
	public Paciente(String nomeCompleto, String cpf, String dataNasc, char sexo,
			String rg, String orgaoExp, String ufOE, String endereco, String numero,
			String complemento, String bairro, String municipio, String uf, String cep,
			String telefone, String telefone2, String email, String mae, String pai) {
		
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.dataNasc = dataNasc;
		this.sexo = sexo;
		this.rg = rg;
		this.orgaoExp = orgaoExp;
		this.ufOE = ufOE;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.municipio = municipio;
		this.uf = uf;
		this.cep = cep;
		this.telefone = telefone;
		this.telefone2 = telefone2;
		this.email = email;
		this.mae = mae;
		this.pai = pai;
		
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nomeCompleto;
	private String cpf;
	private String dataNasc;
	private char sexo;
	private String rg;
	private String orgaoExp;
	private String ufOE;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private String municipio;
	private String uf;
	private String cep;
	private String telefone;
	private String telefone2;
	private String email;
	private String mae;
	private String pai;

}
