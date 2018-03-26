package adapterPattern;

public class AdapterPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "alone");
		audioPlayer.play("mp4", "I'm with you");
		audioPlayer.play("vlc", "I'll be there for you");
		audioPlayer.play("avi", "forget you");
	}

}
