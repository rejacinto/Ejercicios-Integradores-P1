package bootcamp.ej2;

public class SerieInteger extends Serie<Integer> {

    public SerieInteger(Integer valorInicial, Integer paso) {
        super(valorInicial, paso);
    }

    @Override
    public Integer siguienteNumero() {
        this.valor = valor + paso;
        return valor;
    }

    @Override
    public void reiniciarSerie() {
        this.valor = valorInicial;
    }

    @Override
    public void establecerValorInicial(Integer valorInicial) {
        this.valorInicial = valorInicial;
        this.valor = valorInicial;
    }
}
