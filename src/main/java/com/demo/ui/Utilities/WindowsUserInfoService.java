/**
 * 
 */
package com.demo.ui.Utilities;

/**
 * @author raguram.maniyarasu
 *
 */
import com.sun.jna.Native;
import com.sun.jna.platform.win32.Advapi32;
import com.sun.jna.ptr.IntByReference;

public class WindowsUserInfoService {

    public static WindowsUserInfo getLoggedInUserDetails() {
        WindowsUserInfo userInfo = new WindowsUserInfo();
        IntByReference size = new IntByReference(0);
        Advapi32.INSTANCE.GetUserNameW(null, size);

        char[] buffer = new char[size.getValue()];
        if (Advapi32.INSTANCE.GetUserNameW(buffer, size)) {
            userInfo.setUserName(Native.toString(buffer));
        }

        return userInfo;
    }
}
