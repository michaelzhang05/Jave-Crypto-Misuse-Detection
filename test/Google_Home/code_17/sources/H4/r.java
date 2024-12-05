package h4;

import O5.InterfaceC1355k;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.v0;
import p4.z0;

/* loaded from: classes4.dex */
public final class r implements p4.v0 {

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f32729f;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f32724a = O5.l.b(a.f32732a);

    /* renamed from: b, reason: collision with root package name */
    private final int f32725b = e4.n.f31740k;

    /* renamed from: c, reason: collision with root package name */
    private final int f32726c = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();

    /* renamed from: d, reason: collision with root package name */
    private final String f32727d = "blik_code";

    /* renamed from: e, reason: collision with root package name */
    private final int f32728e = KeyboardType.Companion.m4923getNumberPjHm6EE();

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f32730g = AbstractC3700N.a(null);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f32731h = AbstractC3700N.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32732a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j6.j invoke() {
            return new j6.j("^[0-9]{6}$");
        }
    }

    private final j6.j m() {
        return (j6.j) this.f32724a.getValue();
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f32731h;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f32725b);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public InterfaceC3698L d() {
        return this.f32730g;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f32729f;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f32726c;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f32728e;
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
        return this.f32727d;
    }

    @Override // p4.v0
    public p4.y0 l(String input) {
        AbstractC3255y.i(input, "input");
        boolean e8 = m().e(input);
        if (input.length() == 0) {
            return z0.a.f37883c;
        }
        if (e8) {
            return A0.b.f36969a;
        }
        for (int i8 = 0; i8 < input.length(); i8++) {
            if (!Character.isDigit(input.charAt(i8))) {
                return new z0.c(e4.n.f31766x, null, false, 6, null);
            }
        }
        if (input.length() < 6) {
            return new z0.b(e4.n.f31764w);
        }
        return new z0.c(e4.n.f31766x, null, false, 6, null);
    }
}
