import java.util.Scanner;

class MainProgram {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int faktorial = 1;
        System.out.println("Masukkan bilangan bulat : ");
        int n = in.nextInt();
        if (n <= 0){
            System.out.println("Angka yang dimasukkan bukan bilangan bulat atau adalah angka 0");
        } else {
            for (int i = 1; i <= n; i++){
                faktorial *= i;
            }
            System.out.println("Hasil faktorial dari " + String.valueOf(n) + " adalah " + String.valueOf(faktorial));
        }

        in.close();
    }
}