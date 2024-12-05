package A6;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import y6.f;
import y6.k;

/* loaded from: classes5.dex */
public abstract class N implements y6.f {

    /* renamed from: a, reason: collision with root package name */
    private final y6.f f517a;

    /* renamed from: b, reason: collision with root package name */
    private final int f518b;

    public /* synthetic */ N(y6.f fVar, AbstractC3247p abstractC3247p) {
        this(fVar);
    }

    @Override // y6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // y6.f
    public int d(String name) {
        AbstractC3255y.i(name, "name");
        Integer i8 = j6.n.i(name);
        if (i8 != null) {
            return i8.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // y6.f
    public int e() {
        return this.f518b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n8 = (N) obj;
        if (AbstractC3255y.d(this.f517a, n8.f517a) && AbstractC3255y.d(a(), n8.a())) {
            return true;
        }
        return false;
    }

    @Override // y6.f
    public String f(int i8) {
        return String.valueOf(i8);
    }

    @Override // y6.f
    public List g(int i8) {
        if (i8 >= 0) {
            return AbstractC1378t.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // y6.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // y6.f
    public y6.j getKind() {
        return k.b.f41058a;
    }

    @Override // y6.f
    public y6.f h(int i8) {
        if (i8 >= 0) {
            return this.f517a;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (this.f517a.hashCode() * 31) + a().hashCode();
    }

    @Override // y6.f
    public boolean i(int i8) {
        if (i8 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    @Override // y6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    public String toString() {
        return a() + '(' + this.f517a + ')';
    }

    private N(y6.f fVar) {
        this.f517a = fVar;
        this.f518b = 1;
    }
}
