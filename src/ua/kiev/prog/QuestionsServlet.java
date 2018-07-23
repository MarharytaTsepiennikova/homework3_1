package ua.kiev.prog;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Cоздать проект «Анкета».
 * Сделать возможность ввода пользователем его имени, фамилии, возраста и ответов на 2-3 вопроса.
 * Данные должны отправляться на сервер, который в ответ должен вернуть статистику по ответам в виде HTML документа.
 */

public class QuestionsServlet extends HttpServlet {

    static final int BROWSER_IE = 0;
    static final int BROWSER_OPERA = 1;
    static final int BROWSER_FIREFOX = 2;
    static final int BROWSER_CHROME = 3;
    static final int BROWSER_SAFARI = 4;

    static final int MAIL_GMAIL = 5;
    static final int MAIL_MAILRU = 6;
    static final int MAIL_IUA = 7;
    static final int MAIL_UKRNET = 8;
    static final int MAIL_OTHER = 9;

    static final String TEMPLATE = "<html><head><title>Статистика опроса</title></head>" +
            "<body>%s</body></html>";

    final int[] results = new int[10];


    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html; charset=utf-8");
        PrintWriter pw = resp.getWriter();

        final String browser = req.getParameter("browser");
        final String mail = req.getParameter("mail");

        if ("ie".equals(browser)) {
            results[BROWSER_IE]++;
        }
        if ("opera".equals(browser)) {
            results[BROWSER_OPERA]++;
        }
        if ("firefox".equals(browser)) {
            results[BROWSER_FIREFOX]++;
        }
        if ("chrome".equals(browser)) {
            results[BROWSER_CHROME]++;
        }
        if ("safari".equals(browser)){
            results[BROWSER_SAFARI]++;
        }

        if ("gmail".equals(mail)) {
            results[MAIL_GMAIL]++;
        }
        if ("mailru".equals(mail)) {
            results[MAIL_MAILRU]++;
        }
        if ("iua".equals(mail)) {
            results[MAIL_IUA]++;
        }
        if ("ukrnet".equals(mail)) {
            results[MAIL_UKRNET]++;
        }
        if ("other".equals(mail)) {
            results[MAIL_OTHER]++;
        }

        String res = "<p>Internet Explorer: " + results[BROWSER_IE] + "<br>Opera: " + results[BROWSER_OPERA] + "<br>Mozilla Firefox: "
                + results[BROWSER_FIREFOX] + "<br>Chrome: " + results[BROWSER_CHROME] + "<br>Safari: " + results[BROWSER_SAFARI] + "<br></p>";
        res += "<p> Gmail: " + results[MAIL_GMAIL] + "<br>Mail.ru: " + results[MAIL_MAILRU] + "<br>I.ua: " + results[MAIL_IUA] +
                "<br>Ukr.net: " + results[MAIL_UKRNET] + "<br>Other email services: " + results[MAIL_OTHER] + "</p>";

        pw.println(String.format(TEMPLATE, res));
    }
}
