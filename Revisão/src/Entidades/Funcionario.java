package Entidades;

import java.util.ArrayList;
import java.util.List;

import Entidades.Enum.Nivel;

public class Funcionario 
{
   private String nomeFuncionario;
   private Nivel nivel;
   private double salarioBase;
   private Departamento deparatamento;
   
   private List<Tarefa> tarefas = new ArrayList();

   public void Funcionario() {}
   public void Funcionario( String nomeFuncionario, Nivel nivel, double salarioBase,Departamento deparatamento) 
   {
	   this.nomeFuncionario = nomeFuncionario;
	   this.nivel = nivel;
	   this.salarioBase = salarioBase;
	   this.deparatamento =  deparatamento;
	   
   }
public String getNomeFuncionario() {
	return nomeFuncionario;
}
public void setNomeFuncionario(String nomeFuncionario) {
	this.nomeFuncionario = nomeFuncionario;
}
public Nivel getNivel() {
	return nivel;
}
public void setNivel(Nivel nivel) {
	this.nivel = nivel;
}
public Departamento getDeparatamento() {
	return deparatamento;
}
public void setDeparatamento(Departamento deparatamento) {
	this.deparatamento = deparatamento;
}
public List<Tarefa> getTarefas() {
	return tarefas;
}
public void removeTarefa(Tarefa tarefa) {tarefas.add(tarefa);}
public void addTarefa(Tarefa tarefa) {tarefas.add(tarefa);}
public void setTarefas(List<Tarefa> tarefas) {
	this.tarefas = tarefas;
}
public double getSalarioBase() {
	return salarioBase;
}
   
   
   
}
