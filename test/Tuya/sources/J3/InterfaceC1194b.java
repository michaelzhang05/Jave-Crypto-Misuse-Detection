package J3;

import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import y3.AbstractC3991f;

/* renamed from: J3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC1194b {

    /* renamed from: J3.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5145a;

        /* renamed from: b, reason: collision with root package name */
        private final List f5146b;

        /* renamed from: c, reason: collision with root package name */
        private final A3.a f5147c;

        /* renamed from: d, reason: collision with root package name */
        private final List f5148d;

        /* renamed from: e, reason: collision with root package name */
        private final AbstractC3991f f5149e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f5150f;

        /* renamed from: g, reason: collision with root package name */
        private final B3.d f5151g;

        public a(String selectedPaymentMethodCode, List supportedPaymentMethods, A3.a arguments, List formElements, AbstractC3991f abstractC3991f, boolean z8, B3.d usBankAccountFormArguments) {
            AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3159y.i(arguments, "arguments");
            AbstractC3159y.i(formElements, "formElements");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            this.f5145a = selectedPaymentMethodCode;
            this.f5146b = supportedPaymentMethods;
            this.f5147c = arguments;
            this.f5148d = formElements;
            this.f5149e = abstractC3991f;
            this.f5150f = z8;
            this.f5151g = usBankAccountFormArguments;
        }

        public static /* synthetic */ a b(a aVar, String str, List list, A3.a aVar2, List list2, AbstractC3991f abstractC3991f, boolean z8, B3.d dVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = aVar.f5145a;
            }
            if ((i8 & 2) != 0) {
                list = aVar.f5146b;
            }
            List list3 = list;
            if ((i8 & 4) != 0) {
                aVar2 = aVar.f5147c;
            }
            A3.a aVar3 = aVar2;
            if ((i8 & 8) != 0) {
                list2 = aVar.f5148d;
            }
            List list4 = list2;
            if ((i8 & 16) != 0) {
                abstractC3991f = aVar.f5149e;
            }
            AbstractC3991f abstractC3991f2 = abstractC3991f;
            if ((i8 & 32) != 0) {
                z8 = aVar.f5150f;
            }
            boolean z9 = z8;
            if ((i8 & 64) != 0) {
                dVar = aVar.f5151g;
            }
            return aVar.a(str, list3, aVar3, list4, abstractC3991f2, z9, dVar);
        }

        public final a a(String selectedPaymentMethodCode, List supportedPaymentMethods, A3.a arguments, List formElements, AbstractC3991f abstractC3991f, boolean z8, B3.d usBankAccountFormArguments) {
            AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
            AbstractC3159y.i(supportedPaymentMethods, "supportedPaymentMethods");
            AbstractC3159y.i(arguments, "arguments");
            AbstractC3159y.i(formElements, "formElements");
            AbstractC3159y.i(usBankAccountFormArguments, "usBankAccountFormArguments");
            return new a(selectedPaymentMethodCode, supportedPaymentMethods, arguments, formElements, abstractC3991f, z8, usBankAccountFormArguments);
        }

        public final A3.a c() {
            return this.f5147c;
        }

        public final List d() {
            return this.f5148d;
        }

        public final boolean e() {
            return this.f5150f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f5145a, aVar.f5145a) && AbstractC3159y.d(this.f5146b, aVar.f5146b) && AbstractC3159y.d(this.f5147c, aVar.f5147c) && AbstractC3159y.d(this.f5148d, aVar.f5148d) && AbstractC3159y.d(this.f5149e, aVar.f5149e) && this.f5150f == aVar.f5150f && AbstractC3159y.d(this.f5151g, aVar.f5151g)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f5145a;
        }

        public final List g() {
            return this.f5146b;
        }

        public final B3.d h() {
            return this.f5151g;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((((this.f5145a.hashCode() * 31) + this.f5146b.hashCode()) * 31) + this.f5147c.hashCode()) * 31) + this.f5148d.hashCode()) * 31;
            AbstractC3991f abstractC3991f = this.f5149e;
            if (abstractC3991f == null) {
                hashCode = 0;
            } else {
                hashCode = abstractC3991f.hashCode();
            }
            return ((((hashCode2 + hashCode) * 31) + androidx.compose.foundation.a.a(this.f5150f)) * 31) + this.f5151g.hashCode();
        }

        public String toString() {
            return "State(selectedPaymentMethodCode=" + this.f5145a + ", supportedPaymentMethods=" + this.f5146b + ", arguments=" + this.f5147c + ", formElements=" + this.f5148d + ", paymentSelection=" + this.f5149e + ", processing=" + this.f5150f + ", usBankAccountFormArguments=" + this.f5151g + ")";
        }
    }

    /* renamed from: J3.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0096b {

        /* renamed from: J3.b$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC0096b {

            /* renamed from: a, reason: collision with root package name */
            private final w3.c f5152a;

            /* renamed from: b, reason: collision with root package name */
            private final String f5153b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w3.c cVar, String selectedPaymentMethodCode) {
                super(null);
                AbstractC3159y.i(selectedPaymentMethodCode, "selectedPaymentMethodCode");
                this.f5152a = cVar;
                this.f5153b = selectedPaymentMethodCode;
            }

            public final w3.c a() {
                return this.f5152a;
            }

            public final String b() {
                return this.f5153b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                if (AbstractC3159y.d(this.f5152a, aVar.f5152a) && AbstractC3159y.d(this.f5153b, aVar.f5153b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                int hashCode;
                w3.c cVar = this.f5152a;
                if (cVar == null) {
                    hashCode = 0;
                } else {
                    hashCode = cVar.hashCode();
                }
                return (hashCode * 31) + this.f5153b.hashCode();
            }

            public String toString() {
                return "OnFormFieldValuesChanged(formValues=" + this.f5152a + ", selectedPaymentMethodCode=" + this.f5153b + ")";
            }
        }

        /* renamed from: J3.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0097b extends AbstractC0096b {

            /* renamed from: a, reason: collision with root package name */
            private final String f5154a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0097b(String code) {
                super(null);
                AbstractC3159y.i(code, "code");
                this.f5154a = code;
            }

            public final String a() {
                return this.f5154a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0097b) && AbstractC3159y.d(this.f5154a, ((C0097b) obj).f5154a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5154a.hashCode();
            }

            public String toString() {
                return "OnPaymentMethodSelected(code=" + this.f5154a + ")";
            }
        }

        /* renamed from: J3.b$b$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0096b {

            /* renamed from: a, reason: collision with root package name */
            private final String f5155a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String code) {
                super(null);
                AbstractC3159y.i(code, "code");
                this.f5155a = code;
            }

            public final String a() {
                return this.f5155a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof c) && AbstractC3159y.d(this.f5155a, ((c) obj).f5155a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f5155a.hashCode();
            }

            public String toString() {
                return "ReportFieldInteraction(code=" + this.f5155a + ")";
            }
        }

        private AbstractC0096b() {
        }

        public /* synthetic */ AbstractC0096b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    boolean a();

    void b(AbstractC0096b abstractC0096b);

    void close();

    InterfaceC3349K getState();
}
