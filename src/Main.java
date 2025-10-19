void main() {
    Fila fila = new Fila();
    Pilha pilha = new Pilha();

    // Inserir clientes na fila (filaAtendimento)
    Cliente[] filaAtendimento = new Cliente[] {
            new Cliente("CLI001", "Maria Silva", "Dúvida sobre produto"),
            new Cliente("CLI002", "João Souza", "Reclamação de serviço"),
            new Cliente("CLI003", "Ana Costa", "Solicitação de reembolso"),
            new Cliente("CLI004", "Pedro Alves", "Informações de entrega"),
            new Cliente("CLI005", "Carla Dias", "Agendamento de visita"),
            new Cliente("CLI006", "Lucas Martins", "Alteração de pedido"),
            new Cliente("CLI007", "Patrícia Rocha", "Cancelamento de contrato"),
            new Cliente("CLI008", "Rafael Lima", "Renovação de assinatura"),
            new Cliente("CLI009", "Fernanda Gomes", "Suporte para instalação"),
            new Cliente("CLI010", "Carlos Eduardo", "Pedido de orçamento")
    };

    for (Cliente cliente : filaAtendimento) {
        fila.inserir(cliente);
    }

    Solicitacao[] historico = new Solicitacao[] {
            new Solicitacao("REQ001", "Instalação de software", "2024-08-20 10:30"),
            new Solicitacao("REQ002", "Manutenção preventiva", "2024-08-20 11:00"),
            new Solicitacao("REQ003", "Atualização de sistema", "2024-08-20 11:30"),
            new Solicitacao("REQ004", "Suporte técnico", "2024-08-20 12:00"),
            new Solicitacao("REQ005", "Troca de equipamento", "2024-08-20 12:30"),
            new Solicitacao("REQ006", "Consulta de garantia", "2024-08-20 13:00"),
            new Solicitacao("REQ007", "Reparo de impressora", "2024-08-20 13:30"),
            new Solicitacao("REQ008", "Configuração de rede", "2024-08-20 14:00"),
            new Solicitacao("REQ009", "Restauração de dados", "2024-08-20 14:30"),
            new Solicitacao("REQ010", "Consulta técnica", "2024-08-20 15:00")
    };

    for (Solicitacao solicitacao : historico) {
        pilha.inserir(solicitacao);
    }

    System.out.println("\n=== Atendendo o próximo cliente ===");
    fila.remover();
    System.out.println("Cliente atendido. Nova fila:");
    fila.printar();

    System.out.println("\n=== Removendo solicitação do histórico ===");
    pilha.remover();
    System.out.println("Solicitação removida. Novo histórico:");
    pilha.printar();


    pilha.printar();
    fila.printar();
}
