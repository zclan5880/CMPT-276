package per.assignment.rectangle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import per.assignment.rectangle.entity.Rectangle;
import per.assignment.rectangle.service.RectangleService;

import java.util.List;

@Controller
public class RectangleController {

    @Autowired
    private RectangleService rectangleService;

    @GetMapping("/")
    public String indexView() {
        return "index";
    }

    @GetMapping("/list")
    public String listView(Model model) {
        List<Rectangle> rectangleList = rectangleService.findAll();
        model.addAttribute("rectangles", rectangleList);
        return "rectangle-list";
    }

    @GetMapping("/create")
    public String createView(Model model) {
        model.addAttribute("rectangle", new Rectangle());
        return "rectangle-create";
    }

    @PostMapping("/addRectangle")
    public String create(@ModelAttribute Rectangle rectangle, Model model)
    {
        rectangleService.addRectangle(rectangle);
        List<Rectangle> rectangleList = rectangleService.findAll();
        model.addAttribute("rectangles", rectangleList);
        return "rectangle-list";
    }

    @PostMapping("/updateRectangle")
    public String update(@ModelAttribute Rectangle rectangle, Model model)
    {
        rectangleService.updateRectangle(rectangle);
        List<Rectangle> rectangleList = rectangleService.findAll();
        model.addAttribute("rectangles", rectangleList);
        return "rectangle-list";
    }

    @PostMapping("/deleteRectangle")
    public String delete(@ModelAttribute Rectangle rectangle, Model model)
    {
        rectangleService.deleteRectangle(rectangle);
        List<Rectangle> rectangleList = rectangleService.findAll();
        model.addAttribute("rectangles", rectangleList);
        return "rectangle-list";
    }

    @PostMapping("/detail")
    public String detailView(@ModelAttribute Rectangle rectangle, Model model)
    {
        Rectangle rectangle1 = rectangleService.findById(rectangle);
        model.addAttribute("rectangle", rectangle1);
        return "rectangle-detail";
    }

    @PostMapping("/update")
    public String updateView(@ModelAttribute Rectangle rectangle, Model model)
    {
        Rectangle rectangle1 = rectangleService.findById(rectangle);
        model.addAttribute("rectangle", rectangle1);
        return "rectangle-create";
    }
}
