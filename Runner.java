class Runner{
  public static void main(String[] args){
    Starship starship = new Starship("Enterprise");
    Crew crew = new Crew("Picard");
    Crew crew2 = new Crew("Riker");

    starship.enrollCrew(crew);
    starship.enrollCrew(crew2);

    System.out.println(starship.getName());
    System.out.println(starship.crewCount());
    System.out.println(crew.getName());
    System.out.println(crew2.getName());
  }
}