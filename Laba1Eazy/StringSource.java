/**
 * Реализация интерфейса Source источником данный служет строка
 * @autor Anton Chemodurov M3108
 * @version 1.0
 */


package Laba1Eazy;

public class StringSource implements Source {
    private char[] data;
    private int ptr;

    /**
     * 
     * @param data принемает массив символов
     */
    public StringSource(char[] data) {
        this.data = data;
        ptr = 0;
    }

    @Override
    public void nextChar() {
        if (hasNext()) {
            ptr++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }


    @Override
    public char getChar() {
        return data[ptr];
    }

    @Override
    public boolean hasNext() {
       return ptr  < data.length;
    }
    
}
