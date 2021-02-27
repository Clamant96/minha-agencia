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
public final class PessoaJuridica extends ContaBanco{
    private String cnpj;
    private int saldo;
    
    public PessoaJuridica(){
        this.setSaldo(0);
    }
    
    public PessoaJuridica(String cnpj, int saldo){
        this.cnpj = cnpj;
        this.setSaldo(0);
    }
    
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    
    public String getCnpj(){
        return this.cnpj;
    }
    
    public void depositar(int deposito){
    }
    
    public void sacar(int saque){
    }
    
    public void menu(){            
        System.out.println("Conta | Pessoa Juridica");
        System.out.println("---------------------");

        System.out.println();

        System.out.print("Razao Social: ");
        this.setNome(entradaString.nextLine());

        System.out.print("CNPJ: ");
        this.setCnpj(entradaString.nextLine());

        System.out.println("Saldo Atual R$ "+ formatacao.format(this.getSaldo()));

        this.menuPerfil();

    }
    
    public void menuPerfil(){
        do{
            // MENU PERFIL - CONTA
            this.opcaoConta();
            this.setOpcao(entradaOpcao.nextInt());
            
            switch(this.getOpcao()){
                case 1:
                    System.out.println("Perfil | Saldo");
                    System.out.println("Saldo Atual R$ "+ formatacao.format(this.getSaldo()));
                break;
                
                case 2:
                    System.out.println("Perfil | Deposito");
                    System.out.println("Quanto voce deseja depositar");
                    
                    System.out.print("R$ ");
                    this.depositar(entradaDouble.nextDouble());
                    System.out.println();
                break;
                
                case 3:
                    System.out.println("Perfil | Saque");
                    System.out.println("Quando voce deseja sacar");
                    
                    System.out.print("R$ ");
                    this.sacar(entradaDouble.nextDouble());
                    System.out.println();
                break;
                
                case 4:
                    System.out.println("Perfil | Meus Dados");
                    System.out.printf("Ola, %s aqui estam seus dados cadastrais\n", this.getNome());
                    
                    System.out.printf("Nome: %s \n", this.getNome());
                    System.out.printf("CNPJ: %s \n", this.getCnpj());
                    System.out.println("Saldo Atual R$ "+ formatacao.format(this.getSaldo()));
                    
                break;
                
                case 0:
                    System.out.println("Ate breve!!");
                break;
                
                default:
                    System.out.println("Opcao invalida!!");
                break;
            }
        
        }while(this.getOpcao() != 0);
    }
    
}
