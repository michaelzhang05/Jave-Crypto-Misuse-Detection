package W2;

import N2.d;
import O5.p;
import P5.AbstractC1378t;
import P5.a0;
import j6.n;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import y2.C4203b;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: i, reason: collision with root package name */
    public static final a f11434i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final int f11435j = 8;

    /* renamed from: a, reason: collision with root package name */
    private final m f11436a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11437b;

    /* renamed from: c, reason: collision with root package name */
    private final k f11438c;

    /* renamed from: d, reason: collision with root package name */
    private final List f11439d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f11440e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f11441f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f11442g;

    /* renamed from: h, reason: collision with root package name */
    private final X2.a f11443h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: W2.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0240a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f11444a;

            static {
                int[] iArr = new int[k.values().length];
                try {
                    iArr[k.f11623a.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[k.f11624b.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f11444a = iArr;
            }
        }

        private a() {
        }

        public final e a(k signupMode, N2.d config) {
            boolean z8;
            Set b12;
            AbstractC3255y.i(signupMode, "signupMode");
            AbstractC3255y.i(config, "config");
            boolean z9 = false;
            if (signupMode == k.f11624b) {
                z8 = true;
            } else {
                z8 = false;
            }
            d.b a8 = config.a();
            List c8 = AbstractC1378t.c();
            String b8 = a8.b();
            if (b8 == null || n.u(b8)) {
                z9 = true;
            }
            boolean z10 = !z9;
            if (z8 && z10) {
                c8.add(j.f11619b);
                c8.add(j.f11618a);
            } else if (z8) {
                c8.add(j.f11618a);
                c8.add(j.f11619b);
            } else {
                c8.add(j.f11618a);
                c8.add(j.f11619b);
            }
            if (!AbstractC3255y.d(config.l().m(), C4203b.Companion.b().b())) {
                c8.add(j.f11620c);
            }
            List a9 = AbstractC1378t.a(c8);
            int i8 = C0240a.f11444a[signupMode.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    b12 = a0.l(AbstractC1378t.b1(a9), AbstractC1378t.m0(a9));
                } else {
                    throw new p();
                }
            } else {
                b12 = AbstractC1378t.b1(a9);
            }
            return new e(null, config.h(), signupMode, a9, b12, false, false, null, 224, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11445a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f11624b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f11623a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11445a = iArr;
        }
    }

    public e(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, X2.a signUpState) {
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(fields, "fields");
        AbstractC3255y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3255y.i(signUpState, "signUpState");
        this.f11436a = mVar;
        this.f11437b = merchantName;
        this.f11438c = kVar;
        this.f11439d = fields;
        this.f11440e = prefillEligibleFields;
        this.f11441f = z8;
        this.f11442g = z9;
        this.f11443h = signUpState;
    }

    public static /* synthetic */ e b(e eVar, m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, X2.a aVar, int i8, Object obj) {
        m mVar2;
        String str2;
        k kVar2;
        List list2;
        Set set2;
        boolean z10;
        boolean z11;
        X2.a aVar2;
        if ((i8 & 1) != 0) {
            mVar2 = eVar.f11436a;
        } else {
            mVar2 = mVar;
        }
        if ((i8 & 2) != 0) {
            str2 = eVar.f11437b;
        } else {
            str2 = str;
        }
        if ((i8 & 4) != 0) {
            kVar2 = eVar.f11438c;
        } else {
            kVar2 = kVar;
        }
        if ((i8 & 8) != 0) {
            list2 = eVar.f11439d;
        } else {
            list2 = list;
        }
        if ((i8 & 16) != 0) {
            set2 = eVar.f11440e;
        } else {
            set2 = set;
        }
        if ((i8 & 32) != 0) {
            z10 = eVar.f11441f;
        } else {
            z10 = z8;
        }
        if ((i8 & 64) != 0) {
            z11 = eVar.f11442g;
        } else {
            z11 = z9;
        }
        if ((i8 & 128) != 0) {
            aVar2 = eVar.f11443h;
        } else {
            aVar2 = aVar;
        }
        return eVar.a(mVar2, str2, kVar2, list2, set2, z10, z11, aVar2);
    }

    public final e a(m mVar, String merchantName, k kVar, List fields, Set prefillEligibleFields, boolean z8, boolean z9, X2.a signUpState) {
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(fields, "fields");
        AbstractC3255y.i(prefillEligibleFields, "prefillEligibleFields");
        AbstractC3255y.i(signUpState, "signUpState");
        return new e(mVar, merchantName, kVar, fields, prefillEligibleFields, z8, z9, signUpState);
    }

    public final List c() {
        return this.f11439d;
    }

    public final String d() {
        return this.f11437b;
    }

    public final Set e() {
        return this.f11440e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3255y.d(this.f11436a, eVar.f11436a) && AbstractC3255y.d(this.f11437b, eVar.f11437b) && this.f11438c == eVar.f11438c && AbstractC3255y.d(this.f11439d, eVar.f11439d) && AbstractC3255y.d(this.f11440e, eVar.f11440e) && this.f11441f == eVar.f11441f && this.f11442g == eVar.f11442g && this.f11443h == eVar.f11443h) {
            return true;
        }
        return false;
    }

    public final X2.a f() {
        return this.f11443h;
    }

    public final k g() {
        return this.f11438c;
    }

    public final boolean h() {
        int i8;
        k kVar = this.f11438c;
        if (kVar == null) {
            i8 = -1;
        } else {
            i8 = b.f11445a[kVar.ordinal()];
        }
        if (i8 == -1) {
            return false;
        }
        if (i8 != 1) {
            if (i8 == 2) {
                if (!this.f11441f || this.f11442g) {
                    return false;
                }
            } else {
                throw new p();
            }
        } else if (this.f11436a == null || this.f11442g) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        m mVar = this.f11436a;
        int i8 = 0;
        if (mVar == null) {
            hashCode = 0;
        } else {
            hashCode = mVar.hashCode();
        }
        int hashCode2 = ((hashCode * 31) + this.f11437b.hashCode()) * 31;
        k kVar = this.f11438c;
        if (kVar != null) {
            i8 = kVar.hashCode();
        }
        return ((((((((((hashCode2 + i8) * 31) + this.f11439d.hashCode()) * 31) + this.f11440e.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f11441f)) * 31) + androidx.compose.foundation.a.a(this.f11442g)) * 31) + this.f11443h.hashCode();
    }

    public final m i() {
        return this.f11436a;
    }

    public final boolean j() {
        return this.f11441f;
    }

    public final boolean k() {
        if (AbstractC1378t.m0(this.f11439d) == j.f11618a) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        if (AbstractC1378t.m0(this.f11439d) == j.f11619b) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "InlineSignupViewState(userInput=" + this.f11436a + ", merchantName=" + this.f11437b + ", signupMode=" + this.f11438c + ", fields=" + this.f11439d + ", prefillEligibleFields=" + this.f11440e + ", isExpanded=" + this.f11441f + ", apiFailed=" + this.f11442g + ", signUpState=" + this.f11443h + ")";
    }

    public /* synthetic */ e(m mVar, String str, k kVar, List list, Set set, boolean z8, boolean z9, X2.a aVar, int i8, AbstractC3247p abstractC3247p) {
        this(mVar, str, kVar, list, set, (i8 & 32) != 0 ? false : z8, (i8 & 64) != 0 ? false : z9, (i8 & 128) != 0 ? X2.a.f12741a : aVar);
    }
}
