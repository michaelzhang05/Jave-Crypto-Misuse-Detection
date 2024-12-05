package M3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public interface V {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f6826a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.p f6827b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f6828c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f6829d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f6830e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f6831f;

        public a(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3255y.i(paymentOptionsItems, "paymentOptionsItems");
            this.f6826a = paymentOptionsItems;
            this.f6827b = pVar;
            this.f6828c = z8;
            this.f6829d = z9;
            this.f6830e = z10;
            this.f6831f = z11;
        }

        public static /* synthetic */ a b(a aVar, List list, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = aVar.f6826a;
            }
            if ((i8 & 2) != 0) {
                pVar = aVar.f6827b;
            }
            com.stripe.android.paymentsheet.p pVar2 = pVar;
            if ((i8 & 4) != 0) {
                z8 = aVar.f6828c;
            }
            boolean z12 = z8;
            if ((i8 & 8) != 0) {
                z9 = aVar.f6829d;
            }
            boolean z13 = z9;
            if ((i8 & 16) != 0) {
                z10 = aVar.f6830e;
            }
            boolean z14 = z10;
            if ((i8 & 32) != 0) {
                z11 = aVar.f6831f;
            }
            return aVar.a(list, pVar2, z12, z13, z14, z11);
        }

        public final a a(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3255y.i(paymentOptionsItems, "paymentOptionsItems");
            return new a(paymentOptionsItems, pVar, z8, z9, z10, z11);
        }

        public final boolean c() {
            return this.f6830e;
        }

        public final List d() {
            return this.f6826a;
        }

        public final com.stripe.android.paymentsheet.p e() {
            return this.f6827b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f6826a, aVar.f6826a) && AbstractC3255y.d(this.f6827b, aVar.f6827b) && this.f6828c == aVar.f6828c && this.f6829d == aVar.f6829d && this.f6830e == aVar.f6830e && this.f6831f == aVar.f6831f) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f6828c;
        }

        public final boolean g() {
            return this.f6829d;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f6826a.hashCode() * 31;
            com.stripe.android.paymentsheet.p pVar = this.f6827b;
            if (pVar == null) {
                hashCode = 0;
            } else {
                hashCode = pVar.hashCode();
            }
            return ((((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f6828c)) * 31) + androidx.compose.foundation.a.a(this.f6829d)) * 31) + androidx.compose.foundation.a.a(this.f6830e)) * 31) + androidx.compose.foundation.a.a(this.f6831f);
        }

        public String toString() {
            return "State(paymentOptionsItems=" + this.f6826a + ", selectedPaymentOptionsItem=" + this.f6827b + ", isEditing=" + this.f6828c + ", isProcessing=" + this.f6829d + ", canEdit=" + this.f6830e + ", canRemove=" + this.f6831f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6832a = new a();

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
                return 792087598;
            }

            public String toString() {
                return "AddCardPressed";
            }
        }

        /* renamed from: M3.V$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0120b extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f6833b = com.stripe.android.model.o.f25462u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f6834a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0120b(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f6834a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f6834a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0120b) && AbstractC3255y.d(this.f6834a, ((C0120b) obj).f6834a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6834a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f6834a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f6835b = com.stripe.android.model.o.f25462u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f6836a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f6836a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f6836a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3255y.d(this.f6836a, ((c) obj).f6836a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6836a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f6836a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            private final B3.f f6837a;

            public d(B3.f fVar) {
                super(null);
                this.f6837a = fVar;
            }

            public final B3.f a() {
                return this.f6837a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof d) && AbstractC3255y.d(this.f6837a, ((d) obj).f6837a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                B3.f fVar = this.f6837a;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(selection=" + this.f6837a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f6838a = new e();

            private e() {
                super(null);
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof e)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2007142043;
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
