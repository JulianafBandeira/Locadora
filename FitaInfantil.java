public class FitaInfantil extends FitaTipo {
    @Override
    public double getValorAluguel(int diasAlugado) {
        double valorDoAluguel = 1.5;
        if (diasAlugado > 3) {
            valorDoAluguel += (diasAlugado - 3) * 1.5;
        }
        return valorDoAluguel;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        return 1;
    }
}
