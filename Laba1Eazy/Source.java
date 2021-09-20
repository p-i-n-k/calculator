/**
 * 
 * @autor Anton Chemodurov M3108
 * @version 1.0
 */


package Laba1Eazy;

public interface Source {
    /**
     * преход к следующему символу
     */
    void nextChar();

    /**
     * 
     * @return текущий символ
     */
    char getChar();

    /**
     * 
     * @return остались ли еще символы в потоке
     */
    boolean hasNext();
}
