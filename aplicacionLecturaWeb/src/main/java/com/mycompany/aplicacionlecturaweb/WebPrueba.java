/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aplicacionlecturaweb;

import java.io.IOException;
import java.net.URL;
import net.htmlparser.jericho.Segment;
import net.htmlparser.jericho.Source;
import net.htmlparser.jericho.TextExtractor;

/**
 *
 * @author formacion
 */
public class WebPrueba {
    public static void main (String[] args) throws IOException{
        Source web1 = new Source(new URL("http://www.google.es"));
        Segment web2 = new Segment(web1,0,web1.length()-1);
        TextExtractor web3 = new TextExtractor(web2);
        System.out.println(web3.toString());
    }
}
