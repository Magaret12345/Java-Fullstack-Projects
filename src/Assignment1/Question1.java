package Assignment1;
//Write a program(WAP) to print INEURON using pattern programming logic.
public class Question1 {
  

        public static void main(String[] args) {
            int n=11;
            System.out.println("");
            for(int i=0;i<n;i++) {
                //I
                for(int j=0;j<n;j++) {
                 if((i==0&&j<(n-1))||j==(n-1)/2||(i==n-1&&j<(n-1))) {
                     System.out.print("*");
                 }
                 else
                 {
                     System.out.print(" ");
                 }
                     
                }
                //N
                for(int j=0;j<n;j++) {
                    
                    if(j==0||j==(n-1)||i==j) {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                        
                    } 
                //E
                for(int j=0;j<n;j++) {
                    System.out.print(" ");
                if(j==0||(i==0&&j<3*n/4)||(i==(n-1)/2&&j<3*n/4)||(i==n-1&&j<3*n/4)) {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                    
                }
                //U
                for(int j=0;j<n;j++) {
                   
                    if((j==0&&i<n-1)||(j==(n-1)&&i!=n-1)||(j!=0&&i==n-1&&j<(n-1))) {
                        System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                    
                }
                //R
                for(int j=0;j<n;j++) {
                    //(i==j) && i>=n/2 && j>=n/2
                    if((j==0&&i>0)||(j==(n-1)/2&&i!=0&&i<(n-1)/2)||(i==(n-1)/2&&j<(n-1)/2)||(i==0&&j<(n-1)/2)||(i-j==(n-1)/2)) {
                        System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                    
                }
                //O
                 for(int j=0;j<n;j++) {
                    
                    if((j==0&&i>0&&i!=(n-1))||(j==(n-1)/2&&i!=0&&i!=(n-1))||(j!=0&&i==n-1&&j<(n-1)/2)||(i==0&&j!=0&&j<(n-1)/2)) {
                        System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                    
                }
                 //N
                 for(int j=0;j<n;j++) {
                     
                     if(j==0||j==(n-1)||i==j) {
                         System.out.print("*");
                     }
                     else
                     {
                         System.out.print(" ");
                     }
                         
                     } 
                System.out.println();
            }
    }
    }


