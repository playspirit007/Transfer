package Videosammlung;

import java.util.ArrayList;

public record VideoCollection(ArrayList<Video> videos) {
	
	public void addVideo(Video video) {
		videos.add(video);
	}
	
	public void importVideos(File file) {
		
	}
}
