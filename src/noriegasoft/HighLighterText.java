/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noriegasoft;

import java.awt.Color;
import javax.swing.text.DefaultHighlighter;

/**
 *
 * @author lnoriegag
 */
    public class HighLighterText extends DefaultHighlighter.DefaultHighlightPainter {
    public HighLighterText(Color color) {
        super(color);
    }
}

