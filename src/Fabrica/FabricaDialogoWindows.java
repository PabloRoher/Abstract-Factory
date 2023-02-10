package Fabrica;

import Dialogo.Dialogo;
import Dialogo.DialogoWindows;

public class FabricaDialogoWindows implements GUIFabrica{
    public Dialogo createDialogo(){
        return new DialogoWindows();
    }
}
