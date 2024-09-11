package filereader;

import java.util.*;
import java.io.*;

public class File {
	public static void main(String[] args) throws Exception{
		ArrayList<Materials> list = new ArrayList<Materials>(); 
		
		FileReader file = new FileReader("materiais.txt");   //file i want to get content
		BufferedReader line = new BufferedReader(file);   //file will be read per line
		
		String aux = line.readLine();  // variable will read the line and split the contend into ; and become a vector  

		while (aux != null) {  
			String[] vetor = aux.split(";");
			Materials m1 = new Materials(Integer.parseInt(vetor[0]), vetor[1], Double.parseDouble(vetor[2]) , Integer.parseInt(vetor[3]));
			list.add(m1);  //add and storages splitted elements in arraylist
			aux = line.readLine(); 
		}
		
		line.close();
		
		System.out.println(">>>Materials list");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).showsMaterial();
		}
		
		System.out.println(">>>Low cost materials");
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).price < 40) {
				list.get(i).showsMaterial();
			}
		}
	}
}
