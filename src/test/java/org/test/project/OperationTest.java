package org.test.project;

import org.junit.jupiter.api.Test;
import org.test.project.operations.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OperationTest {


    @Test
    public void testSumOperation(){
        Operation op = new SumOperation();

        assertEquals(op.makeOperation(5,5),10);
    }

    @Test
    public void testSubtractOperation(){
        Operation op = new SubtractOperation();

        assertEquals(op.makeOperation(5,10),-5);
    }

    @Test
    public void testMultiplyOperation(){
        Operation op = new MultiplyOperation();

        assertEquals(op.makeOperation(5,1),5);
    }
    
    
    @Test
    public void testMultiplyOperation2(){
        Operation op = new MultiplyOperation();

        assertEquals(op.makeOperation(5,1),15);
    }


}
