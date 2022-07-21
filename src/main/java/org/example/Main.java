package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Fruta> frutas = extracted(Path.of("variaveis.txt"));
        criarRelatorio(frutas, Path.of("modelo.txt"));
    }

    private static List<Fruta> extracted(Path path) throws IOException {
        List<Fruta> frutas = new ArrayList<>();
        List<String> stringList = Files.readAllLines(path);

        for (String s :
                stringList) {
            String[] strings = s.split("=");
            String nome = strings[0].trim();
            int tonelada = Integer.parseInt(strings[1].trim());
            frutas.add(new Fruta(nome, tonelada));
        }

        return frutas;
    }

    private static void criarRelatorio(List<Fruta> frutas, Path modelo) throws IOException {
        String mes = LocalDate.now().format(DateTimeFormatter.ofPattern("MMMM"));
        int ano = LocalDate.now().getYear();
        String modeloStr = Files.readString(modelo);
        for (Fruta fruta :
                frutas) {
            modeloStr = modeloStr.replace("<% " + fruta.getNome() + " %>", String.valueOf(fruta.getTonelada()));
            modeloStr = modeloStr.replace("<%" + fruta.getNome() + "%>", String.valueOf(fruta.getTonelada()));
        }

        modeloStr = modeloStr.replace("<% mes %>", mes);
        modeloStr = modeloStr.replace("<%mes%>", mes);
        modeloStr = modeloStr.replace("<% ano %>", String.valueOf(ano));
        modeloStr = modeloStr.replace("<%ano%>", String.valueOf(ano));
        String path = "relatorio-" + mes + ".txt";
        int num = 0;
        while (Files.exists(Path.of(path)))
        {
            path = "relatorio-" + mes + " (" + ++num +").txt";
        }

        Files.createFile(Path.of(path));
        Files.writeString(Path.of(path), modeloStr);
        System.out.println(modeloStr);
    }
}