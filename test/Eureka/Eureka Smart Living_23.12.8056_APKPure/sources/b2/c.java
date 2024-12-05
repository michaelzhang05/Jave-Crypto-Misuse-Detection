package b2;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    protected final Context f3822a;

    public c(Context context) {
        this.f3822a = context;
    }

    public int a(String str, String str2) {
        return this.f3822a.getPackageManager().checkPermission(str, str2);
    }

    public ApplicationInfo b(String str, int i6) {
        return this.f3822a.getPackageManager().getApplicationInfo(str, i6);
    }

    public CharSequence c(String str) {
        return this.f3822a.getPackageManager().getApplicationLabel(this.f3822a.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i6) {
        return this.f3822a.getPackageManager().getPackageInfo(str, i6);
    }
}
