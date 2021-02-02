package tests;

import jdk.jfr.Description;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class SearchPageTests {
    @Description("Checking login on ")
    @Test
    public void loginTestFlow() {
        open("https://www.google.com/");
        sleep(600220);
    }

}
