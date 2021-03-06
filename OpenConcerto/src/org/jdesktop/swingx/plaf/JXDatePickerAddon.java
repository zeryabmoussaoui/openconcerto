/*
 * Copyright 2005 Sun Microsystems, Inc., 4150 Network Circle,
 * Santa Clara, California 95054, U.S.A. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.jdesktop.swingx.plaf;

import java.util.Arrays;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;

import org.jdesktop.swingx.JXDatePicker;
import org.jdesktop.swingx.plaf.basic.BasicDatePickerUI;

/**
 * @author Joshua Outwater
 */
public class JXDatePickerAddon extends AbstractComponentAddon {
    public JXDatePickerAddon() {
        super("JXDatePicker");
    }

    
    protected void addBasicDefaults(LookAndFeelAddons addon, List/*<Object>*/ defaults) {
        defaults.addAll(Arrays.asList(new Object[] {
                JXDatePicker.uiClassID,
                BasicDatePickerUI.class.getName(),
                "JXDatePicker.linkFormat",
                "Nous sommes le {0,date, dd MMMM yyyy}",
                "JXDatePicker.longFormat",
                "EEE MM/dd/yyyy",
                "JXDatePicker.mediumFormat",
                "MM/dd/yyyy",
                "JXDatePicker.shortFormat",
                "MM/dd",
                "JXDatePicker.border",
                new BorderUIResource(BorderFactory.createCompoundBorder(
                    LineBorder.createGrayLineBorder(),
                    BorderFactory.createEmptyBorder(3, 3, 3, 3))),
                "JXDatePicker.numColumns",
                new Integer(10)
        }));
        addResource(defaults, "org.jdesktop.swingx.plaf.basic.resources.DatePicker");
    }
}
