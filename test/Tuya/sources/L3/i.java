package L3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import q3.C3654g;

/* loaded from: classes4.dex */
public interface i {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f6257a;

        /* renamed from: b, reason: collision with root package name */
        private final C3654g f6258b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f6259c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f6260d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f6261e;

        public a(List paymentMethods, C3654g c3654g, boolean z8, boolean z9, boolean z10) {
            AbstractC3159y.i(paymentMethods, "paymentMethods");
            this.f6257a = paymentMethods;
            this.f6258b = c3654g;
            this.f6259c = z8;
            this.f6260d = z9;
            this.f6261e = z10;
        }

        public final boolean a() {
            return this.f6261e;
        }

        public final boolean b() {
            return this.f6260d;
        }

        public final C3654g c() {
            return this.f6258b;
        }

        public final List d() {
            return this.f6257a;
        }

        public final boolean e() {
            return this.f6259c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f6257a, aVar.f6257a) && AbstractC3159y.d(this.f6258b, aVar.f6258b) && this.f6259c == aVar.f6259c && this.f6260d == aVar.f6260d && this.f6261e == aVar.f6261e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f6257a.hashCode() * 31;
            C3654g c3654g = this.f6258b;
            if (c3654g == null) {
                hashCode = 0;
            } else {
                hashCode = c3654g.hashCode();
            }
            return ((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f6259c)) * 31) + androidx.compose.foundation.a.a(this.f6260d)) * 31) + androidx.compose.foundation.a.a(this.f6261e);
        }

        public String toString() {
            return "State(paymentMethods=" + this.f6257a + ", currentSelection=" + this.f6258b + ", isEditing=" + this.f6259c + ", canRemove=" + this.f6260d + ", canEdit=" + this.f6261e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6262a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C3654g paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6262a = paymentMethod;
            }

            public final C3654g a() {
                return this.f6262a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3159y.d(this.f6262a, ((a) obj).f6262a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6262a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f6262a + ")";
            }
        }

        /* renamed from: L3.i$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0133b extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6263a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0133b(C3654g paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6263a = paymentMethod;
            }

            public final C3654g a() {
                return this.f6263a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0133b) && AbstractC3159y.d(this.f6263a, ((C0133b) obj).f6263a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6263a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f6263a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6264a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(C3654g paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f6264a = paymentMethod;
            }

            public final C3654g a() {
                return this.f6264a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3159y.d(this.f6264a, ((c) obj).f6264a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6264a.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(paymentMethod=" + this.f6264a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final d f6265a = new d();

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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    boolean a();

    void b(b bVar);

    void close();

    InterfaceC3349K getState();
}
