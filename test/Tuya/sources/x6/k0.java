package x6;

import L5.C1224h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import v6.f;

/* loaded from: classes5.dex */
public final class k0 implements v6.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f39581a;

    /* renamed from: b, reason: collision with root package name */
    private final v6.e f39582b;

    public k0(String serialName, v6.e kind) {
        AbstractC3159y.i(serialName, "serialName");
        AbstractC3159y.i(kind, "kind");
        this.f39581a = serialName;
        this.f39582b = kind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // v6.f
    public String a() {
        return this.f39581a;
    }

    @Override // v6.f
    public boolean c() {
        return f.a.c(this);
    }

    @Override // v6.f
    public int d(String name) {
        AbstractC3159y.i(name, "name");
        b();
        throw new C1224h();
    }

    @Override // v6.f
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
        if (AbstractC3159y.d(a(), k0Var.a()) && AbstractC3159y.d(getKind(), k0Var.getKind())) {
            return true;
        }
        return false;
    }

    @Override // v6.f
    public String f(int i8) {
        b();
        throw new C1224h();
    }

    @Override // v6.f
    public List g(int i8) {
        b();
        throw new C1224h();
    }

    @Override // v6.f
    public List getAnnotations() {
        return f.a.a(this);
    }

    @Override // v6.f
    public v6.f h(int i8) {
        b();
        throw new C1224h();
    }

    public int hashCode() {
        return a().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // v6.f
    public boolean i(int i8) {
        b();
        throw new C1224h();
    }

    @Override // v6.f
    public boolean isInline() {
        return f.a.b(this);
    }

    @Override // v6.f
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public v6.e getKind() {
        return this.f39582b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
