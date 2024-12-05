package i6;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: i6.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2844s extends C2804C {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f31801c = AtomicIntegerFieldUpdater.newUpdater(C2844s.class, "_resumed");
    private volatile int _resumed;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2844s(P5.d r3, java.lang.Throwable r4, boolean r5) {
        /*
            r2 = this;
            if (r4 != 0) goto L1d
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Continuation "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " was cancelled normally"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
        L1d:
            r2.<init>(r4, r5)
            r3 = 0
            r2._resumed = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.C2844s.<init>(P5.d, java.lang.Throwable, boolean):void");
    }

    public final boolean c() {
        return f31801c.compareAndSet(this, 0, 1);
    }
}
