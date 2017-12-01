public class Ejercicio17 {
        public static void main(String[] args) {
            // TODO code application logic here
            int A,B;

            for(A = 1; A <= 10; A++){
                for(B = 1; B <= 10; B++){
                    if(A * B < 10){
                        System.out.print(A * B + "  ");
                    }
                    else{
                        System.out.print(A * B + " ");
                    }
                    if(B == 10){
                        System.out.println("");
                    }
                }

            }
        }
    }

