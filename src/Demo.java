import Fabrica.FabricaDialogoMac;
import Fabrica.FabricaDialogoWindows;
import Fabrica.GUIFabrica;
import app.Cliente;


public class Demo {
    private static Cliente configureApplication() {
        Cliente app;
        GUIFabrica fabrica;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            fabrica = new FabricaDialogoMac();
        } else {
            fabrica = new FabricaDialogoWindows();
        }
        app = new Cliente(fabrica);
        return app;
    }

    public static void main(String[] args) {
        Cliente app = configureApplication();
        app.crear();
    }
}

