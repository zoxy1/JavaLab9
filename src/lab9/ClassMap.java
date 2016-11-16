package lab9;

public class ClassMap {
	
	private int roomNo;
	private String[][] deskArray ;
	ClassMap(int id){
		roomNo=id;	
		deskArray=new String[3][4];
	}
	public void setDesk(String name){
	   
	   end:  for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 4; col++) {
	                if (deskArray[row][col] == null) { 
	                    deskArray[row][col]=name;
	                System.out.println("Найдено свободное место строка:"+ row+" столбец:"+col);
	                break end;
	                }
	            }
	    }
	}//end setDesk
	
	public void searchDesk(String name){
	    int findPlace=0;
		// добавил метку findOk, если нашли место студента выходим сразу из двух циклов
	    findOk:for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				if (deskArray[row][col] != null && deskArray[row][col].equals(name) == true) {
					System.out.println("Найдено место студента: " + name + " строка:" + row + " столбец:" + col);
					findPlace = 1;
					 break findOk;
				}

			}
		}
	    if(findPlace==0){
		System.out.println("Место студента с именем: "+name+" не найдено");
	    }
	}
	public void displayDeskMap(){
	    System.out.println("Выводим карту мест, класса №"+roomNo); 
	    for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 4; col++) {
	                
	                System.out.print(deskArray[row][col]+" ");
	            }
	    System.out.println();
	     }    
	}

}
