
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ModeloPacientes2 {
    
    Queue<Pacientes> ListaPacientes = new LinkedList();
    
    public void PacientesMedico2(String ape, String nom){
        
        Pacientes nuevoPaciente = new Pacientes(ape, nom);
        this.ListaPacientes.add(nuevoPaciente);
        
    }
    public Queue ListarPaciente(){
        
        return this.ListaPacientes;   
    }
    public void EliminarPaciente2(){
        
        this.ListaPacientes.poll();
        
    }
}
