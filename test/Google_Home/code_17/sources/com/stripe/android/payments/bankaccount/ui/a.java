package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.payments.bankaccount.navigation.d;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.payments.bankaccount.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0543a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final d f26185a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0543a(d result) {
            super(null);
            AbstractC3255y.i(result, "result");
            this.f26185a = result;
        }

        public final d a() {
            return this.f26185a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0543a) && AbstractC3255y.d(this.f26185a, ((C0543a) obj).f26185a);
        }

        public int hashCode() {
            return this.f26185a.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.f26185a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final String f26186a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26187b;

        /* renamed from: c, reason: collision with root package name */
        private final String f26188c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String publishableKey, String financialConnectionsSessionSecret, String str) {
            super(null);
            AbstractC3255y.i(publishableKey, "publishableKey");
            AbstractC3255y.i(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.f26186a = publishableKey;
            this.f26187b = financialConnectionsSessionSecret;
            this.f26188c = str;
        }

        public final String a() {
            return this.f26187b;
        }

        public final String b() {
            return this.f26186a;
        }

        public final String c() {
            return this.f26188c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f26186a, bVar.f26186a) && AbstractC3255y.d(this.f26187b, bVar.f26187b) && AbstractC3255y.d(this.f26188c, bVar.f26188c);
        }

        public int hashCode() {
            int hashCode = ((this.f26186a.hashCode() * 31) + this.f26187b.hashCode()) * 31;
            String str = this.f26188c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.f26186a + ", financialConnectionsSessionSecret=" + this.f26187b + ", stripeAccountId=" + this.f26188c + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3247p abstractC3247p) {
        this();
    }
}
