/**
 * 
 */
package beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Java User
 *
 */
public class StartProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		ChildService childService = applicationContext.getBean("childService",ChildService.class);
		
		System.out.println("Children before weight update");
		System.out.println("Child 1 Name: " + childService.getChild(1).getChildName() + " Weight: " + childService.getChild(1).getWeight());
		System.out.println("Child 2 Name: " + childService.getChild(2).getChildName() + " Weight: " + childService.getChild(2).getWeight());
		
		childService.updateWeight(1, 2, 10);
		
		System.out.println("Children after weight update");
		System.out.println("Child 1 name : " + childService.getChild(1).getChildName() + " Weight: " + childService.getChild(1).getWeight());
		System.out.println("Child 2 name : " + childService.getChild(2).getChildName() + " Weight: " + childService.getChild(2).getWeight());

	}

}
