
import Controladores.ListaControler;
import Modelos.ModeloPacientes1;
import Modelos.ModeloPacientes2;
import Vistas.frmVistaMedico1;
import Vistas.frmVistaMedico2;
import Vistas.frmVistaPrincipal;


public class main {

    public static void main(String[] args) {
        
        frmVistaPrincipal VistaPrincipal = new frmVistaPrincipal(null, true);
        frmVistaMedico1 VistaMedico1 = new frmVistaMedico1(null, true);
        frmVistaMedico2 VistaMedico2 = new frmVistaMedico2(null, true);
        ModeloPacientes1 ModeloLista = new ModeloPacientes1();
        ModeloPacientes2 ModeloLista2 = new ModeloPacientes2();   
        
        ListaControler controladorLista = new ListaControler(VistaPrincipal, VistaMedico1,
        VistaMedico2, ModeloLista, ModeloLista2);
    }
}
