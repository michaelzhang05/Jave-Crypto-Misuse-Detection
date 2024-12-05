package com.stripe.android.paymentsheet;

import A3.AbstractC0974y;
import A3.d0;
import B3.f;
import B3.h;
import C3.c;
import H3.c;
import L3.m;
import M3.C1314i;
import M3.C1316k;
import M3.InterfaceC1324t;
import O5.I;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import a6.InterfaceC1670p;
import android.app.Application;
import androidx.activity.result.ActivityResultCaller;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.C1970d;
import com.stripe.android.googlepaylauncher.h;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.r;
import com.stripe.android.paymentsheet.PaymentSheetContractV2;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.e;
import com.stripe.android.paymentsheet.h;
import com.stripe.android.paymentsheet.k;
import com.stripe.android.paymentsheet.l;
import com.stripe.android.paymentsheet.n;
import com.stripe.android.paymentsheet.u;
import com.stripe.android.paymentsheet.x;
import e3.EnumC2791e;
import e4.C2801b;
import h4.Q;
import h6.InterfaceC2963c;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3232a;
import kotlin.jvm.internal.C3252v;
import l6.AbstractC3360i;
import l6.M;
import l6.N;
import n2.C3470g;
import o2.InterfaceC3515b;
import o6.AbstractC3689C;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3687A;
import o6.InterfaceC3693G;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import s2.AbstractC3992a;
import s3.AbstractC3995c;
import t3.C4028b;
import t3.EnumC4032f;
import u2.InterfaceC4057d;
import w3.AbstractC4146b;
import x3.InterfaceC4187a;

/* loaded from: classes4.dex */
public final class y extends P3.a {

    /* renamed from: C, reason: collision with root package name */
    private final PaymentSheetContractV2.a f27768C;

    /* renamed from: D, reason: collision with root package name */
    private final L3.h f27769D;

    /* renamed from: E, reason: collision with root package name */
    private final t3.q f27770E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC4057d f27771F;

    /* renamed from: G, reason: collision with root package name */
    private final n3.i f27772G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC4187a f27773H;

    /* renamed from: I, reason: collision with root package name */
    private final o6.w f27774I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC3698L f27775J;

    /* renamed from: K, reason: collision with root package name */
    private final P3.c f27776K;

    /* renamed from: L, reason: collision with root package name */
    private final o6.v f27777L;

    /* renamed from: M, reason: collision with root package name */
    private final InterfaceC3687A f27778M;

    /* renamed from: N, reason: collision with root package name */
    private final o6.w f27779N;

    /* renamed from: O, reason: collision with root package name */
    private c f27780O;

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC3698L f27781P;

    /* renamed from: Q, reason: collision with root package name */
    private com.stripe.android.paymentsheet.j f27782Q;

    /* renamed from: R, reason: collision with root package name */
    private final B3.b f27783R;

    /* renamed from: S, reason: collision with root package name */
    private final h.d f27784S;

    /* renamed from: T, reason: collision with root package name */
    private final InterfaceC3698L f27785T;

    /* renamed from: U, reason: collision with root package name */
    private final InterfaceC3698L f27786U;

    /* renamed from: V, reason: collision with root package name */
    private final InterfaceC3698L f27787V;

    /* renamed from: W, reason: collision with root package name */
    private final InterfaceC3698L f27788W;

    /* renamed from: X, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.e f27789X;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.h f27791b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f27792c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0663a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f27793a;

            C0663a(y yVar) {
                this.f27793a = yVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h.a aVar, S5.d dVar) {
                this.f27793a.u0(aVar);
                return I.f8278a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.stripe.android.paymentsheet.h hVar, y yVar, S5.d dVar) {
            super(2, dVar);
            this.f27791b = hVar;
            this.f27792c = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(this.f27791b, this.f27792c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27790a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3706f f8 = this.f27791b.f();
                C0663a c0663a = new C0663a(this.f27792c);
                this.f27790a = 1;
                if (f8.collect(c0663a, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27794a;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27794a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                y yVar = y.this;
                this.f27794a = 1;
                if (yVar.C0(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f27796a = new c("SheetTopWallet", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f27797b = new c("SheetBottomBuy", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f27798c = new c("None", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f27799d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f27800e;

        static {
            c[] a8 = a();
            f27799d = a8;
            f27800e = U5.b.a(a8);
        }

        private c(String str, int i8) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f27796a, f27797b, f27798c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f27799d.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f27801a;

        public d(Function0 starterArgsSupplier) {
            AbstractC3255y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f27801a = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            Application a8 = D2.b.a(extras);
            y a9 = AbstractC0974y.a().b(a8).build().a().b(new d0((PaymentSheetContractV2.a) this.f27801a.invoke())).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3255y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create");
            return a9;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27802a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f27803b;

        static {
            int[] iArr = new int[u.k.a.values().length];
            try {
                iArr[u.k.a.f27507a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.k.a.f27508b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.k.a.f27509c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.k.a.f27510d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u.k.a.f27511e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u.k.a.f27513g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u.k.a.f27514h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u.k.a.f27512f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f27802a = iArr;
            int[] iArr2 = new int[u.k.c.values().length];
            try {
                iArr2[u.k.c.f27517a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f27803b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f27804a;

        /* renamed from: c, reason: collision with root package name */
        int f27806c;

