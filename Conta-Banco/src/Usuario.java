public class Usuario {
    public static void main(String[] args) throws Exception {
       
        ContaTerminal contaTerminal = new ContaTerminal();

        System.out.println("Digite o numero:" + contaTerminal.numero);
        System.out.println("Por favor, digite o número da Agência !:" + contaTerminal.agencia);
        System.out.println("Digite o nome do cliente !: " + contaTerminal.nomecliente);
        System.out.println("Seu saldo: " + contaTerminal.saldo);



        
    }
}