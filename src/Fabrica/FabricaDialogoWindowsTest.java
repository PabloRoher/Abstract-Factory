package Fabrica;

import Dialogo.DialogoWindows;
import app.Cliente;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaDialogoWindowsTest {
    @Test
    public void test1(){
        Cliente app;
        GUIFabrica fabricaDialogoWindows;
        fabricaDialogoWindows = new FabricaDialogoWindows();
        app = new Cliente(fabricaDialogoWindows);
        app.crear();
    }

}