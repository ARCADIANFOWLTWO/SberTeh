package base.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import base.domain.ListE;
import base.repository.ListRepository;


@Controller
public class UpdateController {
    @Autowired
    private ListRepository listRepository;

    @GetMapping(value={"/list/{id}/updateList"})
    public String updateListForm(Model model, @PathVariable long id) {
        ListE list = listRepository.findById(id).get();
        model.addAttribute("list", list);
        return "/updateList";
    }

    @RequestMapping(value={"/list/{id}/updateList"}, method=RequestMethod.POST)
    public String updatelistSubmit(Model model, @PathVariable long id, @ModelAttribute("list") ListE list) {
        return "redirect:/index/" + id;
    }

}