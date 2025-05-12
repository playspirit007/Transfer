package Wörterbuch;

import java.util.HashMap;

public record Dictionary(Language sourceLanguage, Language targetLanguage, HashMap<Word, Word> entries) {

	public void addEntry(Word sourceWord, Word targetWord) throws InvalidLanguageException {
		if (sourceWord.language() != sourceLanguage) {
			throw new InvalidLanguageException("sourceLanguage flasch!");
		}
		if (targetWord.language() != targetLanguage) {
			throw new InvalidLanguageException("targetLanguage flasch!");
		}
		entries.put(sourceWord, targetWord);
	}
}
