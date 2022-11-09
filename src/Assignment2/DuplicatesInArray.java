package Assignment2;

public class DuplicatesInArray {

    public static void main(String[] args) {
        int ars[]={1,2,2,5,6,7,8,6}; 
            //{1,5,2,3,1,2,6};
        System.out.println("Please find the duplicate values in the given array::");
        for(int i=0;i<ars.length;i++) {
            for(int j=i+1;j<ars.length;j++) {
                if(ars[i]==ars[j]) {
                    System.out.print(ars[j]+" ");                
                }
               
            }
        }

    }

}
