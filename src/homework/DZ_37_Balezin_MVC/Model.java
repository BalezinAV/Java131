package homework.DZ_37_Balezin_MVC;
import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class Model {
    private Map<String, Article> articles;
    private String dbFilm;

    public Model(){
        this.dbFilm = "dbF.txt";
        this.articles = loadData();
//        this.articles = new LinkedHashMap<>();
    }
    public void addArticle(Map dictArticle){
        Article article = new Article(dictArticle);
        articles.put((String)dictArticle.get("название"),article);
    }
    public Collection getAllArticles(){return articles.values();}
    public Map getSingleArticle(String userTitle){
       Article article = this.articles.get(userTitle);
       Map<String, String> dictArticle = new LinkedHashMap<>();
       dictArticle.put("название", article.getTitle());
       dictArticle.put("жанр", article.getGenre());
       dictArticle.put("режиссера", article.getDirector());
       dictArticle.put("год выпуска", article.getYearF());
       dictArticle.put("длительность", article.getDuration());
       dictArticle.put("студия", article.getStudio());
       dictArticle.put("актеры", article.getActors());
       return dictArticle;
    }
    public Article removeArticle(String userTitle){
        return articles.remove(userTitle);
    }
    public void saveData(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.dbFilm))){
            oos.writeObject(this.articles);
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public LinkedHashMap loadData(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.dbFilm))){
            return (LinkedHashMap) ois.readObject();
        }catch (Exception ex){
            return new LinkedHashMap();
        }
    }
}
//class Article {
    class Article implements Serializable{
    private String title;
    private String genre;
    private String director;
    private String yearF;
    private String duration;
    private String studio;
    private String actors;

    public Article(Map dictArticle){
        this.title = (String) dictArticle.get("название");
        this.genre = (String) dictArticle.get("жанр");
        this.director = (String) dictArticle.get("режиссера");
        this.yearF = (String) dictArticle.get("год выпуска");
        this.duration = (String) dictArticle.get("длительность");
        this.studio = (String) dictArticle.get("студия");
        this.actors = (String) dictArticle.get("актеры");
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }
    public String getYearF(){
        return yearF;
    }

    public String getDuration() {
        return duration;
    }
    public String getStudio(){return studio;}
    public String getActors(){return actors;}

    @Override
    public String toString() {
        return "'" + this.title + "' " + this.director + " (" + this.yearF + ")";
    }
}
