/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciabancaria;

/**
 *
 * @author kevin
 */
public class AgenciaBancaria {

    /**
     * @param args the command line arguments
     */
    
    /*
        DESAFIO:
        
        Uma agencia bancaria permite o cadastro de dois tipos de clientes: pessoas físicas(PF) e  
        pessoas jurídicas(PJ). No caso das PF, a agência exige, além do nome e o documento CPF, 
        a data de nascimento do novo cliente. Para as PJ, a agência exige apenas o nome da empresa 
        e o documento CNPJ.

        Após o cadastramento, o novo cliente pode começar a operar a conta corrente. Como e exigido 
        um deposito inicial de R$ 200 para as operações das contas PF, o saldo desses clientes começa 
        com esse valor. Tanto eles quanto os clientes PJ podem depositar e sacar os valores da conta 
        corrente.

    */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco banco = new ContaBanco();
        PessoaFisica pf = new PessoaFisica();
        PessoaJuridica pj = new PessoaJuridica();
        
        do{
            // MENU PRINCIPAL - HOME
            banco.opcaoMenu();
            banco.setOpcao(banco.entradaOpcao.nextInt());
            
            switch(banco.getOpcao()){
                case 1:
                    System.out.println("Painel Minha Conta");
                    System.out.println();
                    System.out.println("Digite [PF] - Pessoa Fisica");
                    System.out.println("Digite [PJ] - Pessoa Juridica");
                    
                    banco.setConta(banco.entradaConta.nextLine());
                    
                    if(banco.getConta().equals("PF") || banco.getConta().equals("pf")){
                        pf.menu();
                    }else if(banco.getConta().equals("PJ") || banco.getConta().equals("pj")){
                        pj.menu();
                    }else{
                        System.out.println("Opcao invalida!");
                    }
                break;
                
                case 0:
                    System.out.println("Obrigado por acessar a Connect Banck");
                break;
                
                default:
                    System.out.println("Opcao invalida!!");
                break;
            }
        
        }while(banco.getOpcao() != 0);
        
    }
    
}
