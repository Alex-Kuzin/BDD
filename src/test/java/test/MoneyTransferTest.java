package test;

import data.DataHelper;
import lombok.var;
import org.junit.jupiter.api.Test;
import page.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class MoneyTransferTest {
    @Test
    void shouldMoneyTransfer() {
        open("http://localhost:9999");
        var authInfo = DataHelper.getAuthInfo();
        var loginPage = new LoginPage();
        var verificationPage = loginPage.validLogin(authInfo);
        var vereficationCode = DataHelper.getVerificationCodeFor(authInfo);
        var dashboardPage = verificationPage.validVerify(vereficationCode);
    }
}
