package beans;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChildDaoInMemoryImpl implements ChildDao {
	private Map<Long,Child>childrenMap=new HashMap<Long,Child>();
	{
		
		Child child1 = new Child(1L,"John", 80.2, 11);
		Child child2 = new Child(2L,"Mary", 20.6, 1);
		
		childrenMap.put(child1.getId(), child1);
		childrenMap.put(child2.getId(), child2);
		
	}
	public void insert(Child child) {
		// TODO Auto-generated method stub
		childrenMap.put(child.getId(), child);
	}

	public void update(Child child) {
		// TODO Auto-generated method stub
		childrenMap.put(child.getId(), child);
	}

	public void update(List<Child> Children) {
		// TODO Auto-generated method stub
		for (Child child:Children) {
			update(child);
		}	
	}

	public void delete(long childId) {
		// TODO Auto-generated method stub
		childrenMap.remove(childId);
	}

	public Child find(long childId) {
		// TODO Auto-generated method stub
		return childrenMap.get(childId);
	}

	public List<Child> find(List<Long> childIds) {
		// TODO Auto-generated method stub
		List<Child>children = new ArrayList<Child>();
		for(Long id:childIds) {
			children.add(childrenMap.get(id));
		}
		return children;
	}

	public List<Child> find(String childName) {
		// TODO Auto-generated method stub
		List<Child>children = new ArrayList<Child>();
		for(Child child:childrenMap.values()) {
			if(childName.equals(child.getChildName()))
				children.add(child);
		}
		return children;
	}

	public List<Child> find(double weight) {
		// TODO Auto-generated method stub
		List<Child>children = new ArrayList<Child>();
		for(Child child:childrenMap.values()) {
			if(weight ==(child.getWeight()))
				children.add(child);
		}
		return children;
	}

	public List<Child> find(int age) {
		// TODO Auto-generated method stub
		List<Child>children = new ArrayList<Child>();
		for(Child child:childrenMap.values()) {
			if(age ==(child.getAge()))
				children.add(child);
		}
		return children;
	}

}
