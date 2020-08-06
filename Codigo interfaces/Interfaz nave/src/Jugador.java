public class Jugador implements Nave {


        public Jugador(){}

        public void moverposicion(int x, int y){


            System.out.println("La nave se desplazo hacia:"+(x));

            System.out.println("La nave se desplazo hacia:"+(y));
        }

        public void disparar(){
            System.out.println("La nave disparo");

        }


}
