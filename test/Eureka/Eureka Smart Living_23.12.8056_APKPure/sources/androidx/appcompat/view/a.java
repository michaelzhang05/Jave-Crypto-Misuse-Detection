package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f438a;

    private a(Context context) {
        this.f438a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f438a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f438a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f438a.getResources().getConfiguration();
        int i6 = configuration.screenWidthDp;
        int i7 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i6 > 600) {
            return 5;
        }
        if (i6 > 960 && i7 > 720) {
            return 5;
        }
        if (i6 > 720 && i7 > 960) {
            return 5;
        }
        if (i6 >= 500) {
            return 4;
        }
        if (i6 > 640 && i7 > 480) {
            return 4;
        }
        if (i6 <= 480 || i7 <= 640) {
            return i6 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f438a.getResources().getBoolean(d.b.f6140a);
    }

    public boolean f() {
        return true;
    }
}
