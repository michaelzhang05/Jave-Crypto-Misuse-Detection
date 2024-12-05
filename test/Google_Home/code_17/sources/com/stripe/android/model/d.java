package com.stripe.android.model;

import P5.Q;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;
import z4.AbstractC4229b;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25305a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25306b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25307c;

        public a(String clientSecret, String str, String str2) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            this.f25305a = clientSecret;
            this.f25306b = str;
            this.f25307c = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return AbstractC4229b.a(Q.k(O5.x.a("client_secret", this.f25305a), O5.x.a("hosted_surface", this.f25307c), O5.x.a("product", "instant_debits"), O5.x.a("attach_required", Boolean.TRUE), O5.x.a("payment_method_data", new p(o.p.f25586h, null, null, null, null, null, null, null, null, null, null, null, null, null, new o.e(null, this.f25306b, null, null, 13, null), null, null, null, null, 507902, null).B())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f25305a, aVar.f25305a) && AbstractC3255y.d(this.f25306b, aVar.f25306b) && AbstractC3255y.d(this.f25307c, aVar.f25307c);
        }

        public int hashCode() {
            int hashCode = this.f25305a.hashCode() * 31;
            String str = this.f25306b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25307c;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebits(clientSecret=" + this.f25305a + ", customerEmailAddress=" + this.f25306b + ", hostedSurface=" + this.f25307c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final String f25308a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25309b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25310c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25311d;

        public b(String clientSecret, String customerName, String str, String str2) {
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(customerName, "customerName");
            this.f25308a = clientSecret;
            this.f25309b = customerName;
            this.f25310c = str;
            this.f25311d = str2;
        }

        @Override // com.stripe.android.model.d
        public Map a() {
            return AbstractC4229b.a(Q.k(O5.x.a("client_secret", this.f25308a), O5.x.a("hosted_surface", this.f25311d), O5.x.a("payment_method_data", p.e.n(p.f25636u, new o.e(null, this.f25310c, this.f25309b, null, 9, null), null, null, 6, null).B())));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f25308a, bVar.f25308a) && AbstractC3255y.d(this.f25309b, bVar.f25309b) && AbstractC3255y.d(this.f25310c, bVar.f25310c) && AbstractC3255y.d(this.f25311d, bVar.f25311d);
        }

        public int hashCode() {
            int hashCode = ((this.f25308a.hashCode() * 31) + this.f25309b.hashCode()) * 31;
            String str = this.f25310c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25311d;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(clientSecret=" + this.f25308a + ", customerName=" + this.f25309b + ", customerEmailAddress=" + this.f25310c + ", hostedSurface=" + this.f25311d + ")";
        }
    }

    Map a();
}
