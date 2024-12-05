package S5;

import S5.g;
import a6.InterfaceC1668n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes5.dex */
public final class c implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final g f9819a;

    /* renamed from: b, reason: collision with root package name */
    private final g.b f9820b;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3256z implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f9821a = new a();

        a() {
            super(2);
        }

        @Override // a6.InterfaceC1668n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            AbstractC3255y.i(acc, "acc");
            AbstractC3255y.i(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        AbstractC3255y.i(left, "left");
        AbstractC3255y.i(element, "element");
        this.f9819a = left;
        this.f9820b = element;
    }

    private final boolean c(g.b bVar) {
        return AbstractC3255y.d(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f9820b)) {
            g gVar = cVar.f9819a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                AbstractC3255y.g(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
        }
        return false;
    }

    private final int e() {
        int i8 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f9819a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                return i8;
            }
            i8++;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.e() != e() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // S5.g
    public Object fold(Object obj, InterfaceC1668n operation) {
        AbstractC3255y.i(operation, "operation");
        return operation.invoke(this.f9819a.fold(obj, operation), this.f9820b);
    }

    @Override // S5.g
    public g.b get(g.c key) {
        AbstractC3255y.i(key, "key");
        c cVar = this;
        while (true) {
            g.b bVar = cVar.f9820b.get(key);
            if (bVar != null) {
                return bVar;
            }
            g gVar = cVar.f9819a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                return gVar.get(key);
            }
        }
    }

    public int hashCode() {
        return this.f9819a.hashCode() + this.f9820b.hashCode();
    }

    @Override // S5.g
    public g minusKey(g.c key) {
        AbstractC3255y.i(key, "key");
        if (this.f9820b.get(key) != null) {
            return this.f9819a;
        }
        g minusKey = this.f9819a.minusKey(key);
        if (minusKey == this.f9819a) {
            return this;
        }
        if (minusKey == h.f9825a) {
            return this.f9820b;
        }
        return new c(minusKey, this.f9820b);
    }

    @Override // S5.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f9821a)) + ']';
    }
}
