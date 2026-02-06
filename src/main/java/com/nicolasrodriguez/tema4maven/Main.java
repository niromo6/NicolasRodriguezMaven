package com.nicolasrodriguez.tema4maven;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String texto="Nicolás Rodríguez";
        String banner= FigletFont.convertOneLine(texto);
        List<String> lista=new ArrayList<>();
        for (String lBanner:texto.split("\n")) {
            lista.add(lBanner);
        }

        lista.add("Me llamo Nicolás Rodríguez. Tengo 19 años.");
        lista.add("Soy de Dénia, ALicante.");
        lista.add("Pero actualmente estoy viviendo en Gandía, Valencia.");
        lista.add("Estoy cursando 1ºDAW en el María Enríquez en Gandía.");
        lista.add("He cursado el grado medio de SMX en el Historiador Chabàs en Dénia.");
        lista.add("Hice las prácticas de 2ºSMX en Irlanda, estuve unos 2 meses y medio.");
        lista.add("Tengo un buen nivel inglés.");
        lista.add("Me gusta mucho las redes y el hardware, aunque ahora aprendiendo programación me parece bastante interesantes.");
        lista.add("Soy bastante responsable y trabajador, también abierto a aprender todo lo posible.");
        lista.add("Estoy dispuesto a encontrar trabajo del ámbito que estoy cursando");

        Screen screen = new DefaultTerminalFactory().createScreen();
        screen.startScreen();
        screen.setCursorPosition(null);



    }
}