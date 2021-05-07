public class Guitar implements MusicalInstrument{
  private Song song;
  
  public Guitar (Song song){
    this.song=song;
  }
  
  public void playSongWithMusicalInstrument() {
	System.out.println("Playing song with Guitar");
    song.setNotes("C minor");
    song.useNotes();
  }
}
