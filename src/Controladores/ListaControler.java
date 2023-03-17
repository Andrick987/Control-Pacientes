
package Controladores;

import Modelos.ListaPacientes;
import Modelos.Pacientes;
import Vistas.frmVistaMedico1;
import Vistas.frmVistaMedico2;
import Vistas.frmVistaPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

public class ListaControler implements ActionListener{
    
    frmVistaPrincipal VistaPrincipal;
    frmVistaMedico1 VistaMedico1;
    frmVistaMedico2 VistaMedico2;
    
    ListaPacientes ModeloLista;

    public ListaControler(frmVistaPrincipal VistaPrincipal, ListaPacientes ModeloLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloLista = ModeloLista;
        
        this.VistaPrincipal.btnAgregarMedico1.addActionListener(this);
        this.VistaPrincipal.btnAgregarMedico2.addActionListener(this);
        this.VistaPrincipal.btnListaMedico1.addActionListener(this);
        this.VistaPrincipal.btnListaMedico2.addActionListener(this);
        
        this.VistaPrincipal.setLocationRelativeTo(null);
        this.VistaPrincipal.setVisible(true);
        
    }
     
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == this.VistaPrincipal.btnAgregarMedico1){
            
            this.ModeloLista.PacientesMedico1(this.VistaPrincipal.txtApellidos.getText(),
            this.VistaPrincipal.txtNombre.getText());
           
            Queue<Pacientes> listalocal = this.ModeloLista.ListarPaciente();
            
            String Cadena = "";
            for(Pacientes MiListaPacientes : listalocal){
                Cadena = Cadena + MiListaPacientes.getApellidos()+" "+MiListaPacientes.getNombres()+"\n";
            this.VistaMedico1.txtListaMedico1.setText(Cadena);
            }
    }
    }
        
}
