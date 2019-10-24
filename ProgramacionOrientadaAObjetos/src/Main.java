public class Main {
  public static void main(String[] args) {
    // "[operacion1]" ------> [a=2]
    Caja operacion1 = new Caja(7);
    operacion1.decrementPelotas(5);
    System.out.println(operacion1.getPelotas());
    operacion1.setPelotas(2); // lo mismo -> operacion1.pelotas = 2;

    // "[operacion1]" ------> [a=3]
    Caja operacion2 = new Caja(15);
    operacion2.pelotas = 3;

    // "2 3"
    System.out.println(operacion1.pelotas + " " +operacion2.pelotas);

    // "[operacion1]" ------> "[operacion2]" ------> [a=32]
    // "[operacion1]" ------> [a=32]
    // "[operacion1]" ------> [a=100]
    operacion1 = operacion2;
    operacion1.pelotas = 100;

    // "100 32"
    System.out.println(operacion1.pelotas + " " +operacion2.pelotas);

    // primitivos
    // int long short byte char float double
    int a1 = 23;
    int a2 = 32;
    // "23 32"
    System.out.println(a1+ " " +a2);

    a1 = a2;
    a1 = 100;
    // "100 32"
    System.out.println(a1+ " " +a2);

  }

}
