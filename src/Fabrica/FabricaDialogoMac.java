package Fabrica;

import Dialogo.DialogoMac;
import Dialogo.Dialogo;

public class FabricaDialogoMac implements GUIFabrica{

    public Dialogo createDialogo() {
        return new DialogoMac();
    }


}
