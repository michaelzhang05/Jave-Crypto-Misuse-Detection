package A6;

import O5.C1352h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import y6.f;
import y6.k;

/* loaded from: classes5.dex */
public final class X implements y6.f {

    /* renamed from: a, reason: collision with root package name */
    public static final X f532a = new X();

    /* renamed from: b, reason: collision with root package name */
    private static final y6.j f533b = k.d.f41060a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f534c = "kotlin.Nothing";

    private X() {
    }

    private final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // y6.f
    public String a() {
        return f534c;
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
    public y6.j getKind() {
        return f533b;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
