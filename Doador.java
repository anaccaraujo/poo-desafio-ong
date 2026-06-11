/* 2. A herança: `Voluntario` e `Doador` (a especialização)

* Crie a subclasse `Doador` que herda (`extends`) de `MembroONG`.

   * Atributo específico: `valorDoadoMensal` (double).

   * Sobrescrita: Use `@Override` para reescrever o método `exibirResumo()`, exibindo o status de "Doador Ativo" e o valor.*/


  public class Doador extends MembroONG {
    private double valorDoadoMensal;

    public double getValorDoadoMensal(){
        return valorDoadoMensal;
    }

    public void setValorDoadoMensal(double valorDoadoMensal){
        if(valorDoadoMensal >= 0){
            this.valorDoadoMensal = valorDoadoMensal;
        } else {
            System.out.println("ERRO: Valor doado não pode ser negativo.");
        }
        
    }

    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Status: Doador Ativo");
        System.out.println("Valor Doado Mensal: R$ " + getValorDoadoMensal());
        System.out.println();
    }
  }