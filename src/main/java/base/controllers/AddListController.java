package base.controllers;


import base.domain.ListE;
import base.repository.ListRepository;
import base.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddListController {
    @Autowired
    private ListRepository listRepository;
    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value={"/addList"}, method=RequestMethod.GET)
    public String listForm(Model model) {
        model.addAttribute("addList", new ListE());
        return "addList";
    }

    @RequestMapping(value={"/addList"}, method=RequestMethod.POST)
    public String listSubmit(@ModelAttribute ListE addList) {
        if(StringUtils.hasText(addList.getName())){
            listRepository.save(new ListE(addList.getName()));
        }
        return "redirect:/";
    }
}