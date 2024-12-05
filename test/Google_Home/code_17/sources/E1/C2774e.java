package e1;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* renamed from: e1.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C2774e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f31265d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f31266e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final i f31267a = i.c();

    /* renamed from: b, reason: collision with root package name */
    private long f31268b;

    /* renamed from: c, reason: collision with root package name */
    private int f31269c;

    private synchronized long a(int i8) {
        if (!c(i8)) {
            return f31265d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f31269c) + this.f31267a.e(), f31266e);
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
        this.f31269c = 0;
    }

    public synchronized boolean b() {
        boolean z8;
        if (this.f31269c != 0) {
            if (this.f31267a.a() <= this.f31268b) {
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
        this.f31269c++;
        this.f31268b = this.f31267a.a() + a(i8);
    }
}
