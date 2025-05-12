package Arrays.MultidimensionalArray;

public class Multi_dimensional_Array_Example01 {
    
    static String[][] name= {{"krunal","jay","mehul","bhide"},{"QA","Dev","B.A","C.A"}};//Declaration & initialization of Array
    static String[][] rivers=new String[2][2];//Declaration of Array
    
        static void displayname() {
            
            System.out.println(name[0][0]+" :-"+name[1][0]);
            System.out.println(name[0][1]+" :-"+name[1][1]);
            System.out.println(name[0][2]+" :-"+name[1][2]);
            System.out.println(name[0][3]+" :-"+name[1][3]);
        }
        
        static void displayRivers() {
            rivers[0][0]="ganga";
            rivers[0][1]="kaveri";
            rivers[1][0]="godawari";
            rivers[1][1]="mahi";
            
            for(int i=0;i<=1;i++) {
        	for(int j=0;j<=1;j++) {
            System.out.println("Rivers :"+rivers[i][j]);
        	}
            }
        }
        
        public static void main(String args[]) {
            Multi_dimensional_Array_Example01.displayname();
            Multi_dimensional_Array_Example01.displayRivers();
        }
}
