package lab9;

public class GuessingGame {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("�� �� ����� ��������");
		}
		else{
	if(args[0].equals("help")){
		System.out.println("���� ����������� � ���, ��� ������������ �������� \n"
				+ "��������� �����-���� ����� �� 1 �� 5 ����� ��������� ���������\n"
				+ "������. ��������� ��������� ������� ���������� ����� �� 1 �� 5\n "
				+ "� ���������� � �������� ������ ������������. ���� ����� ���������,\n"
				+ "��������� ������ ���������, ��� ������������ ������ �����. \n"
				+ "���� ����� �� �������, �� ��������� ��������� ����� � ������� \n"
				+ "����������� ��� ���. ");
	}
	else{
		int randomNum = ((int)( Math.random()*5)+1);	
		if(randomNum==Integer.parseInt(args[0])){
			System.out.println("�� ������� �����!!!");
		}
		else{
			System.out.println("����� �� �������, �� �� ������ ����������� ��� ���)");
		}
	
	}
	}
	}
}
