package org.example._05;

public class Mastercard extends Bandeira {

    public Mastercard(String formato) {
        super(formato);
    }

    @Override
    public Boolean formatoValido() {
        return formato.matches("^5[1-5]\\d{14}$");
    }
}
