package ee.mihkel.listid;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@RestController // RestController on alati classi peal (annotation)
public class StringController<getSum> {
    // Tellimused, Tooted, Kasutajad, Katergooriad, Pildigalerii pildid, Uudised

    // Ei saadeta staatilisi kohti (mis üldse ei muutu)

    List<String> s6nad = new ArrayList(Arrays.asList("Elas", "metsas", "mutionu", "lisa")); // String []

    @GetMapping("sonad")    // localhost:8080/sonad
    public List saaS6nad() {
        System.out.println("Elas " + " metsas " + " mutionu " + " lisa");
        return s6nad;
    }
    @GetMapping("get-size")    // localhost:8080/get-size    // :::!!! - mitu tükki massiivis on
    public Integer getSize() {

        List<String> input = s6nad;
        int size = input.size();
        System.out.println(size);
        return input.size();
//        return Collections.singletonList(size);   //tekitab listi kus sees ainult üks väärtus
    }
    @GetMapping("get-sum")    // localhost:8080/get-sum    // :::!!! tagastab kõik sõnad kokku liidetuna EI OSKA
    public String getSum() {
        List<String> input = s6nad;

        String sum = "";
        for (String value : s6nad) {
            sum += value;
        }
        return sum;

    }

    @GetMapping("sona")    // localhost:8080/sona
    public String saaS6na() {

        return s6nad.get(2);
    }

    @GetMapping("lisa-sona/{uusS6na}")    // localhost:8080/lisa-sona/s
    public String lisaS6na(@PathVariable String uusS6na) { // URL muutuja
        s6nad.add(uusS6na);
        System.out.println("Edukalt sõna lisatud");
        return "Edukalt sõna lisatud";
    }

    @GetMapping("saa-sona/{j2rjekorraNumber}")    // localhost:8080/saa-sona/1
    public String saaKindelS6na(@PathVariable int j2rjekorraNumber) { // URL muutuja
        System.out.println("Saa sõna");
        try {
            return s6nad.get(j2rjekorraNumber);
        }
        catch (IndexOutOfBoundsException e){
            return "liiga suur või väike number";
        }
    }
}

