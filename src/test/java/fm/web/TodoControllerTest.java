package fm.web;

import fm.app.model.Todo;
import fm.config.TestConfig;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {TestConfig.class})
@WebAppConfiguration
public class TodoControllerTest {

    @Autowired
    private TodoController todoController;

    @Test
    public void shouldReturnAListOfTodoAndAViewName() {
        ModelAndView modelAndView = todoController.showTodos();
        List<Todo> todos = (List<Todo>) modelAndView.getModel().get("todos");

        Assertions.assertEquals("show", modelAndView.getViewName());
        Assertions.assertEquals(3, todos.size());
    }
}