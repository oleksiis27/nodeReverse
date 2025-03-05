//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Noda node = new Noda(1, new Noda(2, new Noda(3))) ;

        Noda.print(node);

        System.out.println("=======reverse============");

        node = Noda.reverse(node);

        Noda.print(node);
    }
}