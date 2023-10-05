public class Main {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,11,911};
        for( int i =0; i < numbers.length; i++){
            System.out.print(numbers[i]+",");
        } 
            System.out.println();
        
        for( int i =0; i < numbers.length-1; i++){
            System.out.print(numbers[i]+ ",");
        }   
        System.out.println(numbers[numbers.length-1]+".");
        var nol=0;

        
        for(int i=0; i < numbers.length;i++){
            nol=nol+numbers[0];
        }        System.out.print(nol);
         }
}
