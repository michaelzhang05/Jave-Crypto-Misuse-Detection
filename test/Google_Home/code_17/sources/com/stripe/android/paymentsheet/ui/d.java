package com.stripe.android.paymentsheet.ui;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface d {

    /* loaded from: classes4.dex */
    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27760a = new a();

        private a() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        private final B2.b f27761a;

        public b(B2.b bVar) {
            this.f27761a = bVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && AbstractC3255y.d(this.f27761a, ((b) obj).f27761a);
        }

        public int hashCode() {
            B2.b bVar = this.f27761a;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "Idle(error=" + this.f27761a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27762a = new c();

        private c() {
        }
    }
}
