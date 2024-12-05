package m5;

import android.content.Intent;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public interface h {
    androidx.appcompat.app.c getActivity();

    ExecutorService getThreadPool();

    boolean hasPermission(String str);

    Object onMessage(String str, Object obj);

    void requestPermission(org.apache.cordova.b bVar, int i6, String str);

    void requestPermissions(org.apache.cordova.b bVar, int i6, String[] strArr);

    void startActivityForResult(org.apache.cordova.b bVar, Intent intent, int i6);
}
