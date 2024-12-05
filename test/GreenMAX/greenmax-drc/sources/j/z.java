package j;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: SegmentPool.kt */
/* loaded from: classes2.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    private static final int f19413c;

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReference<y>[] f19414d;

    /* renamed from: e, reason: collision with root package name */
    public static final z f19415e = new z();
    private static final int a = 65536;

    /* renamed from: b, reason: collision with root package name */
    private static final y f19412b = new y(new byte[0], 0, 0, false, false);

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f19413c = highestOneBit;
        AtomicReference<y>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i2 = 0; i2 < highestOneBit; i2++) {
            atomicReferenceArr[i2] = new AtomicReference<>();
        }
        f19414d = atomicReferenceArr;
    }

    private z() {
    }

    private final AtomicReference<y> a() {
        Thread currentThread = Thread.currentThread();
        kotlin.jvm.internal.l.e(currentThread, "Thread.currentThread()");
        return f19414d[(int) (currentThread.getId() & (f19413c - 1))];
    }

    public static final void b(y yVar) {
        AtomicReference<y> a2;
        y yVar2;
        kotlin.jvm.internal.l.f(yVar, "segment");
        if (yVar.f19410g == null && yVar.f19411h == null) {
            if (yVar.f19408e || (yVar2 = (a2 = f19415e.a()).get()) == f19412b) {
                return;
            }
            int i2 = yVar2 != null ? yVar2.f19407d : 0;
            if (i2 >= a) {
                return;
            }
            yVar.f19410g = yVar2;
            yVar.f19406c = 0;
            yVar.f19407d = i2 + 8192;
            if (a2.compareAndSet(yVar2, yVar)) {
                return;
            }
            yVar.f19410g = null;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final y c() {
        AtomicReference<y> a2 = f19415e.a();
        y yVar = f19412b;
        y andSet = a2.getAndSet(yVar);
        if (andSet == yVar) {
            return new y();
        }
        if (andSet == null) {
            a2.set(null);
            return new y();
        }
        a2.set(andSet.f19410g);
        andSet.f19410g = null;
        andSet.f19407d = 0;
        return andSet;
    }
}
