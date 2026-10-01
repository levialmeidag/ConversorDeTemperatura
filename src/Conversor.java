public class Conversor {
    public static void main(String[] args) {

        double temperatura = 32.5;
        double fahrenheit = (temperatura * 1.8) + 32;
        double temperaturaEmFahrenheit = fahrenheit;
        System.out.println(temperaturaEmFahrenheit);

        String mensagem = String.format("A tempertaura de %f Celsius é equivalente a %f Fahrenheit", temperatura, temperaturaEmFahrenheit);
        System.out.println(mensagem);


        int casting = (int) (temperaturaEmFahrenheit);
        System.out.println("A temperatura em Fahrenheit usando o casting é: " + casting);

    }
}
