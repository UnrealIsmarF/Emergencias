
import Controladores.PacientesController;
import Modelos.PacientesModel;
import Vistas.frmPrincipal;

public class main {

    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        PacientesModel ModeloPacientes = new PacientesModel();
        
        PacientesController ControladorPacientes = new PacientesController(VistaPrincipal,ModeloPacientes);
        
    }
    
}
