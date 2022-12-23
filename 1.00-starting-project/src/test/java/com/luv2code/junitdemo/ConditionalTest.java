package com.luv2code.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionalTest {
    @Test
    @Disabled("Don't run this test until JIRA#123 is resolved")
    void basicTest(){
        //execute method and perform asserts
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testForWindowsOnly(){
        //execute method and perform asserts only for Windows OS
    }

    @Test
    @EnabledOnOs(OS.MAC)
    void testForMacOnly(){
        //execute method and perform asserts only for MAC OS
    }

    @Test
    @EnabledOnOs({OS.MAC,OS.WINDOWS})
    void testForMacAndWindowsOnly(){
        //execute method and perform asserts only for MAC and Windows OS
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testForLinuxOnly(){
        //execute method and perform asserts only for Linux OS
    }

    @Test
    @EnabledOnJre(JRE.JAVA_17)
    void testForOnlyForJava17(){
        //execute method and perform asserts
    }

    @Test
    @EnabledOnJre(JRE.JAVA_13)
    void testForOnlyForJava13(){
        //execute method and perform asserts
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_11,max=JRE.JAVA_18)
    void testForOnlyForJavaRange(){
        //execute method and perform asserts
    }
    @Test
    @EnabledIfEnvironmentVariable(named = "LUV2CODE_ENV",matches= "DEV")
    void testOnlyForDevEnvironment(){
        //execute method and perform asserts
    }
    @Test
    @EnabledIfSystemProperty(named = "LUV2CODE_SYS_PROP",matches= "CI_CD_DEPLOY")
    void testOnlyForSystemProperty(){
        //execute method and perform asserts
    }


}
