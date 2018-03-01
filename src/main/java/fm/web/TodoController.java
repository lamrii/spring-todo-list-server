package fm.web;

import fm.app.model.Todo;
import fm.app.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller("/api")
public class TodoController {

    private TodoService todoService;

    @Autowired
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public ModelAndView showTodos() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("show");
        List<Todo> todos = todoService.getTodos();
        modelAndView.addObject("todos", todos);

        return modelAndView;
    }

    @GetMapping("/todos")
    @ResponseBody
    public List<Todo> todos() {

        return todoService.getTodos();
    }
}
