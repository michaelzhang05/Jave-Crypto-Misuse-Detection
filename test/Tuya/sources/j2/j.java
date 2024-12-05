package J2;

import com.stripe.android.googlepaylauncher.h;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import s0.C3723m;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f4765a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C3723m a(h.d googlePayConfig, I2.h paymentsClientFactory) {
            AbstractC3159y.i(googlePayConfig, "googlePayConfig");
            AbstractC3159y.i(paymentsClientFactory, "paymentsClientFactory");
            return paymentsClientFactory.a(googlePayConfig.e());
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }
}
