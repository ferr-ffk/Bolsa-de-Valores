import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Bolsa_Valores {
    public static void main(String[] args) {
        List<Investidor> investidores = new LinkedList<>();
        List<Corretora> corretoras = new LinkedList<>();
        List<Ativo> ativos = new LinkedList<>();
        List<Ordem> ordens = new LinkedList<>();

        // Exemplo de uso
        Investidor investidor1 = new Investidor("Investidor1", "123456789");
        Investidor investidor2 = new Investidor("Investidor2", "987654321");

        Corretora corretora1 = new Corretora("Corretora1");
        Corretora corretora2 = new Corretora("Corretora2");

        Acao acao1 = new Acao("AAPL", "Apple Inc.");
        Acao acao2 = new Acao("GOOGL", "Alphabet Inc.");
        FII fii1 = new FII("FII123", "FII Exemplo");

        Carteira carteira1 = new Carteira("Carteira1", investidor1);
        Carteira carteira2 = new Carteira("Carteira2", investidor2);

        Ordem ordem1 = new Ordem("Compra", 10, 150.0, investidor1, acao1, corretora1);
        Ordem ordem2 = new Ordem("Venda", 5, 160.0, investidor1, acao2, corretora1);
        Ordem ordem3 = new Ordem("Compra", 8, 200.0, investidor2, acao1, corretora2);
        Ordem ordem4 = new Ordem("Venda", 3, 250.0, investidor2, fii1, corretora2);

        investidores.add(investidor1);
        investidores.add(investidor2);

        corretoras.add(corretora1);
        corretoras.add(corretora2);

        ativos.add(acao1);
        ativos.add(acao2);
        ativos.add(fii1);

        ordens.add(ordem1);
        ordens.add(ordem2);
        ordens.add(ordem3);
        ordens.add(ordem4);

        // Listas de exemplo para uso nos relatórios
        List<Ativo> composicaoCarteiraInvestidor1 = investidor1.getComposicaoCarteira();
        List<Ativo> acoesMaisNegociadas = RelatorioService.acoesMaisNegociadas(ativos);
        List<Corretora> corretorasComMaisOrdens = RelatorioService.corretorasComMaisOrdens(corretoras);
    }

    // Substituir o investidor1 pelo investidor desejeado
List<Ativo> composicaoInvestidor1 = RelatorioService.composicaoCarteiraInvestidor(investidor1);


List<Corretora> corretorasMaisOrdens = RelatorioService.corretorasComMaisOrdens(corretoras);


List<Ativo> acoesMaisNegociadasList = RelatorioService.acoesMaisNegociadas(ativos);

}
