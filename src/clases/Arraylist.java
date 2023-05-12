/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author mateo
**/
    public class Arraylist {
        private ArrayList<controladorlogin> usuarios;

    public Arraylist() {
        usuarios = new ArrayList<>();
        usuarios.add(new controladorlogin("prueba","prueba"));
    }
 
    public void agregarUsuario(String nombreUsuario, String contrasena) {
        usuarios.add(new controladorlogin(nombreUsuario, contrasena));
    }
      public boolean comprobarUsuario(String nombre, String contraseña) {
        for (controladorlogin usuario : usuarios) {
            if (usuario.getUser().equals(nombre) && usuario.getPassword().equals(contraseña)) {
                return true;
            }
        }
        return false;
    }     

  }
