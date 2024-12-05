package h.a.z.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: RxThreadFactory.java */
/* loaded from: classes2.dex */
public final class h extends AtomicLong implements ThreadFactory {

    /* renamed from: f, reason: collision with root package name */
    final String f18226f;

    /* renamed from: g, reason: collision with root package name */
    final int f18227g;

    /* renamed from: h, reason: collision with root package name */
    final boolean f18228h;

    /* compiled from: RxThreadFactory.java */
    /* loaded from: classes2.dex */
    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public h(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f18226f + '-' + incrementAndGet();
        Thread aVar = this.f18228h ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f18227g);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f18226f + "]";
    }

    public h(String str, int i2) {
        this(str, i2, false);
    }

    public h(String str, int i2, boolean z) {
        this.f18226f = str;
        this.f18227g = i2;
        this.f18228h = z;
    }
}
