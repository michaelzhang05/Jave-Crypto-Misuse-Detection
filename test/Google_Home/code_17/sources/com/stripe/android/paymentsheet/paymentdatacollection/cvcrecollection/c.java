package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27309a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1573770629;
        }

        public String toString() {
            return "OnBackPressed";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27310a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return 572477442;
        }

        public String toString() {
            return "OnConfirmPressed";
        }
    }

    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c$c, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0636c implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f27311a;

        public C0636c(String cvc) {
            AbstractC3255y.i(cvc, "cvc");
            this.f27311a = cvc;
        }

        public final String a() {
            return this.f27311a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0636c) && AbstractC3255y.d(this.f27311a, ((C0636c) obj).f27311a);
        }

        public int hashCode() {
            return this.f27311a.hashCode();
        }

        public String toString() {
            return "OnCvcChanged(cvc=" + this.f27311a + ")";
        }
    }
}
