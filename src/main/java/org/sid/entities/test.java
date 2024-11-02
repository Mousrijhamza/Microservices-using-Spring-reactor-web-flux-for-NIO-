package org.sid.entities;
import java.util.Locale;
import java.text.NumberFormat;
import java.text.NumberFormat.Style;
import java.time.DayOfWeek;

public class test {
    public static void main(String[] args) {
        double price = 1.85;
        double rate = 0.065;
        double numCustomer = 10000000;

        Locale locale = Locale.FRANCE;
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        NumberFormat nf2 = NumberFormat.getPercentInstance(locale);
        NumberFormat nf3 = NumberFormat.getCompactNumberInstance(locale, Style.SHORT);

        // Définir le nombre maximum de chiffres après la virgule
        nf2.setMaximumFractionDigits(1);
        System.out.println(nf.format(price));
        System.out.println(nf2.format(rate));
        System.out.println(nf3.format(numCustomer));





    }
}
