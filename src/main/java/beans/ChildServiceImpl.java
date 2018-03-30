package beans;

public class ChildServiceImpl implements ChildService {

	private ChildDao childDao;
	
	public ChildDao getChildDao() {
		return childDao;
	}
	
	public void setChildDao(ChildDao childDao) {
		this.childDao = childDao;
			
	}
	
	public void  updateWeight(long childId1, long childId2, double changedWeight) {
		Child childWeight1 = childDao.find(childId1);
		Child childWeight2 = childDao.find(childId2);
		
		childWeight1.setWeight(childWeight1.getWeight() + changedWeight);
		childWeight2.setWeight(childWeight2.getWeight() + changedWeight);
		
		childDao.update(childWeight1);
		childDao.update(childWeight2);
	}


	public Child getChild(long childId) {
		// TODO Auto-generated method stub
		return childDao.find(childId);
	}

}
