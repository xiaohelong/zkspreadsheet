/*

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2013/12/01 , Created by dennis
}}IS_NOTE

Copyright (C) 2013 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zss.ngmodel.impl.sys;

import java.util.Date;

import org.zkoss.poi.ss.usermodel.DateUtil;
import org.zkoss.zss.ngmodel.sys.CalendarUtil;
/**
 * 
 * @author dennis
 *
 */
public class CalendarUtilImpl implements CalendarUtil {

	@Override
	public Date doubleValueToDate(double date, boolean date1904) {
		return DateUtil.getJavaDate(date, date1904);
	}

	@Override
	public double dateToDoubleValue(Date date, boolean date1904) {
		return DateUtil.getExcelDate(date,date1904);
	}

}
