package com.myles.demo;

import org.apache.tika.*;
import java.io.*;
/**
 * Hello world!
 *
 */
public class DemoTika 
{
    public static void main( String[] args ) throws Exception
    {
        Tika tika= new Tika();
	File file=new File("/local.txt");
	file.createNewFile();
    }
}
