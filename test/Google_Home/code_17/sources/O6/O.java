package o6;

import O5.s;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;
import q6.C3865F;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class O extends p6.d {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f36618a = AtomicReferenceFieldUpdater.newUpdater(O.class, Object.class, "_state");
    private volatile Object _state;

    @Override // p6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(C3699M c3699m) {
        C3865F c3865f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36618a;
        if (atomicReferenceFieldUpdater.get(this) == null) {
            c3865f = AbstractC3700N.f36616a;
            atomicReferenceFieldUpdater.set(this, c3865f);
            return true;
        }
        return false;
    }

    public final Object e(S5.d dVar) {
        C3865F c3865f;
        C3374p c3374p = new C3374p(T5.b.c(dVar), 1);
        c3374p.C();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36618a;
        c3865f = AbstractC3700N.f36616a;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3865f, c3374p)) {
            s.a aVar = O5.s.f8302b;
            c3374p.resumeWith(O5.s.b(O5.I.f8278a));
        }
        Object y8 = c3374p.y();
        if (y8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == T5.b.e()) {
            return y8;
        }
        return O5.I.f8278a;
    }

    @Override // p6.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public S5.d[] b(C3699M c3699m) {
        f36618a.set(this, null);
        return p6.c.f37901a;
    }

    public final void g() {
        C3865F c3865f;
        C3865F c3865f2;
        C3865F c3865f3;
        C3865F c3865f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36618a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                c3865f = AbstractC3700N.f36617b;
                if (obj != c3865f) {
                    c3865f2 = AbstractC3700N.f36616a;
                    if (obj == c3865f2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f36618a;
                        c3865f3 = AbstractC3700N.f36617b;
                        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, obj, c3865f3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f36618a;
                        c3865f4 = AbstractC3700N.f36616a;
                        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater3, this, obj, c3865f4)) {
                            s.a aVar = O5.s.f8302b;
                            ((C3374p) obj).resumeWith(O5.s.b(O5.I.f8278a));
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final boolean h() {
        C3865F c3865f;
        C3865F c3865f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f36618a;
        c3865f = AbstractC3700N.f36616a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c3865f);
        AbstractC3255y.f(andSet);
        c3865f2 = AbstractC3700N.f36617b;
        if (andSet == c3865f2) {
            return true;
        }
        return false;
    }
}
