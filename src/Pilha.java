public class Pilha {
    private Node topo;

    public boolean isVazio(){
        if (topo == null) return true;
        return false;
    }

    public void inserir(Solicitacao solicitacao){
        Node atual = new Node(solicitacao);
        if (!isVazio()){
            atual.proximo = topo;
            topo = atual;
        }
        else {
            this.topo = atual;
        }
    }

    public void remover(){
        if (!isVazio()){
            Node atual = topo;
            topo = topo.proximo;
            atual.proximo = null;
        }
        else {
            System.out.println("A pilha esta vazia");
        }
    }

    public Solicitacao bisbilhotar(){
        if (!isVazio()){
            return topo.solicitacao;
        }
        else {
            System.out.println("A pilha esta vazia");
            return null;
        }
    }

    public void printar(){
        if (!isVazio()){
            Node atual = topo;

            while (atual != null){
                System.out.println("-----------------");
                System.out.println("| " + atual.solicitacao.id + " |");
                System.out.println("| " + atual.solicitacao.descricao + " |");
                System.out.println("| " + atual.solicitacao.datahora + " |");
                System.out.println("-----------------");

                atual = atual.proximo;
            }
        }
        else {
            System.out.println("A Pilha esta vazia");
        }
    }
}
