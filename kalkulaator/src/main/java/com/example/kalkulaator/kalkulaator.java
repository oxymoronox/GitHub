package com.example.kalkulaator;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@RestController // annotation (annab klassile eriomadused)
public class kalkulaator {
    List<Integer> integers = new ArrayList<>(Arrays.asList(31, 51, 24)); // muutuja

    @GetMapping("integers") // localhost:8080/integers  // @GetMapping(kui kindlal URLil vaja kindlaid asju kätte saada)
    public List<Integer> getIntegers() {
        return integers;


    }
    @GetMapping("add-integer/{newInteger}") //                              localhost:8080/add-integer/s : Lisab numbri massiivi
    public List<Integer> addInteger(@PathVariable Integer newInteger) { //
        integers.add(newInteger);
        return integers;
    }
    @GetMapping ("remove-integer/{removeInteger}") // localhost:8080/remove-integer/1 //   :EI KUSTUTA?!
    public List<Integer> removeInteger(@PathVariable List<Integer> removeInteger) {
        integers.remove(removeInteger);
        return integers;
    }
    @GetMapping ("remove-same-integers/{removeSameIntegers}") // localhost:8080/remove-same-integers/1   :kustutab kõik sama väärtusega numbrid massivist
    public List<Integer> removeSameIntegers(@PathVariable Integer removeSameIntegers) {
        integers.removeAll(Collections.singleton(removeSameIntegers));
        return integers;
    }
    @GetMapping ("remove-all")      // localhost:8080/remove-all    :kustutab kõik numbrid massiivist
    public List<Integer> removeAllIntegers() {
        integers.removeAll(integers);
        return integers;

    }
    @GetMapping ("getSum")           // localhost:8080/getSum
    public int getSum() {              // tagastab - List<Integer>

        List<Integer> input = integers;
        int sum = 0;

        for (int i = 0; i <input.size(); i++) {
            sum = sum + input.get(i);
        }
        return sum;
    }
    @GetMapping ("getAverage")           // localhost:8080/getAverage   ?!KESKMINE KOMAKOHTADEGA JA ILMA ?!
    public float getAverage() {

        List<Integer> input = integers;
        int sum = 106;
        float size = 0;
        float average;

        for (int i = 0; i < input.size(); i++) {
        }
        size = input.size();
        average = sum/size;
        return (float) average;
    }
    @GetMapping ("getSize")           // localhost:8080/getSize
    public int Size() {

        List<Integer> input = integers;

        int size = input.size();

        return size;
    }
    @GetMapping ("add-integers")           // localhost:8080/add-integers
    public int addIntegers() {

        List<Integer> input = integers;

            int size = 0;
            int sum = 0;

            for (int i = 0; i < input.size(); i++) {
                sum+=input.get(i);
            }
            return sum;
    }
    @GetMapping ("subtract-integers")           // localhost:8080/subtract-integers
    public int subtractIntegers() {

        List<Integer> input = integers;

        int size = 0;
        int sum = 0;

        for (int i = 0; i < input.size(); i++) {
            sum+=input.get(i);
        }
        return sum;
    }
    @GetMapping ("multiply-integers")           // localhost:8080/multiply-integers :
    public int multiplyIntegers() {

        List<Integer> input = integers;

        int size = 0;
        int sum = 1;

        for (Integer integer : input) {
            sum *= integer;
        }
        return sum;
}
    @GetMapping ("divide-integers")           // localhost:8080/divide-integers : KORRUTAMINE EI ÕNNESTU
    public double divideIntegers() {

        List<Integer> input = integers;

        int size = 0;
        double sum = 1;

        for (Integer integer : input) {
            sum /= integer;
        }
        return sum;


}
}















