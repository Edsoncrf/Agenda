package br.com.ed.agenda.model;

//import java.math.BigInteger;



public class Contato{
	//private BigInteger idContato;
	private String nome;
	private String endereco;
	private int telefone1;
	private int telefone2;
	private String email;
	private String datanasc;		
	private String profissao;
	private String sexo;
	private boolean estadocivil;
	private String escolaridade;
	
	public Contato(String nome,String endereco,int telefone1,int telefone2,String email,String datanasc,String profissao,String sexo,boolean estadocivil,String escolaridade) {
		// TODO Auto-generated constructor stub
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setTelefone1(telefone1);
		this.setTelefone2(telefone2);
		this.setEmail(email);
		this.setDatanasc(datanasc);
		this.setProfissao(profissao);
		this.setSexo(sexo);
		this.setEstadocivil(estadocivil);
		this.setEscolaridade(escolaridade);		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}
	public int getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(int telefone2) {
		this.telefone2 = telefone2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public boolean isEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(boolean estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}	
}