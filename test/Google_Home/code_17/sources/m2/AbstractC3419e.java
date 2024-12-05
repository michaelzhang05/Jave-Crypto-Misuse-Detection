package m2;

import com.stripe.android.model.b;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import e3.InterfaceC2795i;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: m2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3419e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34946a = new a(null);

    /* renamed from: m2.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final AbstractC3419e a(String clientSecret, b.d dVar) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            if (n.c.f25424c.a(clientSecret)) {
                return new C3417c(clientSecret, dVar);
            }
            if (u.b.f25769c.a(clientSecret)) {
                return new C3418d(clientSecret);
            }
            throw new IllegalStateException(("Encountered an invalid client secret \"" + clientSecret + "\"").toString());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public /* synthetic */ AbstractC3419e(AbstractC3247p abstractC3247p) {
        this();
    }

    public final InterfaceC2795i a(com.stripe.android.model.o paymentMethod, com.stripe.android.model.r rVar) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        String str = paymentMethod.f25463a;
        if (str == null) {
            str = "";
        }
        return c(str, paymentMethod.f25467e, rVar);
    }

    public abstract InterfaceC2795i b(com.stripe.android.model.p pVar, com.stripe.android.model.r rVar);

    public abstract InterfaceC2795i c(String str, o.p pVar, com.stripe.android.model.r rVar);

    private AbstractC3419e() {
    }
}
