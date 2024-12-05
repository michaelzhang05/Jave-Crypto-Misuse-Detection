package S6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    public static final V f9851a = new V();

    /* renamed from: b, reason: collision with root package name */
    private static final int f9852b = 65536;

    /* renamed from: c, reason: collision with root package name */
    private static final U f9853c = new U(new byte[0], 0, 0, false, false);

    /* renamed from: d, reason: collision with root package name */
    private static final int f9854d;

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReference[] f9855e;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9854d = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i8 = 0; i8 < highestOneBit; i8++) {
            atomicReferenceArr[i8] = new AtomicReference();
        }
        f9855e = atomicReferenceArr;
    }

    private V() {
    }

    private final AtomicReference a() {
        return f9855e[(int) (Thread.currentThread().getId() & (f9854d - 1))];
    }

    public static final void b(U segment) {
        int i8;
        AbstractC3255y.i(segment, "segment");
        if (segment.f9849f == null && segment.f9850g == null) {
            if (segment.f9847d) {
                return;
            }
            AtomicReference a8 = f9851a.a();
            U u8 = f9853c;
            U u9 = (U) a8.getAndSet(u8);
            if (u9 == u8) {
                return;
            }
            if (u9 != null) {
                i8 = u9.f9846c;
            } else {
                i8 = 0;
            }
            if (i8 >= f9852b) {
                a8.set(u9);
                return;
            }
            segment.f9849f = u9;
            segment.f9845b = 0;
            segment.f9846c = i8 + 8192;
            a8.set(segment);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static final U c() {
        AtomicReference a8 = f9851a.a();
        U u8 = f9853c;
        U u9 = (U) a8.getAndSet(u8);
        if (u9 == u8) {
            return new U();
        }
        if (u9 == null) {
            a8.set(null);
            return new U();
        }
        a8.set(u9.f9849f);
        u9.f9849f = null;
        u9.f9846c = 0;
        return u9;
    }
}
