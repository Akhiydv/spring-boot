import com.phone.Android;
import com.phone.IOS;
import com.phone.OS;
import com.phone.OperatingSystemFactory;
import com.phone.Windows;

public class FactoryMain {

	public static void main(String[] args) 
	{
		OperatingSystemFactory osf=new OperatingSystemFactory();
		OS obj=osf.getInstance("Open");
		OS obj1=osf.getInstance("Closed");
		OS obj2=osf.getInstance("dfgjhdbjh");
		//OS obj=new Android();
		obj.spec();
		obj1.spec();
		obj2.spec();
		/*
		 * OS obj1=new IOS(); obj1.spec(); OS obj2=new Windows(); obj2.spec();
		 */
		
	}

}
