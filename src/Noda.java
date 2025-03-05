public class Noda {
    int data;
    Noda next;

    public Noda(int x) {
        data = x;
    }

    public Noda(int x, Noda next) {
        data = x;
        this.next = next;
    }

    public static void print(Noda node) {
        Noda current = node;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static Noda reverse(Noda head) {
        Noda next;
        Noda current = head;
        Noda prev = null;

        while (current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
