package validators;

import java.util.ArrayList;
import java.util.List;

import models.Message;

public class MessageValidator {

    public static List<String> validate(Message m){
        List<String> errors = new ArrayList<String>();

        String title_error = validateTitle(m.getTitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = validateContent(m.getContent());
        if(!content_error.equals("")){
                errors.add(content_error);
        }

        return errors;
    }

    private static String validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "タイトルを入力してください。";
        }

        return "";
    }

    private static String validateContent(String content) {
        if(content == null || content.equals("")) {
            return "メッセージを入力してください。";
        }

        return "";

    }

}
