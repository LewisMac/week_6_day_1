public class Starship{
  private String name;
  private Crew[] roster;

  public Starship(String name){
    this.name = name;
    this.roster = new Crew[10];
  }

  public String getName(){
    return this.name;
  }

  public int crewCount(){
    int count = 0;
    for (Crew crew : roster){
      if (crew != null){
        count++;
      }
    }
    return count;
  }

  public void enrollCrew(Crew crew){
    if (rosterFull()){
      return;
    }
    int crewCount = this.crewCount();
    roster[crewCount] = crew;
  }

  public boolean rosterFull(){
    return crewCount() == roster.length;
  }
}