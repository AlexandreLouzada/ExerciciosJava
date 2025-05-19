package controle;

class ListaArray {
    private int[] array;
    private int tamanho;

    // Construtor que inicializa a lista com uma capacidade específica
    public ListaArray(int capacidade) {
        this.array = new int[capacidade];
        this.tamanho = 0;
    }

    // Método para adicionar um elemento no final da lista
    public void adicionar(int elemento) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = elemento;
    }

    // Método para adicionar um elemento em uma posição específica
    public void adicionar(int elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho || tamanho == array.length) {
            System.out.println("Erro: Posição inválida ou lista cheia!");
            return;
        }
        for (int i = tamanho; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
        tamanho++;
    }

    // Método para remover um elemento de uma posição específica
    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;
    }

    // Método para imprimir todos os elementos da lista
    public void imprimirLista() {
        if (tamanho == 0) {
            System.out.println("Lista vazia.");
            return;
        }
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

