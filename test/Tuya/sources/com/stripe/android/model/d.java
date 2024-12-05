package com.stripe.android.model;

import M5.Q;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;
import w4.AbstractC3849b;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f24250a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24251b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24252c;

        public a(String clientSecret, String str, String str2) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            this.f24250a = clientSecret;
            this.f24251b = str;
            this.f24252c = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return AbstractC3849b.a(Q.k(L5.x.a("client_secret", this.f24250a), L5.x.a("hosted_surface", this.f24252c), L5.x.a("product", "instant_debits"), L5.x.a("attach_required", Boolean.TRUE), L5.x.a("payment_method_data", new p(o.p.f24531h, null, null, null, null, null, null, null, null, null, null, null, null, null, new o.e(null, this.f24251b, null, null, 13, null), null, null, null, null, 507902, null).y())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f24250a, aVar.f24250a) && AbstractC3159y.d(this.f24251b, aVar.f24251b) && AbstractC3159y.d(this.f24252c, aVar.f24252c);
        }

        public int hashCode() {
            int hashCode = this.f24250a.hashCode() * 31;
            String str = this.f24251b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24252c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(clientSecret=" + this.f24250a + ", customerEmailAddress=" + this.f24251b + ", hostedSurface=" + this.f24252c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f24253a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24254b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24255c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24256d;

        public b(String clientSecret, String customerName, String str, String str2) {
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(customerName, "customerName");
            this.f24253a = clientSecret;
            this.f24254b = customerName;
            this.f24255c = str;
            this.f24256d = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return AbstractC3849b.a(Q.k(L5.x.a("client_secret", this.f24253a), L5.x.a("hosted_surface", this.f24256d), L5.x.a("payment_method_data", p.e.n(p.f24581u, new o.e(null, this.f24255c, this.f24254b, null, 9, null), null, null, 6, null).y())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f24253a, bVar.f24253a) && AbstractC3159y.d(this.f24254b, bVar.f24254b) && AbstractC3159y.d(this.f24255c, bVar.f24255c) && AbstractC3159y.d(this.f24256d, bVar.f24256d);
        }

        public int hashCode() {
            int hashCode = ((this.f24253a.hashCode() * 31) + this.f24254b.hashCode()) * 31;
            String str = this.f24255c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24256d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(clientSecret=" + this.f24253a + ", customerName=" + this.f24254b + ", customerEmailAddress=" + this.f24255c + ", hostedSurface=" + this.f24256d + ")";
        }
    }

    Map a();
}
