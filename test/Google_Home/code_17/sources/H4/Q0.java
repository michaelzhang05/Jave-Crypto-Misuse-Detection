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
public final class Q0 implements p4.v0 {

    /* renamed from: f, reason: collision with root package name */
    private final VisualTransformation f32449f;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f32444a = O5.l.b(a.f32452a);

    /* renamed from: b, reason: collision with root package name */
    private final int f32445b = e4.n.f31697D0;

    /* renamed from: c, reason: collision with root package name */
    private final int f32446c = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();

    /* renamed from: d, reason: collision with root package name */
    private final String f32447d = "upi_id";

    /* renamed from: e, reason: collision with root package name */
    private final int f32448e = KeyboardType.Companion.m4922getEmailPjHm6EE();

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f32450g = AbstractC3700N.a(null);

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f32451h = AbstractC3700N.a(Boolean.FALSE);

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f32452a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j6.j invoke() {
            return new j6.j("[a-zA-Z0-9.\\-_]{2,256}@[a-zA-Z]{2,64}");
        }
    }

    private final j6.j m() {
        return (j6.j) this.f32444a.getValue();
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f32451h;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f32445b);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public InterfaceC3698L d() {
        return this.f32450g;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f32449f;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f32446c;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f32448e;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        return j6.n.M0(userTyped).toString();
    }

    @Override // p4.v0
    public String k() {
        return this.f32447d;
    }

    @Override // p4.v0
    public p4.y0 l(String input) {
        boolean z8;
        AbstractC3255y.i(input, "input");
        if (m().e(input) && input.length() <= 30) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (input.length() == 0) {
            return z0.a.f37883c;
        }
        if (z8) {
            return A0.b.f36969a;
        }
        return new z0.b(e4.n.f31768y);
    }
}
