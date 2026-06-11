/*"1. A superclasse: `MembroONG` (a base)

* Atributos Privados: `nome` (String), `cpf` (String) e `diasAtuacao` (int).

* Encapsulamento: Crie os métodos Getters e Setters.

* Regra de Negócio (Setter): O método `setDiasAtuacao(int dias)` não pode aceitar valores negativos.

* Comportamento: Crie um método `exibirResumo()` que imprima o nome e os dias de atuação."*/


public class MembroONG {
    private String nome;
    private String cpf;
    private int diasAtuacao;

    public String getNome(){ // get pega o valor
        return nome;
    }

    public void setNome(String nome){ // set coloca o valor 
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getDiasAtuacao(){
        return diasAtuacao;
    }

    public void setDiasAtuacao(int diasAtuacao){
        if(diasAtuacao >= 0){
            this.diasAtuacao = diasAtuacao;
        } else{
            System.out.println("ERRO: Dias de atuação não pode ser negativo.");
        }
    }

    public void exibirResumo(){
        System.out.println("Nome: " + nome);
        System.out.println("Dias de Atuação: " + diasAtuacao );
    }
    
}