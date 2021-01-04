public class App {
    public static void main(String[] args) throws Exception {
        Carro c[] = new Carro[3];
        c[0] = new Carro("Chevrolet", "C3PO", "IUT556", 2000, 6.5f);
        c[1] = new Carro("Tesla", "Y", "KKK171", 2015, 2.5f);
        c[2] = new Carro("Tesla", "Y", "KKK171", 2015, 2.5f);

        if (c[0].equals(c[1])) {
            System.out.println("Os carros são iguais");
        } else {
            System.out.println("Os carros são diferentes!");
        }
        System.out.println(c[0].toString());
        System.out.println(c[1].toString());
        System.out.println(c[2].toString());

        Moto m[] = new Moto[3];
        m[0] = new Moto("Ninja", "Honda", "OOP784", 2001, 50000);
        m[1] = new Moto("Ninja", "Honda", "OOP784", 2001, 50000);
        m[2] = new Moto("CG", "Yamaha", "SGH597", 2001, 40000);
        if (m[0].equals(m[1])) {
            System.out.println("As motos são iguais");
        } else {
            System.out.println("As motos são diferentes!");
        }
        System.out.println(m[0].toString());
        System.out.println(m[1].toString());
        System.out.println(m[2].toString());

        Onibus o[] = new Onibus[3];
        o[0] = new Onibus("050", "Volks", "GFD459", 2005, 20);
        o[1] = new Onibus("050", "Volks", "GFD459", 2005, 20);
        o[2] = new Onibus("010", "Volks", "DAR879", 2005, 2);
        if (o[0].equals(o[1])) {
            System.out.println("Os onibus sao iguais");
        } else {
            System.out.println("Os onibus são diferentes");
        }

        System.out.println(o[0].toString());
        System.out.println(o[1].toString());
        System.out.println(o[2].toString());
    }

}
