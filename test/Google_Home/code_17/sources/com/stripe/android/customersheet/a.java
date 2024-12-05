package com.stripe.android.customersheet;

import B3.f;
import O5.p;
import com.stripe.android.model.o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.stripe.android.customersheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0454a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0455a f24602b = new C0455a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f24603a;

        /* renamed from: com.stripe.android.customersheet.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0455a {
            private C0455a() {
            }

            public final AbstractC0454a a(B3.f fVar) {
                AbstractC3255y.i(fVar, "<this>");
                if (fVar instanceof f.c) {
                    return b.f24604c;
                }
                if (fVar instanceof f.C0009f) {
                    String str = ((f.C0009f) fVar).r().f25463a;
                    AbstractC3255y.f(str);
                    return new c(str);
                }
                return null;
            }

            public /* synthetic */ C0455a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.customersheet.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0454a {

            /* renamed from: c, reason: collision with root package name */
            public static final b f24604c = new b();

            private b() {
                super("google_pay", null);
            }
        }

        /* renamed from: com.stripe.android.customersheet.a$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0454a {

            /* renamed from: c, reason: collision with root package name */
            private final String f24605c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String id) {
                super(id, null);
                AbstractC3255y.i(id, "id");
                this.f24605c = id;
            }

            @Override // com.stripe.android.customersheet.a.AbstractC0454a
            public String a() {
                return this.f24605c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3255y.d(this.f24605c, ((c) obj).f24605c);
            }

            public int hashCode() {
                return this.f24605c.hashCode();
            }

            public String toString() {
                return "StripeId(id=" + this.f24605c + ")";
            }
        }

        public /* synthetic */ AbstractC0454a(String str, AbstractC3247p abstractC3247p) {
            this(str);
        }

        public String a() {
            return this.f24603a;
        }

        public final B3.f b(Function1 paymentMethodProvider) {
            AbstractC3255y.i(paymentMethodProvider, "paymentMethodProvider");
            if (this instanceof b) {
                return f.c.f820a;
            }
            if (this instanceof c) {
                o oVar = (o) paymentMethodProvider.invoke(a());
                if (oVar != null) {
                    return new f.C0009f(oVar, null, null, 6, null);
                }
                return null;
            }
            throw new p();
        }

        private AbstractC0454a(String str) {
            this.f24603a = str;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0456a f24606a = new C0456a(null);

        /* renamed from: com.stripe.android.customersheet.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0456a {
            private C0456a() {
            }

            public final b a(Throwable cause, String str) {
                AbstractC3255y.i(cause, "cause");
                return new C0457b(cause, str);
            }

            public final b b(Object obj) {
                return new c(obj);
            }

            public /* synthetic */ C0456a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.customersheet.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0457b extends b {

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f24607b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24608c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0457b(Throwable cause, String str) {
                super(null);
                AbstractC3255y.i(cause, "cause");
                this.f24607b = cause;
                this.f24608c = str;
            }

            public final Throwable a() {
                return this.f24607b;
            }

            public final String b() {
                return this.f24608c;
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            private final Object f24609b;

            public c(Object obj) {
                super(null);
                this.f24609b = obj;
            }

            public final Object a() {
                return this.f24609b;
            }
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }

        private b() {
        }
    }

    List e();

    boolean f();
}
