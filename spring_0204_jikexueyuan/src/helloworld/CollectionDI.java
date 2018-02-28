package helloworld;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionDI {

	private List addList;
	private Map addMap;
	private Set addSet;
	private Properties prop;
	public List getAddList() {
		return addList;
	}
	public void setAddList(List addList) {
		this.addList = addList;
	}
	public Map getAddMap() {
		return addMap;
	}
	public void setAddMap(Map addMap) {
		this.addMap = addMap;
	}
	public Set getAddSet() {
		return addSet;
	}
	public void setAddSet(Set setaddSet) {
		this.addSet = setaddSet;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
}
