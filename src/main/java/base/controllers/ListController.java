package base.controllers;

import base.domain.List;
import base.repository.ListRepository;
import base.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ListController {
    @Autowired
    private ListRepository listRepository;

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String getIndex(Model model){
        Iterable<List> lists = listRepository.findAll();

        model.addAttribute("lists", lists);
        return "index";
    }

    /*@RequestMapping(value = {"/index/{id}"}, method = RequestMethod.GET)
    public String getIndex1(Model model){
        Iterable<Task> tasks = taskRepository.findAll();

        model.addAttribute("tasks", tasks);
        return "index";
    }*/
}
