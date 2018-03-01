package fm.app.business;

import fm.app.model.Todo;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class TodoManager {

    public List<Todo> getTodos() {
        Todo td1 = new Todo();
        td1.setId(1L);
        td1.setMessage("First todo");
        Todo td2 = new Todo();
        td2.setId(2L);
        td2.setMessage("Let's do a test");
        Todo td3 = new Todo();
        td3.setId(1L);
        td3.setMessage("Connecto to database");

        return Arrays.asList(td1, td2, td3);
    }

}
