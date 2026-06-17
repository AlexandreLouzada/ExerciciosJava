"""
Jogo da Velha (Tic-Tac-Toe)
Aplicação em Python que simula o clássico jogo da velha para dois jogadores
"""

class JogoDaVelha:
    def __init__(self):
        """Inicializa o tabuleiro e as variáveis do jogo"""
        self.tabuleiro = [[' ' for _ in range(3)] for _ in range(3)]
        self.jogador_atual = 'X'
        self.jogadas = 0
        
    def exibir_tabuleiro(self):
        """Exibe o tabuleiro atual do jogo"""
        print("\n")
        print("     0   1   2")
        print("   +---+---+---+")
        for i in range(3):
            print(f" {i} | {self.tabuleiro[i][0]} | {self.tabuleiro[i][1]} | {self.tabuleiro[i][2]} |")
            print("   +---+---+---+")
        print()
    
    def fazer_jogada(self, linha, coluna):
        """
        Realiza uma jogada no tabuleiro
        
        Args:
            linha: linha do tabuleiro (0-2)
            coluna: coluna do tabuleiro (0-2)
            
        Returns:
            True se a jogada foi válida, False caso contrário
        """
        if linha < 0 or linha > 2 or coluna < 0 or coluna > 2:
            print("❌ Posição inválida! Use valores entre 0 e 2.")
            return False
        
        if self.tabuleiro[linha][coluna] != ' ':
            print("❌ Posição já ocupada! Escolha outra.")
            return False
        
        self.tabuleiro[linha][coluna] = self.jogador_atual
        self.jogadas += 1
        return True
    
    def verificar_vitoria(self):
        """
        Verifica se há um vencedor
        
        Returns:
            True se houver vencedor, False caso contrário
        """
        # Verificar linhas
        for i in range(3):
            if (self.tabuleiro[i][0] == self.tabuleiro[i][1] == self.tabuleiro[i][2] != ' '):
                return True
        
        # Verificar colunas
        for j in range(3):
            if (self.tabuleiro[0][j] == self.tabuleiro[1][j] == self.tabuleiro[2][j] != ' '):
                return True
        
        # Verificar diagonais
        if (self.tabuleiro[0][0] == self.tabuleiro[1][1] == self.tabuleiro[2][2] != ' '):
            return True
        
        if (self.tabuleiro[0][2] == self.tabuleiro[1][1] == self.tabuleiro[2][0] != ' '):
            return True
        
        return False
    
    def verificar_empate(self):
        """
        Verifica se o jogo terminou em empate
        
        Returns:
            True se houver empate, False caso contrário
        """
        return self.jogadas == 9
    
    def trocar_jogador(self):
        """Alterna entre os jogadores X e O"""
        self.jogador_atual = 'O' if self.jogador_atual == 'X' else 'X'
    
    def reiniciar(self):
        """Reinicia o jogo"""
        self.tabuleiro = [[' ' for _ in range(3)] for _ in range(3)]
        self.jogador_atual = 'X'
        self.jogadas = 0
    
    def jogar(self):
        """Loop principal do jogo"""
        print("=" * 40)
        print("🎮  BEM-VINDO AO JOGO DA VELHA  🎮")
        print("=" * 40)
        print("\nRegras:")
        print("- Jogador 1: X")
        print("- Jogador 2: O")
        print("- Digite a linha e coluna (0-2) para fazer sua jogada")
        print("- Vence quem fizer 3 em linha (horizontal, vertical ou diagonal)")
        
        while True:
            self.exibir_tabuleiro()
            
            print(f"🎯 Vez do jogador {self.jogador_atual}")
            
            try:
                linha = int(input("Digite a linha (0-2): "))
                coluna = int(input("Digite a coluna (0-2): "))
                
                if not self.fazer_jogada(linha, coluna):
                    continue
                
                if self.verificar_vitoria():
                    self.exibir_tabuleiro()
                    print("=" * 40)
                    print(f"🎉 PARABÉNS! Jogador {self.jogador_atual} VENCEU! 🎉")
                    print("=" * 40)
                    break
                
                if self.verificar_empate():
                    self.exibir_tabuleiro()
                    print("=" * 40)
                    print("🤝 EMPATE! Ninguém venceu desta vez! 🤝")
                    print("=" * 40)
                    break
                
                self.trocar_jogador()
                
            except ValueError:
                print("❌ Entrada inválida! Digite apenas números.")
            except KeyboardInterrupt:
                print("\n\n👋 Jogo interrompido. Até logo!")
                break
        
        # Perguntar se deseja jogar novamente
        while True:
            resposta = input("\n🔄 Deseja jogar novamente? (s/n): ").lower()
            if resposta == 's':
                self.reiniciar()
                self.jogar()
                break
            elif resposta == 'n':
                print("\n👋 Obrigado por jogar! Até a próxima!")
                break
            else:
                print("❌ Resposta inválida! Digite 's' para sim ou 'n' para não.")


def main():
    """Função principal para iniciar o jogo"""
    jogo = JogoDaVelha()
    jogo.jogar()


if __name__ == "__main__":
    main()
