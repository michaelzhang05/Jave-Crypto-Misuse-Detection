package x6;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class m0 implements v6.f, InterfaceC3952l {

    /* renamed from: a, reason: collision with root package name */
    private final v6.f f39586a;

    /* renamed from: b, reason: collision with root package name */
    private final String f39587b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f39588c;

    public m0(v6.f original) {
        AbstractC3159y.i(original, "original");
        this.f39586a = original;
        this.f39587b = original.a() + '?';
        this.f39588c = AbstractC3940c0.a(original);
    }

    @Override // v6.f
    public String a() {
        return this.f39587b;
    }

    @Override // x6.InterfaceC3952l
    public Set b() {
        return this.f39588c;
    }

    @Override // v6.f
    public boolean c() {
        return true;
    }

    @Override // v6.f
    public int d(String name) {
        AbstractC3159y.i(name, "name");
        return this.f39586a.d(name);
    }

    @Override // v6.f
    public int e() {
        return this.f39586a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof m0) && AbstractC3159y.d(this.f39586a, ((m0) obj).f39586a)) {
            return true;
        }
        return false;
    }

    @Override // v6.f
    public String f(int i8) {
        return this.f39586a.f(i8);
    }

    @Override // v6.f
    public List g(int i8) {
        return this.f39586a.g(i8);
    }

    @Override // v6.f
    public List getAnnotations() {
        return this.f39586a.getAnnotations();
    }

    @Override // v6.f
    public v6.j getKind() {
        return this.f39586a.getKind();
    }

    @Override // v6.f
    public v6.f h(int i8) {
        return this.f39586a.h(i8);
    }

    public int hashCode() {
        return this.f39586a.hashCode() * 31;
    }

    @Override // v6.f
    public boolean i(int i8) {
        return this.f39586a.i(i8);
    }

    @Override // v6.f
    public boolean isInline() {
        return this.f39586a.isInline();
    }

    public final v6.f j() {
        return this.f39586a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f39586a);
        sb.append('?');
        return sb.toString();
    }
}
