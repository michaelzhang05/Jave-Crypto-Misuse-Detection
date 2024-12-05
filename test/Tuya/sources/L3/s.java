package L3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public interface s {

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6413a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f6414b;

        /* renamed from: c, reason: collision with root package name */
        private final B3.d f6415c;

        /* renamed from: d, reason: collision with root package name */
        private final A3.a f6416d;

        /* renamed from: e, reason: collision with root package name */
        private final List f6417e;

        /* renamed from: f, reason: collision with root package name */
        private final W2.a f6418f;

        public a(String selectedPaymentMethodCode, boolean z8, B3.d usBankAccountFormArguments, A3.a formArguments, List formElements, W2.a aVar) {
            AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            AbstractC3159y.i(formArguments, "formArguments");
            AbstractC3159y.i(formElements, "formElements");
            this.f6413a = selectedPaymentMethodCode;
            this.f6414b = z8;
            this.f6415c = usBankAccountFormArguments;
            this.f6416d = formArguments;
            this.f6417e = formElements;
            this.f6418f = aVar;
        }

        public final A3.a a() {
            return this.f6416d;
        }

        public final List b() {
            return this.f6417e;
        }

        public final W2.a c() {
            return this.f6418f;
        }

        public final String d() {
            return this.f6413a;
        }

        public final B3.d e() {
            return this.f6415c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f6413a, aVar.f6413a) && this.f6414b == aVar.f6414b && AbstractC3159y.d(this.f6415c, aVar.f6415c) && AbstractC3159y.d(this.f6416d, aVar.f6416d) && AbstractC3159y.d(this.f6417e, aVar.f6417e) && AbstractC3159y.d(this.f6418f, aVar.f6418f)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f6414b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((((this.f6413a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f6414b)) * 31) + this.f6415c.hashCode()) * 31) + this.f6416d.hashCode()) * 31) + this.f6417e.hashCode()) * 31;
            W2.a aVar = this.f6418f;
            if (aVar == null) {
                hashCode = 0;
            } else {
                hashCode = aVar.hashCode();
            }
            return hashCode2 + hashCode;
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.f6413a + ", isProcessing=" + this.f6414b + ", usBankAccountFormArguments=" + this.f6415c + ", formArguments=" + this.f6416d + ", formElements=" + this.f6417e + ", headerInformation=" + this.f6418f + ")";
        }
    }

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            public static final a f6419a = new a();

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

        /* renamed from: L3.s$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0136b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final w3.c f6420a;

            public C0136b(w3.c cVar) {
                this.f6420a = cVar;
            }

            public final w3.c a() {
                return this.f6420a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0136b) && AbstractC3159y.d(this.f6420a, ((C0136b) obj).f6420a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                w3.c cVar = this.f6420a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                return "FormFieldValuesChanged(formValues=" + this.f6420a + ")";
            }
        }
    }

    boolean a();

    boolean b();

    void c(b bVar);

    void close();

    InterfaceC3349K getState();
}
