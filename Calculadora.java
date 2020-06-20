package org.me.calculadora;

public class Calculadora extends javax.swing.JFrame {


    //Soma
    private void SumActionPerformed(java.awt.event.ActionEvent evt) {    

        float firstNumber, secondNumber, result;
        
        firstNumber = Float.parseFloat(txtFirstNumber.getText());
        secondNumber = Float.parseFloat(txtSecondNumber.getText());
        
        result = firstNumber + secondNumber;
        
        txtResult.setText(String.valueOf(result));

    }                                       
                                                             

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {    

        float firstNumber, secondNumber, result;
        
        firstNumber = Float.parseFloat(txtFirstNumber.getText());
        secondNumber = Float.parseFloat(txtSecondNumber.getText());
        
        result = firstNumber - secondNumber;
        
        txtResult.setText(String.valueOf(result));

    }                                     

    //Multiplicação
    private void MultiplicationActionPerformed(java.awt.event.ActionEvent evt) {      

        float firstNumber, secondNumber, result;
        
        firstNumber = Float.parseFloat(txtFirstNumber.getText());
        secondNumber = Float.parseFloat(txtSecondNumber.getText());
        
        result = firstNumber * secondNumber;
        
        txtResult.setText(String.valueOf(result));

    }                         

    //Divisão
    private void SplitActionPerformed(java.awt.event.ActionEvent evt) {    

        float firstNumber, secondNumber, result;

        firstNumber = Float.parseFloat(txtFirstNumber.getText());
        secondNumber = Float.parseFloat(txtSecondNumber.getText());

        result = firstNumber / secondNumber;

        txtResult.setText(String.valueOf(result));

    }                           

    //Expoente ao quadrado
    private void PowerOfTwoActionPerformed(java.awt.event.ActionEvent evt) {  

        int firstNumber, result;
        
        firstNumber = Integer.parseInt(txtFirstNumber.getText());
        
        result = (int) Math.pow(firstNumber, 2);
        
        txtResult.setText(String.valueOf(result));

    }                                                                                  

    //Expoente ao cubo
    private void PowerOfThreeActionPerformed(java.awt.event.ActionEvent evt) {    

        int firstNumber, result;
        
        firstNumber = Integer.parseInt(txtFirstNumber.getText());
        
        result = (int) Math.pow(firstNumber, 3);
        
        txtResult.setText(String.valueOf(result));

    }                                          

    //Raiz quadrada
    private void SquareRootActionPerformed(java.awt.event.ActionEvent evt) {       

        int firstNumber, result;
        
        firstNumber = Integer.parseInt(txtFirstNumber.getText());
        
        result = (int) Math.sqrt(firstNumber);
        
        txtResult.setText(String.valueOf(result));

    }       


    //Função do Fatorial / copiei do Google.
    public long factorialUsingRecursion(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorialUsingRecursion(n - 1);
    }

    //Fatorial
    private void FactorialActionPerformed(java.awt.event.ActionEvent evt) {    

         int firstNumber, result;
        
        firstNumber = Integer.parseInt(txtFirstNumber.getText());
        
        result = (int) factorialUsingRecursion(firstNumber);
        
        txtResult.setText(String.valueOf(result));

    }

    //C - Clear
    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {       

        txtFirstNumber.setText("");
        txtSecondNumber.setText("");
        txtResult.setText("");

    }                                                 
}
