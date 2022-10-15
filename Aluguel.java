public class Aluguel {
    private FitaAluguelInterface fita;
    private int diasAlugada;

    public Aluguel(FitaAluguelInterface fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public FitaAluguelInterface getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public double computaValor(){
        return this.fita.getValorAluguel(diasAlugada);
    }

    public int computaPontos(){
        return this.fita.getPontos(diasAlugada);
    }
}