package Lesson22.articles;
import java.io.*;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
public class Model {
    private Map<String, Article> articles;
    private String dbName;

    public Model() { // Убрали типы передаваемым аргументов, так как нам не нужно чтобы что-то передавалось
        this.dbName = "db.txt";
        this.articles = loadData();
//    this.articles = new LinkedHashMap<>(); // будет храниться в порядке, в которм мы его сохранили

    }
    public void addArticle(Map dictArticle){ // метод
        Article article = new Article(dictArticle); // Экземпляр класса артикл, куда приходит принимаемый аргумент диктартикл
        articles.put((String)dictArticle.get("название"), article);
    }
    public Collection getAllArticles(){
        return articles.values();
    }

    public Map getSingleArticle(String userTitle){ // пользователь вводит название статьи
        Article article = this.articles.get(userTitle); // Должны вернуться все значения которые лежат по определенному названию.
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", article.getTitle());
        dictArticle.put("автора", article.getAuthor());
        dictArticle.put("кол-во страниц", article.getPage());
        dictArticle.put("описание", article.getDescription());
        return dictArticle; // вернутся в мап артикл Контроллер
    }

    public Article removeArticle(String userTitle){ // возвращаем удаленные значения
        return articles.remove(userTitle);
    }

    public void saveData(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(this.dbName))){
            oos.writeObject(this.articles); // Это линкедХешмап
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public LinkedHashMap loadData(){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(this.dbName))){
            return (LinkedHashMap) ois.readObject();
        }catch (Exception ex){
            return new LinkedHashMap();
        }
    }
}
//class Article{
class Article implements Serializable { // чтобы работало требование о сохранении данных в файл
    private String title;
    private String author;
    private String page;
    private String description;

    public Article(Map dictArticle) {
        this.title = (String) dictArticle.get("название"); // приводим явным образом к строкивому значению, т.к. используем тип данных стринг
        this.author = (String) dictArticle.get("автора");;
        this.page = (String) dictArticle.get("кол-во страниц");
        this.description = (String) dictArticle.get("описание");
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPage() {
        return page;
    }

    public String getDescription() {
        return description;
    }
    @Override
    public String toString() {
        return this.title + "(" + this.author + ")";
    }
}
