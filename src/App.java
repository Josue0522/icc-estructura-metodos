public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamiento metodosOrdenamiento=new MetodosOrdenamiento();
        int[] numero={30,7,12,5};
        metodosOrdenamiento.imprime(numero);
        int[] arregloOrdenado = metodosOrdenamiento.sortByBubble(numero,true);
        metodosOrdenamiento.imprime(arregloOrdenado);
    }
}
