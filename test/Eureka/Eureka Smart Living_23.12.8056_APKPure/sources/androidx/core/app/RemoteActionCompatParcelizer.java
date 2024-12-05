package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1915a = (IconCompat) aVar.v(remoteActionCompat.f1915a, 1);
        remoteActionCompat.f1916b = aVar.l(remoteActionCompat.f1916b, 2);
        remoteActionCompat.f1917c = aVar.l(remoteActionCompat.f1917c, 3);
        remoteActionCompat.f1918d = (PendingIntent) aVar.r(remoteActionCompat.f1918d, 4);
        remoteActionCompat.f1919e = aVar.h(remoteActionCompat.f1919e, 5);
        remoteActionCompat.f1920f = aVar.h(remoteActionCompat.f1920f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1915a, 1);
        aVar.D(remoteActionCompat.f1916b, 2);
        aVar.D(remoteActionCompat.f1917c, 3);
        aVar.H(remoteActionCompat.f1918d, 4);
        aVar.z(remoteActionCompat.f1919e, 5);
        aVar.z(remoteActionCompat.f1920f, 6);
    }
}
