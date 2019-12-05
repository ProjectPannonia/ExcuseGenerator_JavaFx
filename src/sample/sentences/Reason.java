package sample.sentences;

import java.util.ArrayList;
import java.util.Random;

public class Reason implements ListGenerator {
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
        ArrayList<String> ThirdSection = new ArrayList<String>();

        ThirdSection.add("kiszívta a nyakam.");
        ThirdSection.add("Ginát rakott az italomba.");
        ThirdSection.add("kiégette cigivel a pulcsimat.");
        ThirdSection.add("épp előttem esett össze.");
        ThirdSection.add("olcsó parfümöket akart rámsózni.");
        ThirdSection.add("meg akart erőszakolni.");
        ThirdSection.add("feljelentett gyorshajtásért.");
        ThirdSection.add("ellopta a biciklimet.");
        ThirdSection.add("áthajtott rajtam egy kotrógéppel.");
        ThirdSection.add("teleposztolta pornóvideókkal a Facebook-oldalam.");
        ThirdSection.add("megpróbált megölni.");
        ThirdSection.add("el akart csábítani.");
        ThirdSection.add("eltépte az adóbevallásomat.");
        ThirdSection.add("gyomorszájon vágott.");
        ThirdSection.add("összeveszett a buszsofőrrel.");
        ThirdSection.add("rasszista viccekkel zaklatott telefonon.");
        ThirdSection.add("betört a házamba.");
        ThirdSection.add("sört öntött a laptopomba.");
        ThirdSection.add("megkergetett a Blahán.");
        ThirdSection.add("lefeküdt a nagybátyámmal.");
        ThirdSection.add("részegen ordibált az ablakom alatt.");
        ThirdSection.add("betuszkolt egy lopott rendőrautóba és orális kielégítést ajánlott fel.");
        ThirdSection.add("segített megtalálni Jézust.");

        return ThirdSection;
    }

    public int getNumber() {
        Random random = new Random();
        int element = random.nextInt(listSize-1);

        return element;
    }
}
