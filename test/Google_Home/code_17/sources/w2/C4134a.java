package w2;

import P5.AbstractC1378t;
import j6.n;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: w2.a */
/* loaded from: classes4.dex */
public final class C4134a extends AbstractC4144k {

    /* renamed from: f */
    public static final C0915a f40352f = new C0915a(null);

    /* renamed from: w2.a$a */
    /* loaded from: classes4.dex */
    public static final class C0915a {
        private C0915a() {
        }

        public static /* synthetic */ C4134a b(C0915a c0915a, IOException iOException, String str, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                str = null;
            }
            return c0915a.a(iOException, str);
        }

        public final /* synthetic */ C4134a a(IOException e8, String str) {
            AbstractC3255y.i(e8, "e");
            String str2 = "(" + str + ")";
            if (str == null || n.u(str)) {
                str2 = null;
            }
            return new C4134a("IOException during API request to " + AbstractC1378t.w0(AbstractC1378t.r("Stripe", str2), " ", null, null, 0, null, null, 62, null) + ": " + e8.getMessage() + ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", e8);
        }

        public /* synthetic */ C0915a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C4134a(String str, Throwable th) {
        super(null, null, 0, th, str, 7, null);
    }

    @Override // w2.AbstractC4144k
    public String a() {
        return "connectionError";
    }
}
