import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContaBacariaTest {

//Construtor----------------------------------------------------------------------
    @Test
    public void saldoInicialMenorQueZero(){
        assertThrows(Exception.class, ()->{
            ContaBancaria conta = new ContaBancaria(-200);
        });
    }
//---------------------------------------------------------------------------------

//Deposito-------------------------------------------------------------------------
    @Test
    public void depositoMenorQueZero() {
        assertThrows(Exception.class, ()->{
            ContaBancaria conta = new ContaBancaria(200);
            conta.depositarValor(-100);
        });
    }
//----------------------------------------------------------------------------------

//Saque-----------------------------------------------------------------------------
    @Test
    public void sacarMenorQueZero(){
        assertThrows(Exception.class, ()->{
            ContaBancaria conta = new ContaBancaria(200);
            conta.sacarValor(-100);
        });
    }

    @Test
    public void sacarMaiorQueSaldo(){
        assertThrows(Exception.class, ()->{
            ContaBancaria conta = new ContaBancaria(200);
            conta.sacarValor(300);
        });
    }
//------------------------------------------------------------------------------------

    @Test
    public void verificaSaldo() throws Exception {
        ContaBancaria conta1 = new ContaBancaria(200);
        assertEquals(200, conta1.getSaldo());
    }

}//Class end
