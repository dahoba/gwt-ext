/*
 * GWT-Ext Widget Library
 * Copyright 2007 - 2008, GWT-Ext LLC., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
 

package com.gwtext.client.widgets.grid.event;

import com.gwtext.client.data.Record;
import com.gwtext.client.widgets.grid.GridPanel;

//deails here http://extjs.com/forum/showthread.php?t=2834&highlight=validateedit
/**
 *
 * @author Sanjiv Jivan
 */
public interface EditorGridListener {

    /**
     * Fires after a cell is edited.
     *
     * @param grid     this
     * @param record   the record being edited
     * @param field    the field name being edited
     * @param newValue the value being set
     * @param oldValue the original value for the field, before the edit.
     * @param rowIndex the grid row index
     * @param colIndex the grid column index
     */
    void onAfterEdit(GridPanel grid, Record record, String field, Object newValue, Object oldValue, int rowIndex, int colIndex);

    /**
     * Fires before cell editing is triggered.
     *
     * @param grid     This grid
     * @param record   the record being edited
     * @param field    the field name being edited
     * @param value    the value for the field being edited
     * @param rowIndex the grid row index
     * @param colIndex the grid column index
     * @return false to cancel the edit
     */
    boolean doBeforeEdit(GridPanel grid, Record record, String field, Object value, int rowIndex, int colIndex);

    /**
     * Fires after a cell is edited, but before the value is set in the record. Return false to cancel the change.
     *
     * @param grid          this
     * @param record        the record being edited
     * @param field         the field name being edited
     * @param value         the value being set
     * @param originalValue the original value for the field, before the edit
     * @param rowIndex      the grid row index
     * @param colIndex      the grid column index
     * @return false to cancel the change
     */
    boolean doValidateEdit(GridPanel grid, Record record, String field, Object value, Object originalValue, int rowIndex, int colIndex);
}