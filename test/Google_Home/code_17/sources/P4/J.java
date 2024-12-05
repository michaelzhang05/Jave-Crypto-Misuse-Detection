package p4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.v0;
import p4.z0;
import u2.AbstractC4058e;

/* loaded from: classes4.dex */
public final class J implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f37127h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f37128i = 8;

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f37133e;

    /* renamed from: a, reason: collision with root package name */
    private final int f37129a = AbstractC4058e.f39958e;

    /* renamed from: b, reason: collision with root package name */
    private final int f37130b = KeyboardCapitalization.Companion.m4903getWordsIUNYP9k();

    /* renamed from: c, reason: collision with root package name */
    private final String f37131c = "name";

    /* renamed from: d, reason: collision with root package name */
    private final int f37132d = KeyboardType.Companion.m4927getTextPjHm6EE();

    /* renamed from: f, reason: collision with root package name */
    private final o6.w f37134f = AbstractC3700N.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f37135g = AbstractC3700N.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final s0 a(String str) {
            return new s0(new J(), false, str, 2, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f37135g;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f37129a);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f37133e;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f37130b;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f37132d;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (Character.isLetter(charAt) || charAt == ' ') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // p4.v0
    public String k() {
        return this.f37131c;
    }

    @Override // p4.v0
    public y0 l(String input) {
        AbstractC3255y.i(input, "input");
        if (j6.n.u(input)) {
            return z0.a.f37883c;
        }
        return A0.b.f36969a;
    }

    @Override // p4.v0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public o6.w d() {
        return this.f37134f;
    }
}
