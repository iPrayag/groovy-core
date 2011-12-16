package org.codehaus.groovy.classgen.asm.sc

import org.codehaus.groovy.classgen.asm.AbstractBytecodeTestCase

/**
 * Unit tests for static compilation: basic math operations.
 * 
 * @author Cedric Champeau
 */
class StaticCompileMathTest extends AbstractBytecodeTestCase {
    void testIntSum() {
        assertScript '''
            @groovy.transform.CompileStatic
            int m() {
                int a = 10
                int b = 20
                int c = a+b
            }
            assert m()==30
        '''
    }

    void testLongSum() {
        assertScript '''
            @groovy.transform.CompileStatic
            long m() {
                long a = 10
                long b = 20
                long c = a+b
            }
            assert m()==30
        '''
    }

    void testShortSum() {
        assertScript '''
            @groovy.transform.CompileStatic
            int m() {
                short a = 10
                short b = 20
                int c = a+b
            }
            assert m()==30
        '''
    }

    void testFloatSum() {
        assertScript '''
            @groovy.transform.CompileStatic
            float m() {
                float a = 10f
                float b = 20f
                float c = a+b
            }
            assert m()==30f
        '''
    }

    void testDoubleSum() {
        assertScript '''
            @groovy.transform.CompileStatic
            double m() {
                double a = 10d
                double b = 20d
                double c = a+b
            }
            assert m()==30d
        '''
    }

    void testDoublePlusInt() {
        assertScript '''
            @groovy.transform.CompileStatic
            double m() {
                double a = 10d
                int b = 1
                double c = a+b
            }
            assert m()==11d
        '''
    }
    
    void testIntMinusDouble() {
        assertScript '''
            @groovy.transform.CompileStatic
            double m() {
                int x = 10
                double y = 0.5
                x-y
            }
            assert m()==9.5d
        '''
    }

    void testIntMinusBigDec() {
        extractionOptions = [method: 'm', print:true]
        assertScript '''
            @groovy.transform.CompileStatic
            double m() {
                return 1i - 1.0 // 1.0 is BigDecimal
            }
            assert m()==0
        '''
    }

    void testIntPlusBigDec() {
        extractionOptions = [method: 'm', print:true]
        assertScript '''
            @groovy.transform.CompileStatic
            double m() {
                return 1i + 1.0 // 1.0 is BigDecimal
            }
            assert m()==2
        '''
    }

    void testIntMultiplyBigDec() {
        extractionOptions = [method: 'm', print:true]
        assertScript '''
            @groovy.transform.CompileStatic
            double m() {
                return 1i * 1.0 // 1.0 is BigDecimal
            }
            assert m()==1
        '''
    }

    void testIntDivBigDec() {
        extractionOptions = [method: 'm', print:true]
        assertScript '''
            @groovy.transform.CompileStatic
            double m() {
                return 1i / 1.0 // 1.0 is BigDecimal
            }
            assert m()==1
        '''
    }

}