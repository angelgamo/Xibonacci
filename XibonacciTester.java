import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class XibonacciTester {

	@Test
	void easyTest() {
		// Fibonacci until 10
		ArrayList<Integer> resultado1 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
		ArrayList<Integer> respuesta1 = new ArrayList<Integer>(Arrays.asList(0, 1));
		Xibonacci.Xibonacci(respuesta1, 10, 0);
		assertArrayEquals(resultado1.toArray(), respuesta1.toArray());
		// Tribonacci until 10
		ArrayList<Integer> resultado2 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 4, 7, 13, 24, 44, 81));
		ArrayList<Integer> respuesta2 = new ArrayList<Integer>(Arrays.asList(0, 1, 1));
		Xibonacci.Xibonacci(respuesta2, 10, 0);
		assertArrayEquals(resultado2.toArray(), respuesta2.toArray());
		// Quadranacci until 10
		ArrayList<Integer> resultado3 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 4, 8, 15, 29, 56, 108));
		ArrayList<Integer> respuesta3 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2));
		Xibonacci.Xibonacci(respuesta3, 10, 0);
		assertArrayEquals(resultado3.toArray(), respuesta3.toArray());
		// Pentranacci until 10
		ArrayList<Integer> resultado4 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 7, 14, 27, 53, 104));
		ArrayList<Integer> respuesta4 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3));
		Xibonacci.Xibonacci(respuesta4, 10, 0);
		assertArrayEquals(resultado4.toArray(), respuesta4.toArray());
	}

	@Test
	void hardTest() {
		// Decanacci until 35
		ArrayList<Integer> resultado1 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 88, 176, 351, 701, 1400, 2797, 5589, 11170, 22327, 44633, 89232, 178376, 356576, 712801, 1424901, 2848402, 5694007, 11382425, 22753680, 45485033, 90925433, 181761634, 363344892, 726333208, 1451953615));
		ArrayList<Integer> respuesta1 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
		Xibonacci.Xibonacci(respuesta1, 35, 0);
		assertArrayEquals(resultado1.toArray(), respuesta1.toArray());
		// Fibonacci until 47
		ArrayList<Integer> resultado2 = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903));
		ArrayList<Integer> respuesta2 = new ArrayList<Integer>(Arrays.asList(0, 1));
		Xibonacci.Xibonacci(respuesta2, 47, 0);
		assertArrayEquals(resultado2.toArray(), respuesta2.toArray());
	}
}
