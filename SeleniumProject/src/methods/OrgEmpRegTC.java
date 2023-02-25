package methods;

import java.io.IOException;

public class OrgEmpRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		BusinessMethods bm = new BusinessMethods();
		
		String res = bm.OrgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.OrgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.OrgEmpReg("Sharat", "Chandra", "SC34785");
		System.out.println("Employee Registration "+res);
		
		res = bm.OrgLogout();
		System.out.println("Application Logout "+res);
		
		bm.OrgClose();
		System.out.println("Application close Successfully");

	}

}
