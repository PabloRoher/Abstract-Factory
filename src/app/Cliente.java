package app;

import Dialogo.Dialogo;
import Fabrica.GUIFabrica;

public class Cliente {
    private Dialogo dialogo;

    public Cliente(GUIFabrica fabrica) {
        dialogo = fabrica.createDialogo();

    }

    public void crear() {
        dialogo.crear();
    }
}
