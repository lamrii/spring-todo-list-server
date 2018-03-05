package fm.app.service;

import fm.app.business.TodoManager;
import fm.app.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TodoService {

    private TodoManager todoManager;

    @Autowired
    public TodoService(TodoManager todoManager) {
        this.todoManager = todoManager;
    }

//    @Transactional
    public List<Todo> getTodos() {
        return todoManager.getTodos();
    }
}
