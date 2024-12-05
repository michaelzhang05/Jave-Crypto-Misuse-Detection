package e4;

import M5.AbstractC1246t;
import androidx.compose.ui.unit.Dp;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import m4.D;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public final class t0 implements m4.D {

    /* renamed from: a, reason: collision with root package name */
    private final m4.G f30824a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30825b;

    /* renamed from: c, reason: collision with root package name */
    private final List f30826c;

    /* renamed from: d, reason: collision with root package name */
    private final float f30827d;

    /* renamed from: e, reason: collision with root package name */
    private final m4.H f30828e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f30829f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3983b f30830g;

    public /* synthetic */ t0(m4.G g8, int i8, List list, float f8, m4.H h8, AbstractC3151p abstractC3151p) {
        this(g8, i8, list, f8, h8);
    }

    @Override // m4.D
    public m4.G a() {
        return this.f30824a;
    }

    @Override // m4.D
    public InterfaceC3983b b() {
        return this.f30830g;
    }

    @Override // m4.D
    public boolean c() {
        return this.f30829f;
    }

    @Override // m4.D
    public InterfaceC3349K d() {
        return v4.g.n(AbstractC1246t.m());
    }

    @Override // m4.D
    public InterfaceC3349K e() {
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
        if (AbstractC3159y.d(this.f30824a, t0Var.f30824a) && this.f30825b == t0Var.f30825b && AbstractC3159y.d(this.f30826c, t0Var.f30826c) && Dp.m5183equalsimpl0(this.f30827d, t0Var.f30827d) && AbstractC3159y.d(this.f30828e, t0Var.f30828e)) {
            return true;
        }
        return false;
    }

    public final List f() {
        return this.f30826c;
    }

    public final int g() {
        return this.f30825b;
    }

    public final float h() {
        return this.f30827d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((this.f30824a.hashCode() * 31) + this.f30825b) * 31) + this.f30826c.hashCode()) * 31) + Dp.m5184hashCodeimpl(this.f30827d)) * 31;
        m4.H h8 = this.f30828e;
        if (h8 == null) {
            hashCode = 0;
        } else {
            hashCode = h8.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "MandateTextElement(identifier=" + this.f30824a + ", stringResId=" + this.f30825b + ", args=" + this.f30826c + ", topPadding=" + Dp.m5189toStringimpl(this.f30827d) + ", controller=" + this.f30828e + ")";
    }

    private t0(m4.G identifier, int i8, List args, float f8, m4.H h8) {
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(args, "args");
        this.f30824a = identifier;
        this.f30825b = i8;
        this.f30826c = args;
        this.f30827d = f8;
        this.f30828e = h8;
        String[] strArr = (String[]) args.toArray(new String[0]);
        this.f30830g = AbstractC3984c.f(i8, Arrays.copyOf(strArr, strArr.length), null, 4, null);
    }

    public /* synthetic */ t0(m4.G g8, int i8, List list, float f8, m4.H h8, int i9, AbstractC3151p abstractC3151p) {
        this(g8, i8, list, (i9 & 8) != 0 ? Dp.m5178constructorimpl(8) : f8, (i9 & 16) != 0 ? null : h8, null);
    }
}
