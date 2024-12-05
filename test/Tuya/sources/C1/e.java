package c1;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f14872d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f14873e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final i f14874a = i.c();

    /* renamed from: b, reason: collision with root package name */
    private long f14875b;

    /* renamed from: c, reason: collision with root package name */
    private int f14876c;

    private synchronized long a(int i8) {
        if (!c(i8)) {
            return f14872d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f14876c) + this.f14874a.e(), f14873e);
    }

    private static boolean c(int i8) {
        if (i8 != 429 && (i8 < 500 || i8 >= 600)) {
            return false;
        }
        return true;
    }

    private static boolean d(int i8) {
        if ((i8 < 200 || i8 >= 300) && i8 != 401 && i8 != 404) {
            return false;
        }
        return true;
    }

    private synchronized void e() {
        this.f14876c = 0;
    }

    public synchronized boolean b() {
        boolean z8;
        if (this.f14876c != 0) {
            if (this.f14874a.a() <= this.f14875b) {
                z8 = false;
            }
        }
        z8 = true;
        return z8;
    }

    public synchronized void f(int i8) {
        if (d(i8)) {
            e();
            return;
        }
        this.f14876c++;
        this.f14875b = this.f14874a.a() + a(i8);
    }
}
