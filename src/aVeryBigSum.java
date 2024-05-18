import java.util.List;

 class aVeryBigSum {
    public static long longsum(List<Long> ar){
    long sum = 0;
    for(long num: ar){
    sum += num;
    }
    return  sum;
    }

    public static void main(String[] args){
        List<Long> numbers = List.of(1000000001L, 1000000002L, 1000000003L);
        long result = longsum(numbers);
        System.out.println("Sum of the elements: "+ result);
    }
}
