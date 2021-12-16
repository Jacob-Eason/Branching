public class Testing {


public Testing(){
}


public static void prepare(int[]array){

    for(int i=0; i<array.length; i++){
        array[i] = i;
    }

}

    public static void main(String [] args){
        int[] array = new int[5]; 
        prepare(array);
        for(int ele:array){
            System.out.print(array[ele] +",");
        }
        System.out.println();
        System.out.println("lol");
    }
}