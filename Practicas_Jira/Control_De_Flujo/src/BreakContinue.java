public class BreakContinue {
    public static void main(String[] args) {
        //BREAK
        System.out.println("Break en 3 ---------------");
        for (int i = 0; i< 6; i++){
            for (int j=0; j<5; j++){
                if (j==3){
                    break;
                }
                else{
                    System.out.println("iteracion [i,j]: " + i + ", " + j);
                }
            }
        }
        System.out.println("Continue en 3 ---------------");
        //CONTINUE
        for (int i = 0; i< 6; i++){
            for (int j=0; j<5; j++){
                if (j==3){
                    continue;
                }
                else{
                    System.out.println("iteracion [i,j]: " + i + ", " + j);
                }
            }
        }
    }
}
