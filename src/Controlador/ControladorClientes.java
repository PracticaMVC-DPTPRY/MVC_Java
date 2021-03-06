
package Controlador;

/**
 *
 * @author Stevia
 */
import Modelo.MDB;
import Vista.FrmCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorClientes implements ActionListener{
  private FrmCliente _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public ControladorClientes(FrmCliente view, MDB model){
       this._model=model;
       this._view=view;
        this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override

public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
        
        leyenda=_model.registrarAlta("clientes",_view.txtCedula.getText()+",'"+_view.txtLugar_Expedicion.getText()+"','"+_view.txtNombre_Completo.getText()+"','"+_view.txtProfesion.getText()+"','"+_view.txtDireccion_Residencial.getText()+"','"+_view.txtCiudad.getText()+"','"+_view.txtDepartamento.getText()+"','"+_view.txtEmail.getText()
                +"',"+_view.txtTel_Residencial.getText()+","+_view.txtTel_Trabajo.getText()+","+_view.txtNum_Factura.getText()+",'"+_view.txtFecha_Credito.getText()+"','"+_view.txtTipo_Cartera.getText()+"',"+_view.txtValor_Credito.getText()+","+_view.txtNum_Cuotas.getText());
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("Clientes");
}
public void limpiar(){
    _view.txtCedula.setText(null);
    _view.txtLugar_Expedicion.setText(null);
    _view.txtNombre_Completo.setText(null);
    _view.txtProfesion.setText(null);
    _view.txtDireccion_Residencial.setText(null);
    _view.txtCiudad.setText(null);
    _view.txtDepartamento.setText(null);
    _view.txtEmail.setText(null);
    
    _view.txtTel_Residencial.setText(null);
    _view.txtTel_Trabajo.setText(null);
    _view.txtNum_Factura.setText(null);
    _view.txtFecha_Credito.setText(null);
    _view.txtTipo_Cartera.setText(null);
    _view.txtValor_Credito.setText(null);
    _view.txtNum_Cuotas.setText(null);

}
}
