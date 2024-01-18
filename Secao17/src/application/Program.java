package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		FileReader fr = null;
		BufferedReader br = null;
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> lines = new ArrayList<Product>();
		
		System.out.print("Quantos produtos você quer criar: ");
		int qtd = sc.nextInt();	
		
		for(int i=0;i<qtd;i++) {
			System.out.println("Produto "+(i+1)+ " nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Preço: ");
			double price = sc.nextDouble();
			System.out.println("Quantidade: ");
			int quantity = sc.nextInt();
			Product produto = new Product(i, nome, price, quantity);
			lines.add(produto);
		}
		
		/*
		Product produto = new Product(1, "Celular", 1000.00, 3);
		lines.add(produto);
		Product produto2 = new Product(2, "TV", 200.00, 1);
		lines.add(produto2);
		Product produto3 = new Product(3, "Caixa", 0.05, 50);
		lines.add(produto3);
		for(int i=0;i<lines.size();i++) {
			System.out.println(lines.get(i).getName()+";"+lines.get(i).getPrice()+";"+lines.get(i).getQuantity());
			System.out.println(lines.get(i).getName()+";"+lines.get(i).tot());
		}
		*/
		
		System.out.println("Entre com o path:");
		sc.nextLine();
		String strPath = sc.nextLine();
		//String strPath = "C:\\OneDrive\\Área de Trabalho";
		System.out.println("Entre com o nome da pasta:");
		String strFolder = sc.nextLine();
		//String strFolder = "teste01";
		System.out.println("Entre com o nome do arquivo:");
		String strFile = (sc.nextLine()+".txt");
		//String strFile = "teste01.txt";
		String absoluteFilePath  = strPath+"\\"+strFolder+"\\"+strFile;
		
		File path = new File(strFile);
		boolean success = new File(strPath+"\\"+strFolder).mkdir();
		System.out.println("Directory created successfully: " + success);
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(absoluteFilePath))) {
			for(int i=0;i<lines.size();i++) {
				String line = lines.get(i).getName()+";"+lines.get(i).getPrice()+";"+lines.get(i).getQuantity();
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
