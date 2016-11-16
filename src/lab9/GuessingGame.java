package lab9;

public class GuessingGame {

	public static void main(String[] args) {
		if(args.length==0){
			System.out.println("Вы не ввели аргумент");
		}
		else{
	if(args[0].equals("help")){
		System.out.println("Игра заключается в том, что пользователь сообщает \n"
				+ "программе какое-либо число от 1 до 5 через аргументы командной\n"
				+ "строки. Программа случайным образом генерирует число от 1 до 5\n "
				+ "и сравнивает с заданным числом пользователя. Если числа совпадают,\n"
				+ "программа выдает сообщение, что пользователь угадал число. \n"
				+ "Если числа не совпали, то выводится случайное число и просьба \n"
				+ "попробовать еще раз. ");
	}
	else{
		int randomNum = ((int)( Math.random()*5)+1);	
		if(randomNum==Integer.parseInt(args[0])){
			System.out.println("Вы угадали число!!!");
		}
		else{
			System.out.println("Числа не совпали, но вы можете попробовать еще раз)");
		}
	
	}
	}
	}
}
