package n4;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f8020d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f8021e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final i f8022a = i.c();

    /* renamed from: b, reason: collision with root package name */
    private long f8023b;

    /* renamed from: c, reason: collision with root package name */
    private int f8024c;

    private synchronized long a(int i6) {
        if (c(i6)) {
            return (long) Math.min(Math.pow(2.0d, this.f8024c) + this.f8022a.e(), f8021e);
        }
        return f8020d;
    }

    private static boolean c(int i6) {
        return i6 == 429 || (i6 >= 500 && i6 < 600);
    }

    private static boolean d(int i6) {
        return (i6 >= 200 && i6 < 300) || i6 == 401 || i6 == 404;
    }

    private synchronized void e() {
        this.f8024c = 0;
    }

    public synchronized boolean b() {
        boolean z5;
        if (this.f8024c != 0) {
            z5 = this.f8022a.a() > this.f8023b;
        }
        return z5;
    }

    public synchronized void f(int i6) {
        if (d(i6)) {
            e();
            return;
        }
        this.f8024c++;
        this.f8023b = this.f8022a.a() + a(i6);
    }
}
