package com.stripe.android.paymentsheet;

import N2.b;
import O5.I;
import O5.InterfaceC1355k;
import Q2.a;
import a6.InterfaceC1668n;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.SavedStateHandle;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3364k;
import l6.C3377q0;
import l6.M;
import o6.AbstractC3689C;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import s3.AbstractC3995c;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.link.a f27031a;

    /* renamed from: b, reason: collision with root package name */
    private final N2.e f27032b;

    /* renamed from: c, reason: collision with root package name */
    private final SavedStateHandle f27033c;

    /* renamed from: d, reason: collision with root package name */
    private final O2.d f27034d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.v f27035e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3706f f27036f;

    /* renamed from: g, reason: collision with root package name */
    private final o6.w f27037g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3698L f27038h;

    /* renamed from: i, reason: collision with root package name */
    private final o6.w f27039i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3698L f27040j;

    /* renamed from: k, reason: collision with root package name */
    private final InterfaceC1355k f27041k;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: com.stripe.android.paymentsheet.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0606a extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0606a f27042a = new C0606a();

            private C0606a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0606a);
            }

            public int hashCode() {
                return -1384461919;
            }

            public String toString() {
                return "Cancelled";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f27043a = new b();

            private b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 870884921;
            }

            public String toString() {
                return "CompleteWithoutLink";
            }
        }

        /* loaded from: classes4.dex */
        public static final class c extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f27044b = AbstractC3995c.f39222b;

            /* renamed from: a, reason: collision with root package name */
            private final AbstractC3995c f27045a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AbstractC3995c result) {
                super(null);
                AbstractC3255y.i(result, "result");
                this.f27045a = result;
            }

            public final AbstractC3995c a() {
                return this.f27045a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && AbstractC3255y.d(this.f27045a, ((c) obj).f27045a);
            }

            public int hashCode() {
                return this.f27045a.hashCode();
            }

            public String toString() {
                return "CompletedWithPaymentResult(result=" + this.f27045a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class d extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final d f27046a = new d();

            private d() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -1190189758;
            }

            public String toString() {
                return "Launched";
            }
        }

        /* loaded from: classes4.dex */
        public static final class e extends a {

            /* renamed from: a, reason: collision with root package name */
            private final B3.f f27047a;

            public e(B3.f fVar) {
                super(null);
                this.f27047a = fVar;
            }

            public final B3.f a() {
                return this.f27047a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && AbstractC3255y.d(this.f27047a, ((e) obj).f27047a);
            }

            public int hashCode() {
                B3.f fVar = this.f27047a;
                if (fVar == null) {
                    return 0;
                }
                return fVar.hashCode();
            }

            public String toString() {
                return "PaymentDetailsCollected(paymentSelection=" + this.f27047a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class f extends a {

            /* renamed from: b, reason: collision with root package name */
            public static final int f27048b = com.stripe.android.model.o.f25462u;

            /* renamed from: a, reason: collision with root package name */
            private final com.stripe.android.model.o f27049a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(com.stripe.android.model.o paymentMethod) {
                super(null);
                AbstractC3255y.i(paymentMethod, "paymentMethod");
                this.f27049a = paymentMethod;
            }

            public final com.stripe.android.model.o a() {
                return this.f27049a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && AbstractC3255y.d(this.f27049a, ((f) obj).f27049a);
            }

            public int hashCode() {
                return this.f27049a.hashCode();
            }

            public String toString() {
                return "PaymentMethodCollected(paymentMethod=" + this.f27049a + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class g extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final g f27050a = new g();

            private g() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -66772493;
            }

            public String toString() {
                return "Ready";
            }
        }

        /* renamed from: com.stripe.android.paymentsheet.h$a$h, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0607h extends a {

            /* renamed from: a, reason: collision with root package name */
            public static final C0607h f27051a = new C0607h();

            private C0607h() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0607h);
            }

            public int hashCode() {
                return 1573500113;
            }

            public String toString() {
                return "Started";
            }
        }

        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27052a;

        static {
            int[] iArr = new int[R2.a.values().length];
            try {
                iArr[R2.a.f9616a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[R2.a.f9618c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[R2.a.f9617b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[R2.a.f9619d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[R2.a.f9620e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27052a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27053a;

        /* renamed from: b, reason: collision with root package name */
        Object f27054b;

        /* renamed from: c, reason: collision with root package name */
        Object f27055c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27056d;

        /* renamed from: f, reason: collision with root package name */
        int f27058f;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27056d = obj;
            this.f27058f |= Integer.MIN_VALUE;
            return h.this.b(null, null, null, false, this);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.InterfaceC0180a f27059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a.InterfaceC0180a interfaceC0180a) {
            super(0);
            this.f27059a = interfaceC0180a;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P2.c invoke() {
            return this.f27059a.build().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27060a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ N2.d f27062c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(N2.d dVar, S5.d dVar2) {
            super(2, dVar2);
            this.f27062c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f27062c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27060a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                N2.e e9 = h.this.e();
                N2.d dVar = this.f27062c;
                this.f27060a = 1;
                if (e9.c(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27063a;

        /* renamed from: b, reason: collision with root package name */
        Object f27064b;

        /* renamed from: c, reason: collision with root package name */
        Object f27065c;

        /* renamed from: d, reason: collision with root package name */
        Object f27066d;

        /* renamed from: e, reason: collision with root package name */
        Object f27067e;

        /* renamed from: f, reason: collision with root package name */
        boolean f27068f;

        /* renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f27069g;

        /* renamed from: i, reason: collision with root package name */
        int f27071i;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27069g = obj;
            this.f27071i |= Integer.MIN_VALUE;
            return h.this.k(null, null, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class g extends C3252v implements Function1 {
        g(Object obj) {
            super(1, obj, h.class, "onLinkActivityResult", "onLinkActivityResult(Lcom/stripe/android/link/LinkActivityResult;)V", 0);
        }

        public final void d(N2.b p02) {
            AbstractC3255y.i(p02, "p0");
            ((h) this.receiver).j(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((N2.b) obj);
            return I.f8278a;
        }
    }

    public h(com.stripe.android.link.a linkLauncher, N2.e linkConfigurationCoordinator, SavedStateHandle savedStateHandle, O2.d linkStore, a.InterfaceC0180a linkAnalyticsComponentBuilder) {
        AbstractC3255y.i(linkLauncher, "linkLauncher");
        AbstractC3255y.i(linkConfigurationCoordinator, "linkConfigurationCoordinator");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(linkStore, "linkStore");
        AbstractC3255y.i(linkAnalyticsComponentBuilder, "linkAnalyticsComponentBuilder");
        this.f27031a = linkLauncher;
        this.f27032b = linkConfigurationCoordinator;
        this.f27033c = savedStateHandle;
        this.f27034d = linkStore;
        o6.v b8 = AbstractC3689C.b(1, 5, null, 4, null);
        this.f27035e = b8;
        this.f27036f = b8;
        o6.w a8 = AbstractC3700N.a(null);
        this.f27037g = a8;
        this.f27038h = a8;
        o6.w a9 = AbstractC3700N.a(null);
        this.f27039i = a9;
        this.f27040j = AbstractC3708h.b(a9);
        this.f27041k = O5.l.b(new d(linkAnalyticsComponentBuilder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010e, code lost:
    
        if (r8 == null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0146 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(N2.d r27, com.stripe.android.model.p r28, B3.f.a r29, boolean r30, S5.d r31) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.h.b(N2.d, com.stripe.android.model.p, B3.f$a, boolean, S5.d):java.lang.Object");
    }

    private final AbstractC3995c c(N2.b bVar) {
        if (bVar instanceof b.C0137b) {
            return AbstractC3995c.C0877c.f39224c;
        }
        if (bVar instanceof b.a) {
            return AbstractC3995c.a.f39223c;
        }
        if (bVar instanceof b.c) {
            return new AbstractC3995c.d(((b.c) bVar).a());
        }
        throw new O5.p();
    }

    private final P2.c d() {
        return (P2.c) this.f27041k.getValue();
    }

    public final N2.e e() {
        return this.f27032b;
    }

    public final InterfaceC3706f f() {
        return this.f27036f;
    }

    public final InterfaceC3698L g() {
        return this.f27038h;
    }

    public final void h() {
        N2.d dVar = (N2.d) this.f27039i.getValue();
        if (dVar == null) {
            return;
        }
        this.f27031a.b(dVar);
        this.f27035e.e(a.d.f27046a);
    }

    public final void i() {
        N2.d dVar = (N2.d) this.f27040j.getValue();
        if (dVar != null) {
            AbstractC3364k.d(C3377q0.f34651a, null, null, new e(dVar, null), 3, null);
        }
    }

    public final void j(N2.b result) {
        b.C0137b c0137b;
        boolean z8;
        AbstractC3255y.i(result, "result");
        com.stripe.android.model.o oVar = null;
        if (result instanceof b.C0137b) {
            c0137b = (b.C0137b) result;
        } else {
            c0137b = null;
        }
        if (c0137b != null) {
            oVar = c0137b.r();
        }
        if ((result instanceof b.a) && ((b.a) result).a() == b.a.EnumC0136b.f7662a) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (oVar != null) {
            this.f27035e.e(new a.f(oVar));
            this.f27034d.c();
        } else {
            if (z8) {
                this.f27035e.e(a.C0606a.f27042a);
                return;
            }
            this.f27035e.e(new a.c(c(result)));
            this.f27034d.c();
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002e. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(W2.m r19, B3.f r20, boolean r21, S5.d r22) {
        /*
            Method dump skipped, instructions count: 518
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.h.k(W2.m, B3.f, boolean, S5.d):java.lang.Object");
    }

    public final void l(ActivityResultCaller activityResultCaller) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        this.f27031a.c(activityResultCaller, new g(this));
    }

    public final void m(L3.g gVar) {
        boolean z8;
        o6.w wVar = this.f27037g;
        if (gVar != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        wVar.setValue(Boolean.valueOf(z8));
        if (gVar == null) {
            return;
        }
        this.f27039i.setValue(gVar.a());
    }

    public final void n() {
        this.f27031a.e();
    }
}
