package Videosammlung;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

public record VideoCollection(ArrayList<Video> videos) {
	
	public void addVideo(Video video) {
		videos.add(video);
	}
	
	public void importVideos(File file) throws FileNotFoundException {
		try (Scanner myScanner = new Scanner(file)) {
			if (!myScanner.hasNextLine()) {
				throw new FileNotFoundException("Datei ist leer!");
			}
		}
	}
	
	public Optional<Video> getVideoByTitle(String title) {
	    for (Video v : videos) {
	        if (v.getMovie().title().equals(title)) {
	            return Optional.of(v);
	        }
	    }
	    return Optional.empty();
	}
}
