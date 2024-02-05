package bootcamp.ej2;

public class SerieDouble extends Serie<Double> {

    public SerieDouble(Double valorInicial, Double paso) {
        super(valorInicial, paso);
    }

    @Override
    public Double siguienteNumero() {
        this.valor = valor + paso;
        return valor;
    }

    @Override
    public void reiniciarSerie() {
        this.valor = valorInicial;
    }

    @Override
    public void establecerValorInicial(Double valorInicial) {
        this.valorInicial = valorInicial;
        this.valor = valorInicial;
    }
}

