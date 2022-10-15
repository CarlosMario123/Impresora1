

public class Main {
    public static void main(String[] args) {
        Documento documento = new Documento("Cenicienta","erase una vez en bosque");
        Impresora impresora = new Impresora();
        impresora.encender();
        impresora.ImprimirDocumento(documento);
    }
}