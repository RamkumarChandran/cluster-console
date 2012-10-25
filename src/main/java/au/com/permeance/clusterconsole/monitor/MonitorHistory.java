package au.com.permeance.clusterconsole.monitor;

import com.liferay.portal.kernel.json.JSONObject;

import java.util.Date;
import java.util.SortedMap;

public interface MonitorHistory {

    SortedMap<String, SortedMap<Date, JSONObject>> getHistory();

}
