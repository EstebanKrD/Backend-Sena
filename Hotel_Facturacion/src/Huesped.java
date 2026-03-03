public class Huesped {
    private int noches;
    private double valorNoche;
    private double consumo;

    public Huesped(int noches, double valorNoche, double consumo) {
        this.noches = (noches < 0) ? 0 : noches;
        this.valorNoche = (valorNoche < 0) ? 0 : valorNoche;
        this.consumo = (consumo < 0) ? 0 : consumo;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = (noches < 0) ? 0 : noches;
    }

    public double getValorNoche() {
        return valorNoche;
    }

    public void setValorNoche(double valorNoche) {
        this.valorNoche = (valorNoche < 0) ? 0 : valorNoche;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = (consumo < 0) ? 0 : consumo;
    }

    public double calcularTotal() {
        return (noches * valorNoche) + consumo;
    }
}