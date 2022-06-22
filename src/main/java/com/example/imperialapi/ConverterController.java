package com.example.imperialapi;

import org.springframework.web.bind.annotation.*;

@RestController
public class ConverterController {

    @GetMapping("/ounce/{number}")
    public double convertOunce(
            @PathVariable double number

    ) {

        return number * 28.35;
    }

    @GetMapping("/stone/{number}")
    public double convertStone(
            @PathVariable double number
    ) {
        return number * 6.35;
    }
}
