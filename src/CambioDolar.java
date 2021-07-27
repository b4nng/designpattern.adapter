public class CambioDolar implements ICambio{

    private float dolar;

    @Override
    public float getCambio() {
        return this.dolar;
    }

    @Override
    public void setCambio(float dolares) {
        this.dolar = dolares;
    }
}
