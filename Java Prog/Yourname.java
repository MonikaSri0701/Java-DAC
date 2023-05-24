import java.io.Console;

class Name {
public static void main(String ar[]) {
Console con = System.console();

System.out.print("Name: ");
String uname = con.readLine();

System.out.print("Hello Your Name: " + uname);

}
}