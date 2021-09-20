/**
 * Калькулатор умеющий вычилять занчение выражение вида
 * ws numder +/- ws number...
 * ws - пробельный символы
 * number - целое число в диапазоне  от -2147483648 до 2147483647
 * @autor Anton Chemodurov M3108
 * @version 1.0
 */

package Laba1Eazy;

public class Calc {
    private Source data;

    /**
     * 
     * @param data входные данные интерфейс Source 
     */
    public Calc(Source data) {
        this.data = data;
    }

    /**
     * 
     * @return значение переданного выражения
     */
    public long cout() {
        long sum = getInteger();

        while(data.hasNext()) {
            if (test('+')) {
                sum  += getInteger();
            } else if (test('-')) {
                sum -= getInteger();
            } else {
                throw new IllegalArgumentException("unsuppored operation");
            }
        }
        return sum;
    }


    private  boolean test(char t) {
        if (data.getChar() == t) {
            data.nextChar();
            return true;
        } else {
            return false;
        }
    }

    private void skipWhitespace() {
        while (data.hasNext() && Character.isWhitespace(data.getChar())) data.nextChar();
    }

    private  int getInteger() {
        skipWhitespace();
        StringBuilder num = new StringBuilder("0");
        while (data.hasNext() && Character.isDigit(data.getChar())) {
            num.append(data.getChar());
            data.nextChar();
        }
        skipWhitespace();
        return Integer.parseInt(num.toString());
    }


}
