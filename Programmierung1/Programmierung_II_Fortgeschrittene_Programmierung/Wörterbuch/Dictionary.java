package Wörterbuch;

import java.util.HashMap;

public record Dictionary(Language sourceLanguage, Language targetLanguage, HashMap<Word, Word> entries) {

}
