package y6;

import h6.InterfaceC2963c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f f41020a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2963c f41021b;

    /* renamed from: c, reason: collision with root package name */
    private final String f41022c;

    public c(f original, InterfaceC2963c kClass) {
        AbstractC3255y.i(original, "original");
        AbstractC3255y.i(kClass, "kClass");
        this.f41020a = original;
        this.f41021b = kClass;
        this.f41022c = original.a() + '<' + kClass.b() + '>';
    }

    @Override // y6.f
    public String a() {
        return this.f41022c;
    }

    @Override // y6.f
    public boolean c() {
        return this.f41020a.c();
    }

    @Override // y6.f
    public int d(String name) {
        AbstractC3255y.i(name, "name");
        return this.f41020a.d(name);
    }

    @Override // y6.f
    public int e() {
        return this.f41020a.e();
    }

    public boolean equals(Object obj) {
        c cVar;
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar == null || !AbstractC3255y.d(this.f41020a, cVar.f41020a) || !AbstractC3255y.d(cVar.f41021b, this.f41021b)) {
            return false;
        }
        return true;
    }

    @Override // y6.f
    public String f(int i8) {
        return this.f41020a.f(i8);
    }

    @Override // y6.f
    public List g(int i8) {
        return this.f41020a.g(i8);
    }

    @Override // y6.f
    public List getAnnotations() {
        return this.f41020a.getAnnotations();
    }

    @Override // y6.f
    public j getKind() {
        return this.f41020a.getKind();
    }

    @Override // y6.f
    public f h(int i8) {
        return this.f41020a.h(i8);
    }

    public int hashCode() {
        return (this.f41021b.hashCode() * 31) + a().hashCode();
    }

    @Override // y6.f
    public boolean i(int i8) {
        return this.f41020a.i(i8);
    }

    @Override // y6.f
    public boolean isInline() {
        return this.f41020a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f41021b + ", original: " + this.f41020a + ')';
    }
}
