
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ListaPacientes {
    
    Queue<Pacientes> ListaPacientes = new LinkedList();
    
    public void PacientesMedico1(String ape, String nom){
        
        Pacientes nuevoPaciente = new Pacientes(ape, nom);
        this.ListaPacientes.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "Paciente Agregado a Medico A");
    }
    public void PacientesMedico2(String ape, String nom){
        
        Pacientes nuevoPaciente = new Pacientes(ape, nom);
        this.ListaPacientes.add(nuevoPaciente);
        JOptionPane.showMessageDialog(null, "Paciente Agregado a Medico B");
    }
    public Queue ListarPaciente(){
        
        return this.ListaPacientes;
        
    }
}
    
