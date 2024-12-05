package com.getcapacitor.cordova;

import android.util.Pair;
import androidx.appcompat.app.c;
import java.util.concurrent.Executors;
import org.apache.cordova.CordovaInterfaceImpl;
import org.apache.cordova.b;

/* loaded from: classes.dex */
public class MockCordovaInterfaceImpl extends CordovaInterfaceImpl {
    public MockCordovaInterfaceImpl(c cVar) {
        super(cVar, Executors.newCachedThreadPool());
    }

    public b getActivityResultCallback() {
        return this.f8294f;
    }

    public boolean handlePermissionResult(int i6, String[] strArr, int[] iArr) {
        Pair a6 = this.f8293e.a(i6);
        if (a6 == null) {
            return false;
        }
        ((b) a6.first).onRequestPermissionResult(((Integer) a6.second).intValue(), strArr, iArr);
        return true;
    }
}
