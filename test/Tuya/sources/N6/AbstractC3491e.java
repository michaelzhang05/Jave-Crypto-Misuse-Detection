package n6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: n6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3491e {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36260a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3491e.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36261b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3491e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC3491e(AbstractC3491e abstractC3491e) {
        this._prev = abstractC3491e;
    }

    private final AbstractC3491e c() {
        AbstractC3491e g8 = g();
        while (g8 != null && g8.h()) {
            g8 = (AbstractC3491e) f36261b.get(g8);
        }
        return g8;
    }

    private final AbstractC3491e d() {
        AbstractC3491e e8 = e();
        AbstractC3159y.f(e8);
        while (e8.h()) {
            AbstractC3491e e9 = e8.e();
            if (e9 == null) {
                return e8;
            }
            e8 = e9;
        }
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f36260a.get(this);
    }

    public final void b() {
        f36261b.lazySet(this, null);
    }

    public final AbstractC3491e e() {
        Object f8 = f();
        if (f8 == AbstractC3490d.a()) {
            return null;
        }
        return (AbstractC3491e) f8;
    }

    public final AbstractC3491e g() {
        return (AbstractC3491e) f36261b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        if (e() == null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return androidx.concurrent.futures.a.a(f36260a, this, null, AbstractC3490d.a());
    }

    public final void k() {
        Object obj;
        AbstractC3491e abstractC3491e;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC3491e c8 = c();
            AbstractC3491e d8 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36261b;
            do {
                obj = atomicReferenceFieldUpdater.get(d8);
                if (((AbstractC3491e) obj) == null) {
                    abstractC3491e = null;
                } else {
                    abstractC3491e = c8;
                }
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, d8, obj, abstractC3491e));
            if (c8 != null) {
                f36260a.set(c8, d8);
            }
            if (!d8.h() || d8.i()) {
                if (c8 == null || !c8.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC3491e abstractC3491e) {
        return androidx.concurrent.futures.a.a(f36260a, this, null, abstractC3491e);
    }
}
