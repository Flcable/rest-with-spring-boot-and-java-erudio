package br.com.erudio.controllers;

import java.util.concurrent.atomic.AtomicLong;

import br.com.erudio.converters.NumberConverter;
import br.com.erudio.math.SimpleMath;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exceptions.UnsupportedMathOperationException;

@RestController
public class MathController {

		private SimpleMath math = new SimpleMath();
        
	 @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	    public Double sum(@PathVariable("numberOne") String numberOne,
	                      @PathVariable("numberTwo") String numberTwo) throws Exception {
	        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
	            throw new UnsupportedMathOperationException("Please set a numeric value! ");
	        }
	        return math.sum(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
	    }    
	    
	 
	 @RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	    public Double sub(@PathVariable("numberOne") String numberOne,
	                      @PathVariable("numberTwo") String numberTwo) throws Exception {
	        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
	            throw new UnsupportedMathOperationException("Please set a numeric value! ");
	        }
		 return math.sub(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
	    }    
	 
	 
	 @RequestMapping(value="/mult/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	    public Double mult(@PathVariable("numberOne") String numberOne,
	                      @PathVariable("numberTwo") String numberTwo) throws Exception {
	        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
	            throw new UnsupportedMathOperationException("Please set a numeric value! ");
	        }
		 return math.mult(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
	    }    
	 
	 @RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	    public Double div(@PathVariable("numberOne") String numberOne,
	                      @PathVariable("numberTwo") String numberTwo) throws Exception {
	        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
	            throw new UnsupportedMathOperationException("Please set a numeric value! ");
	        }
		 return math.div(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
	    }  
	 
	 @RequestMapping(value="/med/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	    public Double med(@PathVariable("numberOne") String numberOne,
	                      @PathVariable("numberTwo") String numberTwo) throws Exception {
	        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
	            throw new UnsupportedMathOperationException("Please set a numeric value! ");
	        }
		 return math.med(NumberConverter.covertToDouble(numberOne), NumberConverter.covertToDouble(numberTwo));
	    }  
	 
	 @RequestMapping(value="/quad/{numberOne}", method=RequestMethod.GET)
	    public Double quad(@PathVariable("numberOne") String numberOne) throws Exception {
	        if (!NumberConverter.isNumeric(numberOne) ) {
	            throw new UnsupportedMathOperationException("Please set a numeric value! ");
	        }
	        Double num = math.quad(NumberConverter.covertToDouble(numberOne)) ;
	        return Math.sqrt(num);
	    }  
	 
	 
	 
	 

}