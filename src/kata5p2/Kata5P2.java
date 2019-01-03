/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata5p2;
import Model.*;
import java.io.IOException;
import java.util.List;
import View.*;

/**
 *
 * @author danie
 */

public class Kata5P2 {

    private static List<String> listMails;
    private static Histogram histograma;
    public static void main(String[] args) throws IOException {
        input();
        process();
        output();
    }
   
     public static void input() throws IOException{
        MailListReaderBD bd = new MailListReaderBD();
        listMails = bd.read("jdbc:sqlite:Kata5.db", "EMAIL");
    }
    
    public static void process(){
        MailHistogramBuilder builded = new MailHistogramBuilder();
        histograma = builded.build(listMails);

    }
    
    public static void output(){
        new HistogramDisplay(histograma).execute();
    }
}