/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 * 
 * Copyright 2011 OpenConcerto, by ILM Informatique. All rights reserved.
 * 
 * The contents of this file are subject to the terms of the GNU General Public License Version 3
 * only ("GPL"). You may not use this file except in compliance with the License. You can obtain a
 * copy of the License at http://www.gnu.org/licenses/gpl-3.0.html See the License for the specific
 * language governing permissions and limitations under the License.
 * 
 * When distributing the software, include this License Header Notice in each file.
 */
 
 package org.openconcerto.ui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

public class TitledSeparator extends JPanel {
    /**
     * 
     */
    private static final long serialVersionUID = 152598636165675470L;

    public TitledSeparator(String txt) {
        this(txt, false);

    }

    public TitledSeparator(String txt, boolean bold) {
        this.setOpaque(false);
        this.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.ipadx = 3;
        final JLabel label;
        if (!bold) {
            label = new JLabel(txt);

        } else {
            label = new JLabelBold(txt);
        }
        this.add(label, c);
        DefaultGridBagConstraints.lockMinimumSize(label);
        c.gridx++;
        c.weightx = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(new JSeparator(), c);

    }
}
