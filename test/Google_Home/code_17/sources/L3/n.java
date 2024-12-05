package L3;

import O5.p;
import P5.AbstractC1378t;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.model.o;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.C3427m;
import t3.w;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final a f6076g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f6077h = C3427m.a.f34983d;

    /* renamed from: a, reason: collision with root package name */
    private final c f6078a;

    /* renamed from: b, reason: collision with root package name */
    private final b f6079b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6080c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6081d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f6082e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f6083f;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: L3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0106a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f6084a;

            static {
                int[] iArr = new int[h.b.EnumC0472b.values().length];
                try {
                    iArr[h.b.EnumC0472b.f24987b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.b.EnumC0472b.f24988c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f6084a = iArr;
            }
        }

        private a() {
        }

        public final n a(Boolean bool, String str, boolean z8, B3.b googlePayButtonType, boolean z9, List paymentMethodTypes, h.d dVar, Function0 onGooglePayPressed, Function0 onLinkPressed, boolean z10) {
            c cVar;
            boolean z11;
            C3427m.a aVar;
            int i8;
            C3427m.a.b bVar;
            AbstractC3255y.i(googlePayButtonType, "googlePayButtonType");
            AbstractC3255y.i(paymentMethodTypes, "paymentMethodTypes");
            AbstractC3255y.i(onGooglePayPressed, "onGooglePayPressed");
            AbstractC3255y.i(onLinkPressed, "onLinkPressed");
            c cVar2 = new c(str);
            if (AbstractC3255y.d(bool, Boolean.TRUE)) {
                cVar = cVar2;
            } else {
                cVar = null;
            }
            if (dVar != null) {
                z11 = dVar.a();
            } else {
                z11 = false;
            }
            if (dVar != null) {
                boolean g8 = dVar.b().g();
                int i9 = C0106a.f6084a[dVar.b().a().ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        bVar = C3427m.a.b.f34988c;
                    } else {
                        throw new p();
                    }
                } else {
                    bVar = C3427m.a.b.f34987b;
                }
                aVar = new C3427m.a(g8, bVar, dVar.b().b());
            } else {
                aVar = null;
            }
            b bVar2 = new b(googlePayButtonType, z11, aVar);
            if (!z8) {
                bVar2 = null;
            }
            if (cVar == null && bVar2 == null) {
                return null;
            }
            Object M02 = AbstractC1378t.M0(paymentMethodTypes);
            o.p pVar = o.p.f25587i;
            if (AbstractC3255y.d(M02, pVar.f25605a) && !z10) {
                i8 = w.f39762P;
            } else if (AbstractC1378t.M0(paymentMethodTypes) == null && !z10) {
                i8 = w.f39761O;
            } else if (AbstractC3255y.d(AbstractC1378t.M0(paymentMethodTypes), pVar.f25605a) && z10) {
                i8 = w.f39764R;
            } else {
                i8 = w.f39763Q;
            }
            return new n(cVar, bVar2, z9, i8, onGooglePayPressed, onLinkPressed);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f6085d = C3427m.a.f34983d;

        /* renamed from: a, reason: collision with root package name */
        private final B3.b f6086a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6087b;

        /* renamed from: c, reason: collision with root package name */
        private final C3427m.a f6088c;

        public b(B3.b buttonType, boolean z8, C3427m.a aVar) {
            AbstractC3255y.i(buttonType, "buttonType");
            this.f6086a = buttonType;
            this.f6087b = z8;
            this.f6088c = aVar;
        }

        public final boolean a() {
            return this.f6087b;
        }

        public final C3427m.a b() {
            return this.f6088c;
        }

        public final B3.b c() {
            return this.f6086a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f6086a == bVar.f6086a && this.f6087b == bVar.f6087b && AbstractC3255y.d(this.f6088c, bVar.f6088c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f6086a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6087b)) * 31;
            C3427m.a aVar = this.f6088c;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "GooglePay(buttonType=" + this.f6086a + ", allowCreditCards=" + this.f6087b + ", billingAddressParameters=" + this.f6088c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f6089a;

        public c(String str) {
            this.f6089a = str;
        }

        public final String a() {
            return this.f6089a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3255y.d(this.f6089a, ((c) obj).f6089a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f6089a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Link(email=" + this.f6089a + ")";
        }
    }

    public n(c cVar, b bVar, boolean z8, int i8, Function0 onGooglePayPressed, Function0 onLinkPressed) {
        AbstractC3255y.i(onGooglePayPressed, "onGooglePayPressed");
        AbstractC3255y.i(onLinkPressed, "onLinkPressed");
        this.f6078a = cVar;
        this.f6079b = bVar;
        this.f6080c = z8;
        this.f6081d = i8;
        this.f6082e = onGooglePayPressed;
        this.f6083f = onLinkPressed;
    }

    public final boolean a() {
        return this.f6080c;
    }

    public final int b() {
        return this.f6081d;
    }

    public final b c() {
        return this.f6079b;
    }

    public final c d() {
        return this.f6078a;
    }

    public final Function0 e() {
        return this.f6082e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3255y.d(this.f6078a, nVar.f6078a) && AbstractC3255y.d(this.f6079b, nVar.f6079b) && this.f6080c == nVar.f6080c && this.f6081d == nVar.f6081d && AbstractC3255y.d(this.f6082e, nVar.f6082e) && AbstractC3255y.d(this.f6083f, nVar.f6083f)) {
            return true;
        }
        return false;
    }

    public final Function0 f() {
        return this.f6083f;
    }

    public int hashCode() {
        int hashCode;
        c cVar = this.f6078a;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = hashCode * 31;
        b bVar = this.f6079b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((((((((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f6080c)) * 31) + this.f6081d) * 31) + this.f6082e.hashCode()) * 31) + this.f6083f.hashCode();
    }

    public String toString() {
        return "WalletsState(link=" + this.f6078a + ", googlePay=" + this.f6079b + ", buttonsEnabled=" + this.f6080c + ", dividerTextResource=" + this.f6081d + ", onGooglePayPressed=" + this.f6082e + ", onLinkPressed=" + this.f6083f + ")";
    }
}
