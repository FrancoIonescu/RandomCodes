package Builder.Program;

import Builder.Clase.Magazin;
import Builder.Clase.MagazinBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> decoratiuni = new ArrayList<>();
        decoratiuni.add("decoratiune1");
        decoratiuni.add("decoratiune2");
        decoratiuni.add("decoratiune3");

        MagazinBuilder builder = new MagazinBuilder();
        Magazin billa = builder.setDenumire("Billa").build();

        Magazin carrefour = builder.setDenumire("Carrefour").setDecoratiuni(decoratiuni).build();
        System.out.println(billa);
        System.out.println(carrefour);
    }
}