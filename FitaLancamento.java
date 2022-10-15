public class FitaLancamento extends FitaTipo{

    @Override
    public double getValorAluguel(int diasAlugado) {
        return diasAlugado * 3;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        return (diasAlugadas > 1) ? 2 : 1;
    }
}
