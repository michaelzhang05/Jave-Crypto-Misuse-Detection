package v6;

import e6.InterfaceC2643c;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    private final f f38889a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2643c f38890b;

    /* renamed from: c, reason: collision with root package name */
    private final String f38891c;

    public c(f original, InterfaceC2643c kClass) {
        AbstractC3159y.i(original, "original");
        AbstractC3159y.i(kClass, "kClass");
        this.f38889a = original;
        this.f38890b = kClass;
        this.f38891c = original.a() + '<' + kClass.b() + '>';
    }

    @Override // v6.f
    public String a() {
        return this.f38891c;
    }

    @Override // v6.f
    public boolean c() {
        return this.f38889a.c();
    }

    @Override // v6.f
    public int d(String name) {
        AbstractC3159y.i(name, "name");
        return this.f38889a.d(name);
    }

    @Override // v6.f
    public int e() {
        return this.f38889a.e();
    }

    public boolean equals(Object obj) {
        c cVar;
        if (obj instanceof c) {
            cVar = (c) obj;
        } else {
            cVar = null;
        }
        if (cVar == null || !AbstractC3159y.d(this.f38889a, cVar.f38889a) || !AbstractC3159y.d(cVar.f38890b, this.f38890b)) {
            return false;
        }
        return true;
    }

    @Override // v6.f
    public String f(int i8) {
        return this.f38889a.f(i8);
    }

    @Override // v6.f
    public List g(int i8) {
        return this.f38889a.g(i8);
    }

    @Override // v6.f
    public List getAnnotations() {
        return this.f38889a.getAnnotations();
    }

    @Override // v6.f
    public j getKind() {
        return this.f38889a.getKind();
    }

    @Override // v6.f
    public f h(int i8) {
        return this.f38889a.h(i8);
    }

    public int hashCode() {
        return (this.f38890b.hashCode() * 31) + a().hashCode();
    }

    @Override // v6.f
    public boolean i(int i8) {
        return this.f38889a.i(i8);
    }

    @Override // v6.f
    public boolean isInline() {
        return this.f38889a.isInline();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f38890b + ", original: " + this.f38889a + ')';
    }
}
