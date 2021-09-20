package Laba1Eazy;

import java.io.FileInputStream;
import java.io.IOException;

public class FileSource implements Source {
    private final FileInputStream data;
    private int c;
    private final int EOF = -1;

    public FileSource(FileInputStream data) {
        this.data = data;
    }

    @Override
    public void nextChar() {
        try {
            c = c == EOF ? EOF : data.read();
        } catch (IOException e) {
            c = EOF;
        }
        
    }

    @Override
    public char getChar() {
        if (c != EOF) {
            return (char)c;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public boolean hasNext() {
        return c != EOF;
    }
    
}
