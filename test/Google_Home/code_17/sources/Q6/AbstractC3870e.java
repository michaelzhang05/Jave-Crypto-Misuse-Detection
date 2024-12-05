package q6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: q6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3870e {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38388a = AtomicReferenceFieldUpdater.newUpdater(AbstractC3870e.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f38389b = AtomicReferenceFieldUpdater.newUpdater(AbstractC3870e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC3870e(AbstractC3870e abstractC3870e) {
        this._prev = abstractC3870e;
    }

    private final AbstractC3870e c() {
        AbstractC3870e g8 = g();
        while (g8 != null && g8.h()) {
            g8 = (AbstractC3870e) f38389b.get(g8);
        }
        return g8;
    }

    private final AbstractC3870e d() {
        AbstractC3870e e8 = e();
        AbstractC3255y.f(e8);
        while (e8.h()) {
            AbstractC3870e e9 = e8.e();
            if (e9 == null) {
                return e8;
            }
            e8 = e9;
        }
        return e8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f() {
        return f38388a.get(this);
    }

    public final void b() {
        f38389b.lazySet(this, null);
    }

    public final AbstractC3870e e() {
        Object f8 = f();
        if (f8 == AbstractC3869d.a()) {
            return null;
        }
        return (AbstractC3870e) f8;
    }

    public final AbstractC3870e g() {
        return (AbstractC3870e) f38389b.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        if (e() == null) {
            return true;
        }
        return false;
    }

    public final boolean j() {
        return androidx.concurrent.futures.a.a(f38388a, this, null, AbstractC3869d.a());
    }

    public final void k() {
        Object obj;
        AbstractC3870e abstractC3870e;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC3870e c8 = c();
            AbstractC3870e d8 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f38389b;
            do {
                obj = atomicReferenceFieldUpdater.get(d8);
                if (((AbstractC3870e) obj) == null) {
                    abstractC3870e = null;
                } else {
                    abstractC3870e = c8;
                }
            } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, d8, obj, abstractC3870e));
            if (c8 != null) {
                f38388a.set(c8, d8);
            }
            if (!d8.h() || d8.i()) {
                if (c8 == null || !c8.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC3870e abstractC3870e) {
        return androidx.concurrent.futures.a.a(f38388a, this, null, abstractC3870e);
    }
}
