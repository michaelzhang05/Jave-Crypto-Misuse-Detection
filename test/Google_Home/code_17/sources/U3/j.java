package u3;

import O5.I;
import a3.C1626h;
import android.content.Context;
import b3.InterfaceC1974h;
import com.stripe.android.paymentsheet.u;
import f4.InterfaceC2835a;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f40037a = new j();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40038a = new a();

        a() {
            super(1);
        }

        public final void a(W2.e it) {
            AbstractC3255y.i(it, "it");
            throw new IllegalStateException("`InlineSignUpViewState` updates should not be received by `FormController`!");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((W2.e) obj);
            return I.f8278a;
        }
    }

    private j() {
    }

    public final C1626h a(Context context, String merchantName, Map initialValues, Map map) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(merchantName, "merchantName");
        AbstractC3255y.i(initialValues, "initialValues");
        Context applicationContext = context.getApplicationContext();
        AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
        return new C1626h(new InterfaceC1974h.a(new o2.j(applicationContext), null, initialValues, map, false, merchantName, InterfaceC2835a.c.f31958a, new u.d(null, null, null, null, false, 31, null), false, a.f40038a));
    }
}
