package antonio;

//import java.util.ArrayList;
import java.util.Random;
public class SeparatingIntArray {
	static Random rand = new Random();

public static int[] createArray () {
	int [] array = new int[10];
	for (int i=0; i<10;i++) 		array[i] = rand.nextInt(5);
	return array;
}
	
public static int getRandomAim () {
	int a = rand.nextInt(5);
	return a;
}

/* ���������... =)
 * 
 * public static ArrayList<Integer> sorting (int [] array, int random) {
	ArrayList<Integer> resultList = new ArrayList<Integer>();
	for (int i=0; i<array.length;i++) {
		if (array[i]<=random) resultList.add(0, array[i]);
		if (array[i]>random) resultList.add(resultList.size(), array[i]);
		}
	return resultList;
	}

public static void arrayPrint (ArrayList<Integer> resultList) {
	System.out.println("Result");
	for (Integer x : resultList) System.out.print(x + " ");
}*/
public static int [] sorting (int [] array, int random) {
	int randomCounter = 0;
	int numberOfMach = 0;
//�������� �������� ��� ����, ��� "�����������" ���� ��� ��������, �� ������� � ��������� �����, ���� ���������� ������������� ������..
	
	for (int i = 0; i < array.length-1; i++) {
		if (array[i] < random) numberOfMach++;
	}
	for (int i = 0; i < array.length-1; i++) {
		if (array[i] == random) randomCounter++;
	}
	
	int helper = numberOfMach;
	for (int i = 0; i < array.length-1; i++) {
		if (array[i] == random && (i < numberOfMach || i > numberOfMach+randomCounter)) {
			int c = array[i];
			array[i] = array[helper];
			array[helper] = c;
			helper++;
		}
	}

	
	System.out.println("Matches with the separation number: " + randomCounter); //for debugging
	System.out.println("Past the first mach to the cell # " + numberOfMach); //for debugging
	
/*	for (int i = 0, j = array.length-1; i < numberOfMach-1 || j > (numberOfMach + randomCounter)+1;){
		int helper = numberOfMach;
// �� ������, ���� ������� ������ �� ������ �� ��������� ������
		if (array[i]>random && array[j]<random){
			int c = array[i];
			array[i] = array[j];
			array[j] = c;
			i++; j--;
		}
		if (array[i]<random && array[j]<random) {
			int c = array[i+1];
			array[i+1] = array[j];
			array[j] = c;
			i++; i++;
		}
		if (array[i]>random && array[j]>random) {
			int c = array[j-1];
			array[j-1] = array[i];
			array[i] = c;
			j--; j--;
		}
		if (array[i]<random && array[j]>random) {
			i++; j--;
		}
	} */
//������� ���������...
	/*for (int i = 0; i < array.length-1; i++) {
			if (array[i] > array[i+1] && array[i] > random) {
				int c = array[i];
				array[i] = array[i+1];
				array[i+1] = c;
			}
		}	*/
	return array;
}
//׳�����
public static void arrayPrint (int [] array) {
	for (Integer x : array) System.out.print(x + " ");
	System.out.println();
}
//������ ���
public static void main(String[] args) {
		int[] array = createArray ();
		arrayPrint (array);
		int rand = getRandomAim();
		System.out.println("Separation number = " + rand);  //for debugging
		arrayPrint(sorting (array, rand));
}
}
