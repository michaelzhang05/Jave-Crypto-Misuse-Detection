package com.stripe.android.paymentsheet;

import com.stripe.android.model.b;
import com.stripe.android.paymentsheet.u;
import e3.InterfaceC2795i;
import kotlin.jvm.internal.AbstractC3255y;
import t3.EnumC4032f;
import t3.InterfaceC4027a;

/* loaded from: classes4.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f27025a = a.f27026a;

    /* loaded from: classes4.dex */
    public interface b {

        /* loaded from: classes4.dex */
        public static final class a implements b {
            @Override // com.stripe.android.paymentsheet.f.b
            public abstract EnumC4032f a();
        }

        /* renamed from: com.stripe.android.paymentsheet.f$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0605b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final InterfaceC2795i f27027a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f27028b;

            public C0605b(InterfaceC2795i confirmParams, boolean z8) {
                AbstractC3255y.i(confirmParams, "confirmParams");
                this.f27027a = confirmParams;
                this.f27028b = z8;
            }

            @Override // com.stripe.android.paymentsheet.f.b
            public EnumC4032f a() {
                EnumC4032f enumC4032f = EnumC4032f.f39650b;
                if (!this.f27028b) {
                    return null;
                }
                return enumC4032f;
            }

            public final InterfaceC2795i b() {
                return this.f27027a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0605b)) {
                    return false;
                }
                C0605b c0605b = (C0605b) obj;
                return AbstractC3255y.d(this.f27027a, c0605b.f27027a) && this.f27028b == c0605b.f27028b;
            }

            public int hashCode() {
                return (this.f27027a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f27028b);
            }

            public String toString() {
                return "Confirm(confirmParams=" + this.f27027a + ", isDeferred=" + this.f27028b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f27029a;

            /* renamed from: b, reason: collision with root package name */
            private final B2.b f27030b;

            public c(Throwable cause, B2.b message) {
                AbstractC3255y.i(cause, "cause");
                AbstractC3255y.i(message, "message");
                this.f27029a = cause;
                this.f27030b = message;
            }

            @Override // com.stripe.android.paymentsheet.f.b
            public EnumC4032f a() {
                return null;
            }

            public final Throwable b() {
                return this.f27029a;
            }

            public final B2.b c() {
                return this.f27030b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return AbstractC3255y.d(this.f27029a, cVar.f27029a) && AbstractC3255y.d(this.f27030b, cVar.f27030b);
            }

            public int hashCode() {
                return (this.f27029a.hashCode() * 31) + this.f27030b.hashCode();
            }

            public String toString() {
                return "Fail(cause=" + this.f27029a + ", message=" + this.f27030b + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements b {
            public abstract String b();
        }

        EnumC4032f a();
    }

    Object a(u.l lVar, com.stripe.android.model.p pVar, com.stripe.android.model.r rVar, b.d dVar, boolean z8, S5.d dVar2);

    Object b(u.l lVar, com.stripe.android.model.o oVar, com.stripe.android.model.r rVar, b.d dVar, S5.d dVar2);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f27026a = new a();

        private a() {
        }

        public final InterfaceC4027a a() {
            return null;
        }

        public final void b(InterfaceC4027a interfaceC4027a) {
        }
    }
}
