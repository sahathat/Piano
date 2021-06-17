/*
 * @param hello I test a piano text example pppppppiiiiiiiiiaaaaaaannnnnnoooooo to piano
 */
package piano;

/**
 *
 * @author sahat
 */
public class PianoTest {
    public static void main(String[] args) {
        String test = "Ppppppppppppppiiiiiiiiiiiiiiiiaaaaaaaaaaaaannnnnnnnnnnnnoooooo";
        Piano piano = new Piano(test);
        System.out.println(piano.getPrint());
        System.out.println(piano.getPrintSplit());
        System.out.println(piano.getSetPiano());
    }
}
