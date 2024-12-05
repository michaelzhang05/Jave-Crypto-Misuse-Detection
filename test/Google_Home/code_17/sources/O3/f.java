package O3;

import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import t3.C4033g;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C4033g f8019a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8020b;

        public a(C4033g paymentMethod, boolean z8) {
            AbstractC3255y.i(paymentMethod, "paymentMethod");
            this.f8019a = paymentMethod;
            this.f8020b = z8;
        }

        public final C4033g a() {
            return this.f8019a;
        }

        public final boolean b() {
            return this.f8020b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f8019a, aVar.f8019a) && this.f8020b == aVar.f8020b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f8019a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f8020b);
        }

        public String toString() {
            return "State(paymentMethod=" + this.f8019a + ", isLiveMode=" + this.f8020b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8021a = new a();

            private a() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1323407824;
            }

            public String toString() {
                return "DeletePaymentMethod";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    void a(b bVar);

    a getState();
}
