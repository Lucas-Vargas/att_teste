



public class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) throws Exception{
        this.saldo = saldoInicial;
        if (this.saldo <= 0) {
            System.out.println("Saldo inicial precisa ser maior que 0");
            throw new Exception("Saldo inicial precisa ser maior que 0");
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void depositarValor(double valor) throws Exception {
        if(valor < 0){
            throw new Exception("Impossivel depositar 0 ou negativo");
        }
        saldo += valor;
    }

    public void sacarValor(double valor) throws Exception {
        if(saldo < 0 || valor>saldo || valor < 0) {
            throw new Exception("Saldo insuficiente");
        }
            saldo -= valor;
    }

    public void consutarSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public boolean verificaNum(String numero){
        try{
            double num = Double.parseDouble(numero);
            return true;
        }catch(Exception e){
            return false;
        }
    }

}
