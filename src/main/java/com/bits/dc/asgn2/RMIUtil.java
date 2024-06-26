package com.bits.dc.asgn2;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIUtil {

	public static RmiInterface getRemoteConnection(String server) throws RemoteException, NotBoundException {
		
		String environment = System.getenv(server);
        System.out.println("Seeking connection forCritical Section: "+environment);
        
        String hostname = environment.split(":")[0];
        
        int portnumber = Integer.parseInt(environment.split(":")[1]);
        System.out.println("seeking connection for file writing:" + environment);
        
        Registry myreg = LocateRegistry.getRegistry(hostname, portnumber);                
        RmiInterface inter = (RmiInterface)myreg.lookup("remoteObject");
        
        
        return inter;
	}
	
	public static boolean isOriginatorSameAsNearestServer(String originator) {
		
		String environment = System.getenv("NEAREST_SERVER");
		if (environment == null)
			return true;
		        
        String hostname = environment.split(":")[0];
        if(hostname == null)
        	return true;
	
        if(hostname.equals(originator))
        	return true;
        
        return false;
	}
}
