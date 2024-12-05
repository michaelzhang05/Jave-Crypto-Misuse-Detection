package n6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: n6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3488b extends y {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36257a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3488b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC3487a.f36256a;

    private final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36257a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC3487a.f36256a;
        if (obj2 != obj3) {
            return obj2;
        }
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, obj3, obj)) {
            return obj;
        }
        return atomicReferenceFieldUpdater.get(this);
    }

    @Override // n6.y
    public final Object a(Object obj) {
        Object obj2 = f36257a.get(this);
        if (obj2 == AbstractC3487a.f36256a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public abstract Object d(Object obj);
}
