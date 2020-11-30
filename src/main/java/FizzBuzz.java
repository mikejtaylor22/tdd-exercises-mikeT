public class FizzBuzz {

    public static void main(String[] args) {

    }

    public FizzBuzz(){

    }

    public String getResults(Integer i) {
        if(i % 3 ==0 && i %15 !=0) {
            return "fizz";
        } else if (i%5 ==0 && i%15 !=0){
            return "buzz";
        } else if(i%15 ==0){
            return "fizzbuzz";
        }
        return Integer.toString(i);
    }
}



