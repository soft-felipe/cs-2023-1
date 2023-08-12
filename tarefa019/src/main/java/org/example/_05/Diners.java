package org.example._05;

public class Diners extends Bandeira {
    public Diners(String formato) {
        super(formato);
    }

    @Override
    public Boolean formatoValido() {
        return formato.matches("^3[68]\\d{12}|0[0-5]\\d{11}$");
    }
}
