public class Impresora {

    private boolean EstaEncendida;

    public void encender(){
        EstaEncendida = true;
    }
    public void ImprimirDocumento(Documento doc){

        if(EstaEncendida){
            System.out.println("*imprimiendo doc: " + doc.getTitulo() + "\n");
            System.out.println(doc.getCuerpo());
            System.out.println("*************************************");
        }
    }
}
