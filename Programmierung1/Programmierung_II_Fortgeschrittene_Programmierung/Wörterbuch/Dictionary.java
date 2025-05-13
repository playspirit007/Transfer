package Wörterbuch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;

public record Dictionary(Language sourceLanguage, Language targetLanguage, HashMap<Word, Word> entries) {

	public void importEntries(File file) throws FileNotFoundException {
		Scanner myScanner = new Scanner(file);
		Language one = null;
		Language two = null;
		Word wordsource = null;
		Word wordtarget = null;
		while (myScanner.hasNextLine()) {
			String line = myScanner.nextLine();
			String[] all = line.split(";");
			one = Language.valueOf(all[0]);
			two = Language.valueOf(all[2]);
			wordsource = new Word(all[1], one);
			wordtarget = new Word(all[3], two);

			entries.put(wordsource, wordtarget);
		}
		myScanner.close();
	}

	public void addEntry(Word sourceWord, Word targetWord) throws InvalidLanguageException {
		if (sourceWord.language() != sourceLanguage) {
			throw new InvalidLanguageException("sourceLanguage flasch!");
		}
		if (targetWord.language() != targetLanguage) {
			throw new InvalidLanguageException("targetLanguage flasch!");
		}
		entries.put(sourceWord, targetWord);
	}

	public Optional<String> getTranslation(String word) {
		for (Entry<Word, Word> set : entries.entrySet()) {
			if (set.getKey().value().equals(word)) {
				return Optional.of(set.getValue().value());
			}
		}
		return Optional.empty();
	}
}
