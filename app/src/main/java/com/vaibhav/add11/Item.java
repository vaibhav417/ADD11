package com.vaibhav.add11;

public class Item {


    private final String animalNmae;
    private final int animalImage;

    public Item(String animalNmae, int animalImage) {

        this.animalNmae = animalNmae;
        this.animalImage = animalImage;
    }

    public String getAnimalNmae() {
        return animalNmae;
    }

    public int getAnimalImage() {
        return animalImage;
    }
}
