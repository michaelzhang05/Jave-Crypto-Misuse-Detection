package h.a.z.g;

import h.a.r;
import java.util.concurrent.ThreadFactory;

/* compiled from: NewThreadScheduler.java */
/* loaded from: classes2.dex */
public final class f extends r {

    /* renamed from: b, reason: collision with root package name */
    private static final h f18222b = new h("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* renamed from: c, reason: collision with root package name */
    final ThreadFactory f18223c;

    public f() {
        this(f18222b);
    }

    @Override // h.a.r
    public r.b a() {
        return new g(this.f18223c);
    }

    public f(ThreadFactory threadFactory) {
        this.f18223c = threadFactory;
    }
}
