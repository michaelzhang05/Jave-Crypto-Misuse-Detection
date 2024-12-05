package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.a = (IconCompat) versionedParcel.v(remoteActionCompat.a, 1);
        remoteActionCompat.f806b = versionedParcel.l(remoteActionCompat.f806b, 2);
        remoteActionCompat.f807c = versionedParcel.l(remoteActionCompat.f807c, 3);
        remoteActionCompat.f808d = (PendingIntent) versionedParcel.r(remoteActionCompat.f808d, 4);
        remoteActionCompat.f809e = versionedParcel.h(remoteActionCompat.f809e, 5);
        remoteActionCompat.f810f = versionedParcel.h(remoteActionCompat.f810f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.M(remoteActionCompat.a, 1);
        versionedParcel.D(remoteActionCompat.f806b, 2);
        versionedParcel.D(remoteActionCompat.f807c, 3);
        versionedParcel.H(remoteActionCompat.f808d, 4);
        versionedParcel.z(remoteActionCompat.f809e, 5);
        versionedParcel.z(remoteActionCompat.f810f, 6);
    }
}
