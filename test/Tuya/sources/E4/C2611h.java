package e4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import d6.C2559c;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.v0;
import m4.z0;

/* renamed from: e4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2611h implements m4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f30684h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f30685i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final C2559c f30686j = new C2559c('0', '9');

    /* renamed from: c, reason: collision with root package name */
    private final VisualTransformation f30689c;

    /* renamed from: a, reason: collision with root package name */
    private final int f30687a = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f30688b = "au_bank_account_number";

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3349K f30690d = AbstractC3351M.a(null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f30691e = AbstractC3351M.a(Boolean.FALSE);

    /* renamed from: f, reason: collision with root package name */
    private final int f30692f = AbstractC3053E.f32854N;

    /* renamed from: g, reason: collision with root package name */
    private final int f30693g = KeyboardType.Companion.m4918getNumberPjHm6EE();

    /* renamed from: e4.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f30691e;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f30692f);
    }

    @Override // m4.v0
    public InterfaceC3349K c() {
        return this.f30690d;
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f30689c;
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
        return this.f30687a;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f30693g;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f30686j.l(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return g6.n.U0(sb2, 9);
    }

    @Override // m4.v0
    public String k() {
        return this.f30688b;
    }

    @Override // m4.v0
    public m4.y0 l(String input) {
        AbstractC3159y.i(input, "input");
        if (g6.n.u(input)) {
            return z0.a.f35857c;
        }
        if (input.length() < 9) {
            return new z0.b(AbstractC3053E.f32856O);
        }
        return A0.a.f34942a;
    }
}
