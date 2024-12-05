package h4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.z0;

/* renamed from: h4.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2947p implements p4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f32704h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f32705i = 8;

    /* renamed from: a, reason: collision with root package name */
    private final int f32706a = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f32707b = "bacs_debit_sort_code";

    /* renamed from: c, reason: collision with root package name */
    private final int f32708c = e4.n.f31734h;

    /* renamed from: d, reason: collision with root package name */
    private final int f32709d = KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f32710e = C2949q.f32719a;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f32711f = AbstractC3700N.a(null);

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f32712g = AbstractC3700N.a(Boolean.FALSE);

    /* renamed from: h4.p$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f32712g;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f32708c);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public InterfaceC3698L d() {
        return this.f32711f;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f32710e;
    }

    @Override // p4.v0
    public String f() {
        return "10-80-00";
    }

    @Override // p4.v0
    public int g() {
        return this.f32706a;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f32709d;
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
        return j6.n.U0(sb2, 6);
    }

    @Override // p4.v0
    public String k() {
        return this.f32707b;
    }

    @Override // p4.v0
    public p4.y0 l(String input) {
        AbstractC3255y.i(input, "input");
        if (j6.n.u(input)) {
            return z0.a.f37883c;
        }
        if (input.length() < 6) {
            return new z0.b(e4.n.f31736i);
        }
        return A0.a.f36968a;
    }
}
