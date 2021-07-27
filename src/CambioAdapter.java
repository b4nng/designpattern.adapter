public class CambioAdapter extends CambioReal{
    private ICambio cambioDolar;
    public CambioAdapter(ICambio cambioDolar){
        this.cambioDolar = cambioDolar;
    }

    public float getCambio(){
        cambioDolar.setCambio(this.getReal()*5);
        return cambioDolar.getCambio();
    }

    public void saveCambio(){
        this.setReal(cambioDolar.getCambio()/5);
    }

}
