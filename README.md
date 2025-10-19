# Sistema de Gerenciamento de Atendimento ao Cliente

Este projeto implementa um sistema de gerenciamento de atendimento ao cliente em Java, utilizando **listas encadeadas** para criar uma **pilha** (para histórico de solicitações) e uma **fila** (para ordem de atendimento de clientes). 
## Estrutura do Projeto

O projeto é composto por cinco classes principais:

1. **Solicitacao.java**: Representa uma solicitação de serviço com ID, descrição e data/hora.
2. **Cliente.java**: Representa um cliente com ID, nome e motivo do atendimento.
3. **Node.java**: Classe auxiliar que define o nó da lista encadeada, suportando tanto `Solicitacao` quanto `Cliente`.
4. **Pilha.java**: Implementa uma pilha para armazenar o histórico de solicitações usando uma lista encadeada.
5. **Fila.java**: Implementa uma fila para gerenciar a ordem de atendimento de clientes usando uma lista encadeada.
6. **Main.java**: Demonstra o funcionamento do sistema, inserindo e removendo elementos da pilha e da fila, além de exibir seus conteúdos.

## Descrição das Classes

### 1. Solicitacao.java
- **Propósito**: Representa uma solicitação de serviço no histórico.
- **Atributos**:
    - `id` (String): Identificador único da solicitação.
    - `descricao` (String): Descrição do serviço solicitado.
    - `datahora` (String): Data e hora da solicitação.
- **Métodos**:
    - Construtor: Inicializa os atributos `id`, `descricao` e `datahora`.


### 2. Cliente.java
- **Propósito**: Representa um cliente na fila de atendimento.
- **Atributos**:
    - `id` (String): Identificador único do cliente.
    - `nome` (String): Nome do cliente.
    - `descricao` (String): Motivo do atendimento.
- **Métodos**:
    - Construtor: Inicializa os atributos `id`, `nome` e `descricao`.


### 3. Node.java
- **Propósito**: Define o nó da lista encadeada, usado tanto pela pilha quanto pela fila.
- **Atributos**:
    - `cliente` (Cliente): Referência a um objeto `Cliente` (nulo para nós da pilha).
    - `solicitacao` (Solicitacao): Referência a um objeto `Solicitacao` (nulo para nós da fila).
    - `proximo` (Node): Referência ao próximo nó na lista encadeada.
- **Métodos**:
    - Construtor para `Cliente`: Inicializa o nó com um `Cliente` e define `solicitacao` como nulo.
    - Construtor para `Solicitacao`: Inicializa o nó com uma `Solicitacao` e define `cliente` como nulo.

### 4. Pilha.java
- **Propósito**: Implementa uma pilha para armazenar o histórico de solicitações usando uma lista encadeada.
- **Atributos**:
    - `topo` (Node): Referência ao nó no topo da pilha.
- **Métodos**:
    - `isVazio()`: Verifica se a pilha está vazia (retorna `true` se `topo` é nulo).
    - `inserir(Solicitacao)`: Adiciona uma nova solicitação ao topo da pilha, criando um novo nó e ajustando `topo`.
    - `remover()`: Remove a solicitação do topo, atualizando `topo` para o próximo nó. Exibe uma mensagem se a pilha estiver vazia.
    - `bisbilhotar()`: Retorna a solicitação no topo sem removê-la (funcionalidade extra, não exigida).
    - `printar()`: Exibe todas as solicitações na pilha, mostrando `id`, `descricao` e `datahora` de cada uma.

### 5. Fila.java
- **Propósito**: Implementa uma fila para gerenciar a ordem de atendimento de clientes usando uma lista encadeada.
- **Atributos**:
    - `frente` (Node): Referência ao nó na frente da fila.
    - `tras` (Node): Referência ao nó no final da fila.
- **Métodos**:
    - `isVazio()`: Verifica se a fila está vazia (retorna `true` se `frente` e `tras` são nulos).
    - `inserir(Cliente)`: Adiciona um cliente ao final da fila, criando um novo nó e ajustando `tras` (e `frente`, se a fila estiver vazia).
    - `remover()`: Remove o cliente da frente da fila, atualizando `frente` para o próximo nó. Exibe uma mensagem se a fila estiver vazia.
    - `printar()`: Exibe todos os clientes na fila, mostrando `id`, `nome` e `descricao` de cada um.


### 6. Main.java
- **Propósito**: Demonstra o funcionamento da pilha e da fila.
- **Funcionalidades**:
    - Cria uma instância de `Fila` e `Pilha`.
    - Insere 10 clientes na fila, cada um com `id`, `nome` e `descricao`.
    - Insere 10 solicitações na pilha, cada uma com `id`, `descricao` e `datahora`.
    - Remove um cliente da fila (simulando atendimento) and exibe a fila atualizada.
    - Remove uma solicitação da pilha (simulando exclusão do histórico) and exibe a pilha atualizada.
    - Exibe o estado final da pilha e da fila.


## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Vareja0/Pilha_fila_atendimento.git
   ```
2. Compile os arquivos Java:
    ```bash
   javac *.java
   ```
3. Execute o programa:
    ```bash
   java Main
   ```
4. A saída mostrará:
- A fila após remover um cliente.
- A pilha após remover uma solicitação.
- O estado final da pilha e da fila.
