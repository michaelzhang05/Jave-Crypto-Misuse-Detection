package t2;

import M5.AbstractC1246t;
import g6.n;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: t2.a */
/* loaded from: classes4.dex */
public final class C3780a extends AbstractC3790k {

    /* renamed from: f */
    public static final C0881a f38225f = new C0881a(null);

    /* renamed from: t2.a$a */
    /* loaded from: classes4.dex */
    public static final class C0881a {
        private C0881a() {
        }

        public static /* synthetic */ C3780a b(C0881a c0881a, IOException iOException, String str, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                str = null;
            }
            return c0881a.a(iOException, str);
        }

        public final /* synthetic */ C3780a a(IOException e8, String str) {
            AbstractC3159y.i(e8, "e");
            String str2 = "(" + str + ")";
            if (str == null || n.u(str)) {
                str2 = null;
            }
            return new C3780a("IOException during API request to " + AbstractC1246t.w0(AbstractC1246t.r("Stripe", str2), " ", null, null, 0, null, null, 62, null) + ": " + e8.getMessage() + ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", e8);
        }

        public /* synthetic */ C0881a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C3780a(String str, Throwable th) {
        super(null, null, 0, th, str, 7, null);
    }

    @Override // t2.AbstractC3790k
    public String a() {
        return "connectionError";
    }
}
