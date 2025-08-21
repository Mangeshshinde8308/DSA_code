package DSA03_Array_traverse;

public class ArrayTraverse {

    public static void main(String [] ars){
        int [] passmarks;   //array declaration
        passmarks=new int[10];  //array initialization

        //traverse araay using for loop
         for(int i=0;i<passmarks.length;i++){

            System.out.println("marks without initialization: " + passmarks[i]);
            //we will get 0 because bydefault zero value will store here
            //traverse array O(n) time complexity will use.

         }

         passmarks[0]=10;
         passmarks[1]=20;           
         passmarks[2]=30;
            passmarks[3]=40;
            passmarks[4]=50;
            passmarks[5]=60;
            passmarks[6]=70;
            passmarks[7]=80;
            passmarks[8]=90;
            passmarks[9]=100;
            //passmarks[10]=110; this will give ArrayIndexOutOfBoundsException, 10 size means only 10 element whose index start from 0
             
            

            for(int value:passmarks){  //we can pass iterable arrya or instance of iterable class in for loop
                //this is called enhanced for loop
                System.out.println("marks after initialization: " + value);

                //this way also we can tranverse through array
                //time complexity to taraverse array is O(n) in both cases

            }





        

    }

}
