package ua.samosfator.txtDB;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        TextUtils.removeEvenWords(Paths.get("input.txt"));
    }
}
