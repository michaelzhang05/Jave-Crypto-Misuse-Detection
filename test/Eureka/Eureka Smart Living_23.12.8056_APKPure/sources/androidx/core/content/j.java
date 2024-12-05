package androidx.core.content;

import android.content.Context;
import android.os.Process;
import androidx.core.app.m;

/* loaded from: classes.dex */
public abstract class j {
    public static int a(Context context, String str, int i6, int i7, String str2) {
        if (context.checkPermission(str, i6, i7) == -1) {
            return -1;
        }
        String c6 = m.c(str);
        if (c6 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i7);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return (Process.myUid() == i7 && androidx.core.util.c.a(context.getPackageName(), str2) ? m.a(context, i7, c6, str2) : m.b(context, c6, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
