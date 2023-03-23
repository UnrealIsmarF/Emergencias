package Controladores;

import Modelos.PacientesModel;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PacientesController implements ActionListener{
frmPrincipal VistaPrincipal;
PacientesModel ModeloPacientes;


    public PacientesController(frmPrincipal VistaPrincipal, PacientesModel ModeloPacientes) {
        this.VistaPrincipal = VistaPrincipal;
        this.ModeloPacientes = ModeloPacientes;
        
        //PONER ESCUCHA LOS BOTONES
        this.VistaPrincipal.btnIngresar.addActionListener(this);
        this.VistaPrincipal.btnAtender.addActionListener(this);
        //LEVANTAR LA VISTA PRINCIPAL
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() ==this.VistaPrincipal.btnIngresar)
        {
            this.ModeloPacientes.IngresarPaciente(this.VistaPrincipal.txtApellidos.getText(),
             this.VistaPrincipal.txtNombre.getText(),
             this.VistaPrincipal.txtTelefono.getText(),
             Integer.parseInt(this.VistaPrincipal.txtPrioridad.getText()));
            this.VistaPrincipal.jtTablaPacientes.setModel(this.ModeloPacientes.ListarPacientes());
        }
    }

    
    
}
