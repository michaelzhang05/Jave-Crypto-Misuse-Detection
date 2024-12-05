package f6;

import L5.I;
import L5.s;
import L5.t;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2681h extends AbstractC2682i implements Iterator, P5.d, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private int f31138a;

    /* renamed from: b, reason: collision with root package name */
    private Object f31139b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f31140c;

    /* renamed from: d, reason: collision with root package name */
    private P5.d f31141d;

    private final Throwable g() {
        int i8 = this.f31138a;
        if (i8 != 4) {
            if (i8 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f31138a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final Object h() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // f6.AbstractC2682i
    public Object c(Object obj, P5.d dVar) {
        this.f31139b = obj;
        this.f31138a = 3;
        this.f31141d = dVar;
        Object e8 = Q5.b.e();
        if (e8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    @Override // f6.AbstractC2682i
    public Object f(Iterator it, P5.d dVar) {
        if (!it.hasNext()) {
            return I.f6487a;
        }
        this.f31140c = it;
        this.f31138a = 2;
        this.f31141d = dVar;
        Object e8 = Q5.b.e();
        if (e8 == Q5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (e8 == Q5.b.e()) {
            return e8;
        }
        return I.f6487a;
    }

    @Override // P5.d
    public P5.g getContext() {
        return P5.h.f7994a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i8 = this.f31138a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        return true;
                    }
                    if (i8 == 4) {
                        return false;
                    }
                    throw g();
                }
                Iterator it = this.f31140c;
                AbstractC3159y.f(it);
                if (it.hasNext()) {
                    this.f31138a = 2;
                    return true;
                }
                this.f31140c = null;
            }
            this.f31138a = 5;
            P5.d dVar = this.f31141d;
            AbstractC3159y.f(dVar);
            this.f31141d = null;
            s.a aVar = s.f6511b;
            dVar.resumeWith(s.b(I.f6487a));
        }
    }

    public final void i(P5.d dVar) {
        this.f31141d = dVar;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i8 = this.f31138a;
        if (i8 != 0 && i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    this.f31138a = 0;
                    Object obj = this.f31139b;
                    this.f31139b = null;
                    return obj;
                }
                throw g();
            }
            this.f31138a = 1;
            Iterator it = this.f31140c;
            AbstractC3159y.f(it);
            return it.next();
        }
        return h();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // P5.d
    public void resumeWith(Object obj) {
        t.b(obj);
        this.f31138a = 4;
    }
}
