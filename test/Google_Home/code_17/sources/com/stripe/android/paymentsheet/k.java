package com.stripe.android.paymentsheet;

/* loaded from: classes4.dex */
public interface k {

    /* loaded from: classes4.dex */
    public static final class a implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27086a = new a();

        private a() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return 2038724855;
        }

        public String toString() {
            return "ExternalPaymentMethod";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27087a = new b();

        private b() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -646864001;
        }

        public String toString() {
            return "Fatal";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements k {

        /* renamed from: a, reason: collision with root package name */
        private final int f27088a;

        public c(int i8) {
            this.f27088a = i8;
        }

        public final int a() {
            return this.f27088a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f27088a == ((c) obj).f27088a;
        }

        public int hashCode() {
            return this.f27088a;
        }

        public String toString() {
            return "GooglePay(errorCode=" + this.f27088a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final d f27089a = new d();

        private d() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 382894690;
        }

        public String toString() {
            return "Internal";
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27090a = new e();

        private e() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public int hashCode() {
            return -357572057;
        }

        public String toString() {
            return "MerchantIntegration";
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements k {

        /* renamed from: a, reason: collision with root package name */
        public static final f f27091a = new f();

        private f() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1424027073;
        }

        public String toString() {
            return "Payment";
        }
    }
}
