package witsoftware.desafio.rest.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import witsoftware.desafio.rest.api.model.OperationModel;
import witsoftware.desafio.rest.api.servicos.CalculateSimple;

@RestController
public class Calculator {

    OperationModel operationModel = new OperationModel();

    @Autowired
    private CalculateSimple calculateSimple;


    @GetMapping ("/calculator")
    public ModelAndView getCalculatorPage(Model model){
        model.addAttribute("operationModel",operationModel);
        return new ModelAndView ("/calculator");
    }

    @RequestMapping(value="/calculator", params="add", method = RequestMethod.POST)
    public String add(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.add(operationModel));
        return "/calculator";
    }

    @RequestMapping(value="/calculator", params="subtract", method = RequestMethod.POST)
    public String subtract(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.subtract(operationModel));
        return "/calculator";
    }

    @RequestMapping(value="/calculator", params="multiply", method = RequestMethod.POST)
    public String multiply(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.multiply(operationModel));
        return "/calculator";
    }

    @RequestMapping(value="/calculator", params="divide", method = RequestMethod.POST)
    public String divide(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("result", calculateSimple.divide(operationModel));
        return "/calculator";
    }

    @RequestMapping(value="/calculator", params="clearSimple", method = RequestMethod.POST)
    public String clearSimple(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearSimple(operationModel));
        model.addAttribute("result", 0);
        return "/calculator";
    }

    @RequestMapping(value="/calculator", params="clearAdvanced", method = RequestMethod.POST)
    public String clearAdvanced(@ModelAttribute("operationModel")  OperationModel operationModel, Model model ){
        model.addAttribute("operationModel",  calculateSimple.clearAdvanced(operationModel));
        model.addAttribute("result", 0);
        return "/calculator";
    }
}
