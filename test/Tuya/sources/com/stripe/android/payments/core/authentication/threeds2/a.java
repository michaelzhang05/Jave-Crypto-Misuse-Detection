package com.stripe.android.payments.core.authentication.threeds2;

import X3.m;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import f3.C2662c;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0550a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final C2662c f25201a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0550a(C2662c result) {
            super(null);
            AbstractC3159y.i(result, "result");
            this.f25201a = result;
        }

        public final C2662c a() {
            return this.f25201a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0550a) && AbstractC3159y.d(this.f25201a, ((C0550a) obj).f25201a);
        }

        public int hashCode() {
            return this.f25201a.hashCode();
        }

        public String toString() {
            return "Complete(result=" + this.f25201a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final m f25202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m args) {
            super(null);
            AbstractC3159y.i(args, "args");
            this.f25202a = args;
        }

        public final m a() {
            return this.f25202a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3159y.d(this.f25202a, ((b) obj).f25202a);
        }

        public int hashCode() {
            return this.f25202a.hashCode();
        }

        public String toString() {
            return "StartChallenge(args=" + this.f25202a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final PaymentBrowserAuthContract.a f25203a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PaymentBrowserAuthContract.a args) {
            super(null);
            AbstractC3159y.i(args, "args");
            this.f25203a = args;
        }

        public final PaymentBrowserAuthContract.a a() {
            return this.f25203a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f25203a, ((c) obj).f25203a);
        }

        public int hashCode() {
            return this.f25203a.hashCode();
        }

        public String toString() {
            return "StartFallback(args=" + this.f25203a + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3151p abstractC3151p) {
        this();
    }
}
