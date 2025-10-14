🧮 Projeto: Busca de Elemento em Matriz
📘 Descrição

Este programa em Java permite que o usuário crie uma matriz de tamanho N x M, insira seus elementos e, em seguida, informe um número a ser procurado dentro da matriz.
Quando o número é encontrado, o programa exibe seus vizinhos (esquerda, direita, acima e abaixo), respeitando os limites da matriz.

🚀 Funcionalidades

Leitura do tamanho da matriz (N linhas e M colunas);

Preenchimento dos valores da matriz pelo usuário;

Busca de um número específico;

Exibição dos valores adjacentes (se existirem) ao número encontrado;

Tratamento de bordas (não tenta acessar posições inexistentes da matriz).

🧩 Exemplo de execução
🖥️ Entrada:
Digite o numero N para matriz:
3
Digite o numero M para matriz:
3
Digite os elementos da matriz:
1 2 3
4 5 6
7 8 9
Digite o número a ser procurado:
5

📤 Saída:
Posição 1,1:
Esquerda: 4
Direita: 6
Em cima: 2
Abaixo: 8

🧠 Lógica do programa

O programa usa dois loops for aninhados para percorrer toda a matriz;

Quando o valor procurado é encontrado:

Verifica se há elemento à esquerda (j > 0);

Verifica se há elemento à direita (j < m - 1);

Verifica se há elemento acima (i > 0);

Verifica se há elemento abaixo (i < n - 1);

Essas verificações evitam o erro ArrayIndexOutOfBoundsException.

🛠️ Tecnologias utilizadas

Linguagem: Java

Ferramenta de entrada: Scanner

Estrutura de dados: Matriz bidimensional (int[][])
