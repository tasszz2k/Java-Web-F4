/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author TASS
 */
public class Calculator implements Serializable {

    private int num1 = 0, num2 = 0;
    private String operator = "+", result = "";

    public Calculator() {
    
    }

    


    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getResult() {
        char op = operator.charAt(0);
        switch (op) {
            case '+':
                result = "Sum: " + (num1 + num2);
                break;
            case '-':
                result = "Subtraction: " + (num1 - num2);
                break;
            case '*':
                result = "Multiply: " + (num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    result = "Divide " + ((float) num1 / num2);
                } else {
                    result = "ERROR!";
                }
                break;
        }

        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

}
