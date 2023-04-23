/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maricel.model;

/**
 *
 * @author Usuario
 */
public class Usuario {
    private String id;
    private String nombre;
    private String email;
    private String nacionalidad;
    
    public Usuario(){
    }
        public void setId (String id){
            this.id = id;
            }
    public String getId(){
          return id;
        
    }
    public void setNombre(String name){
        this.nombre = name;
    }
    public String getNombre(){
        return nombre;
    }
     public void setEmail(String email){
        this.email = email;
     }
      public String getEmail(){
        return email;
}
      public void setNacionalidad(String nacionalidad){
          this.nacionalidad = nacionalidad;  
      }       
      public String getNacionalidad(){
        return nacionalidad;
      }
}

