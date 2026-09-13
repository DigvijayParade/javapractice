package functionalInterfacess;

import java.util.Objects;

public class DataSet {

	private String dname ;
	private int dId ;
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(dId, dname);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataSet other = (DataSet) obj;
		return dId == other.dId && Objects.equals(dname, other.dname);
	}
	@Override
	public String toString() {
		return "DataSet [dname=" + dname + ", dId=" + dId + "]";
	}
	public DataSet(String dname, int dId) {
		super();
		this.dname = dname;
		this.dId = dId;
	}
	
	public DataSet() {
		
	}
	
	
}
