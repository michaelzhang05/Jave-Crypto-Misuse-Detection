package T2;

import K2.d;
import L5.p;
import M5.AbstractC1246t;
import M5.a0;
import g6.n;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import v2.C3826b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final a f9777i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f9778j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f9779a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9780b;

    /* renamed from: c, reason: collision with root package name */
    private final k f9781c;

    /* renamed from: d, reason: collision with root package name */
    private final List f9782d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f9783e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9784f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f9785g;

    /* renamed from: h, reason: collision with root package name */
    private final U2.a f9786h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: T2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0215a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9787a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.f9966a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.f9967b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f9787a = iArr;
            }
        }

        private a() {
        }

        public final e a(k signupMode, K2.d config) {
            boolean z8;
            Set b12;
            AbstractC3159y.i(signupMode, "signupMode");
            AbstractC3159y.i(config, "config");
            boolean z9 = false;
            if (signupMode == k.f9967b) {
                z8 = true;
            } else {
                z8 = false;
            }
            d.b b8 = config.b();
            List c8 = AbstractC1246t.c();
            String c9 = b8.c();
            if (c9 == null || n.u(c9)) {
                z9 = true;
            }
            boolean z10 = !z9;
            if (z8 && z10) {
                c8.add(j.f9962b);
                c8.add(j.f9961a);
            } else if (z8) {
                c8.add(j.f9961a);
                c8.add(j.f9962b);
            } else {
                c8.add(j.f9961a);
                c8.add(j.f9962b);
            }
            if (!AbstractC3159y.d(config.j().p(), C3826b.Companion.b().c())) {
                c8.add(j.f9963c);
            }
            List a8 = AbstractC1246t.a(c8);
            int i8 = C0215a.f9787a[signupMode.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    b12 = a0.l(AbstractC1246t.b1(a8), AbstractC1246t.m0(a8));
                } else {
                    throw new p();
                }
            } else {
                b12 = AbstractC1246t.b1(a8);
            }
            return new e(null, config.f(), signupMode, a8, b12, false, false, null, 224, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9788a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f9967b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f9966a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9788a = iArr;
        }
    }

    public e(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, U2.a signUpState) {
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(fields, "fields");
        AbstractC3159y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3159y.i(signUpState, "signUpState");
        this.f9779a = mVar;
        this.f9780b = merchantName;
        this.f9781c = kVar;
        this.f9782d = fields;
        this.f9783e = prefillEligibleFields;
        this.f9784f = z8;
        this.f9785g = z9;
        this.f9786h = signUpState;
    }

    public static /* synthetic */ e b(e eVar, m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, U2.a aVar, int i8, Object obj) {
        m mVar2;
        String str2;
        k kVar2;
        List list2;
        Set set2;
        boolean z10;
        boolean z11;
        U2.a aVar2;
        if ((i8 & 1) != 0) {
            mVar2 = eVar.f9779a;
        } else {
            mVar2 = mVar;
        }
        if ((i8 & 2) != 0) {
            str2 = eVar.f9780b;
        } else {
            str2 = str;
        }
        if ((i8 & 4) != 0) {
            kVar2 = eVar.f9781c;
        } else {
            kVar2 = kVar;
        }
        if ((i8 & 8) != 0) {
            list2 = eVar.f9782d;
        } else {
            list2 = list;
        }
        if ((i8 & 16) != 0) {
            set2 = eVar.f9783e;
        } else {
            set2 = set;
        }
        if ((i8 & 32) != 0) {
            z10 = eVar.f9784f;
        } else {
            z10 = z8;
        }
        if ((i8 & 64) != 0) {
            z11 = eVar.f9785g;
        } else {
            z11 = z9;
        }
        if ((i8 & 128) != 0) {
            aVar2 = eVar.f9786h;
        } else {
            aVar2 = aVar;
        }
        return eVar.a(mVar2, str2, kVar2, list2, set2, z10, z11, aVar2);
    }

    public final e a(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, U2.a signUpState) {
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(fields, "fields");
        AbstractC3159y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3159y.i(signUpState, "signUpState");
        return new e(mVar, merchantName, kVar, fields, prefillEligibleFields, z8, z9, signUpState);
    }

    public final List c() {
        return this.f9782d;
    }

    public final String d() {
        return this.f9780b;
    }

    public final Set e() {
        return this.f9783e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f9779a, eVar.f9779a) && AbstractC3159y.d(this.f9780b, eVar.f9780b) && this.f9781c == eVar.f9781c && AbstractC3159y.d(this.f9782d, eVar.f9782d) && AbstractC3159y.d(this.f9783e, eVar.f9783e) && this.f9784f == eVar.f9784f && this.f9785g == eVar.f9785g && this.f9786h == eVar.f9786h) {
            return true;
        }
        return false;
    }

    public final U2.a f() {
        return this.f9786h;
    }

    public final k g() {
        return this.f9781c;
    }

    public final boolean h() {
        int i8;
        k kVar = this.f9781c;
        if (kVar == null) {
            i8 = -1;
        } else {
            i8 = b.f9788a[kVar.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                if (!this.f9784f || this.f9785g) {
                    return false;
                }
            } else {
                throw new p();
            }
        } else if (this.f9779a == null || this.f9785g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        m mVar = this.f9779a;
        int i8 = 0;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.f9780b.hashCode()) * 31;
        k kVar = this.f9781c;
        if (kVar != null) {
            i8 = kVar.hashCode();
        }
        return ((((((((((hashCode2 + i8) * 31) + this.f9782d.hashCode()) * 31) + this.f9783e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f9784f)) * 31) + androidx.compose.foundation.a.a(this.f9785g)) * 31) + this.f9786h.hashCode();
    }

    public final m i() {
        return this.f9779a;
    }

    public final boolean j() {
        return this.f9784f;
    }

    public final boolean k() {
        if (AbstractC1246t.m0(this.f9782d) == j.f9961a) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (AbstractC1246t.m0(this.f9782d) == j.f9962b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "InlineSignupViewState(userInput=" + this.f9779a + ", merchantName=" + this.f9780b + ", signupMode=" + this.f9781c + ", fields=" + this.f9782d + ", prefillEligibleFields=" + this.f9783e + ", isExpanded=" + this.f9784f + ", apiFailed=" + this.f9785g + ", signUpState=" + this.f9786h + ")";
    }

    public /* synthetic */ e(m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, U2.a aVar, int i8, AbstractC3151p abstractC3151p) {
        this(mVar, str, kVar, list, set, (i8 & 32) != 0 ? false : z8, (i8 & 64) != 0 ? false : z9, (i8 & 128) != 0 ? U2.a.f11070a : aVar);
    }
}
