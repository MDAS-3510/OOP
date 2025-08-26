package aula011.animais;

import aula011.Mamifero;

public class Canguru extends Mamifero {

    @Override
    public void locomover() {
        System.out.println("Pulando");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("som de mamifero");
    }

    public void usarBolsa(){
        System.out.println("Usando bolsa");
    }


}
