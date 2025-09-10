package September5;
//N = a1 * r(n-1)
//1,2,4,8,16 -fibannachi
public class GeoProgression {
    private static int a;
    private static int r;
    private static int n;

    public static double geonumbers(int a, int r, int n){
        GeoProgression.a = a;
        GeoProgression.r = r;
        GeoProgression.n = n;

        return a * Math.pow(r, n-1);
    }
    public static void main(String [] args){
        System.out.println(geonumbers(1,2,3));
    }
}