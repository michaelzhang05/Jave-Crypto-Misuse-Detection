package p4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.app.NotificationCompat;
import j6.AbstractC3202a;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m4.AbstractC3435g;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import p4.A0;
import p4.v0;
import p4.z0;

/* renamed from: p4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3742A implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f36958h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f36959i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f36960j;

    /* renamed from: a, reason: collision with root package name */
    private final int f36961a;

    /* renamed from: b, reason: collision with root package name */
    private final int f36962b;

    /* renamed from: c, reason: collision with root package name */
    private final String f36963c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36964d;

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f36965e;

    /* renamed from: f, reason: collision with root package name */
    private final o6.w f36966f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3698L f36967g;

    /* renamed from: p4.A$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ s0 b(a aVar, String str, boolean z8, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            return aVar.a(str, z8);
        }

        public final s0 a(String str, boolean z8) {
            return new s0(new C3742A(0, 1, null), z8, str);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        AbstractC3255y.h(compile, "compile(...)");
        f36960j = compile;
    }

    public C3742A(int i8) {
        this.f36961a = i8;
        this.f36962b = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();
        this.f36963c = NotificationCompat.CATEGORY_EMAIL;
        this.f36964d = KeyboardType.Companion.m4922getEmailPjHm6EE();
        this.f36966f = AbstractC3700N.a(null);
        this.f36967g = AbstractC3700N.a(Boolean.FALSE);
    }

    private final boolean m(String str) {
        int i8 = 0;
        for (int i9 = 0; i9 < str.length(); i9++) {
            if (str.charAt(i9) == '@') {
                i8++;
            }
        }
        if (i8 <= 1) {
            return false;
        }
        return true;
    }

    private final boolean n(String str) {
        if (!j6.n.H(str, "@", false, 2, null) || !new j6.j(".*@.*\\..+").e(str)) {
            return false;
        }
        return true;
    }

    @Override // p4.v0
    public InterfaceC3698L a() {
        return this.f36967g;
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f36961a);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return rawValue;
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f36965e;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f36962b;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f36964d;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        AbstractC3255y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < userTyped.length(); i8++) {
            char charAt = userTyped.charAt(i8);
            if (!AbstractC3202a.c(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3255y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // p4.v0
    public String k() {
        return this.f36963c;
    }

    @Override // p4.v0
    public y0 l(String input) {
        AbstractC3255y.i(input, "input");
        if (input.length() == 0) {
            return z0.a.f37883c;
        }
        if (f36960j.matcher(input).matches()) {
            return A0.b.f36969a;
        }
        if (!n(input) && !m(input)) {
            return new z0.b(AbstractC3435g.f35156B);
        }
        return new z0.c(AbstractC3435g.f35156B, null, false, 6, null);
    }

    @Override // p4.v0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public o6.w d() {
        return this.f36966f;
    }

    public /* synthetic */ C3742A(int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? AbstractC3435g.f35155A : i8);
    }
}
