 class Top {
        //Constructor de clase Top
        public Top(String s){
            System.out.print("B");
        }


}

class  Bottom2 extends Top{
    //Constructor de Bottom2
    //Le falta implementar el constructor del padre con super();
    public Bottom2(String s){
        super(s);
        System.out.print("D");
    }
    public static void main(String[] args){
        new Bottom2("C");
        System.out.println(" ");
    }



}
