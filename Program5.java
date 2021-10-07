class Program5 {
    public static void main(String args[]){
        int x=10;
            if (x==10){
                // int x=20;
                // we can't declare a variable to have the same name as in the outer scope
                int y=20; //every time y is initialized when it enter in the inner loop
                System.out.println("the values of x and y are " +x+ "," +y);
                x=y*2;
            }
            // y=100; 
            // this will show an error as variable y is not in the scope
            System.out.println("x= "+x);
            // System.out.println("y= "+y);
    }
    
}