        f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27804a = obj;
            this.f27806c |= Integer.MIN_VALUE;
            return y.this.e0(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B3.h invoke(B3.h hVar) {
            return y.this.D0(hVar, c.f27797b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f27808a;

        /* renamed from: b, reason: collision with root package name */
        Object f27809b;

        /* renamed from: c, reason: collision with root package name */
        int f27810c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f27811d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ B3.f f27813f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(B3.f fVar, S5.d dVar) {
            super(2, dVar);
            this.f27813f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            h hVar = new h(this.f27813f, dVar);
            hVar.f27811d = obj;
            return hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x009a, code lost:
        
            if (r1 == null) goto L23;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0072  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = T5.b.e()
                int r1 = r9.f27810c
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r9.f27809b
                com.stripe.android.paymentsheet.l r0 = (com.stripe.android.paymentsheet.l) r0
                java.lang.Object r1 = r9.f27808a
                com.stripe.android.paymentsheet.y r1 = (com.stripe.android.paymentsheet.y) r1
                java.lang.Object r2 = r9.f27811d
                l6.M r2 = (l6.M) r2
                O5.t.b(r10)
                goto L60
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                O5.t.b(r10)
                java.lang.Object r10 = r9.f27811d
                l6.M r10 = (l6.M) r10
                com.stripe.android.paymentsheet.y r1 = com.stripe.android.paymentsheet.y.this
                B3.f r3 = r9.f27813f
                B3.f r1 = com.stripe.android.paymentsheet.y.Z(r1, r3)
                r3 = 0
                if (r1 == 0) goto L4a
                com.stripe.android.paymentsheet.y r4 = com.stripe.android.paymentsheet.y.this
                com.stripe.android.paymentsheet.PaymentSheetContractV2$a r4 = r4.k0()
                com.stripe.android.paymentsheet.u$l r4 = r4.g()
                com.stripe.android.paymentsheet.y r5 = com.stripe.android.paymentsheet.y.this
                com.stripe.android.paymentsheet.u$g r5 = r5.f()
                com.stripe.android.paymentsheet.l r1 = com.stripe.android.paymentsheet.m.a(r1, r4, r5)
                goto L4b
            L4a:
                r1 = r3
            L4b:
                if (r1 == 0) goto L70
                com.stripe.android.paymentsheet.y r3 = com.stripe.android.paymentsheet.y.this
                r9.f27811d = r10
                r9.f27808a = r3
                r9.f27809b = r1
                r9.f27810c = r2
                java.lang.Object r10 = com.stripe.android.paymentsheet.y.N(r3, r9)
                if (r10 != r0) goto L5e
                return r0
            L5e:
                r0 = r1
                r1 = r3
            L60:
                com.stripe.android.model.StripeIntent r10 = (com.stripe.android.model.StripeIntent) r10
                com.stripe.android.paymentsheet.e r1 = com.stripe.android.paymentsheet.y.Q(r1)
                com.stripe.android.paymentsheet.e$b r2 = new com.stripe.android.paymentsheet.e$b
                r2.<init>(r10, r0)
                r1.U(r2)
                O5.I r3 = O5.I.f8278a
            L70:
                if (r3 != 0) goto Lcd
                B3.f r10 = r9.f27813f
                com.stripe.android.paymentsheet.y r0 = com.stripe.android.paymentsheet.y.this
                if (r10 == 0) goto L9c
                java.lang.Class r1 = r10.getClass()
                h6.c r1 = kotlin.jvm.internal.U.b(r1)
                java.lang.String r1 = r1.a()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot confirm using a "
                r2.append(r3)
                r2.append(r1)
                java.lang.String r1 = " payment selection!"
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                if (r1 != 0) goto L9e
            L9c:
                java.lang.String r1 = "Cannot confirm without a payment selection!"
            L9e:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                r2.<init>(r1)
                if (r10 == 0) goto Lac
                n3.i$f r10 = n3.i.f.f35432p
                if (r10 != 0) goto Laa
                goto Lac
            Laa:
                r4 = r10
                goto Laf
            Lac:
                n3.i$f r10 = n3.i.f.f35431o
                goto Laa
            Laf:
                n3.i r3 = com.stripe.android.paymentsheet.y.O(r0)
                w2.k$a r10 = w2.AbstractC4144k.f40356e
                w2.k r5 = r10.b(r2)
                r7 = 4
                r8 = 0
                r6 = 0
                n3.i.b.a(r3, r4, r5, r6, r7, r8)
                com.stripe.android.paymentsheet.n$b r10 = new com.stripe.android.paymentsheet.n$b
                B2.b r1 = s2.AbstractC3992a.a(r2)
                com.stripe.android.paymentsheet.k$d r3 = com.stripe.android.paymentsheet.k.d.f27089a
                r10.<init>(r2, r1, r3)
                com.stripe.android.paymentsheet.y.a0(r0, r10)
            Lcd:
                O5.I r10 = O5.I.f8278a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f27814a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final B2.b invoke(B3.h hVar) {
            h.d a8;
            if (hVar != null && (a8 = hVar.a()) != null) {
                return a8.a();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5551invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5551invoke() {
            y.this.f27777L.e(x.b.f27766a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27816a;

        /* renamed from: b, reason: collision with root package name */
        Object f27817b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27818c;

        /* renamed from: e, reason: collision with root package name */
        int f27820e;

        k(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27818c = obj;
            this.f27820e |= Integer.MIN_VALUE;
            return y.this.y0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27821a;

        /* renamed from: b, reason: collision with root package name */
        Object f27822b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27823c;

        /* renamed from: e, reason: collision with root package name */
        int f27825e;

        l(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27823c = obj;
            this.f27825e |= Integer.MIN_VALUE;
            return y.this.z0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27826a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f27828a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f27829b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f27830c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, S5.d dVar) {
                super(2, dVar);
                this.f27830c = yVar;
            }

            @Override // a6.InterfaceC1668n
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e.InterfaceC0604e interfaceC0604e, S5.d dVar) {
                return ((a) create(interfaceC0604e, dVar)).invokeSuspend(I.f8278a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                a aVar = new a(this.f27830c, dVar);
                aVar.f27829b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f27828a == 0) {
                    O5.t.b(obj);
                    e.InterfaceC0604e interfaceC0604e = (e.InterfaceC0604e) this.f27829b;
                    if (!(interfaceC0604e instanceof e.InterfaceC0604e.c)) {
                        if (interfaceC0604e instanceof e.InterfaceC0604e.d) {
                            e.InterfaceC0604e.d dVar = (e.InterfaceC0604e.d) interfaceC0604e;
                            if (!dVar.b() || !(dVar.a() instanceof l.c)) {
                                this.f27830c.N0(true);
                            } else {
                                this.f27830c.N0(false);
                            }
                            y yVar = this.f27830c;
                            yVar.O0(yVar.m0());
                        } else if (interfaceC0604e instanceof e.InterfaceC0604e.b) {
                            this.f27830c.N0(true);
                            if (!(this.f27830c.s0().getValue() instanceof h.c)) {
                                y yVar2 = this.f27830c;
                                yVar2.O0(yVar2.m0());
                            }
                        } else if (interfaceC0604e instanceof e.InterfaceC0604e.a) {
                            this.f27830c.N0(true);
                            this.f27830c.I0(((e.InterfaceC0604e.a) interfaceC0604e).a());
                        }
                    }
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        m(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27826a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                InterfaceC3698L C8 = y.this.f27789X.C();
                a aVar = new a(y.this, null);
                this.f27826a = 1;
                if (AbstractC3708h.j(C8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3256z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f27832a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ H3.h f27833b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f27834c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.y$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0664a extends C3232a implements InterfaceC1668n {
                C0664a(Object obj) {
                    super(2, obj, y.class, "handleCvcCompletionState", "handleCvcCompletionState(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;)V", 4);
                }

                @Override // a6.InterfaceC1668n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(H3.c cVar, S5.d dVar) {
                    return a.m((y) this.receiver, cVar, dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(H3.h hVar, y yVar, S5.d dVar) {
                super(2, dVar);
                this.f27833b = hVar;
                this.f27834c = yVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object m(y yVar, H3.c cVar, S5.d dVar) {
                yVar.t0(cVar);
                return I.f8278a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f27833b, this.f27834c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f27832a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    InterfaceC3698L c8 = this.f27833b.c();
                    C0664a c0664a = new C0664a(this.f27834c);
                    this.f27832a = 1;
                    if (AbstractC3708h.j(c8, c0664a, this) == e8) {
                        return e8;
                    }
                }
                return I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        n() {
            super(1);
        }

        public final void a(H3.d cvcRecollectionData) {
            boolean z8;
            StripeIntent W7;
            AbstractC3255y.i(cvcRecollectionData, "cvcRecollectionData");
            String b8 = cvcRecollectionData.b();
            if (b8 == null) {
                b8 = "";
            }
            String str = b8;
            EnumC2791e a8 = cvcRecollectionData.a();
            C1970d c1970d = (C1970d) y.this.t().getValue();
            if (c1970d != null && (W7 = c1970d.W()) != null && !W7.c()) {
                z8 = true;
            } else {
                z8 = false;
            }
            H3.h hVar = new H3.h(new H3.a(str, a8, null, z8, 4, null));
            AbstractC3360i.d(ViewModelKt.getViewModelScope(y.this), null, null, new a(hVar, y.this, null), 3, null);
            y.this.r().m(new c.d(hVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((H3.d) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27835a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f27836b;

        /* renamed from: d, reason: collision with root package name */
        int f27838d;

        o(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27836b = obj;
            this.f27838d |= Integer.MIN_VALUE;
            return y.this.C0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27839a;

        p(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new p(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = T5.b.e();
            int i8 = this.f27839a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                    a8 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                L3.h hVar = y.this.f27769D;
                u.l g8 = y.this.k0().g();
                u.g a9 = y.this.k0().a();
                boolean B8 = y.this.f27789X.B();
                boolean h8 = y.this.k0().h();
                this.f27839a = 1;
                a8 = hVar.a(g8, a9, B8, h8, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            return O5.s.a(a8);
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((p) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27841a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3995c f27843c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(AbstractC3995c abstractC3995c, S5.d dVar) {
            super(2, dVar);
            this.f27843c = abstractC3995c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new q(this.f27843c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27841a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                y yVar = y.this;
                this.f27841a = 1;
                obj = yVar.e0(this);
                if (obj == e8) {
                    return e8;
                }
            }
            y.this.J0((StripeIntent) obj, this.f27843c);
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f27844a = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2801b invoke(C1970d c1970d) {
            if (c1970d != null) {
                return c1970d.h();
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f27845a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f27846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(EventReporter eventReporter, y yVar) {
            super(0);
            this.f27845a = eventReporter;
            this.f27846b = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5552invoke();
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5552invoke() {
            this.f27845a.j((B3.f) this.f27846b.y().getValue());
            this.f27846b.f0();
        }
    }

    /* loaded from: classes4.dex */
    public static final class t implements DefaultLifecycleObserver {
        t() {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.a(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner owner) {
            AbstractC3255y.i(owner, "owner");
            y.this.p().n();
            androidx.lifecycle.c.b(this, owner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.c(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.d(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.e(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            androidx.lifecycle.c.f(this, lifecycleOwner);
        }
    }

    /* loaded from: classes4.dex */
    static final class u extends AbstractC3256z implements Function1 {
        u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final L3.m invoke(B3.h hVar) {
            B3.h D02 = y.this.D0(hVar, c.f27796a);
            B2.b bVar = null;
            if (D02 == null) {
                return null;
            }
            if (D02 instanceof h.b) {
                h.d a8 = ((h.b) D02).a();
                if (a8 != null) {
                    bVar = a8.a();
                }
                return new m.b(bVar);
            }
            if (D02 instanceof h.c) {
                return m.c.f6075a;
            }
            if (D02 instanceof h.a) {
                return new m.a(((h.a) D02).b());
            }
            throw new O5.p();
        }
    }

    /* loaded from: classes4.dex */
    static final class v extends AbstractC3256z implements InterfaceC1670p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.h f27850b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3252v implements Function0 {
            a(Object obj) {
                super(0, obj, y.class, "checkoutWithGooglePay", "checkoutWithGooglePay()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5553invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5553invoke() {
                ((y) this.receiver).h0();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3252v implements Function0 {
            b(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.h.class, "launchLink", "launchLink()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5554invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5554invoke() {
                ((com.stripe.android.paymentsheet.h) this.receiver).h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(com.stripe.android.paymentsheet.h hVar) {
            super(4);
            this.f27850b = hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        
            if (r15.a0() == true) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final L3.n a(java.lang.Boolean r12, java.lang.String r13, boolean r14, b3.C1970d r15) {
            /*
                r11 = this;
                L3.n$a r0 = L3.n.f6076g
                r1 = 0
                if (r15 == 0) goto Ld
                boolean r2 = r15.a0()
                r3 = 1
                if (r2 != r3) goto Ld
                goto Le
            Ld:
                r3 = 0
            Le:
                r1 = 0
                if (r15 == 0) goto L16
                java.util.List r2 = r15.h0()
                goto L17
            L16:
                r2 = r1
            L17:
                if (r2 != 0) goto L1d
                java.util.List r2 = P5.AbstractC1378t.m()
            L1d:
                r6 = r2
                com.stripe.android.paymentsheet.y r2 = com.stripe.android.paymentsheet.y.this
                com.stripe.android.googlepaylauncher.h$d r7 = r2.q0()
                com.stripe.android.paymentsheet.y r2 = com.stripe.android.paymentsheet.y.this
                B3.b r4 = com.stripe.android.paymentsheet.y.P(r2)
                com.stripe.android.paymentsheet.y$v$a r8 = new com.stripe.android.paymentsheet.y$v$a
                com.stripe.android.paymentsheet.y r2 = com.stripe.android.paymentsheet.y.this
                r8.<init>(r2)
                com.stripe.android.paymentsheet.y$v$b r9 = new com.stripe.android.paymentsheet.y$v$b
                com.stripe.android.paymentsheet.h r2 = r11.f27850b
                r9.<init>(r2)
                if (r15 == 0) goto L3e
                com.stripe.android.model.StripeIntent r1 = r15.W()
            L3e:
                boolean r10 = r1 instanceof com.stripe.android.model.u
                r1 = r12
                r2 = r13
                r5 = r14
                L3.n r12 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.v.a(java.lang.Boolean, java.lang.String, boolean, b3.d):L3.n");
        }

        @Override // a6.InterfaceC1670p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (C1970d) obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PaymentSheetContractV2.a args, EventReporter eventReporter, L3.h paymentSheetLoader, K3.c customerRepository, t3.q prefsRepository, InterfaceC4057d logger, S5.g workContext, SavedStateHandle savedStateHandle, com.stripe.android.paymentsheet.h linkHandler, e.d intentConfirmationHandlerFactory, InterfaceC3515b.a cardAccountRangeRepositoryFactory, InterfaceC1324t.a editInteractorFactory, n3.i errorReporter, InterfaceC4187a cvcRecollectionHandler) {
        super(args.a(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, editInteractorFactory, cardAccountRangeRepositoryFactory, true);
        B3.b bVar;
        h.d dVar;
        L2.d dVar2;
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(eventReporter, "eventReporter");
        AbstractC3255y.i(paymentSheetLoader, "paymentSheetLoader");
        AbstractC3255y.i(customerRepository, "customerRepository");
        AbstractC3255y.i(prefsRepository, "prefsRepository");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(linkHandler, "linkHandler");
        AbstractC3255y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(cvcRecollectionHandler, "cvcRecollectionHandler");
        this.f27768C = args;
        this.f27769D = paymentSheetLoader;
        this.f27770E = prefsRepository;
        this.f27771F = logger;
        this.f27772G = errorReporter;
        this.f27773H = cvcRecollectionHandler;
        o6.w a8 = AbstractC3700N.a(Boolean.TRUE);
        this.f27774I = a8;
        this.f27775J = a8;
        P3.c cVar = new P3.c(f(), A0(), r().f(), d(), y4.g.m(t(), r.f27844a), y(), g(), k(), new s(eventReporter, this));
        this.f27776K = cVar;
        o6.v b8 = AbstractC3689C.b(1, 0, null, 6, null);
        this.f27777L = b8;
        this.f27778M = b8;
        o6.w a9 = AbstractC3700N.a(null);
        this.f27779N = a9;
        this.f27780O = c.f27797b;
        InterfaceC3698L m8 = y4.g.m(a9, new g());
        this.f27781P = m8;
        u.k u8 = args.a().u();
        u.k.a b9 = u8 != null ? u8.b() : null;
        switch (b9 == null ? -1 : e.f27802a[b9.ordinal()]) {
            case -1:
            case 8:
                bVar = B3.b.f800f;
                break;
            case 0:
            default:
                throw new O5.p();
            case 1:
                bVar = B3.b.f795a;
                break;
            case 2:
                bVar = B3.b.f796b;
                break;
            case 3:
                bVar = B3.b.f797c;
                break;
            case 4:
                bVar = B3.b.f798d;
                break;
            case 5:
                bVar = B3.b.f799e;
                break;
            case 6:
                bVar = B3.b.f801g;
                break;
            case 7:
                bVar = B3.b.f802h;
                break;
        }
        this.f27783R = bVar;
        u.k b10 = args.b();
        if (b10 != null) {
            if (b10.g() == null && !A0()) {
                logger.c("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            } else {
                if (e.f27803b[b10.h().ordinal()] == 1) {
                    dVar2 = L2.d.f5905b;
                } else {
                    dVar2 = L2.d.f5906c;
                }
                dVar = new h.d(dVar2, b10.m(), f().v(), args.a().i().h(), args.a().i().v(), false, false, 96, null);
                this.f27784S = dVar;
                this.f27785T = AbstractC3708h.J(cVar.h(), ViewModelKt.getViewModelScope(this), InterfaceC3693G.a.b(InterfaceC3693G.f36586a, 0L, 0L, 3, null), null);
                this.f27786U = y4.g.m(m8, i.f27814a);
                this.f27787V = y4.g.f(linkHandler.g(), linkHandler.e().d(), d(), t(), new v(linkHandler));
                this.f27788W = y4.g.m(a9, new u());
                this.f27789X = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
                C3470g.f35374a.c(this, savedStateHandle);
                AbstractC3360i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
                eventReporter.l(f(), args.g() instanceof u.l.a);
                AbstractC3360i.d(ViewModelKt.getViewModelScope(this), workContext, null, new b(null), 2, null);
            }
        }
        dVar = null;
        this.f27784S = dVar;
        this.f27785T = AbstractC3708h.J(cVar.h(), ViewModelKt.getViewModelScope(this), InterfaceC3693G.a.b(InterfaceC3693G.f36586a, 0L, 0L, 3, null), null);
        this.f27786U = y4.g.m(m8, i.f27814a);
        this.f27787V = y4.g.f(linkHandler.g(), linkHandler.e().d(), d(), t(), new v(linkHandler));
        this.f27788W = y4.g.m(a9, new u());
        this.f27789X = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
        C3470g.f35374a.c(this, savedStateHandle);
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
        eventReporter.l(f(), args.g() instanceof u.l.a);
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), workContext, null, new b(null), 2, null);
    }

    private final void B0() {
        this.f27773H.a((B3.f) y().getValue(), new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C0(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.y.o
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.y$o r0 = (com.stripe.android.paymentsheet.y.o) r0
            int r1 = r0.f27838d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27838d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$o r0 = new com.stripe.android.paymentsheet.y$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27836b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27838d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            O5.t.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f27835a
            com.stripe.android.paymentsheet.y r2 = (com.stripe.android.paymentsheet.y) r2
            O5.t.b(r7)
            goto L55
        L3d:
            O5.t.b(r7)
            S5.g r7 = r6.B()
            com.stripe.android.paymentsheet.y$p r2 = new com.stripe.android.paymentsheet.y$p
            r2.<init>(r3)
            r0.f27835a = r6
            r0.f27838d = r5
            java.lang.Object r7 = l6.AbstractC3360i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            O5.s r7 = (O5.s) r7
            java.lang.Object r7 = r7.j()
            java.lang.Throwable r5 = O5.s.e(r7)
            if (r5 != 0) goto L6e
            L3.l r7 = (L3.l) r7
            r0.f27835a = r3
            r0.f27838d = r4
            java.lang.Object r7 = r2.y0(r7, r0)
            if (r7 != r1) goto L71
            return r1
        L6e:
            r2.x0(r5)
        L71:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.C0(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B3.h D0(B3.h hVar, c cVar) {
        if (this.f27780O != cVar) {
            return null;
        }
        return hVar;
    }

    private final void E0(Throwable th) {
        this.f27771F.a("Payment Sheet error", th);
        this.f27777L.e(new x.c(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final B3.f G0(B3.f fVar) {
        r.b bVar;
        if (!(fVar instanceof f.C0009f) || !z.c(this)) {
            return fVar;
        }
        f.C0009f c0009f = (f.C0009f) fVar;
        com.stripe.android.model.r i8 = c0009f.i();
        if (i8 instanceof r.b) {
            bVar = (r.b) i8;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = new r.b(null, null, null, 7, null);
        }
        return f.C0009f.h(c0009f, null, null, r.b.g(bVar, (String) ((Q) j().getValue()).j().getValue(), null, null, null, 14, null), 3, null);
    }

    private final void H0(n.b bVar) {
        boolean d8;
        com.stripe.android.paymentsheet.k c8 = bVar.c();
        if (AbstractC3255y.d(c8, k.f.f27091a)) {
            w0(new AbstractC4146b.c(bVar.a()), bVar.b());
            return;
        }
        if (AbstractC3255y.d(c8, k.a.f27086a)) {
            w0(AbstractC4146b.a.f40372a, bVar.b());
            return;
        }
        if (c8 instanceof k.c) {
            w0(new AbstractC4146b.C0918b(((k.c) bVar.c()).a()), bVar.b());
            return;
        }
        if (AbstractC3255y.d(c8, k.b.f27087a)) {
            E0(bVar.a());
            return;
        }
        if (AbstractC3255y.d(c8, k.e.f27090a)) {
            d8 = true;
        } else {
            d8 = AbstractC3255y.d(c8, k.d.f27089a);
        }
        if (d8) {
            G(bVar.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I0(com.stripe.android.paymentsheet.n nVar) {
        if (nVar instanceof n.c) {
            n.c cVar = (n.c) nVar;
            v0(cVar.b(), cVar.a(), false);
        } else if (nVar instanceof n.b) {
            H0((n.b) nVar);
        } else if ((nVar instanceof n.a) || nVar == null) {
            M0(this, null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J0(StripeIntent stripeIntent, AbstractC3995c abstractC3995c) {
        if (abstractC3995c instanceof AbstractC3995c.C0877c) {
            v0(stripeIntent, null, false);
            return;
        }
        if (abstractC3995c instanceof AbstractC3995c.d) {
            AbstractC3995c.d dVar = (AbstractC3995c.d) abstractC3995c;
            w0(new AbstractC4146b.c(dVar.a()), AbstractC3992a.a(dVar.a()));
        } else if (abstractC3995c instanceof AbstractC3995c.a) {
            M0(this, null, 1, null);
        }
    }

    private final void L0(B2.b bVar) {
        h.d dVar;
        o6.w wVar = this.f27779N;
        if (bVar != null) {
            dVar = new h.d(bVar);
        } else {
            dVar = null;
        }
        wVar.setValue(new h.b(dVar));
        x().set("processing", Boolean.FALSE);
    }

    static /* synthetic */ void M0(y yVar, B2.b bVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bVar = null;
        }
        yVar.L0(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(boolean z8) {
        this.f27774I.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(c cVar) {
        this.f27780O = cVar;
        x().set("processing", Boolean.TRUE);
        this.f27779N.setValue(h.c.f874b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(S5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.stripe.android.paymentsheet.y.f
            if (r0 == 0) goto L13
            r0 = r5
            com.stripe.android.paymentsheet.y$f r0 = (com.stripe.android.paymentsheet.y.f) r0
            int r1 = r0.f27806c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27806c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$f r0 = new com.stripe.android.paymentsheet.y$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f27804a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27806c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            O5.t.b(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            O5.t.b(r5)
            o6.L r5 = r4.t()
            o6.f r5 = o6.AbstractC3708h.v(r5)
            r0.f27806c = r3
            java.lang.Object r5 = o6.AbstractC3708h.w(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            b3.d r5 = (b3.C1970d) r5
            com.stripe.android.model.StripeIntent r5 = r5.W()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.e0(S5.d):java.lang.Object");
    }

    private final void g0(B3.f fVar, c cVar) {
        this.f27780O = cVar;
        i0(fVar);
    }

    private final void i0(B3.f fVar) {
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), B(), null, new h(fVar, null), 2, null);
    }

    private final List j0(C1970d c1970d, C4028b c4028b) {
        Object bVar;
        if (f().w() == u.n.f27549d) {
            return O3.u.f8220a.a(this, c1970d, c4028b);
        }
        if (!((Collection) c4028b.c().getValue()).isEmpty()) {
            bVar = new c.j(C1316k.f6949r.a(this, c1970d, c4028b, w()), p0());
        } else {
            bVar = new c.b(C1314i.f6895r.a(this, c1970d));
        }
        return AbstractC1378t.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(H3.c cVar) {
        f.C0009f c0009f;
        r.b bVar;
        Object value = y().getValue();
        if (value instanceof f.C0009f) {
            c0009f = (f.C0009f) value;
        } else {
            c0009f = null;
        }
        if (c0009f != null) {
            if (cVar instanceof c.a) {
                bVar = new r.b(((c.a) cVar).a(), null, null, 6, null);
            } else if (AbstractC3255y.d(cVar, c.b.f3532a)) {
                bVar = new r.b("", null, null, 6, null);
            } else {
                throw new O5.p();
            }
            M(new f.C0009f(c0009f.r(), c0009f.p(), bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(h.a aVar) {
        int i8 = 1;
        I i9 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (AbstractC3255y.d(aVar, h.a.C0606a.f27042a)) {
            M0(this, null, 1, null);
            return;
        }
        if (aVar instanceof h.a.f) {
            M(new f.C0009f(((h.a.f) aVar).a(), f.C0009f.b.f866c, null, 4, null));
            g0((B3.f) y().getValue(), c.f27796a);
            return;
        }
        if (aVar instanceof h.a.c) {
            F0(((h.a.c) aVar).a());
            return;
        }
        if (AbstractC3255y.d(aVar, h.a.d.f27046a)) {
            O0(c.f27796a);
            return;
        }
        if (aVar instanceof h.a.e) {
            B3.f a8 = ((h.a.e) aVar).a();
            if (a8 != null) {
                M(a8);
                g0((B3.f) y().getValue(), c.f27797b);
                i9 = I.f8278a;
            }
            if (i9 == null) {
                g0((B3.f) y().getValue(), c.f27797b);
                return;
            }
            return;
        }
        if (AbstractC3255y.d(aVar, h.a.g.f27050a)) {
            this.f27780O = c.f27797b;
            this.f27779N.setValue(new h.b(objArr2 == true ? 1 : 0, i8, objArr == true ? 1 : 0));
        } else if (AbstractC3255y.d(aVar, h.a.C0607h.f27051a)) {
            this.f27780O = c.f27797b;
            this.f27779N.setValue(h.c.f874b);
        } else if (AbstractC3255y.d(aVar, h.a.b.f27043a)) {
            f0();
        }
    }

    private final void v0(StripeIntent stripeIntent, EnumC4032f enumC4032f, boolean z8) {
        com.stripe.android.model.o oVar;
        B3.f fVar = (B3.f) y().getValue();
        n().u(fVar, enumC4032f);
        if (fVar != null && B3.g.a(fVar)) {
            p().i();
        }
        if (fVar instanceof f.e) {
            com.stripe.android.model.o r8 = stripeIntent.r();
            boolean a8 = N3.d.a((f.e) fVar, this.f27768C.g());
            fVar = null;
            if (a8) {
                oVar = r8;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                fVar = new f.C0009f(oVar, null, null, 6, null);
            }
        }
        if (fVar != null) {
            this.f27770E.a(fVar);
        }
        if (z8) {
            this.f27777L.e(x.b.f27766a);
        } else {
            this.f27779N.setValue(new h.a(new j()));
        }
    }

    private final void w0(AbstractC4146b abstractC4146b, B2.b bVar) {
        n().o((B3.f) y().getValue(), abstractC4146b);
        L0(bVar);
    }

    private final void x0(Throwable th) {
        J(null);
        E0(th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y0(L3.l r7, S5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.y.k
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.y$k r0 = (com.stripe.android.paymentsheet.y.k) r0
            int r1 = r0.f27820e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27820e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$k r0 = new com.stripe.android.paymentsheet.y$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f27818c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27820e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r8)
            goto L85
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f27817b
            L3.l r7 = (L3.l) r7
            java.lang.Object r2 = r0.f27816a
            com.stripe.android.paymentsheet.y r2 = (com.stripe.android.paymentsheet.y) r2
            O5.t.b(r8)
            goto L53
        L40:
            O5.t.b(r8)
            com.stripe.android.paymentsheet.e r8 = r6.f27789X
            r0.f27816a = r6
            r0.f27817b = r7
            r0.f27820e = r4
            java.lang.Object r8 = r8.s(r0)
            if (r8 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            com.stripe.android.paymentsheet.n r8 = (com.stripe.android.paymentsheet.n) r8
            boolean r5 = r8 instanceof com.stripe.android.paymentsheet.n.c
            if (r5 == 0) goto L67
            com.stripe.android.paymentsheet.n$c r8 = (com.stripe.android.paymentsheet.n.c) r8
            com.stripe.android.model.StripeIntent r7 = r8.b()
            t3.f r8 = r8.a()
            r2.v0(r7, r8, r4)
            goto L74
        L67:
            L3.j r8 = r7.s()
            if (r8 == 0) goto L77
            L3.j r7 = r7.s()
            r2.x0(r7)
        L74:
            O5.I r7 = O5.I.f8278a
            return r7
        L77:
            r8 = 0
            r0.f27816a = r8
            r0.f27817b = r8
            r0.f27820e = r3
            java.lang.Object r7 = r2.z0(r7, r0)
            if (r7 != r1) goto L85
            return r1
        L85:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.y0(L3.l, S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z0(L3.l r10, S5.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.stripe.android.paymentsheet.y.l
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.paymentsheet.y$l r0 = (com.stripe.android.paymentsheet.y.l) r0
            int r1 = r0.f27825e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27825e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$l r0 = new com.stripe.android.paymentsheet.y$l
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f27823c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f27825e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.f27822b
            L3.l r10 = (L3.l) r10
            java.lang.Object r0 = r0.f27821a
            com.stripe.android.paymentsheet.y r0 = (com.stripe.android.paymentsheet.y) r0
            O5.t.b(r11)
            goto L70
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            O5.t.b(r11)
            t3.b r11 = r9.i()
            L3.a r2 = r10.b()
            r11.d(r2)
            B3.f r11 = r10.i()
            r9.M(r11)
            b3.d r11 = r10.h()
            r9.J(r11)
            com.stripe.android.paymentsheet.h r11 = r9.p()
            L3.g r2 = r10.g()
            r11.m(r2)
            com.stripe.android.paymentsheet.e r11 = r9.f27789X
            r0.f27821a = r9
            r0.f27822b = r10
            r0.f27825e = r3
            java.lang.Object r11 = r11.s(r0)
            if (r11 != r1) goto L6f
            return r1
        L6f:
            r0 = r9
        L70:
            boolean r1 = r11 instanceof com.stripe.android.paymentsheet.n.b
            r2 = 0
            if (r1 == 0) goto L78
            com.stripe.android.paymentsheet.n$b r11 = (com.stripe.android.paymentsheet.n.b) r11
            goto L79
        L78:
            r11 = r2
        L79:
            if (r11 == 0) goto L86
            java.lang.Throwable r11 = r11.a()
            if (r11 == 0) goto L86
            B2.b r11 = s2.AbstractC3992a.a(r11)
            goto L87
        L86:
            r11 = r2
        L87:
            r0.L0(r11)
            C3.b r11 = r0.r()
            b3.d r10 = r10.h()
            t3.b r1 = r0.i()
            java.util.List r10 = r0.j0(r10, r1)
            r11.l(r10)
            l6.M r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            com.stripe.android.paymentsheet.y$m r6 = new com.stripe.android.paymentsheet.y$m
            r6.<init>(r2)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            l6.AbstractC3360i.d(r3, r4, r5, r6, r7, r8)
            O5.I r10 = O5.I.f8278a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.z0(L3.l, S5.d):java.lang.Object");
    }

    @Override // P3.a
    public InterfaceC3698L A() {
        return this.f27787V;
    }

    public final boolean A0() {
        return A.a(this.f27768C.g());
    }

    @Override // P3.a
    public void D(f.e.d paymentSelection) {
        AbstractC3255y.i(paymentSelection, "paymentSelection");
        M(paymentSelection);
        n().j((B3.f) y().getValue());
        f0();
    }

    @Override // P3.a
    public void E(B3.f fVar) {
        if (!AbstractC3255y.d(fVar, y().getValue())) {
            M(fVar);
        }
    }

    public void F0(AbstractC3995c paymentResult) {
        AbstractC3255y.i(paymentResult, "paymentResult");
        AbstractC3360i.d(ViewModelKt.getViewModelScope(this), B(), null, new q(paymentResult, null), 2, null);
    }

    @Override // P3.a
    public void G(B2.b bVar) {
        L0(bVar);
    }

    @Override // P3.a
    public void H() {
        n().onDismiss();
        this.f27777L.e(x.a.f27765a);
    }

    @Override // P3.a
    public void I(com.stripe.android.paymentsheet.j jVar) {
        this.f27782Q = jVar;
    }

    public final void K0(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3255y.i(activityResultCaller, "activityResultCaller");
        AbstractC3255y.i(lifecycleOwner, "lifecycleOwner");
        p().l(activityResultCaller);
        this.f27789X.P(activityResultCaller, lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(new t());
    }

    @Override // P3.a
    public void b() {
        if (this.f27779N.getValue() instanceof h.b) {
            this.f27779N.setValue(new h.b(null));
        }
    }

    public final void f0() {
        if (z.d(this)) {
            B0();
        } else {
            g0((B3.f) y().getValue(), c.f27797b);
        }
    }

    public final void h0() {
        g0(f.c.f820a, c.f27796a);
    }

    public final PaymentSheetContractV2.a k0() {
        return this.f27768C;
    }

    public final InterfaceC3698L l0() {
        return this.f27781P;
    }

    @Override // P3.a
    public InterfaceC3698L m() {
        return this.f27786U;
    }

    public final c m0() {
        return this.f27780O;
    }

    public final InterfaceC3698L n0() {
        return this.f27775J;
    }

    public final InterfaceC4187a o0() {
        return this.f27773H;
    }

    public final c.j.b p0() {
        if (z.a(this)) {
            return new c.j.b.C0021b(j());
        }
        return c.j.b.a.f1297a;
    }

    public final h.d q0() {
        return this.f27784S;
    }

    public final InterfaceC3687A r0() {
        return this.f27778M;
    }

    @Override // P3.a
    public com.stripe.android.paymentsheet.j s() {
        return this.f27782Q;
    }

    public final o6.w s0() {
        return this.f27779N;
    }

    @Override // P3.a
    public InterfaceC3698L u() {
        return this.f27785T;
    }

    @Override // P3.a
    public InterfaceC3698L z() {
        return this.f27788W;
    }
}
