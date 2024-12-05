package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26254a = new a();

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
        public static final b f26255a = new b();

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
    public static final class C0640c implements c {

        /* renamed from: a, reason: collision with root package name */
        private final String f26256a;

        public C0640c(String cvc) {
            AbstractC3159y.i(cvc, "cvc");
            this.f26256a = cvc;
        }

        public final String a() {
            return this.f26256a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0640c) && AbstractC3159y.d(this.f26256a, ((C0640c) obj).f26256a);
        }

        public int hashCode() {
            return this.f26256a.hashCode();
        }

        public String toString() {
            return "OnCvcChanged(cvc=" + this.f26256a + ")";
        }
    }
}
