package h4;

import P5.AbstractC1378t;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import o6.InterfaceC3698L;
import p4.D;

/* renamed from: h4.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2937k implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32641a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32642b;

    /* renamed from: c, reason: collision with root package name */
    private final p4.H f32643c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f32644d;

    /* renamed from: e, reason: collision with root package name */
    private final B2.b f32645e;

    public C2937k(p4.G identifier, String str, p4.H h8) {
        AbstractC3255y.i(identifier, "identifier");
        this.f32641a = identifier;
        this.f32642b = str;
        this.f32643c = h8;
        this.f32645e = B2.c.f(AbstractC3407E.f34826L, new Object[]{str == null ? "" : str}, null, 4, null);
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32641a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32645e;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32644d;
    }

    @Override // p4.D
    public InterfaceC3698L d() {
        return y4.g.n(AbstractC1378t.m());
    }

    @Override // p4.D
    public InterfaceC3698L e() {
        return D.a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2937k)) {
            return false;
        }
        C2937k c2937k = (C2937k) obj;
        if (AbstractC3255y.d(this.f32641a, c2937k.f32641a) && AbstractC3255y.d(this.f32642b, c2937k.f32642b) && AbstractC3255y.d(this.f32643c, c2937k.f32643c)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f32642b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f32641a.hashCode() * 31;
        String str = this.f32642b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        p4.H h8 = this.f32643c;
        if (h8 != null) {
            i8 = h8.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "AuBecsDebitMandateTextElement(identifier=" + this.f32641a + ", merchantName=" + this.f32642b + ", controller=" + this.f32643c + ")";
    }

    public /* synthetic */ C2937k(p4.G g8, String str, p4.H h8, int i8, AbstractC3247p abstractC3247p) {
        this(g8, str, (i8 & 4) != 0 ? null : h8);
    }
}
