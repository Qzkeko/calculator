package com.qika.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
<<<<<<< HEAD
public class CalculatriceController {
=======
class CalculatriceController {
>>>>>>> 2dd8d821b004c04778f60799b2a6b6eb7a67ebec
 @Autowired
 private Calculatrice calculatrice;
 @RequestMapping("/sum")
 String sum(@RequestParam("a") Integer a,
 @RequestParam("b") Integer b) {
 return String.valueOf(calculatrice.sum(a, b));
 }
<<<<<<< HEAD
}
=======
>>>>>>> 2dd8d821b004c04778f60799b2a6b6eb7a67ebec
