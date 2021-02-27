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
public final class PessoaFisica extends ContaBanco{
    private String cpf;
    private String dataNascimento;
    
    public PessoaFisica(){
        this.setSaldo(200);
    }
    
    public PessoaFisica(String cpf, String dataNascimento, int saldo){
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.setSaldo(200);
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setDataNascimento(String dataNascimento){
        this.dataNascimento = dataNascimento;
    }
    
    public String getDataNascimento(){
        return this.dataNascimento;
    }
    
    public void depositar(int deposito){
    }
    
    public void sacar(int saque){
    }
    
    public void menu(){
        System.out.println("Conta | Pessoa Fisica");
        System.out.println("---------------------");

        System.out.println();

        System.out.print("Nome completo: ");
        this.setNome(entradaString.nextLine());

        System.out.print("CPF: ");
        this.setCpf(entradaString.nextLine());

        System.out.print("Data de nascimento __/__/__ : ");
        this.setCpf(entradaString.nextLine());

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
                    System.out.println("Quando voce deseja depositar");
                    
                    System.out.print("R$ ");
                    this.depositar(entradaDouble.nextDouble());
                    System.out.println();
                break;
                
                case 3:
                    System.out.println("Perfil | Saque");
                    System.out.print("Quando voce deseja sacar");
                    
                    System.out.print("R$ ");
                    this.sacar(entradaDouble.nextDouble());
                    System.out.println();
                break;
                
                case 4:
                    System.out.println("Perfil | Dados");
                    System.out.printf("Ola, %s aqui estam seus dados cadastrais\n", this.getNome());
                    
                    System.out.printf("Nome: %s \n", this.getNome());
                    System.out.printf("CPF: %s \n", this.getCpf());
                    System.out.printf("Nascimento: %s \n", this.getNome());
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
