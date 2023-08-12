//https://www.devmedia.com.br/artigo-java-magazine-46-refactoring-da-teoria-a-pratica/10169
package org.example._05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Cartao {
    private int bandeira;
    private String numero;
    private String validade;

    public boolean isValido() {
        boolean validadeOK = false, formatoOK;
        Date dataValidade;

        try {
            dataValidade = new SimpleDateFormat("MM/yyyy").parse(validade);
        } catch (ParseException e) {
            return validadeOK;
        }

        validadeOK = validarData(dataValidade);
        if (!validadeOK) return false;

        String formatado = removerCaracteresInvalidos();

        formatoOK = formato(formatado);
        if (!formatoOK) return false;

        return numerosValidos(getSoma(formatado));
    }

    public abstract boolean formato(String formatado);

    private String removerCaracteresInvalidos() {
        String regex = "\\d+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(numero);
        return m.group();
    }

    private static boolean numerosValidos(int soma) {
        int resto = soma % 10;
        return resto == 0;
    }

    private static int getSoma(String formatado) {
        int soma = 0;
        int digito = 0;
        int somafim = 0;
        boolean multiplica = false;

        for (int i = formatado.length() - 1; i >= 0; i--) {
            digito = Integer.parseInt(formatado.substring(i,i+1));
            if (multiplica) {
                somafim = digito * 2;
                if (somafim > 9) {
                    somafim -= 9;
                }
            } else {
                somafim = digito;
            }
            soma += somafim;
               multiplica = !multiplica;
        }
        return soma;
    }

    private boolean validarData(Date dataValidade) {
        Calendar calValidade = new GregorianCalendar();
        calValidade.setTime(dataValidade);

        Calendar calHoje = getCalendar(calValidade);
        return calHoje.before(calValidade);
    }

    private static Calendar getCalendar(Calendar calValidade) {
        Calendar calTemp = new GregorianCalendar();
        Calendar calHoje = (GregorianCalendar) calValidade.clone();
        calHoje.set(Calendar.MONTH, calTemp.get(Calendar.MONTH));
        calHoje.set(Calendar.YEAR, calTemp.get(Calendar.YEAR));
        return calHoje;
    }
}

