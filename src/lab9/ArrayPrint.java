package lab9;

public class ArrayPrint {

	public static void main(String[] args) {

		int intOne[] = { 0, 1, 2, 3, 4, 5 }; // �������������� intOne
		int intTwo[];
		
		//intTwo = intOne; // ����������� ���� ������ ������		
	  
		System.arraycopy(intOne, 0, intTwo = new int[intOne.length], 0, intOne.length);
		
		printArr(intOne, "intOne"); //������ ������� intOne
		printArr(intTwo, "intTwo"); // ������ intTwo ��� ��������
		
		intTwo[0] = -1; //����� �������� ����� �� ��� intTwo
		intTwo[1] = -2;
		intTwo[2] = -3;
		intTwo[3] = -4;
		intTwo[4] = -5;
		intTwo[5] = -6;
		
		printArr(intOne, "intOne"); // ��������� ������ intOne
		
		
		printArr(intTwo, "intTwo"); // ������ intTwo ��� ��������

	}

	static void printArr(int[] arr, String nameArr) {
		System.out.println("������ ������� "+ nameArr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(nameArr+"[" + i + "] = " + arr[i]);
		}
		System.out.println(); // ������ ������ � �����
	}

}
