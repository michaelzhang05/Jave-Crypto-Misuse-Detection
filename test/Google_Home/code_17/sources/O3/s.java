package O3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public interface s {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f8204a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8205b;

        /* renamed from: c, reason: collision with root package name */
        private final E3.d f8206c;

        /* renamed from: d, reason: collision with root package name */
        private final D3.a f8207d;

        /* renamed from: e, reason: collision with root package name */
        private final List f8208e;

        /* renamed from: f, reason: collision with root package name */
        private final Z2.a f8209f;

        public a(String selectedPaymentMethodCode, boolean z8, E3.d usBankAccountFormArguments, D3.a formArguments, List formElements, Z2.a aVar) {
            AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3255y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3255y.i(formArguments, "formArguments");
            AbstractC3255y.i(formElements, "formElements");
            this.f8204a = selectedPaymentMethodCode;
            this.f8205b = z8;
            this.f8206c = usBankAccountFormArguments;
            this.f8207d = formArguments;
            this.f8208e = formElements;
            this.f8209f = aVar;
        }

        public final D3.a a() {
            return this.f8207d;
        }

        public final List b() {
            return this.f8208e;
        }

        public final Z2.a c() {
            return this.f8209f;
        }

        public final String d() {
            return this.f8204a;
        }

        public final E3.d e() {
            return this.f8206c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f8204a, aVar.f8204a) && this.f8205b == aVar.f8205b && AbstractC3255y.d(this.f8206c, aVar.f8206c) && AbstractC3255y.d(this.f8207d, aVar.f8207d) && AbstractC3255y.d(this.f8208e, aVar.f8208e) && AbstractC3255y.d(this.f8209f, aVar.f8209f)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f8205b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((this.f8204a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f8205b)) * 31) + this.f8206c.hashCode()) * 31) + this.f8207d.hashCode()) * 31) + this.f8208e.hashCode()) * 31;
            Z2.a aVar = this.f8209f;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.f8204a + ", isProcessing=" + this.f8205b + ", usBankAccountFormArguments=" + this.f8206c + ", formArguments=" + this.f8207d + ", formElements=" + this.f8208e + ", headerInformation=" + this.f8209f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f8210a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return -1206182106;
            }

            public String toString() {
                return "FieldInteraction";
            }
        }

        /* renamed from: O3.s$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0164b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final z3.c f8211a;

            public C0164b(z3.c cVar) {
                this.f8211a = cVar;
            }

            public final z3.c a() {
                return this.f8211a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0164b) && AbstractC3255y.d(this.f8211a, ((C0164b) obj).f8211a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                z3.c cVar = this.f8211a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "FormFieldValuesChanged(formValues=" + this.f8211a + ")";
            }
        }
    }

    boolean a();

    void b(b bVar);

    boolean c();

    void close();

    InterfaceC3698L getState();
}
