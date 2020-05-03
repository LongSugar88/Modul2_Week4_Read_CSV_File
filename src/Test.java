import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a link: ");
        String link = scan.nextLine();
        Read_CSV_File read_csv_file = new Read_CSV_File();
        read_csv_file.Read_File(link);
    }
}
