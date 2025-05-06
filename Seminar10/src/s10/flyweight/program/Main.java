package s10.flyweight.program;

import s10.flyweight.clase.FlyweightFactory;
import s10.flyweight.clase.IImagine;
import s10.flyweight.clase.Imagine;
import s10.flyweight.clase.TipImagine;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        IImagine imagine = flyweightFactory.getImagine(TipImagine.CERC);
        imagine.desenare(10, 10);

        // SAU

        FlyweightFactory.getImagine(TipImagine.CERC).desenare(10, 10);
    }

}
