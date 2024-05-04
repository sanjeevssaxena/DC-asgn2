package com.bits.dc.asgn2;


import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RmiInterface extends Remote, Serializable {

	public void uploadFileToServer(byte[] mybyte, String serverpath, int length) throws RemoteException;

	public byte[] downloadFileFromServer(String serverpath, String originator) throws RemoteException;

	public String[] listFiles(String serverpath) throws RemoteException;

	public boolean createDirectory(String serverpath) throws RemoteException;

	public boolean removeDirectoryOrFile(String serverpath) throws RemoteException;

	
}
