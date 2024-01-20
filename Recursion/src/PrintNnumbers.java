public class PrintNnumbers {
    public static void printNos(int i,int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        printNos(i + 1,n);

    }
    public static void main(String[] args) {
        printNos(1,10);
    }
}
