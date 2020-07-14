package base.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import base.domain.ListE;
import base.domain.TaskE;
import base.repository.ListRepository;
import base.repository.TaskRepository;

@Controller
public class AddTaskController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;



    @RequestMapping(value = "/addTask/{parentId}", method = RequestMethod.GET)
    public String taskForm(@PathVariable Long parentId, Model model) {
        model.addAttribute("parentId", parentId);
        return "addTask";
    }

    @RequestMapping(value = {"/addTask"}, method = RequestMethod.POST)
    public String taskSubmit(@ModelAttribute TaskE addTask, Model model){
        ListE list =listRepository.findById(addTask.getParentId()).get();
        TaskE task = new TaskE();
        task.setTitle(addTask.getTitle());
        task.setList(list);

        taskRepository.save(task);
        return "redirect:/list/" + addTask.getParentId();

    }

}



