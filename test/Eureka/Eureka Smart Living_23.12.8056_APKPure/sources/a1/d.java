package a1;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class d {
    public static String[] a(Context context) {
        try {
            PackageInfo b6 = b.b(context.getPackageManager(), context.getPackageName(), 4096L);
            if (b6 != null) {
                return b6.requestedPermissions;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String[] b(Context context, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        String[] a6 = a(context);
        if (a6 == null || a6.length <= 0) {
            return strArr;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(a6));
        for (String str : strArr) {
            if (!arrayList2.contains(str)) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean c(Context context, String str) {
        String[] a6 = a(context);
        return a6 != null && a6.length > 0 && new ArrayList(Arrays.asList(a6)).contains(str);
    }

    public static boolean d(Context context, String[] strArr) {
        for (String str : strArr) {
            if (!c(context, str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(Context context, String[] strArr) {
        for (String str : strArr) {
            if (androidx.core.content.a.a(context, str) != 0) {
                return false;
            }
        }
        return true;
    }
}
