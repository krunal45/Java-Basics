package main.collectionBasics;

import java.util.EnumSet;
import java.util.Iterator;

public class EnumSetExample {
    enum Languages {
        Gujarati, Hindi, Bengali, Tamil, Telugu, English
    }

    public static void main(String[] args) {
        EnumSet<Languages> languagesEnumSet = EnumSet.allOf(Languages.class);
        System.out.println(languagesEnumSet);
        EnumSet<Languages> emptyEnumSet = EnumSet.noneOf(Languages.class);
        System.out.println(emptyEnumSet);

//        Iterating over Enum Set
        for (Languages languages : languagesEnumSet) {
            System.out.println(languages);
        }
//        addingFewValues in set
        EnumSet<Languages> fewLanguages = EnumSet.range(Languages.Gujarati, Languages.Tamil);
        System.out.println(fewLanguages);

        EnumSet<Languages> addingFewLanguages = EnumSet.of(Languages.Gujarati, Languages.English, Languages.Bengali);
        System.out.println(addingFewLanguages);

//        Removing values from set
        addingFewLanguages.remove(Languages.Gujarati);
        System.out.println(addingFewLanguages);
        addingFewLanguages.removeIf(lang -> (lang.equals(Languages.Bengali)));
        System.out.println(addingFewLanguages);
        addingFewLanguages.removeAll(addingFewLanguages);
        System.out.println(addingFewLanguages);
    }
}
