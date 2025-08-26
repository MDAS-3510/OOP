package aula011.animais;

import aula011.Mamifero;

public class Cachorro extends Mamifero{

     @Override
    public void locomover() {
        System.out.println("Andando");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }


}
