package m4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.v0;
import m4.z0;
import r2.AbstractC3685e;

/* loaded from: classes4.dex */
public final class J implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f35101h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f35102i = 8;

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f35107e;

    /* renamed from: a, reason: collision with root package name */
    private final int f35103a = AbstractC3685e.f37578e;

    /* renamed from: b, reason: collision with root package name */
    private final int f35104b = KeyboardCapitalization.Companion.m4898getWordsIUNYP9k();

    /* renamed from: c, reason: collision with root package name */
    private final String f35105c = "name";

    /* renamed from: d, reason: collision with root package name */
    private final int f35106d = KeyboardType.Companion.m4922getTextPjHm6EE();

    /* renamed from: f, reason: collision with root package name */
    private final l6.v f35108f = AbstractC3351M.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f35109g = AbstractC3351M.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final s0 a(String str) {
            return new s0(new J(), false, str, 2, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f35109g;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f35103a);
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f35107e;
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
        return this.f35104b;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f35106d;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isLetter(charAt) || charAt == ' ') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // m4.v0
    public String k() {
        return this.f35105c;
    }

    @Override // m4.v0
    public y0 l(String input) {
        AbstractC3159y.i(input, "input");
        if (g6.n.u(input)) {
            return z0.a.f35857c;
        }
        return A0.b.f34943a;
    }

    @Override // m4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public l6.v c() {
        return this.f35108f;
    }
}
