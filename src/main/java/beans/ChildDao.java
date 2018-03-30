package beans;

import java.util.List;

public interface ChildDao {
	public void insert(Child child);
	public void update (Child child);
	public void update (List<Child> Children);
	public void delete (long childId);
	public Child find(long childId);
	public List<Child> find (List<Long>childIds);
	public List<Child> find (String childName);
	public List<Child> find (double weight);
	public List<Child> find (int age);

}
