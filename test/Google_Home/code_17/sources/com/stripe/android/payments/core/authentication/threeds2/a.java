package com.stripe.android.payments.core.authentication.threeds2;

import a4.m;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import i3.C2980c;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: com.stripe.android.payments.core.authentication.threeds2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0546a extends a {

        /* renamed from: a, reason: collision with root package name */
        private final C2980c f26256a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0546a(C2980c result) {
            super(null);
            AbstractC3255y.i(result, "result");
            this.f26256a = result;
        }

        public final C2980c a() {
            return this.f26256a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0546a) && AbstractC3255y.d(this.f26256a, ((C0546a) obj).f26256a);
        }

        public int hashCode() {
            return this.f26256a.hashCode();
        }

        public String toString() {
            return "Complete(result=" + this.f26256a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends a {

        /* renamed from: a, reason: collision with root package name */
        private final m f26257a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m args) {
            super(null);
            AbstractC3255y.i(args, "args");
            this.f26257a = args;
        }

        public final m a() {
            return this.f26257a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3255y.d(this.f26257a, ((b) obj).f26257a);
        }

        public int hashCode() {
            return this.f26257a.hashCode();
        }

        public String toString() {
            return "StartChallenge(args=" + this.f26257a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends a {

        /* renamed from: a, reason: collision with root package name */
        private final PaymentBrowserAuthContract.a f26258a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(PaymentBrowserAuthContract.a args) {
            super(null);
            AbstractC3255y.i(args, "args");
            this.f26258a = args;
        }

        public final PaymentBrowserAuthContract.a a() {
            return this.f26258a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f26258a, ((c) obj).f26258a);
        }

        public int hashCode() {
            return this.f26258a.hashCode();
        }

        public String toString() {
            return "StartFallback(args=" + this.f26258a + ")";
        }
    }

    private a() {
    }

    public /* synthetic */ a(AbstractC3247p abstractC3247p) {
        this();
    }
}
