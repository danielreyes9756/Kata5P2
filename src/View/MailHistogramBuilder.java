package View;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Model.Histogram;
import java.util.List;

/**
 *
 * @author danie
 */
public class MailHistogramBuilder {

    public MailHistogramBuilder(){}

    public Histogram<String> build (List<String> mails){
        Histogram<String> histogram = new Histogram();
        for (String mail : mails) {
            histogram.increment(mail);
        }
        return histogram;
    }
}
 
