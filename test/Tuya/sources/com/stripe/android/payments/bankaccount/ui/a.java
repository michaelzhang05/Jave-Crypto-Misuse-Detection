package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.payments.bankaccount.navigation.d;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.payments.bankaccount.ui.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0547a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final d f25130a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0547a(d result) {
            super(null);
            AbstractC3159y.i(result, "result");
            this.f25130a = result;
        }

        public final d a() {
            return this.f25130a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0547a) && AbstractC3159y.d(this.f25130a, ((C0547a) obj).f25130a);
        }

        public int hashCode() {
            return this.f25130a.hashCode();
        }

        public String toString() {
            return "FinishWithResult(result=" + this.f25130a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final String f25131a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25132b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25133c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String publishableKey, String financialConnectionsSessionSecret, String str) {
            super(null);
            AbstractC3159y.i(publishableKey, "publishableKey");
            AbstractC3159y.i(financialConnectionsSessionSecret, "financialConnectionsSessionSecret");
            this.f25131a = publishableKey;
            this.f25132b = financialConnectionsSessionSecret;
            this.f25133c = str;
        }

        public final String a() {
            return this.f25132b;
        }

        public final String b() {
            return this.f25131a;
        }

        public final String c() {
            return this.f25133c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f25131a, bVar.f25131a) && AbstractC3159y.d(this.f25132b, bVar.f25132b) && AbstractC3159y.d(this.f25133c, bVar.f25133c);
        }

        public int hashCode() {
            int hashCode = ((this.f25131a.hashCode() * 31) + this.f25132b.hashCode()) * 31;
            String str = this.f25133c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "OpenConnectionsFlow(publishableKey=" + this.f25131a + ", financialConnectionsSessionSecret=" + this.f25132b + ", stripeAccountId=" + this.f25133c + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3151p abstractC3151p) {
        this();
    }
}
