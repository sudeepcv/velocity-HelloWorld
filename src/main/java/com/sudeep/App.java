package com.sudeep;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        VelocityEngine velocityEngine = new VelocityEngine();
        velocityEngine.init();
        Template template = velocityEngine.getTemplate(/* Give the template file location here */"./src/conf.tpl.txt");
        VelocityContext context = new VelocityContext();
        // template output file
        FileWriter writer = new FileWriter(new File("./src/conf.tpl.output.txt"));
        context.put("NAME", "Sudeep");
        context.put("COMPANY", "Vodafone");
        context.put("CONDITION",true);
        template.merge(context, writer);
        writer.flush();
        writer.close();
    }
}
