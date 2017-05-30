package com.jpvernizzi.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "JOGADOR")
public class Jogador implements Serializable {

	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@Column
	private String nome;
	
	@Column
	private int idade;
	
	@Column
	private double altura;
	
	@Column
	private double peso;
	
	@Column
	private String pe_chute;
	
	@Column
	private double pontuacao;
	
	@Column(name = "time_id")
	private int time; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade(){
		return idade;
	}
	
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	public double getAltura(){
		return altura;
	}
	
	public void setAltura(double altura){
		this.altura = altura;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public String getPeChute(){
		return pe_chute;
	}
	
	public void setPeChute(String pe_chute){
		this.pe_chute = pe_chute;
	}
	
	public double getPontuacao(){
		return pontuacao;
	}
	
	public void setPontuacao(double pontuacao){
		this.pontuacao = pontuacao;
	}
	
/*	public Time getTime(){
		return time;
	}
	
	public void setTime(Time time){
		this.time = time;
	} */

	public void setTime(int timeID){
		this.time = timeID;
	}
	
	public int getTime(){
		return time;
	}
	
}