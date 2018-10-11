import org.junit.Test;

public class CuentaTest {

    @Test
    public void testDepositar(){
        Cuenta cuenta = new Cuenta(1234,"Dario",1000);
        cuenta.depositar(400);
        assert(cuenta.getSaldo() == 1400);
    }

    @Test
    public void testExtraer(){
        Cuenta cuenta = new Cuenta(1234,"Dario",1000);
        cuenta.extraer(800);
        assert(cuenta.getSaldo() == 200);
    }

    @Test
    public void testExtraerSaldoVacio(){
        Cuenta cuenta = new Cuenta(1234,"Dario",0);
        cuenta.extraer(2300);
        assert(cuenta.getSaldo() == 0);
    }

    @Test
    public void testExtraerMontoMayorASaldo(){
        Cuenta cuenta = new Cuenta(1234,"Dario",1000);
        cuenta.extraer(1200);
        assert(cuenta.getSaldo() == 1000);
    }

    @Test
    public void testExtraerCtaCte(){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1234,"Dario",1000,500);
        cuentaCorriente.extraer(1300);
        assert(cuentaCorriente.getSaldo() == -300);
        assert(cuentaCorriente.getGiro() == 200);
    }

    @Test
    public void testExtraerCtaCteSaldoVacio(){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1234,"Dario",0,500);
        cuentaCorriente.extraer(500);
        assert(cuentaCorriente.getSaldo() == -500);
        assert(cuentaCorriente.getGiro() == 0);
    }

    @Test
    public void testExtraerCtaCteMontoFueraDelGiro(){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(1234,"Dario",1000,500);
        cuentaCorriente.extraer(1700);
        assert(cuentaCorriente.getSaldo() == 1000);
        assert(cuentaCorriente.getGiro()== 500);
    }
}