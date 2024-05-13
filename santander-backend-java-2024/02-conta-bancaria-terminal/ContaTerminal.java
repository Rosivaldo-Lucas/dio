import java.util.Scanner;

public class ContaTerminal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Por favor, digite o número da Agência: ");
    int numeroConta = sc.nextInt();
    sc.nextLine();

    System.out.print("Por favor, digite a Agência: ");
    String agenciaConta = sc.nextLine();

    System.out.print("Por favor, digite o Nome de Cliente: ");
    String nomeClienteConta = sc.nextLine();

    System.out.print("Por favor, digite o Saldo: ");
    Double saldoConta = sc.nextDouble();

    ContaBanco novaContaBanco = new ContaBanco(numeroConta, agenciaConta, nomeClienteConta, saldoConta);

    System.out.println(
      "Olá " + 
      novaContaBanco.getNomeCliente() +
      ", obrigado por criar uma conta em nosso banco, sua agência é " +
      novaContaBanco.getAgencia() +
      ", conta " +
      novaContaBanco.getNumero() +
      " e seu saldo " +
      novaContaBanco.getSaldo() +
      " já está disponível para saque"
    );

    sc.close();
  }
  
}
