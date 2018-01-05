package chapter11;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Author: Zheng Jun
 * Mail:zhengjun1987@outlook.com
 * Date: 2018/1/5 10:35
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
