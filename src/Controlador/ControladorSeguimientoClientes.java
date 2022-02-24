
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Stevia
 */
import Modelo.MDB;
import Vista.FrmSeguimientoClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorSeguimientoClientes implements ActionListener{
  private FrmSeguimientoClientes _view; //el formulario 
  private MDB _model;//el manejador de bases de datos

    
    public ControladorSeguimientoClientes(FrmSeguimientoClientes view, MDB model){
       this._model=model;
       this._view=view;
        this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
        leyenda=_model.registrarAlta("seguimiento_clientes","null,"+_view.txtCedula.getText()+",'"+_view.txtLugar_Expedicion.getText()+"','"+_view.txtNombre_Completo.getText()+"','"+_view.txtProfesion.getText()+"','"+_view.txtDireccion_Residencial.getText()+"','"+_view.txtCiudad.getText()+"','"+_view.txtDepartamento.getText()+"','"+_view.txtEmail.getText()+"',"
                +_view.txtTel_Residencial.getText()+","+_view.txtTel_Trabajo.getText()+","+_view.txtNum_Factura.getText()+",'"+_view.txtTipo_Cartera.getText()+"','"+_view.txtFecha_Mora.getText()+"',"+_view.txtDias_Mora.getText()+","+_view.txtVal_Mora.getText()+","+_view.txtV_Seguro.getText()
                +","+_view.txtInteres_Mora.getText()+","+_view.txtSald_Restante.getText()+",'"+_view.txtTipo_Cobro.getText()+"','"+_view.txtFecha_Acuerdo_Uno.getText() +"','"+_view.txtAcuerdo_Uno.getText()+"','"+_view.txtFecha_Acuerdo_Dos.getText()+"','"+_view.txtAcuerdo_Dos.getText()+"','"+_view.txtFecha_Acuerdo_Tres.getText()+"','"+_view.txtAcuerdo_Tres.getText()+"','"+_view.txtFecha_Acuerdo_Cuatro.getText()+"','"+_view.txtAcuerdo_Cuatro.getText()+"'");
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("Seguimiento clientes");
}
public void limpiar(){
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
       _view.txtTipo_Cartera.setText(null);
       _view.txtFecha_Mora.setText(null);
       _view.txtDias_Mora.setText(null);
       _view.txtVal_Mora.setText(null);
       _view.txtV_Seguro.setText(null);
       _view.txtInteres_Mora.setText(null);
       _view.txtSald_Restante.setText(null);
       _view.txtTipo_Cobro.setText(null);
       _view.txtFecha_Acuerdo_Uno.setText(null);
       _view.txtAcuerdo_Uno.setText(null);
       _view.txtFecha_Acuerdo_Dos.setText(null);
       _view.txtAcuerdo_Dos.setText(null);
       _view.txtFecha_Acuerdo_Tres.setText(null);
       _view.txtAcuerdo_Tres.setText(null);
       _view.txtFecha_Acuerdo_Cuatro.setText(null);
       _view.txtAcuerdo_Cuatro.setText(null);

}
}
