import java.util.Scanner;

class GrossSalary {
    public static void main(String[] args) {
        double HRA, DA;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your basic salary..");
        int bs = sc.nextInt();
        if (bs <= 10000) {
            HRA = 0.2 * bs;
            DA = 0.35 * bs;
        } else if (bs <= 20000) {
            HRA = 0.25 * bs;
            DA = 0.3 * bs;
        } else {
            HRA = 0.35 * bs;
            DA = 0.95 * bs;
        }
        System.out.println("Your gross salary is : " + (bs + HRA + DA));
        sc.close();
    }
}