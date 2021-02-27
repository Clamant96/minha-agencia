/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciabancaria;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class ContaBanco {
    private String nome;
    private double saldo;
    private int opcao;
    private String conta;
    
    Scanner entradaOpcao = new Scanner(System.in);
    Scanner entradaConta = new Scanner(System.in);
    Scanner entradaString = new Scanner(System.in);
    Scanner entradaDouble = new Scanner(System.in);
    
    DecimalFormat formatacao = new DecimalFormat("0.00");
    
    public ContaBanco(){
    }
    
    public ContaBanco(String nome, int saldo){
        this.nome = nome;
        this.saldo = saldo;
    }
    
    public ContaBanco(int opcao, String conta){
        this.opcao = opcao;
        this.conta = conta;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void setOpcao(int opcao){
        this.opcao = opcao;
    }
    
    public int getOpcao(){
        return this.opcao;
    }
    
    public void setConta(String conta){
        this.conta = conta;
    }
    
    public String getConta(){
        return this.conta;
    }
    
    public void depositar(double deposito){
        if(deposito > 0){
            this.setSaldo(this.getSaldo() + deposito);
            System.out.println("Ola "+ this.getNome() +" o valor R$ "+ deposito +" foi depositado com sucesso!");
            System.out.println("Saldo atual R$ "+ this.getSaldo());
            System.out.println("|===========================|");
            
        }else if(deposito < 0){
            System.out.println("O valor R$ "+ deposito +" e invalido");
            System.out.println("|===========================|");
            
        }else if(deposito == 0){
            System.out.println("O valor R$ "+ deposito +" tem que ser maior que R$ 0.00");
            System.out.println("|===========================|");
            
        }
    }
    
    public void sacar(double saque){
        if(saque <= this.getSaldo()){
            this.setSaldo(this.getSaldo() - saque);
            System.out.println("Ola "+ this.getNome() +" o valor R$ "+ saque +" foi sacado com sucesso!");
            System.out.println("Saldo atual R$ "+ this.getSaldo());
            System.out.println("|===========================|");
            
        }else if(saque < 0){
            System.out.println("O valor R$ "+ saque +" e invalido");
            System.out.println("|===========================|\n");
            
        }else if(saque == 0){
            System.out.println("O valor R$ "+ saque +" tem que ser maior que R$ 0.00");
            System.out.println("|===========================|");
            
        }else if(saque > this.getSaldo()){
            System.out.println("O valor R$ "+ saque +" e maior do que consta em sua conta "+ this.getSaldo());
            System.out.println("|===========================|");
            
        }   
    }
    
    public void menu(){
        System.out.println("Ola, seja bem-vindo ao Connect Bank, seu banco digital.");
        System.out.println("O que voce deseja fazer hoje?");
        
        /*do{
            // MENU PRINCIPAL - HOME
            this.opcaoMenu();
            this.setOpcao(entradaOpcao.nextInt());
            
            switch(this.getOpcao()){
                case 1:
                    System.out.println("Painel Minha Conta");
                    System.out.println();
                    System.out.println("Digite [PF] - Pessoa Fisica");
                    System.out.println("Digite [PJ] - Pessoa Juridica");
                    
                    this.setConta(entradaConta.nextLine());
                    
                    if(this.getConta().equals("PF")){
                        System.out.println("Conta | Pessoa Fisica");
                        System.out.println("---------------------");
                        
                        System.out.println();
                        
                        System.out.print("Nome completo: ");
                        this.pf.setNome(entradaString.nextLine());
                        
                        System.out.print("CPF: ");
                        this.pf.setCpf(entradaString.nextLine());
                        
                        System.out.print("Data de nascimento __/__/__ : ");
                        this.pf.setCpf(entradaString.nextLine());
                        
                        System.out.print("Saldo atual R$ "+ this.getSaldo());
                        
                        this.menuPerfil();
                        
                    }else if(this.getConta().equals("PJ")){
                        System.out.println("Conta | Pessoa Juridica");
                        System.out.println("---------------------");
                        
                        System.out.println();
                        
                        System.out.print("Razao Social: ");
                        this.pj.setNome(entradaString.nextLine());
                        
                        System.out.print("CNPJ: ");
                        this.pj.setCnpj(entradaString.nextLine());
                        
                        System.out.print("Saldo atual R$ "+ this.getSaldo());
                        
                        this.menuPerfil();
                        
                    }
                break;
                
                case 0:
                    System.out.println("Obrigado por acessar a Connect Banck");
                break;
            }
        
        }while(this.getOpcao() != 0);*/
        
    }
    
    // MENU PRINCIPAL - HOME
    public void opcaoMenu(){
        System.out.println("|====================|");
        System.out.println("1 - Criar nova conta");
        System.out.println("0 - Finalizar sessao");
        System.out.println("|====================|");
        System.out.print("==> ");
    }
    
    public void menuPerfil(){
        System.out.println("Ola, "+ this.getNome() +" seja bem-vindo ao Connect Bank, seu banco digital.");
        System.out.println("O que voce deseja fazer hoje?");
        
        /*do{
            // MENU PERFIL - CONTA
            this.opcaoConta();
            this.setOpcao(entradaOpcao.nextInt());
            
            switch(this.getOpcao()){
                case 1:
                    System.out.println("Perfil | Saldo");
                    System.out.println("Saldo R$ "+ this.getSaldo());
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
                
                case 0:
                    System.out.println("Ate breve!!");
                break;
                
                default:
                    System.out.println("Opcao invalida!!");
                break;
            }
        
        }while(this.getOpcao() != 0);*/
        
    }
    
    // MENU PERFIL - CONTA
    public void opcaoConta(){
        System.out.println("|====================|");
        System.out.println("1 - Verificar saldo");
        System.out.println("2 - Fazer deposito");
        System.out.println("3 - Realizar saque");
        System.out.println("4 - Verificar Dados");
        System.out.println("0 - Logout");
        System.out.println("|====================|");
        System.out.print("==> ");
        
    }
    
}
