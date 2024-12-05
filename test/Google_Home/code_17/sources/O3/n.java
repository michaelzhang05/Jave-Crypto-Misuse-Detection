package O3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import t3.C4033g;

/* loaded from: classes4.dex */
public interface n {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f8131a = new a("NONE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f8132b = new a("EDIT_CARD_BRAND", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f8133c = new a("MANAGE_ONE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f8134d = new a("MANAGE_ALL", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f8135e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f8136f;

        static {
            a[] a8 = a();
            f8135e = a8;
            f8136f = U5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f8131a, f8132b, f8133c, f8134d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f8135e.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List f8137a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8138b;

        /* renamed from: c, reason: collision with root package name */
        private final B3.f f8139c;

        /* renamed from: d, reason: collision with root package name */
        private final C4033g f8140d;

        /* renamed from: e, reason: collision with root package name */
        private final a f8141e;

        public b(List displayablePaymentMethods, boolean z8, B3.f fVar, C4033g c4033g, a availableSavedPaymentMethodAction) {
            AbstractC3255y.i(displayablePaymentMethods, "displayablePaymentMethods");
            AbstractC3255y.i(availableSavedPaymentMethodAction, "availableSavedPaymentMethodAction");
            this.f8137a = displayablePaymentMethods;
            this.f8138b = z8;
            this.f8139c = fVar;
            this.f8140d = c4033g;
            this.f8141e = availableSavedPaymentMethodAction;
        }

        public final a a() {
            return this.f8141e;
        }

        public final List b() {
            return this.f8137a;
        }

        public final C4033g c() {
            return this.f8140d;
        }

        public final B3.f d() {
            return this.f8139c;
        }

        public final boolean e() {
            return this.f8138b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3255y.d(this.f8137a, bVar.f8137a) && this.f8138b == bVar.f8138b && AbstractC3255y.d(this.f8139c, bVar.f8139c) && AbstractC3255y.d(this.f8140d, bVar.f8140d) && this.f8141e == bVar.f8141e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((this.f8137a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f8138b)) * 31;
            B3.f fVar = this.f8139c;
            int i8 = 0;
            if (fVar == null) {
                hashCode = 0;
            } else {
                hashCode = fVar.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            C4033g c4033g = this.f8140d;
            if (c4033g != null) {
                i8 = c4033g.hashCode();
            }
            return ((i9 + i8) * 31) + this.f8141e.hashCode();
        }

        public String toString() {
            return "State(displayablePaymentMethods=" + this.f8137a + ", isProcessing=" + this.f8138b + ", selection=" + this.f8139c + ", displayedSavedPaymentMethod=" + this.f8140d + ", availableSavedPaymentMethodAction=" + this.f8141e + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface c {

        /* loaded from: classes4.dex */
        public static final class a implements c {

            /* renamed from: a, reason: collision with root package name */
            private final C4033g f8142a;

            public a(C4033g savedPaymentMethod) {
                AbstractC3255y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f8142a = savedPaymentMethod;
            }

            public final C4033g a() {
                return this.f8142a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && AbstractC3255y.d(this.f8142a, ((a) obj).f8142a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8142a.hashCode();
            }

            public String toString() {
                return "EditPaymentMethod(savedPaymentMethod=" + this.f8142a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements c {

            /* renamed from: a, reason: collision with root package name */
            private final String f8143a;

            public b(String selectedPaymentMethodCode) {
                AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.f8143a = selectedPaymentMethodCode;
            }

            public final String a() {
                return this.f8143a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && AbstractC3255y.d(this.f8143a, ((b) obj).f8143a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8143a.hashCode();
            }

            public String toString() {
                return "PaymentMethodSelected(selectedPaymentMethodCode=" + this.f8143a + ")";
            }
        }

        /* renamed from: O3.n$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0163c implements c {

            /* renamed from: b, reason: collision with root package name */
            public static final int f8144b = com.stripe.android.model.o.f25462u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f8145a;

            public C0163c(com.stripe.android.model.o savedPaymentMethod) {
                AbstractC3255y.i(savedPaymentMethod, "savedPaymentMethod");
                this.f8145a = savedPaymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f8145a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0163c) && AbstractC3255y.d(this.f8145a, ((C0163c) obj).f8145a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f8145a.hashCode();
            }

            public String toString() {
                return "SavedPaymentMethodSelected(savedPaymentMethod=" + this.f8145a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements c {

            /* renamed from: a, reason: collision with root package name */
            public static final d f8146a = new d();

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
            public static final e f8147a = new e();

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

    void a(c cVar);

    InterfaceC3698L b();

    boolean c();

    InterfaceC3698L getState();
}
