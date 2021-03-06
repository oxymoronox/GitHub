package ee.mihkel.listid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DoubleController {
    List<Double> komakohagaNumbrid = new ArrayList(Arrays.asList(0.11, 2.11, 3.19));

    @GetMapping("numbrid")
    public List<Double> saaNumbrid() {
        return komakohagaNumbrid;
    }
    @GetMapping("prindi-logidesse")
    public void prindiLogidesse() {
        for (int i = 0; i <komakohagaNumbrid.size(); i++) {
            System.out.println(komakohagaNumbrid.get(i));
        }
        for (Double d: komakohagaNumbrid){
            System.out.println(d);
        }
    }

   @GetMapping("true-false/{kahendV22rtus}")
   public String kontrolliTrueFalse(@PathVariable boolean kahendV22rtus) {
       if (kahendV22rtus) {
           return  "Mul on järgmised väärtused: " + komakohagaNumbrid;
       } else {
           return  "Mul ei ole luba sulle väärtusi tagastada";
       }
   }
    @GetMapping("suurem/{number}")
    public String kontrolliKasArvOnSuurem(@PathVariable int number) {
         if (number > 100) {
            return  "Arv on suurem kui 100";
         } else if   (number > 50) {
             return  "Arv on suurem kui 50";
         } else if   (number > 10) {
            return  "Arv on suurem kui 10";
         } else if   (number >= 0) {
             return  "Arv on suurem või võrdne 0";
         } else {
             return "Arv on negatiivne";
    }
   }
    @GetMapping("genereeri")
    public int genereeriSuvalineNumberYhestKymneni() {
        // cast to int ---- kustutab komakohad ära
       return (int) (Math.random()*10+1);
    }

        @GetMapping("saa/{j2rjekorraNumber}")
        public String saaKindelNumber (@PathVariable int j2rjekorraNumber) {
        try {
              return "Leitud number on: " + komakohagaNumbrid.get(j2rjekorraNumber); // saa kindlat järjekorranumbrit
        } catch (IndexOutOfBoundsException e) {
              return "Sisestatud number on liiga suur või väike";
        }
         
}
}