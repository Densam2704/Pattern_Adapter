public class Song {
  private String notes;
  
  public void useNotes(){
	System.out.println("Song uses notes "+notes);
  }
  
  public String getNotes() {
	return notes;
  }
  
  public void setNotes(String notes) {
	this.notes = notes;
  }
}
