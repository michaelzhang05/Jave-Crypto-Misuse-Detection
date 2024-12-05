package I3;

import L5.p;
import M5.AbstractC1246t;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.model.o;
import j2.C3073m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.w;
import y3.EnumC3987b;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: g, reason: collision with root package name */
    public static final a f4081g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f4082h = C3073m.a.f33007d;

    /* renamed from: a, reason: collision with root package name */
    private final c f4083a;

    /* renamed from: b, reason: collision with root package name */
    private final b f4084b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4085c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4086d;

    /* renamed from: e, reason: collision with root package name */
    private final Function0 f4087e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f4088f;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: I3.n$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0063a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f4089a;

            static {
                int[] iArr = new int[h.b.EnumC0476b.values().length];
                try {
                    iArr[h.b.EnumC0476b.f23932b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[h.b.EnumC0476b.f23933c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f4089a = iArr;
            }
        }

        private a() {
        }

        public final n a(Boolean bool, String str, boolean z8, EnumC3987b googlePayButtonType, boolean z9, List paymentMethodTypes, h.d dVar, Function0 onGooglePayPressed, Function0 onLinkPressed, boolean z10) {
            c cVar;
            boolean z11;
            C3073m.a aVar;
            int i8;
            C3073m.a.b bVar;
            AbstractC3159y.i(googlePayButtonType, "googlePayButtonType");
            AbstractC3159y.i(paymentMethodTypes, "paymentMethodTypes");
            AbstractC3159y.i(onGooglePayPressed, "onGooglePayPressed");
            AbstractC3159y.i(onLinkPressed, "onLinkPressed");
            c cVar2 = new c(str);
            if (AbstractC3159y.d(bool, Boolean.TRUE)) {
                cVar = cVar2;
            } else {
                cVar = null;
            }
            if (dVar != null) {
                z11 = dVar.b();
            } else {
                z11 = false;
            }
            if (dVar != null) {
                boolean e8 = dVar.c().e();
                int i9 = C0063a.f4089a[dVar.c().b().ordinal()];
                if (i9 != 1) {
                    if (i9 == 2) {
                        bVar = C3073m.a.b.f33012c;
                    } else {
                        throw new p();
                    }
                } else {
                    bVar = C3073m.a.b.f33011b;
                }
                aVar = new C3073m.a(e8, bVar, dVar.c().c());
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
            Object M02 = AbstractC1246t.M0(paymentMethodTypes);
            o.p pVar = o.p.f24532i;
            if (AbstractC3159y.d(M02, pVar.f24550a) && !z10) {
                i8 = w.f37440P;
            } else if (AbstractC1246t.M0(paymentMethodTypes) == null && !z10) {
                i8 = w.f37439O;
            } else if (AbstractC3159y.d(AbstractC1246t.M0(paymentMethodTypes), pVar.f24550a) && z10) {
                i8 = w.f37442R;
            } else {
                i8 = w.f37441Q;
            }
            return new n(cVar, bVar2, z9, i8, onGooglePayPressed, onLinkPressed);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final int f4090d = C3073m.a.f33007d;

        /* renamed from: a, reason: collision with root package name */
        private final EnumC3987b f4091a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f4092b;

        /* renamed from: c, reason: collision with root package name */
        private final C3073m.a f4093c;

        public b(EnumC3987b buttonType, boolean z8, C3073m.a aVar) {
            AbstractC3159y.i(buttonType, "buttonType");
            this.f4091a = buttonType;
            this.f4092b = z8;
            this.f4093c = aVar;
        }

        public final boolean a() {
            return this.f4092b;
        }

        public final C3073m.a b() {
            return this.f4093c;
        }

        public final EnumC3987b c() {
            return this.f4091a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f4091a == bVar.f4091a && this.f4092b == bVar.f4092b && AbstractC3159y.d(this.f4093c, bVar.f4093c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f4091a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f4092b)) * 31;
            C3073m.a aVar = this.f4093c;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "GooglePay(buttonType=" + this.f4091a + ", allowCreditCards=" + this.f4092b + ", billingAddressParameters=" + this.f4093c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f4094a;

        public c(String str) {
            this.f4094a = str;
        }

        public final String a() {
            return this.f4094a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof c) && AbstractC3159y.d(this.f4094a, ((c) obj).f4094a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            String str = this.f4094a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Link(email=" + this.f4094a + ")";
        }
    }

    public n(c cVar, b bVar, boolean z8, int i8, Function0 onGooglePayPressed, Function0 onLinkPressed) {
        AbstractC3159y.i(onGooglePayPressed, "onGooglePayPressed");
        AbstractC3159y.i(onLinkPressed, "onLinkPressed");
        this.f4083a = cVar;
        this.f4084b = bVar;
        this.f4085c = z8;
        this.f4086d = i8;
        this.f4087e = onGooglePayPressed;
        this.f4088f = onLinkPressed;
    }

    public final boolean a() {
        return this.f4085c;
    }

    public final int b() {
        return this.f4086d;
    }

    public final b c() {
        return this.f4084b;
    }

    public final c d() {
        return this.f4083a;
    }

    public final Function0 e() {
        return this.f4087e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (AbstractC3159y.d(this.f4083a, nVar.f4083a) && AbstractC3159y.d(this.f4084b, nVar.f4084b) && this.f4085c == nVar.f4085c && this.f4086d == nVar.f4086d && AbstractC3159y.d(this.f4087e, nVar.f4087e) && AbstractC3159y.d(this.f4088f, nVar.f4088f)) {
            return true;
        }
        return false;
    }

    public final Function0 f() {
        return this.f4088f;
    }

    public int hashCode() {
        int hashCode;
        c cVar = this.f4083a;
        int i8 = 0;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        int i9 = hashCode * 31;
        b bVar = this.f4084b;
        if (bVar != null) {
            i8 = bVar.hashCode();
        }
        return ((((((((i9 + i8) * 31) + androidx.compose.foundation.a.a(this.f4085c)) * 31) + this.f4086d) * 31) + this.f4087e.hashCode()) * 31) + this.f4088f.hashCode();
    }

    public String toString() {
        return "WalletsState(link=" + this.f4083a + ", googlePay=" + this.f4084b + ", buttonsEnabled=" + this.f4085c + ", dividerTextResource=" + this.f4086d + ", onGooglePayPressed=" + this.f4087e + ", onLinkPressed=" + this.f4088f + ")";
    }
}
