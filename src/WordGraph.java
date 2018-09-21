import java.awt.Color;
import java.awt.Font;
import java.util.Map;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;
import javax.swing.JFrame;

public class WordGraph extends JPanel {

    /**
     * Width, in pixels, of the gap between bars
     */
    public static final int BAR_GAP = 20;

    /**
     * Horizontal position, in pixels, of where the bars should start
     */
    public static final int BAR_START = 100;

    private Map<String, Integer> words;

    public WordGraph(File f) throws FileNotFoundException {
        
        Scanner what=new Scanner(f);
        
        while(what.hasNext()){
            
            String next=what.next();
            addWord(next);
        }

    }

    /**
     * Add a word to the map, or increment the count if that word is already
     * there.
     *
     * Comparisons should be case insensitive. Only add the all lower cased
     * version of a string to the map.
     *
     * @param w
     */
    private void addWord(String w) {
        
        words=new TreeMap<String,Integer>(String.CASE_INSENSITIVE_ORDER);
        
        if(words.containsKey(w)){
            
            words.put(w,words.get(w)+1);
            
        }
        else{
            
            words.put(w,1);
        }
        
    }

    /**
     * Get the height of a bar.
     *
     * All bars are the same height based on the number of words and the gap
     * between each word.
     *
     * @return
     */
    private int getBarHeight() {
        return 0; 
    }

    /**
     * Get the width of a bar.
     *
     * Each bar can be a different width depending on how many times that word
     * occurs in the data set.
     *
     * @param w
     * @return
     */
    private int getBarWidth(String w) {
           return 0;
    }

    /**
     * Get the count of the most common word.
     *
     * @return
     */
    private int getMaxCount() {
        
        int max=Collections.max(words.values());
        
        return max;
    }

    /**
     * Get the number of distinct words that are in the map
     *
     * @return
     */
    private int getWordCount() {
        return words.size();
    }

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {

        int barHeight = getBarHeight();

        int yPos = 0; // hint, hint
        

    }

    /**
     * Return a random color to use when drawing a bar
     *
     * @return
     */
    private Color getRandomColor() {
        return null; 
    }

}
