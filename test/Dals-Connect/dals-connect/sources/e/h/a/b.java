package e.h.a;

import android.os.SystemClock;

/* compiled from: DownloadSpeedMonitor.java */
/* loaded from: classes2.dex */
public class b implements s, r {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f17736b;

    /* renamed from: c, reason: collision with root package name */
    private long f17737c;

    /* renamed from: d, reason: collision with root package name */
    private long f17738d;

    /* renamed from: e, reason: collision with root package name */
    private int f17739e;

    /* renamed from: f, reason: collision with root package name */
    private int f17740f = 1000;

    @Override // e.h.a.s
    public void a() {
        this.f17739e = 0;
        this.a = 0L;
    }

    @Override // e.h.a.s
    public void c(long j2) {
        if (this.f17738d <= 0) {
            return;
        }
        long j3 = j2 - this.f17737c;
        this.a = 0L;
        long uptimeMillis = SystemClock.uptimeMillis() - this.f17738d;
        if (uptimeMillis <= 0) {
            this.f17739e = (int) j3;
        } else {
            this.f17739e = (int) (j3 / uptimeMillis);
        }
    }

    @Override // e.h.a.s
    public void f(long j2) {
        this.f17738d = SystemClock.uptimeMillis();
        this.f17737c = j2;
    }

    @Override // e.h.a.s
    public void h(long j2) {
        if (this.f17740f <= 0) {
            return;
        }
        boolean z = true;
        if (this.a != 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - this.a;
            if (uptimeMillis >= this.f17740f || (this.f17739e == 0 && uptimeMillis > 0)) {
                int i2 = (int) ((j2 - this.f17736b) / uptimeMillis);
                this.f17739e = i2;
                this.f17739e = Math.max(0, i2);
            } else {
                z = false;
            }
        }
        if (z) {
            this.f17736b = j2;
            this.a = SystemClock.uptimeMillis();
        }
    }
}
