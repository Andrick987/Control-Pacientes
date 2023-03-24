
package Controladores;

import Modelos.ModeloPacientes1;
import Modelos.ModeloPacientes2;
import Modelos.Pacientes;
import Vistas.frmVistaMedico1;
import Vistas.frmVistaMedico2;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;
import javax.swing.JOptionPane;

public class ListaControler implements ActionListener{
    
    frmVistaPrincipal VistaPrincipal;
    frmVistaMedico1 VistaMedico1;
    frmVistaMedico2 VistaMedico2;
    ModeloPacientes1 ModeloLista1;
    ModeloPacientes2 ModeloLista2;

    public ListaControler(frmVistaPrincipal VistaPrincipal, frmVistaMedico1 VistaMedico1, frmVistaMedico2 VistaMedico2, 
            ModeloPacientes1 ModeloLista1, ModeloPacientes2 ModeloLista2) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaMedico1 = VistaMedico1;
        this.VistaMedico2 = VistaMedico2;
        this.ModeloLista1 = ModeloLista1;
        this.ModeloLista2 = ModeloLista2;
        
        this.VistaPrincipal.btnAgregarMedico1.addActionListener(this);
        this.VistaPrincipal.btnAgregarMedico2.addActionListener(this);
        this.VistaPrincipal.btnListaMedico1.addActionListener(this);
        this.VistaPrincipal.btnListaMedico2.addActionListener(this);
        this.VistaMedico1.btnAtenderPaciente1.addActionListener(this);
        this.VistaMedico2.btnAtenderPaciente2.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
        
    }
     
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == this.VistaPrincipal.btnAgregarMedico1){
            
            this.ModeloLista1.PacientesMedico1(this.VistaPrincipal.txtApellidos.getText(),
                this.VistaPrincipal.txtNombre.getText());
           
            Queue<Pacientes> listalocal = this.ModeloLista1.ListarPaciente();
            JOptionPane.showMessageDialog(null, "Paciente Agregado a Medico A");
            String Cadena = "";
            for(Pacientes MiListaPacientes: listalocal){
                
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombres()+"\n";
            this.VistaMedico1.txtListaMedico1.setText(Cadena);
            }
            this.VistaPrincipal.txtApellidos.setText(" ");
            this.VistaPrincipal.txtNombre.setText(" ");
            }
        
        if(e.getSource() == this.VistaPrincipal.btnAgregarMedico2){
           this.ModeloLista2.PacientesMedico2(this.VistaPrincipal.txtApellidos.getText(),
                   this.VistaPrincipal.txtNombre.getText());
           
           Queue<Pacientes> listalocal = this.ModeloLista2.ListarPaciente();
           JOptionPane.showMessageDialog(null, "Paciente Agregado a Medico B");
           String Cadena = "";
            for(Pacientes MiListaPacientes: listalocal){
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombres()+"\n";
            this.VistaMedico2.txtListaMedico2.setText(Cadena);
            }
            this.VistaPrincipal.txtApellidos.setText(" ");
            this.VistaPrincipal.txtNombre.setText(" ");
            }
        
        if(e.getSource() == this.VistaPrincipal.btnListaMedico1){
            this.VistaMedico1.setLocationRelativeTo(null);
            this.VistaMedico1.setVisible(true);
            }
        
        if(e.getSource() == this.VistaPrincipal.btnListaMedico2){
            this.VistaMedico2.setLocationRelativeTo(null);
            this.VistaMedico2.setVisible(true);
            }
        if(e.getSource() == this.VistaMedico1.btnAtenderPaciente1){
            this.ModeloLista1.EliminarPaciente1();
            this.ModeloLista1.PacientesMedico1(this.VistaPrincipal.txtApellidos.getText(),
                this.VistaPrincipal.txtNombre.getText());
           
            Queue<Pacientes> listalocal = this.ModeloLista1.ListarPaciente();
            
            String Cadena = "";
            for(Pacientes MiListaPacientes: listalocal){
                
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombres()+"\n";
            }
            this.VistaMedico1.txtListaMedico1.setText(Cadena);
            }
        if(e.getSource() == this.VistaMedico2.btnAtenderPaciente2){
            this.ModeloLista2.EliminarPaciente2();
            this.ModeloLista2.PacientesMedico2(this.VistaPrincipal.txtApellidos.getText(),
                this.VistaPrincipal.txtNombre.getText());
           
            Queue<Pacientes> listalocal = this.ModeloLista2.ListarPaciente();
            
            String Cadena = "";
            for(Pacientes MiListaPacientes: listalocal){
                
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombres()+"\n";
            }
            this.VistaMedico2.txtListaMedico2.setText(Cadena);
            }
    }
        
}
