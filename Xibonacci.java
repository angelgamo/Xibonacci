import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//https://dev.to/jamesrweb/kata-fibonacci-tribonacci-and-friends-3331

public class Xibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep = sc.nextInt();
		for (int i = 0; i < rep; i++) {
			sc.nextLine();
			String Strserie = sc.nextLine();
			String[] Strlist = Strserie.split(", ");
			ArrayList<Integer> serie = new ArrayList<Integer>();
			for (int j = 0; j < Strlist.length; j++) {
				serie.add(Integer.parseInt(Strlist[j]));
			}
			int fin = sc.nextInt();
			int indiceActual = 0;
			Xibonacci(serie, fin, indiceActual);
			System.out.println(serie.toString());
		}

	}

	public static void Xibonacci(ArrayList<Integer> serie, int fin, int indiceActual) {
		ArrayList<Integer> siguiente = cortarLista(serie, indiceActual, serie.size());
		int suma = sumalista(siguiente);
		serie.add(suma);
		indiceActual++;
		if (serie.size() != fin) {
			Xibonacci(serie, fin, indiceActual);
		}
	}

	public static ArrayList<Integer> cortarLista(ArrayList<Integer> lista, int ini, int fin) {
		ArrayList<Integer> nuevaLista = new ArrayList<>();
		for (int i = 0; i < lista.size(); i++) {
			if (i >= ini && i < fin) {
				nuevaLista.add(lista.get(i));
			}

		}
		return nuevaLista;
	}

	public static int sumalista(ArrayList<Integer> siguiente) {
		int suma = 0;
		for (Integer valor : siguiente) {
			suma += valor;
		}
		return suma;
	}

}
