## Singleton Design Pattern

        The singleton pattern is a design pattern that restricts the instantiation of a class to one object. Let’s see various design options for implementing such a class. If you have a good handle on static class variables and access modifiers this should not be a difficult task.

Method 1: Classic Implementation 
``` java
// Classical Java implementation of singleton
// design pattern
class Singleton
{
	private static Singleton obj;

	// private constructor to force use of
	// getInstance() to create Singleton object
	private Singleton() {}

	public static Singleton getInstance()
	{
		if (obj==null)
			obj = new Singleton();
		return obj;
	}
} 
```


