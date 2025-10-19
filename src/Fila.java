public class Fila {
    private Node frente;
    private Node tras;

    public Fila(){
        this.frente = null;
        this.tras = null;
    }

    public void inserir(Cliente cliente){
        Node newNode = new Node(cliente);
        if (!isVazio()){
            tras.proximo = newNode;
            tras = newNode;
        }
        else{
            frente = newNode;
            tras = newNode;
        }
    }

    public void remover(){
        if (!isVazio()){
            Node temp = frente;
            frente = frente.proximo;
            temp.proximo = null;
        }
        else {
            System.out.println("A fila esta vazia");
        }
    }

    public boolean isVazio(){
        if (frente == null && tras == null) return true;
        return false;
    }

    public void printar(){
        if (!isVazio()){
           Node atual = frente;

           while (atual != null){
               System.out.println("-----------------");
               System.out.println("| " + atual.cliente.id + " |");
               System.out.println("| " + atual.cliente.nome + " |");
               System.out.println("| " + atual.cliente.descricao + " |");
               System.out.println("-----------------");

               atual = atual.proximo;
           }
        }
        else {
            System.out.println("A fila esta vazia");
        }
    }
}
