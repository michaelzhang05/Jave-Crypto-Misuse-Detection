package com.stripe.android.customersheet;

import L5.p;
import com.stripe.android.model.o;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public interface a {

    /* renamed from: com.stripe.android.customersheet.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC0458a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0459a f23547b = new C0459a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f23548a;

        /* renamed from: com.stripe.android.customersheet.a$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0459a {
            private C0459a() {
            }

            public final AbstractC0458a a(AbstractC3991f abstractC3991f) {
                AbstractC3159y.i(abstractC3991f, "<this>");
                if (abstractC3991f instanceof AbstractC3991f.c) {
                    return b.f23549c;
                }
                if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                    String str = ((AbstractC3991f.C0916f) abstractC3991f).v().f24408a;
                    AbstractC3159y.f(str);
                    return new c(str);
                }
                return null;
            }

            public /* synthetic */ C0459a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.customersheet.a$a$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC0458a {

            /* renamed from: c, reason: collision with root package name */
            public static final b f23549c = new b();

            private b() {
                super("google_pay", null);
            }
        }

        /* renamed from: com.stripe.android.customersheet.a$a$c */
        /* loaded from: classes4.dex */
        public static final class c extends AbstractC0458a {

            /* renamed from: c, reason: collision with root package name */
            private final String f23550c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String id) {
                super(id, null);
                AbstractC3159y.i(id, "id");
                this.f23550c = id;
            }

            @Override // com.stripe.android.customersheet.a.AbstractC0458a
            public String a() {
                return this.f23550c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3159y.d(this.f23550c, ((c) obj).f23550c);
            }

            public int hashCode() {
                return this.f23550c.hashCode();
            }

            public String toString() {
                return "StripeId(id=" + this.f23550c + ")";
            }
        }

        public /* synthetic */ AbstractC0458a(String str, AbstractC3151p abstractC3151p) {
            this(str);
        }

        public String a() {
            return this.f23548a;
        }

        public final AbstractC3991f b(Function1 paymentMethodProvider) {
            AbstractC3159y.i(paymentMethodProvider, "paymentMethodProvider");
            if (this instanceof b) {
                return AbstractC3991f.c.f39776a;
            }
            if (this instanceof c) {
                o oVar = (o) paymentMethodProvider.invoke(a());
                if (oVar != null) {
                    return new AbstractC3991f.C0916f(oVar, null, null, 6, null);
                }
                return null;
            }
            throw new p();
        }

        private AbstractC0458a(String str) {
            this.f23548a = str;
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final C0460a f23551a = new C0460a(null);

        /* renamed from: com.stripe.android.customersheet.a$b$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0460a {
            private C0460a() {
            }

            public final b a(Throwable cause, String str) {
                AbstractC3159y.i(cause, "cause");
                return new C0461b(cause, str);
            }

            public final b b(Object obj) {
                return new c(obj);
            }

            public /* synthetic */ C0460a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.customersheet.a$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0461b extends b {

            /* renamed from: b, reason: collision with root package name */
            private final Throwable f23552b;

            /* renamed from: c, reason: collision with root package name */
            private final String f23553c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0461b(Throwable cause, String str) {
                super(null);
                AbstractC3159y.i(cause, "cause");
                this.f23552b = cause;
                this.f23553c = str;
            }

            public final Throwable a() {
                return this.f23552b;
            }

            public final String b() {
                return this.f23553c;
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends b {

            /* renamed from: b, reason: collision with root package name */
            private final Object f23554b;

            public c(Object obj) {
                super(null);
                this.f23554b = obj;
            }

            public final Object a() {
                return this.f23554b;
            }
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }

        private b() {
        }
    }

    List g();

    boolean h();
}
