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
	                System.out.println("������� ��������� ����� ������:"+ row+" �������:"+col);
	                break end;
	                }
	            }
	    }
	}//end setDesk
	
	public void searchDesk(String name){
	    int findPlace=0;
		// ������� ����� findOk, ���� ����� ����� �������� ������� ����� �� ���� ������
	    findOk:for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 4; col++) {
				if (deskArray[row][col] != null && deskArray[row][col].equals(name) == true) {
					System.out.println("������� ����� ��������: " + name + " ������:" + row + " �������:" + col);
					findPlace = 1;
					 break findOk;
				}

			}
		}
	    if(findPlace==0){
		System.out.println("����� �������� � ������: "+name+" �� �������");
	    }
	}
	public void displayDeskMap(){
	    System.out.println("������� ����� ����, ������ �"+roomNo); 
	    for (int row = 0; row < 3; row++) {
	            for (int col = 0; col < 4; col++) {
	                
	                System.out.print(deskArray[row][col]+" ");
	            }
	    System.out.println();
	     }    
	}

}
