/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eteczl;

/**
 *
 * @author Admin
 */
public class Trocar_Nome {
	public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Assembly",20);
	Pessoa p2= new Pessoa("Cassandra", 17);
	
	p1.setnome("Amor");
	p2.setnome("Paixão");
	
	System.out.println(p1.getnome() + p2.getnome());
	}
	

}