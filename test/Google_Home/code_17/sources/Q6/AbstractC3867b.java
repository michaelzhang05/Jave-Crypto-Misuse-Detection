package q6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: q6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3867b extends y {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38385a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3867b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC3866a.f38384a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38385a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC3866a.f38384a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    @Override // q6.y
    public final Object a(Object obj) {
        Object obj2 = f38385a.get(this);
        if (obj2 == AbstractC3866a.f38384a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object d(Object obj);
}
