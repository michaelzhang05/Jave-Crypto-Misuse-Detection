package l6;

import L5.s;
import i6.C2839p;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.AbstractC3159y;
import n6.C3486F;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.N, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3352N extends m6.d {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f34617a = AtomicReferenceFieldUpdater.newUpdater(C3352N.class, Object.class, "_state");
    private volatile Object _state;

    @Override // m6.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(C3350L c3350l) {
        C3486F c3486f;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34617a;
        if (atomicReferenceFieldUpdater.get(this) == null) {
            c3486f = AbstractC3351M.f34615a;
            atomicReferenceFieldUpdater.set(this, c3486f);
            return true;
        }
        return false;
    }

    public final Object e(P5.d dVar) {
        C3486F c3486f;
        C2839p c2839p = new C2839p(Q5.b.c(dVar), 1);
        c2839p.B();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34617a;
        c3486f = AbstractC3351M.f34615a;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, c3486f, c2839p)) {
            s.a aVar = L5.s.f6511b;
            c2839p.resumeWith(L5.s.b(L5.I.f6487a));
        }
        Object y8 = c2839p.y();
        if (y8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (y8 == Q5.b.e()) {
            return y8;
        }
        return L5.I.f6487a;
    }

    @Override // m6.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public P5.d[] b(C3350L c3350l) {
        f34617a.set(this, null);
        return m6.c.f35875a;
    }

    public final void g() {
        C3486F c3486f;
        C3486F c3486f2;
        C3486F c3486f3;
        C3486F c3486f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34617a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != null) {
                c3486f = AbstractC3351M.f34616b;
                if (obj != c3486f) {
                    c3486f2 = AbstractC3351M.f34615a;
                    if (obj == c3486f2) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f34617a;
                        c3486f3 = AbstractC3351M.f34616b;
                        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, obj, c3486f3)) {
                            return;
                        }
                    } else {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f34617a;
                        c3486f4 = AbstractC3351M.f34615a;
                        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater3, this, obj, c3486f4)) {
                            s.a aVar = L5.s.f6511b;
                            ((C2839p) obj).resumeWith(L5.s.b(L5.I.f6487a));
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
        C3486F c3486f;
        C3486F c3486f2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f34617a;
        c3486f = AbstractC3351M.f34615a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, c3486f);
        AbstractC3159y.f(andSet);
        c3486f2 = AbstractC3351M.f34616b;
        if (andSet == c3486f2) {
            return true;
        }
        return false;
    }
}
