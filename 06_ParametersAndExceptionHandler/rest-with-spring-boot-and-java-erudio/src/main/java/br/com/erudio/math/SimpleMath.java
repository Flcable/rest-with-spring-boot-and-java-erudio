package br.com.erudio.math;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class SimpleMath {


    public Double sum(Double numberOne, Double numberTwo)  {

        return numberOne + numberTwo;
    }



    public Double sub(Double numberOne, Double numberTwo)  {

        return numberOne - numberTwo;
    }



    public Double mult(Double numberOne, Double numberTwo) {

        return numberOne *  numberTwo;
    }


    public Double div( Double numberOne, Double numberTwo)  {

        return numberOne /  numberTwo;
    }


    public Double med(Double numberOne, Double numberTwo)  {

        return (numberOne +  numberTwo) / 2;
    }


    public Double quad(Double numberOne)  {

        Double num = numberOne ;
        return Math.sqrt(num);
    }
}
