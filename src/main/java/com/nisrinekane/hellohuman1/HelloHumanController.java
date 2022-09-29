package com.nisrinekane.hellohuman1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
    //hello first name
    @RequestMapping("/")
    public String index(@RequestParam(value="firstname", required=false) String searchQuery1, @RequestParam(value="lastname", required=false) String searchQuery2, @RequestParam(value="times", required=false) String searchQuery3) {
        int repeat = Integer.parseInt(searchQuery3);
        if (searchQuery1==null && searchQuery2==null) {
            return new String(new char[repeat]).replace("\0", "hello human");
        }
        if(searchQuery1==null) {
            String query = "Hello " + " " + searchQuery2 + " ";
            return new String(new char[repeat]).replace("\0", query);
        }
        if (searchQuery2==null) {
            String query = "Hello " + " " + searchQuery1 + " ";
            return new String(new char[repeat]).replace("\0", query);
        }
        String query = "Hello " + " " + searchQuery1 + " " + searchQuery2;
        return new String(new char[repeat]).replace("\0", query);
    }
}
