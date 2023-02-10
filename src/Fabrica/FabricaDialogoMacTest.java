package Fabrica;

import app.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaDialogoMacTest {
    @Test
    public void test1(){
        Cliente app;
        GUIFabrica fabricaDialogoMac;
        fabricaDialogoMac = new FabricaDialogoMac();
        app = new Cliente(fabricaDialogoMac);
        app.crear();
    }

}