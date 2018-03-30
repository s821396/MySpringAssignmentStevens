package beans;

public interface ChildService {
	public void updateWeight (long sourceAccountId, long targetAccountId, double amount);
	public Child getChild (long childId);
}
