package com.projectW.DTO;

import java.io.Serializable;

import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.Length;

import com.projectW.Services.validation.ClienteInsert;

@ClienteInsert
public class ClienteNewDTO implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@javax.validation.constraints.NotEmpty(message="Preenchimento obrigatório.")
	@Length(min=5, max=80, message="Tamanho mínimo = 5 e máximo = 100 caracteres")
	private String nome;
	
	@javax.validation.constraints.NotEmpty(message="Preenchimento obrigatório.")
	@Email(message="Email inválido.")
	private String email;
	
	@javax.validation.constraints.NotEmpty(message="Preenchimento obrigatório.")
	private String cpfOuCnpj;
	private Integer tipo;//tipo cliente
	
	@javax.validation.constraints.NotEmpty(message="Preenchimento obrigatório.")
	private String logradouro;
	
	@javax.validation.constraints.NotEmpty(message="Preenchimento obrigatório.")
	private String numero;
	private String complemento;
	private String bairro;
	
	@javax.validation.constraints.NotEmpty(message="Preenchimento obrigatório.")
	private String cep;
	
	@javax.validation.constraints.NotEmpty(message="Preenchimento obrigatório.")
	private String telefone;
	private String telefone2;
	private String telefone3;
	
	private Integer cidadeId;
	
	public ClienteNewDTO() {}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpfOuCnpj() {
		return cpfOuCnpj;
	}

	public void setCpfOuCnpj(String cpfOuCnpj) {
		this.cpfOuCnpj = cpfOuCnpj;
	}

	public Integer getTipo() {
		return tipo;
	}

	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getTelefone3() {
		return telefone3;
	}

	public void setTelefone3(String telefone3) {
		this.telefone3 = telefone3;
	}

	public Integer getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Integer cidadeId) {
		this.cidadeId = cidadeId;
	}
	
	
	
}
