package com.stripe.android.paymentsheet;

import L5.InterfaceC1227k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import q3.C3654g;
import y2.InterfaceC3983b;

/* loaded from: classes4.dex */
public abstract class p {

    /* loaded from: classes4.dex */
    public static final class a extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final a f26080a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final e f26081b = e.f26099b;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f26082c = false;

        private a() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f26081b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f26082c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final b f26083a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final e f26084b = e.f26100c;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f26085c = false;

        private b() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f26084b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f26085c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends p {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26086a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final e f26087b = e.f26101d;

        /* renamed from: c, reason: collision with root package name */
        private static final boolean f26088c = false;

        private c() {
            super(null);
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return f26087b;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return f26088c;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends p {

        /* renamed from: a, reason: collision with root package name */
        private final C3654g f26089a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f26090b;

        /* renamed from: c, reason: collision with root package name */
        private final e f26091c;

        /* renamed from: d, reason: collision with root package name */
        private final InterfaceC3983b f26092d;

        /* renamed from: e, reason: collision with root package name */
        private final com.stripe.android.model.o f26093e;

        /* renamed from: f, reason: collision with root package name */
        private final InterfaceC1227k f26094f;

        /* renamed from: g, reason: collision with root package name */
        private final InterfaceC1227k f26095g;

        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {
            a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.f() || d.this.f26090b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3160z implements Function0 {
            b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.valueOf(d.this.d().f());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3654g displayableSavedPaymentMethod, boolean z8) {
            super(null);
            AbstractC3159y.i(displayableSavedPaymentMethod, "displayableSavedPaymentMethod");
            this.f26089a = displayableSavedPaymentMethod;
            this.f26090b = z8;
            this.f26091c = e.f26098a;
            this.f26092d = displayableSavedPaymentMethod.b();
            this.f26093e = displayableSavedPaymentMethod.d();
            this.f26094f = L5.l.b(new b());
            this.f26095g = L5.l.b(new a());
        }

        @Override // com.stripe.android.paymentsheet.p
        public e a() {
            return this.f26091c;
        }

        @Override // com.stripe.android.paymentsheet.p
        public boolean b() {
            return ((Boolean) this.f26095g.getValue()).booleanValue();
        }

        public final C3654g d() {
            return this.f26089a;
        }

        public final com.stripe.android.model.o e() {
            return this.f26093e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f26089a, dVar.f26089a) && this.f26090b == dVar.f26090b;
        }

        public final boolean f() {
            return ((Boolean) this.f26094f.getValue()).booleanValue();
        }

        public int hashCode() {
            return (this.f26089a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f26090b);
        }

        public String toString() {
            return "SavedPaymentMethod(displayableSavedPaymentMethod=" + this.f26089a + ", canRemovePaymentMethods=" + this.f26090b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f26098a = new e("SavedPaymentMethod", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f26099b = new e("AddCard", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final e f26100c = new e("GooglePay", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final e f26101d = new e("Link", 3);

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ e[] f26102e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f26103f;

        static {
            e[] a8 = a();
            f26102e = a8;
            f26103f = R5.b.a(a8);
        }

        private e(String str, int i8) {
        }

        private static final /* synthetic */ e[] a() {
            return new e[]{f26098a, f26099b, f26100c, f26101d};
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) f26102e.clone();
        }
    }

    private p() {
    }

    public abstract e a();

    public abstract boolean b();

    public /* synthetic */ p(AbstractC3151p abstractC3151p) {
        this();
    }
}
