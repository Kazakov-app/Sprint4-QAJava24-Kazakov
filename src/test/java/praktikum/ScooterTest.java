package praktikum;

import org.junit.Rule;
import org.junit.Test;

public class ScooterTest {

    @Rule
    public BaseDriverRule driverRule = new BaseDriverRule();


    @Test
    public void questionsAboutImportant() {
        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollFirstQuestions()// Прокрутка до первого вопроса
                // Вопрос - Ответ
                .firstImportantQuestion()
                .secondImportantQuestion()
                .thirdImportantQuestion()
                .fourthImportantQuestion()
                .fifthImportantQuestion()
                .sixthImportantQuestion()
                .seventhImportantQuestion()
                .eighthImportantQuestion();
    }


    @Test
    public void upButtonOrderScooter() {

        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .upButtonOrder(); //Верхняя кнопка "Заказать"

        OrderPage orderPage = new OrderPage(driverRule.getDriver());
        orderPage.sectionForWhomScooter() // Раздел - Для кого самокат
                 .sectionAboutRentScooter()   //Раздел - Про аренду
                 .successfulOrderNotification(); // всплывающее окно с сообщением об успешном создании заказа
    }


    @Test
    public void downButtonOrderScooter() {

        HomePage homePage = new HomePage(driverRule.getDriver());
        homePage.openHomePage()
                .scrollDownButtonOrder() // скролл до нижней кнопки "Заказать"
                .downButtonOrder(); //Нижняя кнопка "Заказать"

        OrderPage orderPage = new OrderPage(driverRule.getDriver());
        orderPage.sectionForWhomScooter() //Раздел - Для кого самокат
                 .sectionAboutRentScooter() //Раздел - Про аренду
                 .successfulOrderNotification(); // всплывающее окно с сообщением об успешном создании заказа
    }


}
