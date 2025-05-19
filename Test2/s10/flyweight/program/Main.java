package s10.flyweight.program;

import s10.flyweight.clase.FlyweightFactory;
import s10.flyweight.clase.IImagine;
import s10.flyweight.clase.TipImagine;

public class Main {
    public static void main(String[] args) {
        IImagine cerc = FlyweightFactory.getImagine(TipImagine.CERC);
        cerc.desenare(20, 30);

        IImagine triunghi = FlyweightFactory.getImagine(TipImagine.TRIUNGHI);
        triunghi.desenare(50,120);
    }
}
