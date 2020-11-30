public class OddOrEven {

    public String getResults(int[] numbers) {
        int sum =0;
        for(int i =0; i < numbers.length; i++){
            sum += numbers[i];
        }
        if(sum % 2 ==0){
            return "even";
        } else {
            return "odd";
        }
    }

}
