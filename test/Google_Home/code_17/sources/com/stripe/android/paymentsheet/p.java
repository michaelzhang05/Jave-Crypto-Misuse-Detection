package com.stripe.android.paymentsheet;

import O5.InterfaceC1355k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import t3.C4033g;

/* loaded from: classes4.dex */
public abstract class p {

    /* loaded from: classes4.dex */
    public static final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f27135a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final e f27136b = e.f27154b;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f27137c = false;

        private a() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f27136b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f27137c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27138a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final e f27139b = e.f27155c;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f27140c = false;

        private b() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f27139b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f27140c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27141a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final e f27142b = e.f27156d;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f27143c = false;

        private c() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f27142b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f27143c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends p {

        /* renamed from: a, reason: collision with root package name */
        private final C4033g f27144a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f27145b;

        /* renamed from: c, reason: collision with root package name */
        private final e f27146c;

        /* renamed from: d, reason: collision with root package name */
        private final B2.b f27147d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.o f27148e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC1355k f27149f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC1355k f27150g;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.f() || d.this.f27145b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3256z implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.d().f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C4033g displayableSavedPaymentMethod, boolean z8) {
            super(null);
            AbstractC3255y.i(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            this.f27144a = displayableSavedPaymentMethod;
            this.f27145b = z8;
            this.f27146c = e.f27153a;
            this.f27147d = displayableSavedPaymentMethod.b();
            this.f27148e = displayableSavedPaymentMethod.d();
            this.f27149f = O5.l.b(new b());
            this.f27150g = O5.l.b(new a());
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return this.f27146c;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return ((Boolean) this.f27150g.getValue()).booleanValue();
        }

        public final C4033g d() {
            return this.f27144a;
        }

        public final com.stripe.android.model.o e() {
            return this.f27148e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3255y.d(this.f27144a, dVar.f27144a) && this.f27145b == dVar.f27145b;
        }

        public final boolean f() {
            return ((Boolean) this.f27149f.getValue()).booleanValue();
        }

        public int hashCode() {
            return (this.f27144a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f27145b);
        }

        public String toString() {
            return "SavedPaymentMethod(displayableSavedPaymentMethod=" + this.f27144a + ", canRemovePaymentMethods=" + this.f27145b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f27153a = new e("SavedPaymentMethod", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f27154b = new e("AddCard", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f27155c = new e("GooglePay", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final e f27156d = new e("Link", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f27157e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f27158f;

        static {
            e[] a8 = a();
            f27157e = a8;
            f27158f = U5.b.a(a8);
        }

        private e(String str, int i8) {
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f27153a, f27154b, f27155c, f27156d};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f27157e.clone();
        }
    }

    private p() {
    }

    public abstract e a();

    public abstract boolean b();

    public /* synthetic */ p(AbstractC3247p abstractC3247p) {
        this();
    }
}
