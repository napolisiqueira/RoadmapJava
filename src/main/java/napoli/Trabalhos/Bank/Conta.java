package napoli.Trabalhos.Bank;

public abstract class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int NumeroSeq = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;


    public Conta () {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = NumeroSeq++;
    }


    @Override
    public void sacar(double valor){
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor){
        this.saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirExtrato() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
