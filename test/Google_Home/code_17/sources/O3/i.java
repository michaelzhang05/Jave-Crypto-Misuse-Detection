package O3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import t3.C4033g;

/* loaded from: classes4.dex */
public interface i {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f8048a;

        /* renamed from: b, reason: collision with root package name */
        private final C4033g f8049b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f8050c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f8051d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f8052e;

        public a(List paymentMethods, C4033g c4033g, boolean z8, boolean z9, boolean z10) {
            AbstractC3255y.i(paymentMethods, "paymentMethods");
            this.f8048a = paymentMethods;
            this.f8049b = c4033g;
            this.f8050c = z8;
            this.f8051d = z9;
            this.f8052e = z10;
        }

        public final boolean a() {
            return this.f8052e;
        }

        public final boolean b() {
            return this.f8051d;
        }

        public final C4033g c() {
            return this.f8049b;
        }

        public final List d() {
            return this.f8048a;
        }

        public final boolean e() {
            return this.f8050c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f8048a, aVar.f8048a) && AbstractC3255y.d(this.f8049b, aVar.f8049b) && this.f8050c == aVar.f8050c && this.f8051d == aVar.f8051d && this.f8052e == aVar.f8052e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f8048a.hashCode() * 31;
            C4033g c4033g = this.f8049b;
            if (c4033g == null) {
                hashCode = 0;
            } else {
                hashCode = c4033g.hashCode();
            }
            return ((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f8050c)) * 31) + androidx.compose.foundation.a.a(this.f8051d)) * 31) + androidx.compose.foundation.a.a(this.f8052e);
        }

        public String toString() {
            return "State(paymentMethods=" + this.f8048a + ", currentSelection=" + this.f8049b + ", isEditing=" + this.f8050c + ", canRemove=" + this.f8051d + ", canEdit=" + this.f8052e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C4033g f8053a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C4033g paymentMethod) {
                super(null);
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f8053a = paymentMethod;
            }

            public final C4033g a() {
                return this.f8053a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3255y.d(this.f8053a, ((a) obj).f8053a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8053a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f8053a + ")";
            }
        }

        /* renamed from: O3.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0161b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C4033g f8054a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0161b(C4033g paymentMethod) {
                super(null);
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f8054a = paymentMethod;
            }

            public final C4033g a() {
                return this.f8054a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0161b) && AbstractC3255y.d(this.f8054a, ((C0161b) obj).f8054a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8054a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f8054a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C4033g f8055a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C4033g paymentMethod) {
                super(null);
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f8055a = paymentMethod;
            }

            public final C4033g a() {
                return this.f8055a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3255y.d(this.f8055a, ((c) obj).f8055a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8055a.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(paymentMethod=" + this.f8055a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f8056a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1354134144;
            }

            public String toString() {
                return "ToggleEdit";
            }
        }

        private b() {
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    void a(b bVar);

    boolean c();

    void close();

    InterfaceC3698L getState();
}
