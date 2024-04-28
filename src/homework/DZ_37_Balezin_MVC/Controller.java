package homework.DZ_37_Balezin_MVC;
import java.util.Collection;
import java.util.Map;
public class Controller {
    private Model articleModel;
    private View userInterface;

    public Controller(){
        this.articleModel = new Model();
//        this.articleModel = null;
        this.userInterface = new View();
//        this.userInterface = null;
    }
    public void run(){
        String answer = "";
        while (!answer.equals("q")){
            answer = this.userInterface.waitUserAnswer();
            checkUserAnswer(answer);
        }
    }
    public void checkUserAnswer(String answer){
        if (answer.equals("1")){
            Map articles = this.userInterface.addUserArticles();
            this.articleModel.addArticle(articles);
        } else if (answer.equals("2")) {
            Collection articles = this.articleModel.getAllArticles();
            this.userInterface.showAllArticles(articles);
        } else if (answer.equals("3")) {
            String articleTitle = this.userInterface.getUserArticle();
            try {
                Map article = this.articleModel.getSingleArticle(articleTitle);
                this.userInterface.showSingleArticle(article);
            }catch (NullPointerException npe){
                this.userInterface.showIncorrectTitleError(articleTitle);
            }
        } else if (answer.equals("4")) {
            String articleTitle = this.userInterface.getUserArticle();
//            try {
                Article title = this.articleModel.removeArticle(articleTitle);
                this.userInterface.removeSingleArticle(title);
//            }catch (NullPointerException npe){
//                this.userInterface.showIncorrectTitleError(articleTitle);
//            }
        } else if (answer.equals("q")) {
            System.out.println("Программа завершила работу, данные сохранены.");
            this.articleModel.saveData();
        }else {
            this.userInterface.showIncorrectAnswerError(answer);
        }
    }
}
