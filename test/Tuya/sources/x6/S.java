package x6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import v6.f;
import v6.k;

/* loaded from: classes5.dex */
public abstract class S implements v6.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f39529a;

    /* renamed from: b, reason: collision with root package name */
    private final v6.f f39530b;

    /* renamed from: c, reason: collision with root package name */
    private final v6.f f39531c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39532d;

    public /* synthetic */ S(String str, v6.f fVar, v6.f fVar2, AbstractC3151p abstractC3151p) {
        this(str, fVar, fVar2);
    }

    @Override // v6.f
    public String a() {
        return this.f39529a;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // v6.f
    public int e() {
        return this.f39532d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3159y.d(a(), s8.a()) && AbstractC3159y.d(this.f39530b, s8.f39530b) && AbstractC3159y.d(this.f39531c, s8.f39531c)) {
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
        return k.c.f38928a;
    }

    @Override // v6.f
    public v6.f h(int i8) {
        if (i8 >= 0) {
            int i9 = i8 % 2;
            if (i9 != 0) {
                if (i9 == 1) {
                    return this.f39531c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f39530b;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f39530b.hashCode()) * 31) + this.f39531c.hashCode();
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
        return a() + '(' + this.f39530b + ", " + this.f39531c + ')';
    }

    private S(String str, v6.f fVar, v6.f fVar2) {
        this.f39529a = str;
        this.f39530b = fVar;
        this.f39531c = fVar2;
        this.f39532d = 2;
    }
}
