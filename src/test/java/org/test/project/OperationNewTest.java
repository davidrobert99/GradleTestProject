package org.test.project;

import org.junit.jupiter.api.Test;
import org.test.project.operations.DivideOperation;
import org.test.project.operations.Operation;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OperationNewTest {

    @Test
    public void testDivideOperation(){
        Operation op = new DivideOperation();

        assertEquals(op.makeOperation(5,5), 1);
    }

}
