package J3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface V {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f5120a;

        /* renamed from: b, reason: collision with root package name */
        private final com.stripe.android.paymentsheet.p f5121b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f5122c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f5123d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f5124e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f5125f;

        public a(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
            this.f5120a = paymentOptionsItems;
            this.f5121b = pVar;
            this.f5122c = z8;
            this.f5123d = z9;
            this.f5124e = z10;
            this.f5125f = z11;
        }

        public static /* synthetic */ a b(a aVar, List list, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = aVar.f5120a;
            }
            if ((i8 & 2) != 0) {
                pVar = aVar.f5121b;
            }
            com.stripe.android.paymentsheet.p pVar2 = pVar;
            if ((i8 & 4) != 0) {
                z8 = aVar.f5122c;
            }
            boolean z12 = z8;
            if ((i8 & 8) != 0) {
                z9 = aVar.f5123d;
            }
            boolean z13 = z9;
            if ((i8 & 16) != 0) {
                z10 = aVar.f5124e;
            }
            boolean z14 = z10;
            if ((i8 & 32) != 0) {
                z11 = aVar.f5125f;
            }
            return aVar.a(list, pVar2, z12, z13, z14, z11);
        }

        public final a a(List paymentOptionsItems, com.stripe.android.paymentsheet.p pVar, boolean z8, boolean z9, boolean z10, boolean z11) {
            AbstractC3159y.i(paymentOptionsItems, "paymentOptionsItems");
            return new a(paymentOptionsItems, pVar, z8, z9, z10, z11);
        }

        public final boolean c() {
            return this.f5124e;
        }

        public final List d() {
            return this.f5120a;
        }

        public final com.stripe.android.paymentsheet.p e() {
            return this.f5121b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f5120a, aVar.f5120a) && AbstractC3159y.d(this.f5121b, aVar.f5121b) && this.f5122c == aVar.f5122c && this.f5123d == aVar.f5123d && this.f5124e == aVar.f5124e && this.f5125f == aVar.f5125f) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f5122c;
        }

        public final boolean g() {
            return this.f5123d;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f5120a.hashCode() * 31;
            com.stripe.android.paymentsheet.p pVar = this.f5121b;
            if (pVar == null) {
                hashCode = 0;
            } else {
                hashCode = pVar.hashCode();
            }
            return ((((((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f5122c)) * 31) + androidx.compose.foundation.a.a(this.f5123d)) * 31) + androidx.compose.foundation.a.a(this.f5124e)) * 31) + androidx.compose.foundation.a.a(this.f5125f);
        }

        public String toString() {
            return "State(paymentOptionsItems=" + this.f5120a + ", selectedPaymentOptionsItem=" + this.f5121b + ", isEditing=" + this.f5122c + ", isProcessing=" + this.f5123d + ", canEdit=" + this.f5124e + ", canRemove=" + this.f5125f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* loaded from: classes4.dex */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f5126a = new a();

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

        /* renamed from: J3.V$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0095b extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f5127b = com.stripe.android.model.o.f24407u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f5128a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0095b(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f5128a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f5128a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0095b) && AbstractC3159y.d(this.f5128a, ((C0095b) obj).f5128a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5128a.hashCode();
            }

            public String toString() {
                return "DeletePaymentMethod(paymentMethod=" + this.f5128a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            public static final int f5129b = com.stripe.android.model.o.f24407u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f5130a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3159y.i(paymentMethod, "paymentMethod");
                this.f5130a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f5130a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3159y.d(this.f5130a, ((c) obj).f5130a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5130a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(paymentMethod=" + this.f5130a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends b {

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC3991f f5131a;

            public d(AbstractC3991f abstractC3991f) {
                super(null);
                this.f5131a = abstractC3991f;
            }

            public final AbstractC3991f a() {
                return this.f5131a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof d) && AbstractC3159y.d(this.f5131a, ((d) obj).f5131a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                AbstractC3991f abstractC3991f = this.f5131a;
                if (abstractC3991f == null) {
                    return 0;
                }
                return abstractC3991f.hashCode();
            }

            public String toString() {
                return "SelectPaymentMethod(selection=" + this.f5131a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends b {

            /* renamed from: a, reason: collision with root package name */
            public static final e f5132a = new e();

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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    boolean a();

    void b(b bVar);

    void close();

    InterfaceC3349K getState();
}
