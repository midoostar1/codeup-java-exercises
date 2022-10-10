package movies;

public class Movie {
 private    String name;
  private String category;
  public Movie(String name, String category){
      this.name = name;
      this.category = category;
  }

  String getName(){
      return name;
  }
  String getCategory(){
      return category;
  }
   void setName(String name){
      this.name = name;
   }
   void setCategory(String category){
      this.category = category;
   }
}
