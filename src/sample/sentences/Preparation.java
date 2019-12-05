package sample.sentences;

import java.util.ArrayList;
import java.util.Random;

public class Preparation implements ListGenerator {
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
        ArrayList<String> SecondSection = new ArrayList<String>();

        SecondSection.add("az anyád ");
        SecondSection.add("Berényi Miklós ");
        SecondSection.add("Godzilla ");
        SecondSection.add("egy csapat agresszív Fradi szurkoló ");
        SecondSection.add("egy fogyatékos pasas ");
        SecondSection.add("Kiszel Tünde ");
        SecondSection.add("egy Károly nevű triceratopsz ");
        SecondSection.add("a 101 kiskutya rendezője ");
        SecondSection.add("az a kis ázsiai gyerek az Indiana Jones-ból ");
        SecondSection.add("az anyukám ");
        SecondSection.add("egy hatujjú ember ");
        SecondSection.add("Raiden a Mortal Kombat-ból ");
        SecondSection.add("Kádár János szelleme ");
        SecondSection.add("Adolf Hitler szelleme ");
        SecondSection.add("a komplett Római Birodalom ");
        SecondSection.add("Dzsudzsák Balázs bal lába ");
        SecondSection.add("egy francia túrista ");
        SecondSection.add("Peter Griffin ");
        SecondSection.add("Uri Geller kaszkadőrje ");
        SecondSection.add("egy arab terrorista ");
        SecondSection.add("Kevin tarantulája a Reszkessetek Betörőkből ");
        SecondSection.add("a Blikk egyik riportere ");
        SecondSection.add("Orbán Ráhel szakdolgozata ");

        return SecondSection;
    }

    public int getNumber() {
        Random random = new Random();
        int element = random.nextInt(listSize-1);

        return element;
    }
}
