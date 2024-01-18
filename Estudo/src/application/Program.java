package application;

import java.util.Scanner;

import entities.Matriz;
import entities.Ordenacao;

public class Program {

	public static void main(String[] args) {
		int valorLimite = 9999;
		Ordenacao ordem = new Ordenacao();
		int[] vetor =  ordem.aleatorio(valorLimite);
		ordem.bobbleSort(vetor);
		ordem.insertSort(vetor);
		ordem.selectSort(vetor);
		ordem.quickSortChamada(vetor, 1, valorLimite-1);
		ordem.shellSort(vetor);
		ordem.mergeSortChamada(vetor, 1, valorLimite-1);
		ordem.heapSort(vetor);
		
	}

}



/*
 * Claro, aqui estão 20 exercícios de Java, do mais fácil ao mais difícil:

1. **Olá, Mundo!**
```java
// Escreva um programa que imprima "Olá, Mundo!" na tela.
```

2. **Soma de Dois Números**
```java
// Escreva um programa que some dois números.
```

3. **Tabuada**
```java
// Escreva um programa que imprima a tabuada de um número.
```

4. **Fatorial**
```java
// Escreva um programa que calcule o fatorial de um número.
```

5. **Fibonacci**
```java
// Escreva um programa que imprima a sequência de Fibonacci até um determinado número.
```

6. **Palíndromo**
```java
// Escreva um programa que verifique se uma string é um palíndromo.
```

7. **Ordenação de Array**
```java
// Escreva um programa que ordene um array de inteiros.
```

8. **Busca Binária**
```java
// Implemente um algoritmo de busca binária.
```

9. **Maior e Menor Elemento de um Array**
```java
// Escreva um programa que encontre o maior e o menor elemento de um array.
```

10. **Inversão de String**
```java
// Escreva um programa que inverta uma string.
```

11. **Remoção de Elementos Duplicados em um Array**
```java
// Escreva um programa que remova elementos duplicados de um array.
```

12. **Número Primo**
```java
// Escreva um programa que verifique se um número é primo.
```

13. **Subarray com a Maior Soma**
```java
// Escreva um programa que encontre o subarray contíguo com a maior soma em um array de números.
```

14. **Subsequência Comum Mais Longa**
```java
// Escreva um programa que encontre a subsequência comum mais longa entre duas strings.
```

15. **Árvore Binária de Busca**
```java
// Implemente uma árvore binária de busca.
```

16. **Percorrimento em Profundidade de um Grafo**
```java
// Implemente o percorrimento em profundidade (DFS) de um grafo.
```

17. **Percorrimento em Largura de um Grafo**
```java
// Implemente o percorrimento em largura (BFS) de um grafo.
```

18. **Algoritmo de Dijkstra**
```java
// Implemente o algoritmo de Dijkstra para encontrar o caminho mais curto em um grafo.
```

19. **Algoritmo de Kruskal**
```java
// Implemente o algoritmo de Kruskal para encontrar a árvore geradora mínima de um grafo.
```

20. **Algoritmo de Prim**
```java
// Implemente o algoritmo de Prim para encontrar a árvore geradora mínima de um grafo.
```

Lembre-se de testar e depurar cada programa para garantir que ele funcione corretamente. Boa sorte com seus estudos de Java! 😊
 * */
