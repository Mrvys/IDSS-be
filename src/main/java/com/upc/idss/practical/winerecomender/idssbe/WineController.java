package com.upc.idss.practical.winerecomender.idssbe;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONObject;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/api"})
public class WineController {

    private final String python_exe = "c:\\Users\\puma\\Appdata\\Local\\Programs\\Python\\Python37-32\\python.exe";
    private final String ranking_python_file = "c:C:\\Users\\Puma\\PycharmProjects\\IDSS-py\\source\\ranking.py";

    @RequestMapping("/keywords")
    public JSONObject create(@RequestBody Wine wine){
        JSONObject obj = new JSONObject();
        wine.setKeywords(wine.getKeywords().trim().replaceAll("[ ]{1,}", ";"));
        System.out.println(wine.getKeywords());
        String arguments = wine.getKeywords() + ' ' + wine.getPriceMin() + ' ' + wine.getPriceMax();
//        System.out.print(arguments);
        String result = "";
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", python_exe + ranking_python_file + arguments);
        builder.redirectErrorStream(true);
        Process p = null;
        try {
            p = builder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line = "";
        while (true) {
            try {
                line = r.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (line == null) { break; }
            System.out.println(line);
            result += line;
            result += ";";
        }
        System.out.println("Finished!");
        System.out.print(result);
        wine.setCountry(result);
        obj.put("result", result);

        return obj;
    }

}