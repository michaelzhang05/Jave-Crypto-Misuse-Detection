package x3;

import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public abstract class Z {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39305a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EventReporter.Mode a() {
            return EventReporter.Mode.f25723b;
        }

        public final boolean b() {
            return false;
        }

        public final Set c() {
            return M5.a0.d("PaymentSheet");
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }
}
