package A6;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class m0 implements y6.f, InterfaceC0993l {

    /* renamed from: a, reason: collision with root package name */
    private final y6.f f581a;

    /* renamed from: b, reason: collision with root package name */
    private final String f582b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f583c;

    public m0(y6.f original) {
        AbstractC3255y.i(original, "original");
        this.f581a = original;
        this.f582b = original.a() + '?';
        this.f583c = AbstractC0981c0.a(original);
    }

    @Override // y6.f
    public String a() {
        return this.f582b;
    }

    @Override // A6.InterfaceC0993l
    public Set b() {
        return this.f583c;
    }

    @Override // y6.f
    public boolean c() {
        return true;
    }

    @Override // y6.f
    public int d(String name) {
        AbstractC3255y.i(name, "name");
        return this.f581a.d(name);
    }

    @Override // y6.f
    public int e() {
        return this.f581a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m0) && AbstractC3255y.d(this.f581a, ((m0) obj).f581a)) {
            return true;
        }
        return false;
    }

    @Override // y6.f
    public String f(int i8) {
        return this.f581a.f(i8);
    }

    @Override // y6.f
    public List g(int i8) {
        return this.f581a.g(i8);
    }

    @Override // y6.f
    public List getAnnotations() {
        return this.f581a.getAnnotations();
    }

    @Override // y6.f
    public y6.j getKind() {
        return this.f581a.getKind();
    }

    @Override // y6.f
    public y6.f h(int i8) {
        return this.f581a.h(i8);
    }

    public int hashCode() {
        return this.f581a.hashCode() * 31;
    }

    @Override // y6.f
    public boolean i(int i8) {
        return this.f581a.i(i8);
    }

    @Override // y6.f
    public boolean isInline() {
        return this.f581a.isInline();
    }

    public final y6.f j() {
        return this.f581a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f581a);
        sb.append('?');
        return sb.toString();
    }
}
