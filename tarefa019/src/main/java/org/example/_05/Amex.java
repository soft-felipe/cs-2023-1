package org.example._05;

public class Amex extends Bandeira {
    public Amex(String formato) {
        super(formato);
    }

    @Override
    public Boolean formatoValido() {
        return formato.matches("^3[47]\\d{13}$");
    }
}
