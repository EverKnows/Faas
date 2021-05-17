package com.xjm;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class ScriptTest {

    public static void main(String[] args) throws Exception {
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();

        String script = "package com.xjm;\n" +
                "\n" +
                "public class Test {\n" +
                "\n" +
                "    public void print() {\n" +
                "        System.out.println(\"test\");\n" +
                "    }\n" +
                "}\n";


        Grov
    }
}
