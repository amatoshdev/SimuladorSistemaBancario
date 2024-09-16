import java.util.Scanner;

public class SistemaBancario {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        // Mensagem inicial do Banco Pout.
        System.out.println("""
                                
                Bem vindo ao Banco Pout!
                                
                Insira seus dados para prosseguir ao menu de opções.\s""");

        //Recolhimento de dados do usuário
        System.out.println("\nNome:");
        String nomeCliente = userInput.nextLine();

        double saldoInicial = 2500;

        System.out.printf("""
                                
                ********************************************************
                        
                    Nome:            %s
                    Tipo de Conta:   Corrente
                    Saldo atual:     R$%.2f
                                
                ********************************************************
                                
                """, nomeCliente, saldoInicial);

        // Variável de confirmação de leitura que verifica se o usuário continuará ou não no menu/loop.
        int opcaoOperacao;

        // Looping de operações bancárias.
        do {

            System.out.println("""
                                    
                    Selecione uma operação
                                    
                    1. Consultar Saldo
                    2. Receber Valor
                    3. Transferir Valor
                    4. Sair
                    """);

            System.out.print("Digite o dígito referente a operação selecionada: ");
            opcaoOperacao = userInput.nextInt();

                 // Operação de consulta de saldo.
            if (opcaoOperacao == 1) {

                System.out.printf("""
                                                
                        O seu saldo atual é de R$%.2f.
                        ____________________________________
                        """, saldoInicial);

                // Operação de recebimento de valor.
            } else if (opcaoOperacao == 2) {

                System.out.println("\nInsira um valor a ser recebido (utilize vírgulas apenas se for utilizar centavos, ex: R$10,56):");

                double valorAReceber = userInput.nextDouble();

                saldoInicial += valorAReceber;

                System.out.printf("""
                                                
                        O seu novo saldo é de R$ %.2f.
                        ____________________________________
                        """, saldoInicial);

                // Operação de transferência de valor.
            } else if (opcaoOperacao == 3) {

                System.out.println("\nInsira um valor a ser transferido (utilize vírgulas apenas se for utilizar centavos, ex: R$10,56):");

                double valorATransferir = userInput.nextDouble();

                saldoInicial -= valorATransferir;

                System.out.printf("""
                                                
                        A transferência de R$%.2f foi realizada!
                                                
                        Seu novo saldo é de R$%.2f.
                        ____________________________________
                        """, valorATransferir, saldoInicial);

                // Operação para sair do menu e finalizar o programa.
            } else if (opcaoOperacao == 4) {

                System.out.println("""
                                                
                        Operação finalizada.
                        ____________________________________
                        """);

                // Mensagem de erro caso o dígito não corresponda a uma operação.
            } else {

                System.out.println("""
                        Comando inválido.
                                                
                        Insíra um digito que corresponda a uma operação.
                        ____________________________________
                        """);
            }

            // Exceção para sair do menu de operações.
        } while (opcaoOperacao != 4);
    }
}
