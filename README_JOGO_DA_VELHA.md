# 🎮 Jogo da Velha em Python

Uma implementação completa do clássico jogo da velha (Tic-Tac-Toe) em Python para dois jogadores.

## 📋 Descrição

Este é um jogo da velha interativo que roda no terminal/console. Dois jogadores se alternam fazendo jogadas em um tabuleiro 3x3, tentando formar uma linha de três símbolos iguais (horizontal, vertical ou diagonal).

## ✨ Funcionalidades

- ✅ Tabuleiro 3x3 visual e intuitivo
- ✅ Dois jogadores (X e O)
- ✅ Validação de jogadas
- ✅ Detecção automática de vitória
- ✅ Detecção de empate
- ✅ Opção de jogar novamente
- ✅ Interface com emojis e mensagens coloridas
- ✅ Tratamento de erros e entradas inválidas

## 🚀 Como Executar

### Pré-requisitos
- Python 3.6 ou superior instalado

### Executando o Jogo

1. Abra o terminal/prompt de comando
2. Navegue até o diretório onde está o arquivo
3. Execute o comando:

```bash
python jogo_da_velha.py
```

## 🎯 Como Jogar

1. O jogo começa com o jogador X
2. Quando for sua vez, digite:
   - A **linha** (0, 1 ou 2)
   - A **coluna** (0, 1 ou 2)
3. O tabuleiro é organizado assim:

```
     0   1   2
   +---+---+---+
 0 |   |   |   |
   +---+---+---+
 1 |   |   |   |
   +---+---+---+
 2 |   |   |   |
   +---+---+---+
```

4. Para marcar o centro, por exemplo, digite: linha `1`, coluna `1`
5. O jogo alterna automaticamente entre os jogadores
6. Vence quem conseguir 3 símbolos em linha primeiro
7. Se todas as 9 posições forem preenchidas sem vencedor, é empate

## 📝 Exemplos de Jogadas

- **Posição superior esquerda**: linha `0`, coluna `0`
- **Posição central**: linha `1`, coluna `1`
- **Posição inferior direita**: linha `2`, coluna `2`

## 🏆 Condições de Vitória

O jogo verifica automaticamente as seguintes condições:
- **3 em linha horizontal** (mesma linha)
- **3 em linha vertical** (mesma coluna)
- **3 em diagonal** (principal ou secundária)

## 🔧 Estrutura do Código

O código está organizado em uma classe `JogoDaVelha` com os seguintes métodos:

- `__init__()`: Inicializa o jogo
- `exibir_tabuleiro()`: Mostra o tabuleiro atual
- `fazer_jogada()`: Processa uma jogada
- `verificar_vitoria()`: Verifica se há vencedor
- `verificar_empate()`: Verifica se houve empate
- `trocar_jogador()`: Alterna entre jogadores
- `reiniciar()`: Reinicia o jogo
- `jogar()`: Loop principal do jogo

## 🛡️ Validações Implementadas

- ✅ Verifica se a posição está dentro do tabuleiro (0-2)
- ✅ Verifica se a posição já está ocupada
- ✅ Valida se a entrada é um número
- ✅ Trata interrupções do teclado (Ctrl+C)

## 🎨 Características Técnicas

- **Linguagem**: Python 3
- **Paradigma**: Programação Orientada a Objetos
- **Interface**: Terminal/Console
- **Dependências**: Nenhuma (usa apenas biblioteca padrão)

## 📚 Conceitos de Programação Utilizados

- Classes e Objetos
- Listas bidimensionais (matriz)
- Loops (while, for)
- Condicionais (if/elif/else)
- Tratamento de exceções (try/except)
- Métodos e funções
- Docstrings

## 🤝 Contribuições

Sinta-se à vontade para melhorar o código! Algumas ideias:
- Adicionar modo contra o computador (IA)
- Implementar níveis de dificuldade
- Adicionar placar de vitórias
- Criar interface gráfica (GUI)
- Adicionar sons e efeitos

## 📄 Licença

Este projeto é de código aberto e está disponível para uso educacional.

## 👨‍💻 Autor

Desenvolvido como exercício de programação em Python.

---

**Divirta-se jogando! 🎉**
