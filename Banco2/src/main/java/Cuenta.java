public class Cuenta {
    private int numero;
    private String cliente;
    private double saldo;


    //Constructores
    public Cuenta(int numero, String cliente, double saldo){
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    public Cuenta() {
    }

    //Get y Set saldo
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    //Metodos pedidos
    public void depositar(double monto) {
        this.saldo = this.saldo + monto;
    }

    public void extraer(double monto){
        if((this.saldo-monto) >=0){
            this.saldo = this.saldo - monto;
        }
    }

}
