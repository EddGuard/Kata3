/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;
/*
* Author: EddGuard (Eduardo Santana)
*/

public class Kata3 {

    public static void main(String[] args) {     
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("google.com");
        histogram.increment("ulpgc.es");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("hotmail.com");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("google.com");
        histogram.increment("google.com");
        histogram.increment("google.com");
        new HistogramDisplay(histogram).execute();
    }
}
