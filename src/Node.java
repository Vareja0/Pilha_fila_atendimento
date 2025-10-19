public class Node {
    Cliente cliente;
    Solicitacao solicitacao;
    Node proximo;

    public Node(Cliente cliente){
        this.cliente = cliente;
        this.solicitacao = null;
        this.proximo = null;
    }

    public Node(Solicitacao solicitacao){
        this.cliente = null;
        this.solicitacao = solicitacao;
        this.proximo = null;
    }
}
