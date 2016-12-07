import java.util.*;

public class Starship{
  private String name;
  private ArrayList<Staff> roster;

  public Starship(String name){
    this.name = name;
    this.roster = new ArrayList<Staff>();
  }

  public String getName(){
    return this.name;
  }

  public int crewCount(){
    return roster.size();
  }

  public void enrollCrew(Staff staff){
    roster.add(staff);
  }

  
}