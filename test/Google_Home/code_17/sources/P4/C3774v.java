package p4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import java.util.Calendar;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m4.AbstractC3435g;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.v0;
import p4.z0;

/* renamed from: p4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3774v implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f37784h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f37785i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f37786a = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f37787b = "date";

    /* renamed from: c, reason: collision with root package name */
    private final int f37788c = AbstractC3435g.f35157C;

    /* renamed from: d, reason: collision with root package name */
    private final int f37789d = KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final B f37790e = new B();

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f37791f = AbstractC3700N.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f37792g = AbstractC3700N.a(Boolean.FALSE);

    /* renamed from: p4.v$a */
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
                return new z0.c(AbstractC3435g.f35163I, null, true, 2, null);
            }
            if (z9) {
                return new z0.c(AbstractC3435g.f35163I, null, true, 2, null);
            }
            if (z10) {
                return new z0.c(AbstractC3435g.f35162H, null, true, 2, null);
            }
            if (z12) {
                return new z0.b(AbstractC3435g.f35162H);
            }
            return A0.a.f36968a;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f37792g;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f37788c);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public InterfaceC3698L d() {
        return this.f37791f;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f37786a;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f37789d;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // p4.v0
    public String k() {
        return this.f37787b;
    }

    @Override // p4.v0
    public y0 l(String input) {
        AbstractC3255y.i(input, "input");
        if (j6.n.u(input)) {
            return z0.a.f37883c;
        }
        String a8 = AbstractC3771s.a(input);
        if (a8.length() < 4) {
            return new z0.b(AbstractC3435g.f35160F);
        }
        if (a8.length() > 4) {
            return new z0.c(AbstractC3435g.f35160F, null, false, 6, null);
        }
        a aVar = f37784h;
        Integer i8 = j6.n.i(j6.n.U0(a8, 2));
        if (i8 != null) {
            int intValue = i8.intValue();
            Integer i9 = j6.n.i(j6.n.V0(a8, 2));
            if (i9 != null) {
                return aVar.a(intValue, i9.intValue(), Calendar.getInstance().get(2) + 1, Calendar.getInstance().get(1));
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // p4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public B e() {
        return this.f37790e;
    }
}
