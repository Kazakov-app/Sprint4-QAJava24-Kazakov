package praktikum;

import org.junit.Rule;
import org.junit.Test;

public class ScooterTestQuestionsAboutImportant {


    @Rule
    public BaseDriverRule driverRule = new BaseDriverRule();


    @Test
    public void firstQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .firstImportantQuestion();// Первый Вопрос - Ответ
    }


    @Test
    public void secondQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .secondImportantQuestion();// Второй Вопрос - Ответ
    }


    @Test
    public void thirdQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .thirdImportantQuestion(); // Третий Вопрос - Ответ
    }


    @Test
    public void fourthQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .fourthImportantQuestion(); // Четвертый Вопрос - Ответ
    }


    @Test
    public void fifthQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .fifthImportantQuestion(); // Пятый Вопрос - Ответ
    }


    @Test
    public void sixthQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .sixthImportantQuestion(); // Шестой Вопрос - Ответ
    }


    @Test
    public void seventhQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .seventhImportantQuestion(); // Седьмой Вопрос - Ответ
    }


    @Test
    public void eighthQuestionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                .eighthImportantQuestion(); // Восьмой Вопрос - Ответ
    }
}

