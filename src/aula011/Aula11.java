package aula011;

import aula011.animais.Cachorro;
import aula011.animais.Canguru;

public class Aula11 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
    
    m.setPeso(35.2f);
    m.setCorPelo("Branco");
    

    k.emitirSom();
    c.locomover();
    }
}
