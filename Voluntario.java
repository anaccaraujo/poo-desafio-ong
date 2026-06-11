/*2. A herança: `Voluntario` e `Doador` (a especialização)

* Crie a subclasse `Voluntario` que herda (`extends`) de `MembroONG`.

   * Atributo específico: `setor` (String - ex: "Logística", "Aulas").

   * Sobrescrita: Use `@Override` para reescrever o método `exibirResumo()`, incluindo agora o setor do voluntário.*/


  public class Voluntario extends MembroONG {
    private String setor;

    public String getSetor(){
        return setor;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Setor: " + getSetor());
        System.out.println();
    }
  }