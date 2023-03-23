package Modelos;

import java.util.PriorityQueue;
import javax.swing.table.DefaultTableModel;


public class PacientesModel {
DefaultTableModel ModeloTabla = new DefaultTableModel();
PriorityQueue<Pacientes> ListaPacientes = new PriorityQueue<Pacientes>();
    public void IngresarPaciente(String ape, String nom, String tel, int gra)
    {
        Pacientes nuevoPaciente = new Pacientes(ape, nom, tel ,gra);
        ListaPacientes.add(nuevoPaciente);
    }
    
    public DefaultTableModel ListarPacientes()
    {
        this.ModeloTabla.addColumn("APELLIDOS");
        this.ModeloTabla.addColumn("NOMBRE");
        this.ModeloTabla.addColumn("TELEFONO");
        this.ModeloTabla.addColumn("GRAVEDAD");
        
        for(Pacientes MiListaDePacientes: ListaPacientes)
        {
            this.ModeloTabla.addRow(new Object[]{MiListaDePacientes.getApellidos(),
                MiListaDePacientes.getNombre(), MiListaDePacientes.getTelefono(), MiListaDePacientes.getGravedad()});
        }
        return ModeloTabla;
    }
    
}
