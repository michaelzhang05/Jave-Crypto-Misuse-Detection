package M3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;

/* renamed from: M3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1307b {

    /* renamed from: M3.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f6851a;

        /* renamed from: b, reason: collision with root package name */
        private final List f6852b;

        /* renamed from: c, reason: collision with root package name */
        private final D3.a f6853c;

        /* renamed from: d, reason: collision with root package name */
        private final List f6854d;

        /* renamed from: e, reason: collision with root package name */
        private final B3.f f6855e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f6856f;

        /* renamed from: g, reason: collision with root package name */
        private final E3.d f6857g;

        public a(String selectedPaymentMethodCode, List supportedPaymentMethods, D3.a arguments, List formElements, B3.f fVar, boolean z8, E3.d usBankAccountFormArguments) {
            AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3255y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3255y.i(arguments, "arguments");
            AbstractC3255y.i(formElements, "formElements");
            AbstractC3255y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            this.f6851a = selectedPaymentMethodCode;
            this.f6852b = supportedPaymentMethods;
            this.f6853c = arguments;
            this.f6854d = formElements;
            this.f6855e = fVar;
            this.f6856f = z8;
            this.f6857g = usBankAccountFormArguments;
        }

        public static /* synthetic */ a b(a aVar, String str, List list, D3.a aVar2, List list2, B3.f fVar, boolean z8, E3.d dVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = aVar.f6851a;
            }
            if ((i8 & 2) != 0) {
                list = aVar.f6852b;
            }
            List list3 = list;
            if ((i8 & 4) != 0) {
                aVar2 = aVar.f6853c;
            }
            D3.a aVar3 = aVar2;
            if ((i8 & 8) != 0) {
                list2 = aVar.f6854d;
            }
            List list4 = list2;
            if ((i8 & 16) != 0) {
                fVar = aVar.f6855e;
            }
            B3.f fVar2 = fVar;
            if ((i8 & 32) != 0) {
                z8 = aVar.f6856f;
            }
            boolean z9 = z8;
            if ((i8 & 64) != 0) {
                dVar = aVar.f6857g;
            }
            return aVar.a(str, list3, aVar3, list4, fVar2, z9, dVar);
        }

        public final a a(String selectedPaymentMethodCode, List supportedPaymentMethods, D3.a arguments, List formElements, B3.f fVar, boolean z8, E3.d usBankAccountFormArguments) {
            AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3255y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3255y.i(arguments, "arguments");
            AbstractC3255y.i(formElements, "formElements");
            AbstractC3255y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            return new a(selectedPaymentMethodCode, supportedPaymentMethods, arguments, formElements, fVar, z8, usBankAccountFormArguments);
        }

        public final D3.a c() {
            return this.f6853c;
        }

        public final List d() {
            return this.f6854d;
        }

        public final boolean e() {
            return this.f6856f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f6851a, aVar.f6851a) && AbstractC3255y.d(this.f6852b, aVar.f6852b) && AbstractC3255y.d(this.f6853c, aVar.f6853c) && AbstractC3255y.d(this.f6854d, aVar.f6854d) && AbstractC3255y.d(this.f6855e, aVar.f6855e) && this.f6856f == aVar.f6856f && AbstractC3255y.d(this.f6857g, aVar.f6857g)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f6851a;
        }

        public final List g() {
            return this.f6852b;
        }

        public final E3.d h() {
            return this.f6857g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((this.f6851a.hashCode() * 31) + this.f6852b.hashCode()) * 31) + this.f6853c.hashCode()) * 31) + this.f6854d.hashCode()) * 31;
            B3.f fVar = this.f6855e;
            if (fVar == null) {
                hashCode = 0;
            } else {
                hashCode = fVar.hashCode();
            }
            return ((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f6856f)) * 31) + this.f6857g.hashCode();
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.f6851a + ", supportedPaymentMethods=" + this.f6852b + ", arguments=" + this.f6853c + ", formElements=" + this.f6854d + ", paymentSelection=" + this.f6855e + ", processing=" + this.f6856f + ", usBankAccountFormArguments=" + this.f6857g + ")";
        }
    }

    /* renamed from: M3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0121b {

        /* renamed from: M3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0121b {

            /* renamed from: a, reason: collision with root package name */
            private final z3.c f6858a;

            /* renamed from: b, reason: collision with root package name */
            private final String f6859b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(z3.c cVar, String selectedPaymentMethodCode) {
                super(null);
                AbstractC3255y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.f6858a = cVar;
                this.f6859b = selectedPaymentMethodCode;
            }

            public final z3.c a() {
                return this.f6858a;
            }

            public final String b() {
                return this.f6859b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (AbstractC3255y.d(this.f6858a, aVar.f6858a) && AbstractC3255y.d(this.f6859b, aVar.f6859b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                z3.c cVar = this.f6858a;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                return (hashCode * 31) + this.f6859b.hashCode();
            }

            public String toString() {
                return "OnFormFieldValuesChanged(formValues=" + this.f6858a + ", selectedPaymentMethodCode=" + this.f6859b + ")";
            }
        }

        /* renamed from: M3.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0122b extends AbstractC0121b {

            /* renamed from: a, reason: collision with root package name */
            private final String f6860a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0122b(String code) {
                super(null);
                AbstractC3255y.i(code, "code");
                this.f6860a = code;
            }

            public final String a() {
                return this.f6860a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0122b) && AbstractC3255y.d(this.f6860a, ((C0122b) obj).f6860a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6860a.hashCode();
            }

            public String toString() {
                return "OnPaymentMethodSelected(code=" + this.f6860a + ")";
            }
        }

        /* renamed from: M3.b$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0121b {

            /* renamed from: a, reason: collision with root package name */
            private final String f6861a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String code) {
                super(null);
                AbstractC3255y.i(code, "code");
                this.f6861a = code;
            }

            public final String a() {
                return this.f6861a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3255y.d(this.f6861a, ((c) obj).f6861a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f6861a.hashCode();
            }

            public String toString() {
                return "ReportFieldInteraction(code=" + this.f6861a + ")";
            }
        }

        private AbstractC0121b() {
        }

        public /* synthetic */ AbstractC0121b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    boolean c();

    void close();

    void d(AbstractC0121b abstractC0121b);

    InterfaceC3698L getState();
}
