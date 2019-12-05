package sample.sentences;

import java.util.ArrayList;
import java.util.Random;

public class Introduction implements ListGenerator{
    private int listSize = generateList().size();


    public String getRandomSentence() {
        String result;
        ArrayList<String> introduction = getList();
        int randomNumber = getNumber();
        result = introduction.get(randomNumber);

        return result;
    }

    public ArrayList<String> getList() {
        return generateList();
    }

    public ArrayList<String> generateList() {
        ArrayList<String> FirstSection = new ArrayList<String>();

        FirstSection.add("Ne haragudj, de ");
        FirstSection.add("Bocsáss meg ");
        FirstSection.add("Elnézést kérek ");
        FirstSection.add("Sajnálom, de ");
        FirstSection.add("Tudod, hogy általában nem jellemző rám, viszont ");
        FirstSection.add("Nem fogod elhinni, de ");
        FirstSection.add("Találd ki, mi történt! ");
        FirstSection.add("Basszus! Képzeld el, hogy ");
        FirstSection.add("Van egy kis probléma ");
        FirstSection.add("Én csak tettem a dolgom, mint mindíg, erre bumm ");
        FirstSection.add("A legdurvább dolog esett meg, ami létezhet: ");
        FirstSection.add("Álmomban sem gondoltam volna, hogy ezt mondom, de ");
        FirstSection.add("Bocsi, de egy kicsit késni fogok, mert ");
        FirstSection.add("Sajnos nem fogok tudni segíteni, ugyanis ");
        FirstSection.add("Tudom, hogy rossz kifogás, azonban ");
        FirstSection.add("Ez most kicsit hülyén fog hangzani, de ");
        FirstSection.add("Úristen! ");
        FirstSection.add("Esküszöm, nem az én hibám, viszont ");
        FirstSection.add("Teljesen elvesztettem az időérzékem, ugyanis ");
        FirstSection.add("Borzalmasan érzem magam, ennek ellenére ");
        FirstSection.add("Sajnos megváltoztak a körülmények, mivel ");
        FirstSection.add("Tényleg nem tehetek róla, de ");
        FirstSection.add("Mentségemre szóljon, hogy ");

        return FirstSection;
    }

    public int getNumber() {
        Random random = new Random();
        int element = random.nextInt(listSize-1);

        return element;
    }
}
