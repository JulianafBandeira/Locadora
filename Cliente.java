import java.util.*;

public class Cliente {
    private String nome;
    private List fitasAlugadas = new ArrayList();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    // Esse método tinha muita responsabilidade, então foi quebrado em várias partes
    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        while (alugueis.hasNext()) {
            Aluguel cada = (Aluguel) alugueis.next();
            // determina valores para cada linha
            double valorCorrente = cada.computaValor();

            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente += cada.computaPontos();

            // mostra valores para este aluguel
            resultado += "\t" + cada.getFita().getTítulo() + "\t" + valorCorrente +
                    fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
        return resultado;
    }
}