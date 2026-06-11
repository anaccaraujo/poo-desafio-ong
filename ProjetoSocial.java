/*3. A composição: `ProjetoSocial` ("o lego")

* Regra do TEM-UM: Um projeto de extensão não é um voluntário, ele tem um voluntário líder.

* Crie a classe `ProjetoSocial`.

* Atributos: `nomeDoProjeto` (String), `metaImpacto` (int - número de pessoas atendidas).

* Composição: Adicione um atributo `lider` do tipo `Voluntario`.

* Comportamento: Crie um método `iniciarProjeto()` que imprima uma mensagem dizendo que o projeto começou, quem é o líder responsável e qual o setor dele.*/


public class ProjetoSocial{
    private String nomeDoProjeto;
    private int metaImpacto;
    private Voluntario lider;

    public String getNomeDoProjeto(){
        return nomeDoProjeto;
    }

    public void setNomeDoProjeto(String nomeDoProjeto){
        this.nomeDoProjeto = nomeDoProjeto;
    }

    public int getMetaImpacto(){
        return metaImpacto;
    }

    public void setMetaImpacto(int metaImpacto){
        if(metaImpacto >= 0){
            this.metaImpacto = metaImpacto;
        } else{
            System.out.println("ERRO: Meta de pessoas impactada não pode ser negativa.");
        }
    }

    public Voluntario getLider(){
        return lider;
    }

    public void setLider(Voluntario lider){
        this.lider = lider;
    }

    public void iniciarProjeto(){
        System.out.println("Nome do Projeto: " + nomeDoProjeto);
        System.out.println("Meta: Atender " + metaImpacto + " pessoas.");

        if(lider != null){
            System.out.println("Líder do Projeto: " + lider.getNome());
            System.out.println("Setor do Líder: " + lider.getSetor());
        } else{
            System.out.println("Esse projeto ainda não possui líder definido.");
        }

        System.out.println("Projeto inicializado com sucesso!");
    }
}