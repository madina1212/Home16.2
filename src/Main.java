public class Main {
    public static void main(String[] args) {
        Backend[] backends = {new Java(),new CSharp(),new Python()};
        for (Backend b : backends) {
            System.out.println(backends.toString());
            System.out.println(backends.getClass());
            boolean isIt = b instanceof Backend;
            System.out.println(isIt);
    }
}