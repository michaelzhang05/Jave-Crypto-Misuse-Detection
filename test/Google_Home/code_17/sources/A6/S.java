package A6;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import y6.f;
import y6.k;

/* loaded from: classes5.dex */
public abstract class S implements y6.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f524a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.f f525b;

    /* renamed from: c, reason: collision with root package name */
    private final y6.f f526c;

    /* renamed from: d, reason: collision with root package name */
    private final int f527d;

    public /* synthetic */ S(String str, y6.f fVar, y6.f fVar2, AbstractC3247p abstractC3247p) {
        this(str, fVar, fVar2);
    }

    @Override // y6.f
    public String a() {
        return this.f524a;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // y6.f
    public int e() {
        return this.f527d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s8 = (S) obj;
        if (AbstractC3255y.d(a(), s8.a()) && AbstractC3255y.d(this.f525b, s8.f525b) && AbstractC3255y.d(this.f526c, s8.f526c)) {
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
        return k.c.f41059a;
    }

    @Override // y6.f
    public y6.f h(int i8) {
        if (i8 >= 0) {
            int i9 = i8 % 2;
            if (i9 != 0) {
                if (i9 == 1) {
                    return this.f526c;
                }
                throw new IllegalStateException("Unreached".toString());
            }
            return this.f525b;
        }
        throw new IllegalArgumentException(("Illegal index " + i8 + ", " + a() + " expects only non-negative indices").toString());
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f525b.hashCode()) * 31) + this.f526c.hashCode();
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
        return a() + '(' + this.f525b + ", " + this.f526c + ')';
    }

    private S(String str, y6.f fVar, y6.f fVar2) {
        this.f524a = str;
        this.f525b = fVar;
        this.f526c = fVar2;
        this.f527d = 2;
    }
}
