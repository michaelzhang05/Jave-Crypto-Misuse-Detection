package r3;

import L5.I;
import Y2.h;
import android.content.Context;
import c4.InterfaceC1925a;
import com.stripe.android.paymentsheet.u;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f37657a = new j();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37658a = new a();

        a() {
            super(1);
        }

        public final void a(T2.e it) {
            AbstractC3159y.i(it, "it");
            throw new IllegalStateException("`InlineSignUpViewState` updates should not be received by `FormController`!");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((T2.e) obj);
            return I.f6487a;
        }
    }

    private j() {
    }

    public final X2.h a(Context context, String merchantName, Map initialValues, Map map) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(merchantName, "merchantName");
        AbstractC3159y.i(initialValues, "initialValues");
        Context applicationContext = context.getApplicationContext();
        AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
        return new X2.h(new h.a(new l2.j(applicationContext), null, initialValues, map, false, merchantName, InterfaceC1925a.c.f14983a, new u.d(null, null, null, null, false, 31, null), false, a.f37658a));
    }
}
