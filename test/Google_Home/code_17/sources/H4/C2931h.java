package h4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import g6.C2883c;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.v0;
import p4.z0;

/* renamed from: h4.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2931h implements p4.v0 {

    /* renamed from: h, reason: collision with root package name */
    private static final a f32605h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f32606i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final C2883c f32607j = new C2883c('0', '9');

    /* renamed from: c, reason: collision with root package name */
    private final VisualTransformation f32610c;

    /* renamed from: a, reason: collision with root package name */
    private final int f32608a = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();

    /* renamed from: b, reason: collision with root package name */
    private final String f32609b = "au_bank_account_number";

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f32611d = AbstractC3700N.a(null);

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f32612e = AbstractC3700N.a(Boolean.FALSE);

    /* renamed from: f, reason: collision with root package name */
    private final int f32613f = AbstractC3407E.f34830N;

    /* renamed from: g, reason: collision with root package name */
    private final int f32614g = KeyboardType.Companion.m4923getNumberPjHm6EE();

    /* renamed from: h4.h$a */
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
        return this.f32612e;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f32613f);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public InterfaceC3698L d() {
        return this.f32611d;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f32610c;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f32608a;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f32614g;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        int length = userTyped.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = userTyped.charAt(i8);
            if (f32607j.k(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return j6.n.U0(sb2, 9);
    }

    @Override // p4.v0
    public String k() {
        return this.f32609b;
    }

    @Override // p4.v0
    public p4.y0 l(String input) {
        AbstractC3255y.i(input, "input");
        if (j6.n.u(input)) {
            return z0.a.f37883c;
        }
        if (input.length() < 9) {
            return new z0.b(AbstractC3407E.f34832O);
        }
        return A0.a.f36968a;
    }
}
