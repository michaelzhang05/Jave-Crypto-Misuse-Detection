package e4;

import L5.InterfaceC1227k;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.v0;
import m4.z0;

/* loaded from: classes4.dex */
public final class r implements m4.v0 {

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f30808f;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f30803a = L5.l.b(a.f30811a);

    /* renamed from: b, reason: collision with root package name */
    private final int f30804b = b4.n.f14734k;

    /* renamed from: c, reason: collision with root package name */
    private final int f30805c = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();

    /* renamed from: d, reason: collision with root package name */
    private final String f30806d = "blik_code";

    /* renamed from: e, reason: collision with root package name */
    private final int f30807e = KeyboardType.Companion.m4918getNumberPjHm6EE();

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f30809g = AbstractC3351M.a(null);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f30810h = AbstractC3351M.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30811a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g6.j invoke() {
            return new g6.j("^[0-9]{6}$");
        }
    }

    private final g6.j m() {
        return (g6.j) this.f30803a.getValue();
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f30810h;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f30804b);
    }

    @Override // m4.v0
    public InterfaceC3349K c() {
        return this.f30809g;
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f30808f;
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
        return this.f30805c;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f30807e;
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
        return g6.n.U0(sb2, 6);
    }

    @Override // m4.v0
    public String k() {
        return this.f30806d;
    }

    @Override // m4.v0
    public m4.y0 l(String input) {
        AbstractC3159y.i(input, "input");
        boolean e8 = m().e(input);
        if (input.length() == 0) {
            return z0.a.f35857c;
        }
        if (e8) {
            return A0.b.f34943a;
        }
        for (int i8 = 0; i8 < input.length(); i8++) {
            if (!Character.isDigit(input.charAt(i8))) {
                return new z0.c(b4.n.f14760x, null, false, 6, null);
            }
        }
        if (input.length() < 6) {
            return new z0.b(b4.n.f14758w);
        }
        return new z0.c(b4.n.f14760x, null, false, 6, null);
    }
}
