package m4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.core.app.NotificationCompat;
import g6.AbstractC2725a;
import j4.AbstractC3081g;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import m4.A0;
import m4.v0;
import m4.z0;

/* renamed from: m4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3399A implements v0 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f34932h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f34933i = 8;

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f34934j;

    /* renamed from: a, reason: collision with root package name */
    private final int f34935a;

    /* renamed from: b, reason: collision with root package name */
    private final int f34936b;

    /* renamed from: c, reason: collision with root package name */
    private final String f34937c;

    /* renamed from: d, reason: collision with root package name */
    private final int f34938d;

    /* renamed from: e, reason: collision with root package name */
    private final VisualTransformation f34939e;

    /* renamed from: f, reason: collision with root package name */
    private final l6.v f34940f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3349K f34941g;

    /* renamed from: m4.A$a */
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
            return new s0(new C3399A(0, 1, null), z8, str);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        AbstractC3159y.h(compile, "compile(...)");
        f34934j = compile;
    }

    public C3399A(int i8) {
        this.f34935a = i8;
        this.f34936b = KeyboardCapitalization.Companion.m4896getNoneIUNYP9k();
        this.f34937c = NotificationCompat.CATEGORY_EMAIL;
        this.f34938d = KeyboardType.Companion.m4917getEmailPjHm6EE();
        this.f34940f = AbstractC3351M.a(null);
        this.f34941g = AbstractC3351M.a(Boolean.FALSE);
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
        if (!g6.n.H(str, "@", false, 2, null) || !new g6.j(".*@.*\\..+").e(str)) {
            return false;
        }
        return true;
    }

    @Override // m4.v0
    public InterfaceC3349K a() {
        return this.f34941g;
    }

    @Override // m4.v0
    public Integer b() {
        return Integer.valueOf(this.f34935a);
    }

    @Override // m4.v0
    public VisualTransformation d() {
        return this.f34939e;
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
        return this.f34936b;
    }

    @Override // m4.v0
    public String h(String displayName) {
        AbstractC3159y.i(displayName, "displayName");
        return displayName;
    }

    @Override // m4.v0
    public int i() {
        return this.f34938d;
    }

    @Override // m4.v0
    public String j(String userTyped) {
        AbstractC3159y.i(userTyped, "userTyped");
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < userTyped.length(); i8++) {
            char charAt = userTyped.charAt(i8);
            if (!AbstractC2725a.c(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        AbstractC3159y.h(sb2, "toString(...)");
        return sb2;
    }

    @Override // m4.v0
    public String k() {
        return this.f34937c;
    }

    @Override // m4.v0
    public y0 l(String input) {
        AbstractC3159y.i(input, "input");
        if (input.length() == 0) {
            return z0.a.f35857c;
        }
        if (f34934j.matcher(input).matches()) {
            return A0.b.f34943a;
        }
        if (!n(input) && !m(input)) {
            return new z0.b(AbstractC3081g.f33180B);
        }
        return new z0.c(AbstractC3081g.f33180B, null, false, 6, null);
    }

    @Override // m4.v0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public l6.v c() {
        return this.f34940f;
    }

    public /* synthetic */ C3399A(int i8, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? AbstractC3081g.f33179A : i8);
    }
}
