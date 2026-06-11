public class SistemaMain {
        public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println("   SISTEMA DE GESTÃO - ONG SOLIDÁRIA   ");
        System.out.println("========================================\n");

        Voluntario voluntario1 = new Voluntario();
        voluntario1.setNome("Ana Carla");
        voluntario1.setCpf("111.222.333-44");
        voluntario1.setDiasAtuacao(120);
        voluntario1.setSetor("Aula");

        System.out.println("====================== RESUMO DO VOLUNTÁRIO ======================");
        voluntario1.exibirResumo(); 
        System.out.println();

        Doador doador1 = new Doador();
        doador1.setNome("Ana Clara");
        doador1.setCpf("555.666.777-88");
        doador1.setDiasAtuacao(365);
        doador1.setValorDoadoMensal(1500.00);

        System.out.println("====================== RESUMO DO DOADOR ======================");
        doador1.exibirResumo();
        System.out.println();

        System.out.println("====================== TESTE DE REGRA DE NEGÓCIO ======================");
        System.out.println("Tentando setar -10 dias de atuação...");
        voluntario1.setDiasAtuacao(-10); 
        System.out.println();

        System.out.println("====================== PROJETO ======================");
        ProjetoSocial projeto = new ProjetoSocial();
        projeto.setNomeDoProjeto("Do lixo eletrônico ao luxo: Aprendendo a cultura maker com lixo eletrônico");
        projeto.setMetaImpacto(500);
        projeto.setLider(voluntario1); 

        projeto.iniciarProjeto(); 
    }
}