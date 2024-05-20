public class kankaroo {
    public static String kankarooJumps(int x1, int v1, int x2, int v2){
    if(x1 == x2){
        return "YES";
    }
    if(v1 > v2 && (x2 - x1) % (v1 - v2) == 0){
        return "YES";
    }

    return "NO";
    }

    public static void main(String[] args){
        int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
        String result = kankarooJumps(x1, v1, x2, v2);
        System.out.println(result);
    }
}
