/* DefaultUserAction.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Feb 24, 2012 11:57:44 AM , Created by sam
}}IS_NOTE

Copyright (C) 2012 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
 */
package org.zkoss.zss.ui;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sam
 * @author dennis
 * 
 */
public enum DefaultUserAction {

	 ADD_SHEET("addSheet"),
	 DELETE_SHEET("deleteSheet"),
	 RENAME_SHEET("renameSheet"),
	 MOVE_SHEET_LEFT("moveSheetLeft"),
	 MOVE_SHEET_RIGHT("moveSheetRight"),
	 PROTECT_SHEET("protectSheet"),
	 GRIDLINES("gridlines"),
	 HOME_PANEL("homePanel"),
	 FORMULA_PANEL("formulaPanel"),
	 INSERT_PANEL("insertPanel"),
	 NEW_BOOK("newBook"),
	 SAVE_BOOK("saveBook"),
	 CLOSE_BOOK("closeBook"),
	 EXPORT_PDF("exportPDF"),
	 PASTE("paste"),
	 PASTE_FORMULA("pasteFormula"),
	 PASTE_VALUE("pasteValue"),
	 PASTE_ALL_EXPECT_BORDERS("pasteAllExceptBorder"),
	 PASTE_TRANSPOSE("pasteTranspose"),
	 PASTE_SPECIAL("pasteSpecial"),
	 CUT("cut"),
	 COPY("copy"),
	 FONT_FAMILY("fontFamily"),
	 FONT_SIZE("fontSize"),
	 FONT_BOLD("fontBold"),
	 FONT_ITALIC("fontItalic"),
	 FONT_UNDERLINE("fontUnderline"),
	 FONT_STRIKE("fontStrike"),
	 BORDER("border"),
	 BORDER_BOTTOM("borderBottom"),
	 BORDER_TOP("borderTop"),
	 BORDER_LEFT("borderLeft"),
	 BORDER_RIGHT("borderRight"),
	 BORDER_NO("borderNo"),
	 BORDER_ALL("borderAll"),
	 BORDER_OUTSIDE("borderOutside"),
	 BORDER_INSIDE("borderInside"),
	 BORDER_INSIDE_HORIZONTAL("borderInsideHorizontal"),
	 BORDER_INSIDE_VERTICAL("borderInsideVertical"),
	 FILL_COLOR("fillColor"),
	 FONT_COLOR("fontColor"),
	 VERTICAL_ALIGN_TOP("verticalAlignTop"),
	 VERTICAL_ALIGN_MIDDLE("verticalAlignMiddle"),
	 VERTICAL_ALIGN_BOTTOM("verticalAlignBottom"),
	 HORIZONTAL_ALIGN_LEFT("horizontalAlignLeft"),
	 HORIZONTAL_ALIGN_CENTER("horizontalAlignCenter"),
	 HORIZONTAL_ALIGN_RIGHT("horizontalAlignRight"),
	 WRAP_TEXT("wrapText"),
	 MERGE_AND_CENTER("mergeAndCenter"),
	 MERGE_ACROSS("mergeAcross"),
	 MERGE_CELL("mergeCell"),
	 UNMERGE_CELL("unmergeCell"),
	 INSERT_SHIFT_CELL_RIGHT("shiftCellRight"),
	 INSERT_SHIFT_CELL_DOWN("shiftCellDown"),
	 INSERT_SHEET_ROW("insertSheetRow"),
	 INSERT_SHEET_COLUMN("insertSheetColumn"),
	 DELETE_SHIFT_CELL_LEFT("shiftCellLeft"),
	 DELETE_SHIFT_CELL_UP("shiftCellUp"),
	 DELETE_SHEET_ROW("deleteSheetRow"),
	 DELETE_SHEET_COLUMN("deleteSheetColumn"),
	 ROW_HEIGHT("rowHeight"),
	 COLUMN_WIDTH("columnWidth"),
	 HIDE_ROW("hideRow"),
	 UNHIDE_ROW("unhideRow"),
	 HIDE_COLUMN("hideColumn"),
	 UNHIDE_COLUMN("unhideColumn"),
	 FORMAT_CELL("formatCell"),
	 CLEAR_CONTENT("clearContent"),
	 CLEAR_STYLE("clearStyle"),
	 CLEAR_ALL("clearAll"),
	 SORT_ASCENDING("sortAscending"),
	 SORT_DESCENDING("sortDescending"),
	 CUSTOM_SORT("customSort"),
	 FILTER("filter"),
	 CLEAR_FILTER("clearFilter"),
	 REAPPLY_FILTER("reapplyFilter"),
	 INSERT_PICTURE("insertPicture"),
	 COLUMN_CHART("columnChart"),
	 COLUMN_CHART_3D("columnChart3D"),
	 LINE_CHART("lineChart"),
	 LINE_CHART_3D("lineChart3D"),
	 PIE_CHART("pieChart"),
	 PIE_CHART_3D("pieChart3D"),
	 BAR_CHART("barChart"),
	 BAR_CHART_3D("barChart3D"),
	 AREA_CHART("areaChart"),
	 SCATTER_CHART("scatterChart"),
	 DOUGHNUT_CHART("doughnutChart"),
	 HYPERLINK("hyperlink"),
	 INSERT_FUNCTION("insertFunction"),
	 
	 
	 /* following are fold item only, doesn't send auxevent to server*/
	 VERTICAL_ALIGN("verticalAlign"),
	 HORIZONTAL_ALIGN("horizontalAlign"),
	 INSERT("insert"),
	 DELETE("del"),
	 CLEAR("clear"),
	 SORT_AND_FILTER("sortAndFilter"),
	 OTHER_CHART("otherChart");
	 

	private final String action;

	private DefaultUserAction() {
		this("none");
	}

	private DefaultUserAction(String action) {
		this.action = action;
	}

//	public String getLabelKey() {
//		return "zss." + action;
//	}

//	public boolean equals(String action) {
//		return this.action.equals(action);
//	}
	
	public String getAction(){
		return action;
	}

	@Override
	public String toString() {
		return action;
	}
	
	public static Map<String,DefaultUserAction> actionMap;
	
	public static DefaultUserAction getBy(String action){
		if(actionMap==null){
			synchronized(DefaultUserAction.class){
				if(actionMap==null){
					actionMap = new HashMap<String,DefaultUserAction>();
					for(DefaultUserAction dua:DefaultUserAction.class.getEnumConstants()){
						actionMap.put(dua.action, dua);
					}
				}
			}
		}
		return actionMap.get(action);
		
	}
	

//	public static Collection<String> getLabelKeys() {
//		UserAction[] enums = UserAction.class.getEnumConstants();
//		ArrayList<String> keys = new ArrayList<String>(enums.length);
//		for (UserAction a : enums) {
//			keys.add(a.getLabelKey());
//		}
//		return keys;
//	}

//	/**
//	 * Returns all Action
//	 * 
//	 * @return
//	 */
//	public static HashMap<String, UserAction> getAll() {
//		UserAction[] enums = UserAction.class.getEnumConstants();
//		HashMap<String, UserAction> actions = new HashMap<String, UserAction>(
//				enums.length);
//		for (UserAction t : enums) {
//			actions.put(t.toString(), t);
//		}
//		return actions;
//	}
}