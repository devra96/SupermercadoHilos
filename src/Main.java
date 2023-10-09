public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juan",new int[]{1,2,3,4,5});
        Cliente c2 = new Cliente("Nauj",new int[]{6,7,6,8,9});
        Cliente c3 = new Cliente("AAAA",new int[]{1,1,1,1,1});

        long initialTime = System.currentTimeMillis();
//        System.out.println(initialTime);

        CajeraThread ca1 = new CajeraThread("Juana",c1,initialTime);
        CajeraThread ca2 = new CajeraThread("Anauj",c2,initialTime);
        CajeraThread ca3 = new CajeraThread("EEEEE",c3,initialTime);

        ca1.start();
        ca2.start();
        ca3.start();
    }
}