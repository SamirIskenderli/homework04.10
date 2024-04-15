//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        stringiTersineGaytaranMetod();
    }

    public static void stringiTersineGaytaranMetod() {
        String original = "P501-inUsaqlariVorZakondur";
        String lanigior = "";
        String[] originalinDolacagiMassiv = original.split("");

        for (int i = originalinDolacagiMassiv.length - 1; i >= 0; i--) {
            lanigior += originalinDolacagiMassiv[i];
        }

        System.out.println(lanigior);
    }





}