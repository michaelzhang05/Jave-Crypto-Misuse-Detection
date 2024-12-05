package A6;

import O5.C1352h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import y6.f;

/* loaded from: classes5.dex */
public final class k0 implements y6.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f576a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.e f577b;

    public k0(String serialName, y6.e kind) {
        AbstractC3255y.i(serialName, "serialName");
        AbstractC3255y.i(kind, "kind");
        this.f576a = serialName;
        this.f577b = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // y6.f
    public String a() {
        return this.f576a;
    }

    @Override // y6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // y6.f
    public int d(String name) {
        AbstractC3255y.i(name, "name");
        b();
        throw new C1352h();
    }

    @Override // y6.f
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        if (AbstractC3255y.d(a(), k0Var.a()) && AbstractC3255y.d(getKind(), k0Var.getKind())) {
            return true;
        }
        return false;
    }

    @Override // y6.f
    public String f(int i8) {
        b();
        throw new C1352h();
    }

    @Override // y6.f
    public List g(int i8) {
        b();
        throw new C1352h();
    }

    @Override // y6.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // y6.f
    public y6.f h(int i8) {
        b();
        throw new C1352h();
    }

    public int hashCode() {
        return a().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // y6.f
    public boolean i(int i8) {
        b();
        throw new C1352h();
    }

    @Override // y6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // y6.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public y6.e getKind() {
        return this.f577b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
