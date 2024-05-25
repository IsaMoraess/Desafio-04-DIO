import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<String, Conta> contas;

    public Banco() {
        contas = new HashMap<>();
    }

    public void adicionarConta(Conta conta) {
        contas.put(conta.getNumero(), conta);
    }

    public Conta buscarConta(String numero) {
        return contas.get(numero);
    }

    public void aplicarRendimentos() {
        for (Conta conta : contas.values()) {
            conta.aplicarRendimento();
        }
    }
}
