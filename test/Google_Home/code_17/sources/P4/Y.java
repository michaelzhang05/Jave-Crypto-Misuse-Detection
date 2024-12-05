package p4;

import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.VisualTransformation;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m4.AbstractC3435g;
import o6.AbstractC3700N;
import p4.v0;

/* loaded from: classes4.dex */
public final class Y implements v0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f37327a;

    /* renamed from: b, reason: collision with root package name */
    private final o6.w f37328b;

    /* renamed from: c, reason: collision with root package name */
    private final String f37329c;

    /* renamed from: d, reason: collision with root package name */
    private final a f37330d;

    /* renamed from: e, reason: collision with root package name */
    private final int f37331e;

    /* renamed from: f, reason: collision with root package name */
    private final int f37332f;

    /* renamed from: g, reason: collision with root package name */
    private final String f37333g;

    /* renamed from: h, reason: collision with root package name */
    private final VisualTransformation f37334h;

    /* renamed from: i, reason: collision with root package name */
    private final o6.w f37335i;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: d, reason: collision with root package name */
        public static final b f37336d = new b(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f37337e = 8;

        /* renamed from: a, reason: collision with root package name */
        private final int f37338a;

        /* renamed from: b, reason: collision with root package name */
        private final int f37339b;

        /* renamed from: c, reason: collision with root package name */
        private final j6.j f37340c;

        /* renamed from: p4.Y$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0829a extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final C0829a f37341f = new C0829a();

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private C0829a() {
                /*
                    r3 = this;
                    j6.j r0 = new j6.j
                    java.lang.String r1 = "[a-zA-Z]\\d[a-zA-Z][\\s-]?\\d[a-zA-Z]\\d"
                    r0.<init>(r1)
                    r1 = 0
                    r2 = 6
                    r3.<init>(r2, r2, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p4.Y.a.C0829a.<init>():void");
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final a a(String country) {
                AbstractC3255y.i(country, "country");
                int hashCode = country.hashCode();
                if (hashCode != 2142) {
                    if (hashCode != 2267) {
                        if (hashCode == 2718 && country.equals("US")) {
                            return e.f37344f;
                        }
                    } else if (country.equals("GB")) {
                        return c.f37342f;
                    }
                } else if (country.equals("CA")) {
                    return C0829a.f37341f;
                }
                return d.f37343f;
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final c f37342f = new c();

            private c() {
                super(5, 7, new j6.j("^[A-Za-z][A-Za-z0-9]*(?: [A-Za-z0-9]*)?$"), null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final d f37343f = new d();

            private d() {
                super(1, Integer.MAX_VALUE, new j6.j(".*"), null);
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {

            /* renamed from: f, reason: collision with root package name */
            public static final e f37344f = new e();

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private e() {
                /*
                    r3 = this;
                    j6.j r0 = new j6.j
                    java.lang.String r1 = "\\d+"
                    r0.<init>(r1)
                    r1 = 0
                    r2 = 5
                    r3.<init>(r2, r2, r0, r1)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p4.Y.a.e.<init>():void");
            }
        }

        public /* synthetic */ a(int i8, int i9, j6.j jVar, AbstractC3247p abstractC3247p) {
            this(i8, i9, jVar);
        }

        public final int a() {
            return this.f37339b;
        }

        public final int b() {
            return this.f37338a;
        }

        public final j6.j c() {
            return this.f37340c;
        }

        private a(int i8, int i9, j6.j jVar) {
            this.f37338a = i8;
            this.f37339b = i9;
            this.f37340c = jVar;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements y0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f37346b;

        b(String str) {
            this.f37346b = str;
        }

        @Override // p4.y0
        public boolean a() {
            if (Y.this.f37330d instanceof a.d) {
                if (j6.n.u(this.f37346b)) {
                    return false;
                }
            } else {
                int b8 = Y.this.f37330d.b();
                int a8 = Y.this.f37330d.a();
                int length = this.f37346b.length();
                if (b8 > length || length > a8) {
                    return false;
                }
                if (!Y.this.f37330d.c().e(this.f37346b)) {
                    return false;
                }
            }
            return true;
        }

        @Override // p4.y0
        public boolean b() {
            return j6.n.u(this.f37346b);
        }

        @Override // p4.y0
        public boolean c(boolean z8) {
            if (getError() != null && !z8) {
                return true;
            }
            return false;
        }

        @Override // p4.y0
        public boolean d() {
            if (this.f37346b.length() >= Y.this.f37330d.a()) {
                return true;
            }
            return false;
        }

        @Override // p4.y0
        public C getError() {
            C c8;
            if ((!j6.n.u(this.f37346b)) && !a() && AbstractC3255y.d(Y.this.f37329c, "US")) {
                c8 = new C(AbstractC3435g.f35185v, null, 2, null);
            } else {
                if (!(!j6.n.u(this.f37346b)) || a()) {
                    return null;
                }
                c8 = new C(AbstractC3435g.f35186w, null, 2, null);
            }
            return c8;
        }
    }

    public Y(int i8, o6.w trailingIcon, String country) {
        int m4900getCharactersIUNYP9k;
        int m4927getTextPjHm6EE;
        AbstractC3255y.i(trailingIcon, "trailingIcon");
        AbstractC3255y.i(country, "country");
        this.f37327a = i8;
        this.f37328b = trailingIcon;
        this.f37329c = country;
        a a8 = a.f37336d.a(country);
        this.f37330d = a8;
        a.e eVar = a.e.f37344f;
        if (AbstractC3255y.d(a8, eVar)) {
            m4900getCharactersIUNYP9k = KeyboardCapitalization.Companion.m4901getNoneIUNYP9k();
        } else {
            if (!(AbstractC3255y.d(a8, a.C0829a.f37341f) ? true : AbstractC3255y.d(a8, a.c.f37342f) ? true : AbstractC3255y.d(a8, a.d.f37343f))) {
                throw new O5.p();
            }
            m4900getCharactersIUNYP9k = KeyboardCapitalization.Companion.m4900getCharactersIUNYP9k();
        }
        this.f37331e = m4900getCharactersIUNYP9k;
        if (AbstractC3255y.d(a8, eVar)) {
            m4927getTextPjHm6EE = KeyboardType.Companion.m4924getNumberPasswordPjHm6EE();
        } else {
            if (!(AbstractC3255y.d(a8, a.C0829a.f37341f) ? true : AbstractC3255y.d(a8, a.c.f37342f) ? true : AbstractC3255y.d(a8, a.d.f37343f))) {
                throw new O5.p();
            }
            m4927getTextPjHm6EE = KeyboardType.Companion.m4927getTextPjHm6EE();
        }
        this.f37332f = m4927getTextPjHm6EE;
        this.f37333g = "postal_code_text";
        this.f37334h = new Z(a8);
        this.f37335i = AbstractC3700N.a(Boolean.FALSE);
    }

    @Override // p4.v0
    public Integer b() {
        return Integer.valueOf(this.f37327a);
    }

    @Override // p4.v0
    public String c(String rawValue) {
        AbstractC3255y.i(rawValue, "rawValue");
        return new j6.j("\\s+").f(rawValue, "");
    }

    @Override // p4.v0
    public VisualTransformation e() {
        return this.f37334h;
    }

    @Override // p4.v0
    public String f() {
        return v0.a.a(this);
    }

    @Override // p4.v0
    public int g() {
        return this.f37331e;
    }

    @Override // p4.v0
    public String h(String displayName) {
        AbstractC3255y.i(displayName, "displayName");
        return displayName;
    }

    @Override // p4.v0
    public int i() {
        return this.f37332f;
    }

    @Override // p4.v0
    public String j(String userTyped) {
        boolean d8;
        AbstractC3255y.i(userTyped, "userTyped");
        a aVar = this.f37330d;
        int i8 = 0;
        if (AbstractC3255y.d(aVar, a.e.f37344f)) {
            StringBuilder sb = new StringBuilder();
            int length = userTyped.length();
            while (i8 < length) {
                char charAt = userTyped.charAt(i8);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
                i8++;
            }
            userTyped = sb.toString();
            AbstractC3255y.h(userTyped, "toString(...)");
        } else {
            if (AbstractC3255y.d(aVar, a.C0829a.f37341f)) {
                d8 = true;
            } else {
                d8 = AbstractC3255y.d(aVar, a.c.f37342f);
            }
            if (d8) {
                StringBuilder sb2 = new StringBuilder();
                int length2 = userTyped.length();
                while (i8 < length2) {
                    char charAt2 = userTyped.charAt(i8);
                    if (Character.isLetterOrDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                    i8++;
                }
                String sb3 = sb2.toString();
                AbstractC3255y.h(sb3, "toString(...)");
                userTyped = sb3.toUpperCase(Locale.ROOT);
                AbstractC3255y.h(userTyped, "toUpperCase(...)");
            } else if (!AbstractC3255y.d(aVar, a.d.f37343f)) {
                throw new O5.p();
            }
        }
        return j6.n.U0(userTyped, this.f37330d.a());
    }

    @Override // p4.v0
    public String k() {
        return this.f37333g;
    }

    @Override // p4.v0
    public y0 l(String input) {
        AbstractC3255y.i(input, "input");
        return new b(input);
    }

    @Override // p4.v0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public o6.w a() {
        return this.f37335i;
    }

    @Override // p4.v0
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public o6.w d() {
        return this.f37328b;
    }

    public /* synthetic */ Y(int i8, o6.w wVar, String str, int i9, AbstractC3247p abstractC3247p) {
        this(i8, (i9 & 2) != 0 ? AbstractC3700N.a(null) : wVar, str);
    }
}
