/*
 * Copyright (c) 2016 | James Kusmambang
 * Source : https://github.com/paralun
 */
package com.paralun.app.example3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class FileBean implements ResourceLoaderAware{
    
    private ResourceLoader loader;

    @Override
    public void setResourceLoader(ResourceLoader loader) {
        this.loader = loader;
    }
    
    public void printData() {
        Resource resource = loader.getResource("classpath:/data/input.txt");
        try (Scanner scanner = new Scanner(resource.getInputStream())) {
            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(FileBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void printData2() {
        Resource resource = loader.getResource("classpath:/data/input.txt");
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(resource.getInputStream()))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(FileBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
