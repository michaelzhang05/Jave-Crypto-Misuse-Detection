package x6;

import L5.C1224h;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import v6.f;
import v6.k;

/* loaded from: classes5.dex */
public final class X implements v6.f {

    /* renamed from: a, reason: collision with root package name */
    public static final X f39537a = new X();

    /* renamed from: b, reason: collision with root package name */
    private static final v6.j f39538b = k.d.f38929a;

    /* renamed from: c, reason: collision with root package name */
    private static final String f39539c = "kotlin.Nothing";

    private X() {
    }

    private final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // v6.f
    public String a() {
        return f39539c;
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
    public v6.j getKind() {
        return f39538b;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
