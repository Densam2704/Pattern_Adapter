
//Inspired by
//https://javarush.ru/groups/posts/2139-pattern-proektirovanija-adapter
// Adapter class: Guitar
// Class for adapting:Song
// Interface: MusicalInstrument
public class Main {
  public static void main(String[] args) {
	MusicalInstrument guitar = new Guitar(new Song());
	guitar.playSongWithMusicalInstrument();
  }
}
