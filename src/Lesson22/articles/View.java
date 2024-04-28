package Lesson22.articles;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
public class View {
    Scanner input = new Scanner(System.in);

    public String waitUserAnswer(){
        System.out.println("========== Ввод пользовательских данных ==========");
        System.out.println("Действия со статьями: ");
        System.out.println("1 - создание статьи" +
                "\n2 - просмотр статей" +
                "\n3 - просмотр опреденной статьи" +
                "\n4 - удаление статьи" +
                "\nq - выход из программы");
        System.out.print("Выберите вариант действия: ");
        String userAnswer = input.nextLine();
        System.out.println("==================================================");
        return userAnswer;
    }
    public Map addUserArticles(){
        Map<String, String> dictArticle = new LinkedHashMap<>();
        dictArticle.put("название", "");
        dictArticle.put("автора", "");
        dictArticle.put("кол-во страниц", "");
        dictArticle.put("описание", "");

        System.out.println("========== Создание статьи ==========");
        dictArticle.forEach((key, value) -> {
            System.out.print("Введите " + key + " статьи: ");
            dictArticle.put(key, input.nextLine());
        });
        System.out.println("==================================================");
        return dictArticle;
    }

    public void showAllArticles(Collection articles){
        System.out.println("========== Список статей ==========");
        articles.forEach((element) -> {System.out.println(element);});
        System.out.println("===================================");
    }
    public String getUserArticle(){// метод ничего не принимает, по этому ничего не пишем в аргументах
        System.out.println("========== Список статей ==========");
        System.out.print("->");
        String user_article = input.nextLine();
        System.out.println("===================================");
        return user_article;
    }

    public void showSingleArticle(Map article){
        System.out.println("========== Просмотр статьи ==========");
        article.forEach((key, value) ->{System.out.println(key + ": " + value);});
        System.out.println("===================================");
    }

    public void showIncoerrectTitleError(String userTitle){
        System.out.println("========== Сообщение об ошибке ==========");
        System.out.println("Статья с названием " + userTitle + " не существует");
        System.out.println("===================================");
    }
    public void removeSingleArticle(Article article){
        System.out.println("========== Сообщение об ошибке ==========");
        System.out.println("Статья " + article + " была удалена");
        System.out.println("===================================");
    }

    public void showIncorrectAnswerError(String answer){
        System.out.println("========== Сообщение об ошибке ==========");
        System.out.println("Вариантов " + answer + " не существует");
        System.out.println("===================================");
    }
}
