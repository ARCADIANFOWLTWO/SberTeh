package base.controllers;

import base.domain.List;
import base.domain.Task;
import base.repository.ListRepository;
import base.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.HashMap;
import java.util.Map;



@Controller
public class ListController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex(Model model){
        Iterable<List> lists = listRepository.findAll();

        model.addAttribute("lists",lists);

        return "index";
    }

    @RequestMapping(value = {"/list/{id}"}, method = RequestMethod.GET)
    public String getIndex(Model model, @PathVariable long id){
        Map <Long, Task> lists = getLists();

        model.addAttribute("lists", lists.values());
        model.addAttribute("currentList", lists.get(null));

        return "list";
    }

    private Map<Long, Task> getLists(){
        Map<Long, Task> result = new HashMap<>();
        Iterable<Task> lists = taskRepository.findAll();

        for (Task domain: lists){
            result.put(domain.getUid(), domain);
        }
        return result;
    }
}