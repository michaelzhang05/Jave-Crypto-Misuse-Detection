package m4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import j4.AbstractC3081g;
import java.util.Calendar;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.v0;
import m4.z0;

/* renamed from: m4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3431v implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f35758h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f35759i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f35760a = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f35761b = "date";

    /* renamed from: c, reason: collision with root package name */
    private final int f35762c = AbstractC3081g.f33181C;

    /* renamed from: d, reason: collision with root package name */
    private final int f35763d = KeyboardType.Companion.m4919getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final B f35764e = new B();

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f35765f = AbstractC3351M.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f35766g = AbstractC3351M.a(Boolean.FALSE);

    /* renamed from: m4.v$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final y0 a(int i8, int i9, int i10, int i11) {
            boolean z8;
            boolean z9;
            boolean z10;
            int i12 = i9 - (i11 % 100);
            boolean z11 = false;
            if (i12 < 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (i12 > 50) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i12 == 0 && i10 > i8) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (1 <= i8 && i8 < 13) {
                z11 = true;
            }
            boolean z12 = !z11;
            if (z8) {
                return new z0.c(AbstractC3081g.f33187I, null, true, 2, null);
            }
            if (z9) {
                return new z0.c(AbstractC3081g.f33187I, null, true, 2, null);
            }
            if (z10) {
                return new z0.c(AbstractC3081g.f33186H, null, true, 2, null);
            }
            if (z12) {
                return new z0.b(AbstractC3081g.f33186H);
            }
            return A0.a.f34942a;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f35766g;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f35762c);
    }

    @Override // m4.v0
    public InterfaceC3349K c() {
        return this.f35765f;
    }

    @Override // m4.v0
    public String e() {
        return v0.a.a(this);
    }

    @Override // m4.v0
    public String f(String rawValue) {
        AbstractC3159y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // m4.v0
    public int g() {
        return this.f35760a;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f35763d;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // m4.v0
    public String k() {
        return this.f35761b;
    }

    @Override // m4.v0
    public y0 l(String input) {
        AbstractC3159y.i(input, "input");
        if (g6.n.u(input)) {
            return z0.a.f35857c;
        }
        String a8 = AbstractC3428s.a(input);
        if (a8.length() < 4) {
            return new z0.b(AbstractC3081g.f33184F);
        }
        if (a8.length() > 4) {
            return new z0.c(AbstractC3081g.f33184F, null, false, 6, null);
        }
        a aVar = f35758h;
        Integer i8 = g6.n.i(g6.n.U0(a8, 2));
        if (i8 != null) {
            int intValue = i8.intValue();
            Integer i9 = g6.n.i(g6.n.V0(a8, 2));
            if (i9 != null) {
                return aVar.a(intValue, i9.intValue(), Calendar.getInstance().get(2) + 1, Calendar.getInstance().get(1));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // m4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public B d() {
        return this.f35764e;
    }
}
