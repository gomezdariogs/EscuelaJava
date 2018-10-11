public class CuentaCorriente extends Cuenta {
    private double giro;

    //Constructores
    public CuentaCorriente(int numero, String cliente, double saldo, double giro) {
        super(numero, cliente, saldo);
        this.giro = giro;
    }
    public CuentaCorriente(){
    }

    //Get giro
    public double getGiro(){
        return giro;
    }

    //Metodo extraer
    @Override
    public void extraer(double monto){
        if (this.getSaldo() - monto >= -this.giro) {
            this.giro = this.giro - (monto - this.getSaldo());
            this.setSaldo(this.getSaldo() - monto);
        }
    }
}

