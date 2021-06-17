/*
 * hi
 */
package piano;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author sahat
 */
public class Piano {

    String text;
    char[] split;
    Set set = new LinkedHashSet();
    
    public Piano(String text) {
        this.text = text.toLowerCase();
        this.split = text.toLowerCase().toCharArray();
        for(int i=0;i<split.length;i++){
            set.add(split[i]);
        }
    }

    public String getPrint() {
        return text;
    }
    
    public String getPrintSplit() {
        String result = "";
        for (int i = 0; i < split.length; i++) {
            result += split[i];
        }
        return result;
    }
    
    public String getSetPiano(){
        String result = "";
        Iterator iter = set.iterator();
        while(iter.hasNext()){
            result += iter.next();
        }
        return result;
    }
}
