package s1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import v1.h1;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int f9221a = i.f9224a;

    /* renamed from: b, reason: collision with root package name */
    private static final g f9222b = new g();

    public Intent a(Context context, int i6, String str) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return null;
            }
            return h1.c("com.google.android.gms");
        }
        if (context != null && z1.f.c(context)) {
            return h1.a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f9221a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(b2.d.a(context).d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return h1.b("com.google.android.gms", sb.toString());
    }

    public PendingIntent b(Context context, int i6, int i7) {
        return c(context, i6, i7, null);
    }

    public PendingIntent c(Context context, int i6, int i7, String str) {
        Intent a6 = a(context, i6, str);
        if (a6 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i7, a6, f2.d.f6589a | 134217728);
    }

    public String d(int i6) {
        return i.a(i6);
    }

    public int e(Context context) {
        return f(context, f9221a);
    }

    public int f(Context context, int i6) {
        int c6 = i.c(context, i6);
        if (i.d(context, c6)) {
            return 18;
        }
        return c6;
    }

    public boolean g(Context context, String str) {
        return i.g(context, str);
    }

    public boolean h(int i6) {
        return i.f(i6);
    }
}
