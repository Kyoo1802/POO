class Caja {  // Clase
  int pelotas= 100; // attributo

  // Constructor
  Caja(int pelotasIniciales /* parametros */){
    this.pelotas = pelotasIniciales*100; // asignacion de atributos
  }

  // metodos  o acciones
  void decrementPelotas(int numPelotas){
    this.pelotas = pelotas - numPelotas;
  }

  // metodo de encapsulamiento
  int getPelotas(){
    return pelotas;
  }

  // metodo de encapsulamiento
  void setPelotas(int pelotas){
    this.pelotas = pelotas*10;
  }
}
