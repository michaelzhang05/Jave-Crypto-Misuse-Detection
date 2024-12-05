package L3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import q3.C3654g;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface n {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6340a = new a("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f6341b = new a("EDIT_CARD_BRAND", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f6342c = new a("MANAGE_ONE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f6343d = new a("MANAGE_ALL", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f6344e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f6345f;

        static {
            a[] a8 = a();
            f6344e = a8;
            f6345f = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6340a, f6341b, f6342c, f6343d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6344e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f6346a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6347b;

        /* renamed from: c, reason: collision with root package name */
        private final AbstractC3991f f6348c;

        /* renamed from: d, reason: collision with root package name */
        private final C3654g f6349d;

        /* renamed from: e, reason: collision with root package name */
        private final a f6350e;

        public b(List displayablePaymentMethods, boolean z8, AbstractC3991f abstractC3991f, C3654g c3654g, a availableSavedPaymentMethodAction) {
            AbstractC3159y.i(displayablePaymentMethods, "displayablePaymentMethods");
            AbstractC3159y.i(availableSavedPaymentMethodAction, "availableSavedPaymentMethodAction");
            this.f6346a = displayablePaymentMethods;
            this.f6347b = z8;
            this.f6348c = abstractC3991f;
            this.f6349d = c3654g;
            this.f6350e = availableSavedPaymentMethodAction;
        }

        public final a a() {
            return this.f6350e;
        }

        public final List b() {
            return this.f6346a;
        }

        public final C3654g c() {
            return this.f6349d;
        }

        public final AbstractC3991f d() {
            return this.f6348c;
        }

        public final boolean e() {
            return this.f6347b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3159y.d(this.f6346a, bVar.f6346a) && this.f6347b == bVar.f6347b && AbstractC3159y.d(this.f6348c, bVar.f6348c) && AbstractC3159y.d(this.f6349d, bVar.f6349d) && this.f6350e == bVar.f6350e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f6346a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6347b)) * 31;
            AbstractC3991f abstractC3991f = this.f6348c;
            int i8 = 0;
            if (abstractC3991f == null) {
                hashCode = 0;
            } else {
                hashCode = abstractC3991f.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            C3654g c3654g = this.f6349d;
            if (c3654g != null) {
                i8 = c3654g.hashCode();
            }
            return ((i9 + i8) * 31) + this.f6350e.hashCode();
        }

        public String toString() {
            return "State(displayablePaymentMethods=" + this.f6346a + ", isProcessing=" + this.f6347b + ", selection=" + this.f6348c + ", displayedSavedPaymentMethod=" + this.f6349d + ", availableSavedPaymentMethodAction=" + this.f6350e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface c {

        /* loaded from: classes4.dex */
        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            private final C3654g f6351a;

            public a(C3654g savedPaymentMethod) {
                AbstractC3159y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f6351a = savedPaymentMethod;
            }

            public final C3654g a() {
                return this.f6351a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3159y.d(this.f6351a, ((a) obj).f6351a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6351a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(savedPaymentMethod=" + this.f6351a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            private final String f6352a;

            public b(String selectedPaymentMethodCode) {
                AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.f6352a = selectedPaymentMethodCode;
            }

            public final String a() {
                return this.f6352a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && AbstractC3159y.d(this.f6352a, ((b) obj).f6352a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6352a.hashCode();
            }

            public String toString() {
                return "PaymentMethodSelected(selectedPaymentMethodCode=" + this.f6352a + ")";
            }
        }

        /* renamed from: L3.n$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0135c implements c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f6353b = com.stripe.android.model.o.f24407u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f6354a;

            public C0135c(com.stripe.android.model.o savedPaymentMethod) {
                AbstractC3159y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f6354a = savedPaymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f6354a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0135c) && AbstractC3159y.d(this.f6354a, ((C0135c) obj).f6354a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6354a.hashCode();
            }

            public String toString() {
                return "SavedPaymentMethodSelected(savedPaymentMethod=" + this.f6354a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f6355a = new d();

            private d() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof d)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 1370197407;
            }

            public String toString() {
                return "TransitionToManageOneSavedPaymentMethod";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final e f6356a = new e();

            private e() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof e)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1332425524;
            }

            public String toString() {
                return "TransitionToManageSavedPaymentMethods";
            }
        }
    }

    boolean a();

    void b(c cVar);

    InterfaceC3349K c();

    InterfaceC3349K getState();
}
