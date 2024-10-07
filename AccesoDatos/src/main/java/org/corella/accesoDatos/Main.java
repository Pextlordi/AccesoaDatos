package org.corella.accesoDatos;

import org.corella.accesoDatos.claseFile.FuncionesDirectorio;
import org.corella.accesoDatos.claseFile.FileReaderWriter;
import org.corella.accesoDatos.claseFile.ManejoCSV;

public class Main {
    public static void main(String[] args) {
        /*FuncionesDirectorio fd = new FuncionesDirectorio();
        fd.run(args[0]);*/
        /*FileReaderWriter frw = new FileReaderWriter(args[0]);
        frw.run();*/
        ManejoCSV manejoCSV = new ManejoCSV();
        manejoCSV.run(args[0]);
    }

    /*
    B1
        Inicialización de variables y asignación de recursos
    B2
        Try catch o cuerpo del codigo
    B3
        Finalización y liberación de recursos
    */

}
