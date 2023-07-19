package org.example._05;

public class Visa extends Bandeira {
    public Visa(String formato) {
        super(formato);
    }

    @Override
    public Boolean formatoValido() {
        return formato.matches("^4(\\d{12}|\\d{15})$");
    }
}
