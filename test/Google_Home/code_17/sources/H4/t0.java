package h4;

import P5.AbstractC1378t;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import p4.D;

/* loaded from: classes4.dex */
public final class t0 implements p4.D {

    /* renamed from: a, reason: collision with root package name */
    private final p4.G f32745a;

    /* renamed from: b, reason: collision with root package name */
    private final int f32746b;

    /* renamed from: c, reason: collision with root package name */
    private final List f32747c;

    /* renamed from: d, reason: collision with root package name */
    private final float f32748d;

    /* renamed from: e, reason: collision with root package name */
    private final p4.H f32749e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f32750f;

    /* renamed from: g, reason: collision with root package name */
    private final B2.b f32751g;

    public /* synthetic */ t0(p4.G g8, int i8, List list, float f8, p4.H h8, AbstractC3247p abstractC3247p) {
        this(g8, i8, list, f8, h8);
    }

    @Override // p4.D
    public p4.G a() {
        return this.f32745a;
    }

    @Override // p4.D
    public B2.b b() {
        return this.f32751g;
    }

    @Override // p4.D
    public boolean c() {
        return this.f32750f;
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
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (AbstractC3255y.d(this.f32745a, t0Var.f32745a) && this.f32746b == t0Var.f32746b && AbstractC3255y.d(this.f32747c, t0Var.f32747c) && Dp.m5188equalsimpl0(this.f32748d, t0Var.f32748d) && AbstractC3255y.d(this.f32749e, t0Var.f32749e)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f32747c;
    }

    public final int g() {
        return this.f32746b;
    }

    public final float h() {
        return this.f32748d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f32745a.hashCode() * 31) + this.f32746b) * 31) + this.f32747c.hashCode()) * 31) + Dp.m5189hashCodeimpl(this.f32748d)) * 31;
        p4.H h8 = this.f32749e;
        if (h8 == null) {
            hashCode = 0;
        } else {
            hashCode = h8.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "MandateTextElement(identifier=" + this.f32745a + ", stringResId=" + this.f32746b + ", args=" + this.f32747c + ", topPadding=" + Dp.m5194toStringimpl(this.f32748d) + ", controller=" + this.f32749e + ")";
    }

    private t0(p4.G identifier, int i8, List args, float f8, p4.H h8) {
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(args, "args");
        this.f32745a = identifier;
        this.f32746b = i8;
        this.f32747c = args;
        this.f32748d = f8;
        this.f32749e = h8;
        String[] strArr = (String[]) args.toArray(new String[0]);
        this.f32751g = B2.c.f(i8, Arrays.copyOf(strArr, strArr.length), null, 4, null);
    }

    public /* synthetic */ t0(p4.G g8, int i8, List list, float f8, p4.H h8, int i9, AbstractC3247p abstractC3247p) {
        this(g8, i8, list, (i9 & 8) != 0 ? Dp.m5183constructorimpl(8) : f8, (i9 & 16) != 0 ? null : h8, null);
    }
}
