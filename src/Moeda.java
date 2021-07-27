public class Moeda {
    ICambio cambio;
    CambioAdapter persistencia;

    public Moeda(){
        cambio = new CambioDolar();
        persistencia = new CambioAdapter(cambio);
    }

    public void setCambio(float valor){
        cambio.setCambio(valor);
        persistencia.saveCambio();
    }
    public float getCambio(){
        return persistencia.getCambio();
    }

    public float getReal(){
        return persistencia.getReal();
    }
}
