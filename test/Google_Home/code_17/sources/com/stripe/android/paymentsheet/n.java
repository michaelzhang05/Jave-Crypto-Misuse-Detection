package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3255y;
import t3.EnumC4032f;

/* loaded from: classes4.dex */
public interface n {

    /* loaded from: classes4.dex */
    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final t3.n f27122a;

        public a(t3.n action) {
            AbstractC3255y.i(action, "action");
            this.f27122a = action;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f27122a == ((a) obj).f27122a;
        }

        public int hashCode() {
            return this.f27122a.hashCode();
        }

        public String toString() {
            return "Canceled(action=" + this.f27122a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f27123a;

        /* renamed from: b, reason: collision with root package name */
        private final B2.b f27124b;

        /* renamed from: c, reason: collision with root package name */
        private final k f27125c;

        public b(Throwable cause, B2.b message, k type) {
            AbstractC3255y.i(cause, "cause");
            AbstractC3255y.i(message, "message");
            AbstractC3255y.i(type, "type");
            this.f27123a = cause;
            this.f27124b = message;
            this.f27125c = type;
        }

        public final Throwable a() {
            return this.f27123a;
        }

        public final B2.b b() {
            return this.f27124b;
        }

        public final k c() {
            return this.f27125c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f27123a, bVar.f27123a) && AbstractC3255y.d(this.f27124b, bVar.f27124b) && AbstractC3255y.d(this.f27125c, bVar.f27125c);
        }

        public int hashCode() {
            return (((this.f27123a.hashCode() * 31) + this.f27124b.hashCode()) * 31) + this.f27125c.hashCode();
        }

        public String toString() {
            return "Failed(cause=" + this.f27123a + ", message=" + this.f27124b + ", type=" + this.f27125c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f27126a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC4032f f27127b;

        public c(StripeIntent intent, EnumC4032f enumC4032f) {
            AbstractC3255y.i(intent, "intent");
            this.f27126a = intent;
            this.f27127b = enumC4032f;
        }

        public final EnumC4032f a() {
            return this.f27127b;
        }

        public final StripeIntent b() {
            return this.f27126a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3255y.d(this.f27126a, cVar.f27126a) && this.f27127b == cVar.f27127b;
        }

        public int hashCode() {
            int hashCode = this.f27126a.hashCode() * 31;
            EnumC4032f enumC4032f = this.f27127b;
            return hashCode + (enumC4032f == null ? 0 : enumC4032f.hashCode());
        }

        public String toString() {
            return "Succeeded(intent=" + this.f27126a + ", deferredIntentConfirmationType=" + this.f27127b + ")";
        }
    }
}
