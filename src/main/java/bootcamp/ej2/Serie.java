package bootcamp.ej2;

public abstract class Serie <T extends Number> {

    protected T valor;
    protected T valorInicial;
    protected T paso;

    public T getPaso() {
        return paso;
    }

    public void setPaso(T paso) {
        this.paso = paso;
    }

    public T getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(T valorInicial) {
        this.valorInicial = valorInicial;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public Serie(T valorInicial, T paso) {
        this.valor = valorInicial;
        this.valorInicial = valorInicial;
        this.paso = paso;
    }

    public abstract T siguienteNumero();

    public abstract void reiniciarSerie();

    public abstract void establecerValorInicial(T valorInicial);

}
