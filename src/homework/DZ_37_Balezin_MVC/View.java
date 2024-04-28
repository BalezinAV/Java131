package homework.DZ_37_Balezin_MVC;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class View {
    Scanner input = new Scanner(System.in);
    public String waitUserAnswer(){
        System.out.println("=== Ввод информации о фильме ===");
        System.out.println("Действия с фильмами: ");
        System.out.println("1 - добавление фильма" +
                "\n2 - каталог фильмов" +
                "\n3 - просмотр определенного фильма" +
                "\n4 - удаление фильма" +
                "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("=== === ===");
        return userAnswer;
    }
    public Map addUserArticles(){
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", "");
        dictArticle.put("жанр", "");
        dictArticle.put("режиссера", "");
        dictArticle.put("год выпуска", "");
        dictArticle.put("длительность", "");
        dictArticle.put("студия", "");
        dictArticle.put("актеры", "");

        System.out.println("=== Добавление фильма ===");
        dictArticle.forEach((key, value) -> {
            System.out.print("Введите " + key + " фильма: ");
            dictArticle.put(key, input.nextLine());
        });
        System.out.println("=== === ===");
        return dictArticle;
    }
    public void showAllArticles(Collection articles){
        System.out.println("=== Список фильмов ===");
        articles.forEach((element) -> {System.out.println(element);});
        System.out.println("=== === ===");
    }
    public String getUserArticle(){
        System.out.println("=== Список фильмов ===");
        System.out.print("-> ");
        String user_article = input.nextLine();
        System.out.println("=== === ===");
        return user_article;
    }
    public void showSingleArticle(Map article){
        System.out.println("=== Просмотр фильма ===");
        article.forEach((key, value) ->{System.out.println(key + " : " + value);});
        System.out.println("=== === ===");
    }
    public void showIncorrectTitleError(String userTitle){
        System.out.println("=== Сообщение об ошибке ===");
        System.out.println("Фильм с названием " + userTitle + " отсутствует");
        System.out.println("=== === ===");
    }
    public void removeSingleArticle(Article article){
        System.out.println("=== Сообщение об ошибке ===");
        System.out.println("Фильм " + article + " был удален");
        System.out.println("=== === ===");
    }
    public void showIncorrectAnswerError(String answer){
        System.out.println("=== Сообщение об ошибке ===");
        System.out.println("Вариантов " + answer + " не существует");
        System.out.println("=== === ===");
    }
}
