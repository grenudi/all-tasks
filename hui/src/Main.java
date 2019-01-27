
public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
       new Main().hui("asd");
    }
    private void hui(String s) throws NoSuchMethodException {
        getClass().getMethod("get", String.class);
    }
    @DeprecatedHui
    public void get(String s) throws NoSuchMethodException {
        System.out.println("hui");
    }
}
