package com.example.verificacao_veicular.Layout;

public class Inspection {
    private String title;
    private String description;
    private int icon; // Referência ao recurso do ícone

    public Inspection(String title, String description, int icon) {
        this.title = title;
        this.description = description;
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getIcon() {
        return icon;
    }
}

