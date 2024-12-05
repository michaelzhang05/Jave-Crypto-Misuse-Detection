package M2;

import com.stripe.android.googlepaylauncher.h;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import r0.C3905m;

/* loaded from: classes4.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final a f6471a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final C3905m a(h.d googlePayConfig, L2.h paymentsClientFactory) {
            AbstractC3255y.i(googlePayConfig, "googlePayConfig");
            AbstractC3255y.i(paymentsClientFactory, "paymentsClientFactory");
            return paymentsClientFactory.a(googlePayConfig.g());
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }
}
