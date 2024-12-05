package x6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import v6.f;
import v6.k;

/* loaded from: classes5.dex */
public abstract class N implements v6.f {

    /* renamed from: a, reason: collision with root package name */
    private final v6.f f39522a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39523b;

    public /* synthetic */ N(v6.f fVar, AbstractC3151p abstractC3151p) {
        this(fVar);
    }

    @Override // v6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // v6.f
    public int d(String name) {
        AbstractC3159y.i(name, "name");
        Integer i8 = g6.n.i(name);
        if (i8 != null) {
            return i8.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // v6.f
    public int e() {
        return this.f39523b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n8 = (N) obj;
        if (AbstractC3159y.d(this.f39522a, n8.f39522a) && AbstractC3159y.d(a(), n8.a())) {
            return true;
        }
        return false;
    }

    @Override // v6.f
    public String f(int i8) {
        return String.valueOf(i8);
    }

    @Override // v6.f
    public List g(int i8) {
        if (i8 >= 0) {
            return AbstractC1246t.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // v6.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // v6.f
    public v6.j getKind() {
        return k.b.f38927a;
    }

    @Override // v6.f
    public v6.f h(int i8) {
        if (i8 >= 0) {
            return this.f39522a;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f39522a.hashCode() * 31) + a().hashCode();
    }

    @Override // v6.f
    public boolean i(int i8) {
        if (i8 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // v6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return a() + '(' + this.f39522a + ')';
    }

    private N(v6.f fVar) {
        this.f39522a = fVar;
        this.f39523b = 1;
    }
}
