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
public final class Q0 implements m4.v0 {

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f30528f;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f30523a = L5.l.b(a.f30531a);

    /* renamed from: b, reason: collision with root package name */
    private final int f30524b = b4.n.f14691D0;

    /* renamed from: c, reason: collision with root package name */
    private final int f30525c = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();

    /* renamed from: d, reason: collision with root package name */
    private final String f30526d = "upi_id";

    /* renamed from: e, reason: collision with root package name */
    private final int f30527e = KeyboardType.Companion.m4917getEmailPjHm6EE();

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f30529g = AbstractC3351M.a(null);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3349K f30530h = AbstractC3351M.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f30531a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final g6.j invoke() {
            return new g6.j("[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}");
        }
    }

    private final g6.j m() {
        return (g6.j) this.f30523a.getValue();
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f30530h;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f30524b);
    }

    @Override // m4.v0
    public InterfaceC3349K c() {
        return this.f30529g;
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f30528f;
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
        return this.f30525c;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f30527e;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        return g6.n.M0(userTyped).toString();
    }

    @Override // m4.v0
    public String k() {
        return this.f30526d;
    }

    @Override // m4.v0
    public m4.y0 l(String input) {
        boolean z8;
        AbstractC3159y.i(input, "input");
        if (m().e(input) && input.length() <= 30) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (input.length() == 0) {
            return z0.a.f35857c;
        }
        if (z8) {
            return A0.b.f34943a;
        }
        return new z0.b(b4.n.f14762y);
    }
}
