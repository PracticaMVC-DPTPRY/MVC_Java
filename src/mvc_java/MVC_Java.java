/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorClientes;
import Controlador.ControladorMDB;
import Controlador.ControladorSeguimientoClientes;
import Modelo.MDB;
import Vista.FrmCliente;
import Vista.FrmSeguimientoClientes;
import Vista.FrmVista;

/**
 *
 * @author Stevia
 */
public class MVC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        FrmVista objVista=new FrmVista();
        ControladorMDB objController;
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        
        
        MDB objModelo2=new MDB();
        FrmCliente objVista2=new FrmCliente();
        ControladorClientes objController2;
        objController2 = new ControladorClientes(objVista2,objModelo2);
        objController2.iniciar();
        objVista2.setVisible(true);
        
        MDB objModelo3=new MDB();
        FrmSeguimientoClientes objVista3=new FrmSeguimientoClientes();
        ControladorSeguimientoClientes objController3;
        objController3 = new ControladorSeguimientoClientes(objVista3,objModelo3);
        objController3.iniciar();
        objVista3.setVisible(true);
        
        
    }
    
}
