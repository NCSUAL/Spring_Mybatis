package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.*;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController{
    
    private final BoardService boardService;
    
    @GetMapping("/board/save")
    public String save(){
        return "save";
    }
}