//Classe Fita
public class Fita implements FitaAluguelInterface {

    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    private FitaTipo fitaTipo;
    private String título;

    public Fita(String título, int códigoDePreço) {
        this.título = título;
        definePrecoPorTipo(códigoDePreço);
    }

    public String getTítulo() {
        return título;
    }

    @Override
    public double getValorAluguel(int diasAlugado) {
        return fitaTipo.getValorAluguel(diasAlugado);
    }

    @Override
    public int getPontos(int diasAlugado) {
        return fitaTipo.getPontosDeAlugadorFrequente(diasAlugado);
    }

    public void definePrecoPorTipo(int códigoDePreço) {
        switch (códigoDePreço) {
            case NORMAL:
                this.fitaTipo = new FitaNormal();
                break;
            case LANÇAMENTO:
                this.fitaTipo = new FitaLancamento();
                break;
            case INFANTIL:
                this.fitaTipo = new FitaInfantil();
                break;
        }
    }
}