class Runner{
  public static void main(String[] args){
    Starship starship = new Starship("Enterprise");
    Crew crew = new Crew();

    starship.enrollCrew(crew);
    starship.enrollCrew(crew);
    starship.enrollCrew(crew);
    starship.enrollCrew(crew);
    
    System.out.println(starship.getName());
    System.out.println(starship.crewCount());
  }
}