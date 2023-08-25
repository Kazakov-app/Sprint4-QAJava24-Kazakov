package praktikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    // Лист-блок с вопросами
    public static final By byListQuestions = By.className("accordion__item");

    //Первый вопрос
    public static final String xpathFirstImportantQuestion = "//*[@id=\"accordion__panel-0\"]/p";
    public static final By byFirstImportantQuestion = By.xpath(xpathFirstImportantQuestion);
    //Текст первого ответа
    public static final String textFirstImportantAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

    //Второй вопрос
    public static final String xpathSecondImportantQuestion = "//*[@id=\"accordion__panel-1\"]/p";
    public static final By bySecondImportantQuestion = By.xpath(xpathSecondImportantQuestion);
    //Текст второго ответа
    public static final String textSecondImportantAnswer = "Пока что у нас так: один заказ — один самокат. " +
            "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

    //Третий вопрос
    public static final String xpathThirdImportantQuestion = "//*[@id=\"accordion__panel-2\"]/p";
    public static final By byThirdImportantQuestion = By.xpath(xpathThirdImportantQuestion);
    //Текст третьего ответа
    public static final String textThirdImportantAnswer = "Допустим, вы оформляете заказ на 8 мая. " +
            "Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, " +
            "когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, " +
            "суточная аренда закончится 9 мая в 20:30.";

    //Четвертый вопрос
    public static final String xpathFourthImportantQuestion = "//*[@id=\"accordion__panel-3\"]/p";
    public static final By byFourthImportantQuestion = By.xpath(xpathFourthImportantQuestion);
    //Текст четвертого ответа
    public static final String textFourthImportantAnswer = "Только начиная с завтрашнего дня. " +
            "Но скоро станем расторопнее.";

    //Пятый вопрос
    public static final String xpathFifthImportantQuestion = "//*[@id=\"accordion__panel-4\"]/p";
    public static final By byFifthImportantQuestion = By.xpath(xpathFifthImportantQuestion);
    //Текст пятого ответа
    public static final String textFifthImportantAnswer = "Пока что нет! Но если что-то срочное — " +
            "всегда можно позвонить в поддержку по красивому номеру 1010.";

    //Шестой вопрос
    public static final String xpathSixthImportantQuestion = "//*[@id=\"accordion__panel-5\"]/p";
    public static final By bySixthImportantQuestion = By.xpath(xpathSixthImportantQuestion);
    //Текст шестого ответа
    public static final String textSixthImportantAnswer = "Самокат приезжает к вам с полной зарядкой. " +
            "Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

    //Седьмой вопрос
    public static final String xpathSeventhImportantQuestion = "//*[@id=\"accordion__panel-6\"]/p";
    public static final By bySeventhImportantQuestion = By.xpath(xpathSeventhImportantQuestion);
    //Текст седьмого ответа
    public static final String textSeventhImportantAnswer = "Да, пока самокат не привезли. " +
            "Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

    //Восьмой вопрос
    public static final String xpathEighthImportantQuestion = "//*[@id=\"accordion__panel-7\"]/p";
    public static final By byEighthImportantQuestion = By.xpath(xpathEighthImportantQuestion);
    //Текст восьмого ответа
    public static final String textEighthImportantAnswer = "Да, обязательно. Всем самокатов! " +
            "И Москве, и Московской области.";

    //Верхняя кнопка "Заказать"
    public static final By byUpButtonOrder =
            By.xpath("//*[@id=\"root\"]/div/div[1]/div[1]/div[2]/button[1]");

    //Нижняя кнопка "Заказать"
    public static final By byDownButtonOrder =
            By.xpath("//*[@id=\"root\"]/div/div[1]/div[4]/div[2]/div[5]/button");


    final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage openHomePage() {
        driver.get(EnvConfiguration.URL_BASE);
        return this;
    }

    public List<WebElement> getQuestions(WebDriver driver) {
        return this.driver.findElements(byListQuestions);
    }

    // Ждун для получения текста ответа
    public WebDriverWait getTextAnswerWebDriverWait(WebDriver driver) {
        return new WebDriverWait(this.driver, Duration.ofSeconds(EnvConfiguration.DEFAULT_TIMEOUT));
    }

    // Прокрути страницу до первого вопроса
    public HomePage scrollFirstQuestions() {
        WebElement importanQuestions = getQuestions(driver).get(1);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", importanQuestions);
        return this;
    }

    public HomePage firstImportantQuestion() {
        getQuestions(driver).get(1).click();//Первый вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(byFirstImportantQuestion, textFirstImportantAnswer));
        return this;
    }

    public HomePage secondImportantQuestion() {
        getQuestions(driver).get(2).click();//Второй вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(bySecondImportantQuestion, textSecondImportantAnswer));
        return this;
    }

    public HomePage thirdImportantQuestion() {
        getQuestions(driver).get(3).click();//Третий вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(byThirdImportantQuestion, textThirdImportantAnswer));
        return this;
    }

    public HomePage fourthImportantQuestion() {
        getQuestions(driver).get(4).click();//Четвертый вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(byFourthImportantQuestion, textFourthImportantAnswer));
        return this;
    }

    public HomePage fifthImportantQuestion() {
        getQuestions(driver).get(5).click();//Пятый вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(byFifthImportantQuestion, textFifthImportantAnswer));
        return this;
    }

    public HomePage sixthImportantQuestion() {
        getQuestions(driver).get(6).click();//Шестой вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(bySixthImportantQuestion, textSixthImportantAnswer));
        return this;
    }

    public HomePage seventhImportantQuestion() {
        getQuestions(driver).get(7).click();//Седьмой вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(bySeventhImportantQuestion, textSeventhImportantAnswer));
        return this;
    }

    public HomePage eighthImportantQuestion() {
        getQuestions(driver).get(0).click();//Восьмой вопрос
        //Содержание текста из ответа:
        getTextAnswerWebDriverWait(driver)
                .until(ExpectedConditions
                        .invisibilityOfElementWithText(byEighthImportantQuestion, textEighthImportantAnswer));
        return this;
    }

    // OrderPage
    public HomePage upButtonOrder() {
        driver.findElement(byUpButtonOrder).click(); //Верхняя кнопка Заказать
        return this;
    }

    public HomePage scrollDownButtonOrder() {
        WebElement downButtonOrder = driver.findElement(byDownButtonOrder); // Нижняя кнопка Заказать
        // Прокрути страницу до Нижней кнопка Заказать
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", downButtonOrder);
        return this;
    }

    public HomePage downButtonOrder() {
        driver.findElement(byDownButtonOrder).click();//Нижняя кнопка Заказать
        return this;
    }
}
