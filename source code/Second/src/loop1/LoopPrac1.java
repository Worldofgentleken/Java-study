package loop1;

public class LoopPrac1 {

    public static void main(String[] args) {
        int a;
        for (a = 0; a < 3; a++) {
            System.out.println(a + " ");
        }
        System.out.println();

        for(int i = 0; i < 3; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        for(int i = 0; i < 100; i++){
            System.out.println(i + " ");
        }
        System.out.println();

        for(int i = 10; i > 0; i--){
            System.out.println(i + " ");
        }
        for(int i = 0; i < 10; i += 2){
            System.out.println(i + " ");
        }
        System.out.println();

        for(int i = 0, j = 0; i < 10; i++, j++){
            System.out.println(i + j + " ");
        }
        System.out.println();
    }
}
