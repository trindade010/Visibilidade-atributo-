/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Usuario {
    
    // Atributos
    private String nome;
    private String email;
    private String login;
    private String senha;
    
    // Construtores
    // Inicializa os atributos vazios
    public Usuario() {
        this("","","","");
    }
    public Usuario(String email, String login, String nome, String senha) {
        this.email = email;
        this.login = login;
        this.nome = nome;
        this.senha = senha;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // Implementação dos demais getters e setters
    
    // Métodos específicos da classe
    public void provarExistencia() {
        System.out.println("Oi, eu existo!");
    }
}
