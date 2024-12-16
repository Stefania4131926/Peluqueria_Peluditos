/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelu_modelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pelu_vistas.JDialogPeluqueria;

/**
 *
 * @author dam2
 */
public class Pelu_Modelo {

	private static ArrayList<Usuario> usuarios = new ArrayList<>();

	public Pelu_Modelo() {
	}

	public Pelu_Modelo(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public void agregarUsuario(Usuario u) {

		usuarios.add(u);
		System.out.println("Usuario añadido correctamente");
		
		 File archivo = new File("personas.dat");
         
          try {
            FileOutputStream fos = new FileOutputStream(archivo,true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            
            //hay que añadir en los parentesis personas para que añada toda la lista en el fichero
            oos.writeObject(usuarios);
            oos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(JDialogPeluqueria.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(JDialogPeluqueria.class.getName()).log(Level.SEVERE, null, ex);
        }

	}

	public String mostrarUsuariosString() {
		String listado = "";
		for (Usuario u : usuarios) {

			listado += u.getNombre() + " ";
			listado += u.getApellido() + " ";

		}
		return listado;
	}
}
