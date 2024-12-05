package P5;

import P5.g;
import X5.n;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class c implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final g f7988a;

    /* renamed from: b, reason: collision with root package name */
    private final g.b f7989b;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC3160z implements n {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7990a = new a();

        a() {
            super(2);
        }

        @Override // X5.n
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            AbstractC3159y.i(acc, "acc");
            AbstractC3159y.i(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public c(g left, g.b element) {
        AbstractC3159y.i(left, "left");
        AbstractC3159y.i(element, "element");
        this.f7988a = left;
        this.f7989b = element;
    }

    private final boolean c(g.b bVar) {
        return AbstractC3159y.d(get(bVar.getKey()), bVar);
    }

    private final boolean d(c cVar) {
        while (c(cVar.f7989b)) {
            g gVar = cVar.f7988a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                AbstractC3159y.g(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return c((g.b) gVar);
            }
        }
        return false;
    }

    private final int j() {
        int i8 = 2;
        c cVar = this;
        while (true) {
            g gVar = cVar.f7988a;
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
                if (cVar.j() != j() || !cVar.d(this)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // P5.g
    public Object fold(Object obj, n operation) {
        AbstractC3159y.i(operation, "operation");
        return operation.invoke(this.f7988a.fold(obj, operation), this.f7989b);
    }

    @Override // P5.g
    public g.b get(g.c key) {
        AbstractC3159y.i(key, "key");
        c cVar = this;
        while (true) {
            g.b bVar = cVar.f7989b.get(key);
            if (bVar != null) {
                return bVar;
            }
            g gVar = cVar.f7988a;
            if (gVar instanceof c) {
                cVar = (c) gVar;
            } else {
                return gVar.get(key);
            }
        }
    }

    public int hashCode() {
        return this.f7988a.hashCode() + this.f7989b.hashCode();
    }

    @Override // P5.g
    public g minusKey(g.c key) {
        AbstractC3159y.i(key, "key");
        if (this.f7989b.get(key) != null) {
            return this.f7988a;
        }
        g minusKey = this.f7988a.minusKey(key);
        if (minusKey == this.f7988a) {
            return this;
        }
        if (minusKey == h.f7994a) {
            return this.f7989b;
        }
        return new c(minusKey, this.f7989b);
    }

    @Override // P5.g
    public g plus(g gVar) {
        return g.a.a(this, gVar);
    }

    public String toString() {
        return '[' + ((String) fold("", a.f7990a)) + ']';
    }
}
