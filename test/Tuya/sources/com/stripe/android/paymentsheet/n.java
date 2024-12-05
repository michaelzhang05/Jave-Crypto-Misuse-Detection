package com.stripe.android.paymentsheet;

import com.stripe.android.model.StripeIntent;
import kotlin.jvm.internal.AbstractC3159y;
import q3.EnumC3653f;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public interface n {

    /* loaded from: classes4.dex */
    public static final class a implements n {

        /* renamed from: a, reason: collision with root package name */
        private final q3.n f26067a;

        public a(q3.n action) {
            AbstractC3159y.i(action, "action");
            this.f26067a = action;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f26067a == ((a) obj).f26067a;
        }

        public int hashCode() {
            return this.f26067a.hashCode();
        }

        public String toString() {
            return "Canceled(action=" + this.f26067a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements n {

        /* renamed from: a, reason: collision with root package name */
        private final Throwable f26068a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC3983b f26069b;

        /* renamed from: c, reason: collision with root package name */
        private final k f26070c;

        public b(Throwable cause, InterfaceC3983b message, k type) {
            AbstractC3159y.i(cause, "cause");
            AbstractC3159y.i(message, "message");
            AbstractC3159y.i(type, "type");
            this.f26068a = cause;
            this.f26069b = message;
            this.f26070c = type;
        }

        public final Throwable a() {
            return this.f26068a;
        }

        public final InterfaceC3983b b() {
            return this.f26069b;
        }

        public final k c() {
            return this.f26070c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f26068a, bVar.f26068a) && AbstractC3159y.d(this.f26069b, bVar.f26069b) && AbstractC3159y.d(this.f26070c, bVar.f26070c);
        }

        public int hashCode() {
            return (((this.f26068a.hashCode() * 31) + this.f26069b.hashCode()) * 31) + this.f26070c.hashCode();
        }

        public String toString() {
            return "Failed(cause=" + this.f26068a + ", message=" + this.f26069b + ", type=" + this.f26070c + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements n {

        /* renamed from: a, reason: collision with root package name */
        private final StripeIntent f26071a;

        /* renamed from: b, reason: collision with root package name */
        private final EnumC3653f f26072b;

        public c(StripeIntent intent, EnumC3653f enumC3653f) {
            AbstractC3159y.i(intent, "intent");
            this.f26071a = intent;
            this.f26072b = enumC3653f;
        }

        public final EnumC3653f a() {
            return this.f26072b;
        }

        public final StripeIntent b() {
            return this.f26071a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f26071a, cVar.f26071a) && this.f26072b == cVar.f26072b;
        }

        public int hashCode() {
            int hashCode = this.f26071a.hashCode() * 31;
            EnumC3653f enumC3653f = this.f26072b;
            return hashCode + (enumC3653f == null ? 0 : enumC3653f.hashCode());
        }

        public String toString() {
            return "Succeeded(intent=" + this.f26071a + ", deferredIntentConfirmationType=" + this.f26072b + ")";
        }
    }
}
