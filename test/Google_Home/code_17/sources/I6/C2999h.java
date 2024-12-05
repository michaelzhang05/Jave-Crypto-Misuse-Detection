package i6;

import O5.I;
import O5.s;
import O5.t;
import b6.InterfaceC1985a;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i6.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C2999h extends AbstractC3000i implements Iterator, S5.d, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private int f33001a;

    /* renamed from: b, reason: collision with root package name */
    private Object f33002b;

    /* renamed from: c, reason: collision with root package name */
    private Iterator f33003c;

    /* renamed from: d, reason: collision with root package name */
    private S5.d f33004d;

    private final Throwable f() {
        int i8 = this.f33001a;
        if (i8 != 4) {
            if (i8 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f33001a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    private final Object g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // i6.AbstractC3000i
    public Object a(Object obj, S5.d dVar) {
        this.f33002b = obj;
        this.f33001a = 3;
        this.f33004d = dVar;
        Object e8 = T5.b.e();
        if (e8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (e8 == T5.b.e()) {
            return e8;
        }
        return I.f8278a;
    }

    @Override // i6.AbstractC3000i
    public Object e(Iterator it, S5.d dVar) {
        if (!it.hasNext()) {
            return I.f8278a;
        }
        this.f33003c = it;
        this.f33001a = 2;
        this.f33004d = dVar;
        Object e8 = T5.b.e();
        if (e8 == T5.b.e()) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        if (e8 == T5.b.e()) {
            return e8;
        }
        return I.f8278a;
    }

    @Override // S5.d
    public S5.g getContext() {
        return S5.h.f9825a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i8 = this.f33001a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        return true;
                    }
                    if (i8 == 4) {
                        return false;
                    }
                    throw f();
                }
                Iterator it = this.f33003c;
                AbstractC3255y.f(it);
                if (it.hasNext()) {
                    this.f33001a = 2;
                    return true;
                }
                this.f33003c = null;
            }
            this.f33001a = 5;
            S5.d dVar = this.f33004d;
            AbstractC3255y.f(dVar);
            this.f33004d = null;
            s.a aVar = s.f8302b;
            dVar.resumeWith(s.b(I.f8278a));
        }
    }

    public final void l(S5.d dVar) {
        this.f33004d = dVar;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i8 = this.f33001a;
        if (i8 != 0 && i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    this.f33001a = 0;
                    Object obj = this.f33002b;
                    this.f33002b = null;
                    return obj;
                }
                throw f();
            }
            this.f33001a = 1;
            Iterator it = this.f33003c;
            AbstractC3255y.f(it);
            return it.next();
        }
        return g();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // S5.d
    public void resumeWith(Object obj) {
        t.b(obj);
        this.f33001a = 4;
    }
}
