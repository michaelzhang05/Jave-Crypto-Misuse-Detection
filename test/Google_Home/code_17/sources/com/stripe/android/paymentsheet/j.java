package com.stripe.android.paymentsheet;

import B3.f;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface j {

    /* loaded from: classes4.dex */
    public static final class a implements j {

        /* renamed from: a, reason: collision with root package name */
        private final f.b f27084a;

        public a(f.b paymentSelection) {
            AbstractC3255y.i(paymentSelection, "paymentSelection");
            this.f27084a = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.q a() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.j
        public String b() {
            return d().getType();
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.p c() {
            return null;
        }

        @Override // com.stripe.android.paymentsheet.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f.b d() {
            return this.f27084a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f27084a, ((a) obj).f27084a);
        }

        @Override // com.stripe.android.paymentsheet.j
        public String getType() {
            return d().getType();
        }

        public int hashCode() {
            return this.f27084a.hashCode();
        }

        public String toString() {
            return "External(paymentSelection=" + this.f27084a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements j {

        /* renamed from: a, reason: collision with root package name */
        private final f.e f27085a;

        public b(f.e paymentSelection) {
            AbstractC3255y.i(paymentSelection, "paymentSelection");
            this.f27085a = paymentSelection;
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.q a() {
            return d().i();
        }

        @Override // com.stripe.android.paymentsheet.j
        public String b() {
            boolean z8;
            f.e d8 = d();
            if (d8 instanceof f.e.c) {
                return o.p.f25587i.f25605a;
            }
            boolean z9 = true;
            if (d8 instanceof f.e.a) {
                z8 = true;
            } else {
                z8 = d8 instanceof f.e.d;
            }
            if (!z8) {
                z9 = d8 instanceof f.e.b;
            }
            if (z9) {
                return d().h().u();
            }
            throw new O5.p();
        }

        @Override // com.stripe.android.paymentsheet.j
        public com.stripe.android.model.p c() {
            return d().h();
        }

        @Override // com.stripe.android.paymentsheet.j
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public f.e d() {
            return this.f27085a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3255y.d(this.f27085a, ((b) obj).f27085a);
        }

        @Override // com.stripe.android.paymentsheet.j
        public String getType() {
            return d().h().u();
        }

        public int hashCode() {
            return this.f27085a.hashCode();
        }

        public String toString() {
            return "New(paymentSelection=" + this.f27085a + ")";
        }
    }

    com.stripe.android.model.q a();

    String b();

    com.stripe.android.model.p c();

    B3.f d();

    String getType();
}
