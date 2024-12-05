package G0;

import android.util.Log;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: c, reason: collision with root package name */
    static final h f2913c = new h("FirebaseCrashlytics");

    /* renamed from: a, reason: collision with root package name */
    private final String f2914a;

    /* renamed from: b, reason: collision with root package name */
    private int f2915b = 4;

    public h(String str) {
        this.f2914a = str;
    }

    private boolean a(int i8) {
        if (this.f2915b > i8 && !Log.isLoggable(this.f2914a, i8)) {
            return false;
        }
        return true;
    }

    public static h f() {
        return f2913c;
    }

    public void b(String str) {
        c(str, null);
    }

    public void c(String str, Throwable th) {
        if (a(3)) {
            Log.d(this.f2914a, str, th);
        }
    }

    public void d(String str) {
        e(str, null);
    }

    public void e(String str, Throwable th) {
        if (a(6)) {
            Log.e(this.f2914a, str, th);
        }
    }

    public void g(String str) {
        h(str, null);
    }

    public void h(String str, Throwable th) {
        if (a(4)) {
            Log.i(this.f2914a, str, th);
        }
    }

    public void i(String str) {
        j(str, null);
    }

    public void j(String str, Throwable th) {
        if (a(2)) {
            Log.v(this.f2914a, str, th);
        }
    }

    public void k(String str) {
        l(str, null);
    }

    public void l(String str, Throwable th) {
        if (a(5)) {
            Log.w(this.f2914a, str, th);
        }
    }
}
