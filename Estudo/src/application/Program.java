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
