public class Telefone {
    public void ligando(){
        Correiodevoz();
        atendendo();
        System.out.println("Mandando um correio de voz");
    }
    private void atendendo(){
        System.out.println("Não Atendeu");
    }
    private void Correiodevoz(){
        
        System.out.println("Ligando...");
    }
}
