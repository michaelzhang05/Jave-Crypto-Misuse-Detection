package L3;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import q3.C3654g;

/* loaded from: classes4.dex */
public interface f {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C3654g f6228a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6229b;

        public a(C3654g paymentMethod, boolean z8) {
            AbstractC3159y.i(paymentMethod, "paymentMethod");
            this.f6228a = paymentMethod;
            this.f6229b = z8;
        }

        public final C3654g a() {
            return this.f6228a;
        }

        public final boolean b() {
            return this.f6229b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f6228a, aVar.f6228a) && this.f6229b == aVar.f6229b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f6228a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6229b);
        }

        public String toString() {
            return "State(paymentMethod=" + this.f6228a + ", isLiveMode=" + this.f6229b + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6230a = new a();

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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    void a(b bVar);

    a getState();
}
