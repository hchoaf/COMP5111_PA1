package comp5111.assignment;

public class BranchInfo {
	public final StatementInfo srcInfo;
	public final StatementInfo dstInfo;
	
	public BranchInfo(StatementInfo srcInfo, StatementInfo dstInfo) {
		this.srcInfo = srcInfo;
		this.dstInfo = dstInfo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (this != null && obj == null) {
			return false;
		}
		BranchInfo brcInfo = (BranchInfo) obj;
		if (srcInfo == null && brcInfo.srcInfo != null) {
			return false;
		}
		if (srcInfo != null && brcInfo.srcInfo == null) {
			return false;
		}
		if (dstInfo == null && brcInfo.dstInfo != null) {
			return false;
		}
		if (dstInfo != null && brcInfo.dstInfo == null) {
			return false;
		}
		if (srcInfo.hashCode != brcInfo.srcInfo.hashCode) {
			return false;
		}
		if (dstInfo.hashCode != brcInfo.dstInfo.hashCode) {
			return false;
		}
		return true;
	}
}
