/* ModelEvent.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2013/12/11 , Created by dennis
}}IS_NOTE

Copyright (C) 2013 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zss.ngmodel;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dennis
 *
 */
public class ModelEvent {
private String name;
	
	private Map<String,Object> data;
	
	public ModelEvent(String name){
		this.name = name;
	}
	
	public ModelEvent(String name,Map<String,Object> data){
		this.name = name;
		this.data = new HashMap<String, Object>(data);
	}
	
	public Object getData(String key){
		return data==null?null:data.get(key);
	}

	public String getName() {
		return name;
	}

	public NBook getBook() {
		return (NBook)getData(ModelEvents.PARAM_BOOK);
	}
	
	public NSheet getSheet() {
		return (NSheet)getData(ModelEvents.PARAM_SHEET);
	}
	
	public CellRegion getRegion() {
		return (CellRegion)getData(ModelEvents.PARAM_REGION);
	}
	
	public Object getCustomData() {
		return getData(ModelEvents.PARAM_CUSTOM_DATA);
	}
	
	public boolean isWholeRow(){
		NBook book = getBook();
		if(book == null){
			throw new IllegalStateException("can't find book");
		}
		CellRegion region = getRegion();
		if(region==null){
			return false;
		}
		return region.column<=0 && region.lastColumn>=book.getMaxColumnIndex();
	}
	
	public boolean isWholeColumn(){
		NBook book = getBook();
		if(book == null){
			throw new IllegalStateException("can't find book");
		}
		CellRegion region = getRegion();
		if(region==null){
			return false;
		}
		return region.row<=0 && region.lastRow>=book.getMaxRowIndex();
	}

	public String getObjectId() {
		return (String)getData(ModelEvents.PARAM_OBJECT_ID);
	}
}
