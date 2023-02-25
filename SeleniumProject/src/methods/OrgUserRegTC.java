package methods;

import java.io.IOException;

public class OrgUserRegTC {

	public static void main(String[] args) throws InterruptedException, IOException {
		BusinessMethods bm = new BusinessMethods();
		
		String res = bm.OrgLaunch("firefox", "http://orangehrm.qedgetech.com");
		System.out.println("Application Launch "+res);
		
		res = bm.OrgLogin("Admin", "Qedge123!@#");
		System.out.println("Application Login "+res);
		
		res = bm.OrguserReg("Sharat Chandra", "AAASharatChandraG", "Test@5432167890");
		System.out.println("User Registration "+res);
		
		res = bm.OrgLogout();
		System.out.println("Application Logout "+res);
		
		bm.OrgClose();
		System.out.println("Application close Successfully");

	}

}
