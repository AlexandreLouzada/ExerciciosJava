package controle;

public class TestaArray {

	public static void main(String[] args) {
		ListaArray lista = new ListaArray(5);

		// Adicionando elementos à lista
		lista.adicionar(10);
		lista.adicionar(20);
		lista.adicionar(30);
		lista.adicionar(40);	        
		System.out.println("Após adicionar elementos:");
		lista.imprimirLista();

		// Removendo um elemento da posição 1
		lista.remover(1);
		System.out.println("Após remover elemento da posição 1:");
		lista.imprimirLista();

		// Adicionando um elemento na posição específica
		lista.adicionar(25, 1);
		lista.imprimirLista();
		
		lista.adicionar(26, 0);
		lista.imprimirLista();
	}
}

