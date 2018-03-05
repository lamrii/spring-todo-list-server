package fm.app.business;

import fm.app.model.Todo;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Component
public class TodoManager {

//    @PersistenceContext
//    private EntityManager entityManager;

    public List<Todo> getTodos() {

        Todo td1 = new Todo();
        td1.setId(1L);
        td1.setLabel("First todo");
        Todo td2 = new Todo();
        td2.setId(2L);
        td2.setLabel("Let's do a test");
        Todo td3 = new Todo();
        td3.setId(1L);
        td3.setLabel("Connecto to database");

        Todo t4 = new Todo();
        t4.setLabel("Externalize configuration");
        t4.setCreationDate(LocalDateTime.now());

//        entityManager.persist(t4);
//        entityManager.flush();

        return Arrays.asList(td1, td2, td3);
    }

}
