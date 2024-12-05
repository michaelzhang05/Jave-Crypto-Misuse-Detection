package j2;

import b3.InterfaceC1874i;
import com.stripe.android.model.b;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import com.stripe.android.model.u;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: j2.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3065e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32970a = new a(null);

    /* renamed from: j2.e$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final AbstractC3065e a(String clientSecret, b.d dVar) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            if (n.c.f24369c.a(clientSecret)) {
                return new C3063c(clientSecret, dVar);
            }
            if (u.b.f24714c.a(clientSecret)) {
                return new C3064d(clientSecret);
            }
            throw new IllegalStateException(("Encountered an invalid client secret \"" + clientSecret + "\"").toString());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public /* synthetic */ AbstractC3065e(AbstractC3151p abstractC3151p) {
        this();
    }

    public final InterfaceC1874i a(com.stripe.android.model.o paymentMethod, com.stripe.android.model.r rVar) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        String str = paymentMethod.f24408a;
        if (str == null) {
            str = "";
        }
        return c(str, paymentMethod.f24412e, rVar);
    }

    public abstract InterfaceC1874i b(com.stripe.android.model.p pVar, com.stripe.android.model.r rVar);

    public abstract InterfaceC1874i c(String str, o.p pVar, com.stripe.android.model.r rVar);

    private AbstractC3065e() {
    }
}
