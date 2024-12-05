package com.stripe.android.paymentsheet;

import E3.c;
import I3.m;
import J3.C1201i;
import J3.C1203k;
import J3.InterfaceC1211t;
import L5.I;
import M5.AbstractC1246t;
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
import b3.EnumC1870e;
import b4.C1880b;
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
import e4.Q;
import e6.InterfaceC2643c;
import i6.AbstractC2825i;
import i6.M;
import i6.N;
import java.util.Collection;
import java.util.List;
import k2.C3115g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3136a;
import kotlin.jvm.internal.C3156v;
import l2.InterfaceC3167b;
import l6.AbstractC3340B;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3344F;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import p2.AbstractC3598a;
import p3.AbstractC3601c;
import q3.C3649b;
import q3.EnumC3653f;
import r2.InterfaceC3684d;
import t3.AbstractC3792b;
import u3.InterfaceC3802a;
import x3.AbstractC3924y;
import x3.d0;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import y3.AbstractC3992g;
import y3.EnumC3987b;
import y3.h;
import z3.InterfaceC4021c;

/* loaded from: classes4.dex */
public final class y extends M3.a {

    /* renamed from: C, reason: collision with root package name */
    private final PaymentSheetContractV2.a f26713C;

    /* renamed from: D, reason: collision with root package name */
    private final I3.h f26714D;

    /* renamed from: E, reason: collision with root package name */
    private final q3.q f26715E;

    /* renamed from: F, reason: collision with root package name */
    private final InterfaceC3684d f26716F;

    /* renamed from: G, reason: collision with root package name */
    private final k3.i f26717G;

    /* renamed from: H, reason: collision with root package name */
    private final InterfaceC3802a f26718H;

    /* renamed from: I, reason: collision with root package name */
    private final l6.v f26719I;

    /* renamed from: J, reason: collision with root package name */
    private final InterfaceC3349K f26720J;

    /* renamed from: K, reason: collision with root package name */
    private final M3.c f26721K;

    /* renamed from: L, reason: collision with root package name */
    private final l6.u f26722L;

    /* renamed from: M, reason: collision with root package name */
    private final l6.z f26723M;

    /* renamed from: N, reason: collision with root package name */
    private final l6.v f26724N;

    /* renamed from: O, reason: collision with root package name */
    private c f26725O;

    /* renamed from: P, reason: collision with root package name */
    private final InterfaceC3349K f26726P;

    /* renamed from: Q, reason: collision with root package name */
    private com.stripe.android.paymentsheet.j f26727Q;

    /* renamed from: R, reason: collision with root package name */
    private final EnumC3987b f26728R;

    /* renamed from: S, reason: collision with root package name */
    private final h.d f26729S;

    /* renamed from: T, reason: collision with root package name */
    private final InterfaceC3349K f26730T;

    /* renamed from: U, reason: collision with root package name */
    private final InterfaceC3349K f26731U;

    /* renamed from: V, reason: collision with root package name */
    private final InterfaceC3349K f26732V;

    /* renamed from: W, reason: collision with root package name */
    private final InterfaceC3349K f26733W;

    /* renamed from: X, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.e f26734X;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26735a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.h f26736b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ y f26737c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.y$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0667a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ y f26738a;

            C0667a(y yVar) {
                this.f26738a = yVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(h.a aVar, P5.d dVar) {
                this.f26738a.u0(aVar);
                return I.f6487a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(com.stripe.android.paymentsheet.h hVar, y yVar, P5.d dVar) {
            super(2, dVar);
            this.f26736b = hVar;
            this.f26737c = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(this.f26736b, this.f26737c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26735a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3358f f8 = this.f26736b.f();
                C0667a c0667a = new C0667a(this.f26737c);
                this.f26735a = 1;
                if (f8.collect(c0667a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26739a;

        b(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26739a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                y yVar = y.this;
                this.f26739a = 1;
                if (yVar.C0(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f26741a = new c("SheetTopWallet", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final c f26742b = new c("SheetBottomBuy", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final c f26743c = new c("None", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ c[] f26744d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f26745e;

        static {
            c[] a8 = a();
            f26744d = a8;
            f26745e = R5.b.a(a8);
        }

        private c(String str, int i8) {
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f26741a, f26742b, f26743c};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f26744d.clone();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26746a;

        public d(Function0 starterArgsSupplier) {
            AbstractC3159y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f26746a = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return androidx.lifecycle.n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            Application a8 = A2.b.a(extras);
            y a9 = AbstractC3924y.a().b(a8).build().a().b(new d0((PaymentSheetContractV2.a) this.f26746a.invoke())).a(SavedStateHandleSupport.createSavedStateHandle(extras)).build().a();
            AbstractC3159y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.PaymentSheetViewModel.Factory.create");
            return a9;
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class e {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26747a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f26748b;

        static {
            int[] iArr = new int[u.k.a.values().length];
            try {
                iArr[u.k.a.f26452a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.k.a.f26453b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.k.a.f26454c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.k.a.f26455d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u.k.a.f26456e.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u.k.a.f26458g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u.k.a.f26459h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u.k.a.f26457f.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f26747a = iArr;
            int[] iArr2 = new int[u.k.c.values().length];
            try {
                iArr2[u.k.c.f26462a.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            f26748b = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26749a;

        /* renamed from: c, reason: collision with root package name */
        int f26751c;

        f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26749a = obj;
            this.f26751c |= Integer.MIN_VALUE;
            return y.this.e0(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y3.h invoke(y3.h hVar) {
            return y.this.D0(hVar, c.f26742b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f26753a;

        /* renamed from: b, reason: collision with root package name */
        Object f26754b;

        /* renamed from: c, reason: collision with root package name */
        int f26755c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f26756d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC3991f f26758f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AbstractC3991f abstractC3991f, P5.d dVar) {
            super(2, dVar);
            this.f26758f = abstractC3991f;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            h hVar = new h(this.f26758f, dVar);
            hVar.f26756d = obj;
            return hVar;
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                java.lang.Object r0 = Q5.b.e()
                int r1 = r9.f26755c
                r2 = 1
                if (r1 == 0) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r9.f26754b
                com.stripe.android.paymentsheet.l r0 = (com.stripe.android.paymentsheet.l) r0
                java.lang.Object r1 = r9.f26753a
                com.stripe.android.paymentsheet.y r1 = (com.stripe.android.paymentsheet.y) r1
                java.lang.Object r2 = r9.f26756d
                i6.M r2 = (i6.M) r2
                L5.t.b(r10)
                goto L60
            L1b:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L23:
                L5.t.b(r10)
                java.lang.Object r10 = r9.f26756d
                i6.M r10 = (i6.M) r10
                com.stripe.android.paymentsheet.y r1 = com.stripe.android.paymentsheet.y.this
                y3.f r3 = r9.f26758f
                y3.f r1 = com.stripe.android.paymentsheet.y.Z(r1, r3)
                r3 = 0
                if (r1 == 0) goto L4a
                com.stripe.android.paymentsheet.y r4 = com.stripe.android.paymentsheet.y.this
                com.stripe.android.paymentsheet.PaymentSheetContractV2$a r4 = r4.k0()
                com.stripe.android.paymentsheet.u$l r4 = r4.e()
                com.stripe.android.paymentsheet.y r5 = com.stripe.android.paymentsheet.y.this
                com.stripe.android.paymentsheet.u$g r5 = r5.f()
                com.stripe.android.paymentsheet.l r1 = com.stripe.android.paymentsheet.m.a(r1, r4, r5)
                goto L4b
            L4a:
                r1 = r3
            L4b:
                if (r1 == 0) goto L70
                com.stripe.android.paymentsheet.y r3 = com.stripe.android.paymentsheet.y.this
                r9.f26756d = r10
                r9.f26753a = r3
                r9.f26754b = r1
                r9.f26755c = r2
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
                L5.I r3 = L5.I.f6487a
            L70:
                if (r3 != 0) goto Lcd
                y3.f r10 = r9.f26758f
                com.stripe.android.paymentsheet.y r0 = com.stripe.android.paymentsheet.y.this
                if (r10 == 0) goto L9c
                java.lang.Class r1 = r10.getClass()
                e6.c r1 = kotlin.jvm.internal.U.b(r1)
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
                k3.i$f r10 = k3.i.f.f33440p
                if (r10 != 0) goto Laa
                goto Lac
            Laa:
                r4 = r10
                goto Laf
            Lac:
                k3.i$f r10 = k3.i.f.f33439o
                goto Laa
            Laf:
                k3.i r3 = com.stripe.android.paymentsheet.y.O(r0)
                t2.k$a r10 = t2.AbstractC3790k.f38229e
                t2.k r5 = r10.b(r2)
                r7 = 4
                r8 = 0
                r6 = 0
                k3.i.b.a(r3, r4, r5, r6, r7, r8)
                com.stripe.android.paymentsheet.n$b r10 = new com.stripe.android.paymentsheet.n$b
                y2.b r1 = p2.AbstractC3598a.a(r2)
                com.stripe.android.paymentsheet.k$d r3 = com.stripe.android.paymentsheet.k.d.f26034a
                r10.<init>(r2, r1, r3)
                com.stripe.android.paymentsheet.y.a0(r0, r10)
            Lcd:
                L5.I r10 = L5.I.f6487a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes4.dex */
    static final class i extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f26759a = new i();

        i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC3983b invoke(y3.h hVar) {
            h.d a8;
            if (hVar != null && (a8 = hVar.a()) != null) {
                return a8.a();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3160z implements Function0 {
        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5547invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5547invoke() {
            y.this.f26722L.d(x.b.f26711a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26761a;

        /* renamed from: b, reason: collision with root package name */
        Object f26762b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26763c;

        /* renamed from: e, reason: collision with root package name */
        int f26765e;

        k(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26763c = obj;
            this.f26765e |= Integer.MIN_VALUE;
            return y.this.y0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class l extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26766a;

        /* renamed from: b, reason: collision with root package name */
        Object f26767b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26768c;

        /* renamed from: e, reason: collision with root package name */
        int f26770e;

        l(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26768c = obj;
            this.f26770e |= Integer.MIN_VALUE;
            return y.this.z0(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26771a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f26773a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26774b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f26775c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, P5.d dVar) {
                super(2, dVar);
                this.f26775c = yVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                a aVar = new a(this.f26775c, dVar);
                aVar.f26774b = obj;
                return aVar;
            }

            @Override // X5.n
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(e.InterfaceC0608e interfaceC0608e, P5.d dVar) {
                return ((a) create(interfaceC0608e, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f26773a == 0) {
                    L5.t.b(obj);
                    e.InterfaceC0608e interfaceC0608e = (e.InterfaceC0608e) this.f26774b;
                    if (!(interfaceC0608e instanceof e.InterfaceC0608e.c)) {
                        if (interfaceC0608e instanceof e.InterfaceC0608e.d) {
                            e.InterfaceC0608e.d dVar = (e.InterfaceC0608e.d) interfaceC0608e;
                            if (!dVar.b() || !(dVar.a() instanceof l.c)) {
                                this.f26775c.N0(true);
                            } else {
                                this.f26775c.N0(false);
                            }
                            y yVar = this.f26775c;
                            yVar.O0(yVar.m0());
                        } else if (interfaceC0608e instanceof e.InterfaceC0608e.b) {
                            this.f26775c.N0(true);
                            if (!(this.f26775c.s0().getValue() instanceof h.c)) {
                                y yVar2 = this.f26775c;
                                yVar2.O0(yVar2.m0());
                            }
                        } else if (interfaceC0608e instanceof e.InterfaceC0608e.a) {
                            this.f26775c.N0(true);
                            this.f26775c.I0(((e.InterfaceC0608e.a) interfaceC0608e).a());
                        }
                    }
                    return I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        m(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new m(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26771a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                InterfaceC3349K C8 = y.this.f26734X.C();
                a aVar = new a(y.this, null);
                this.f26771a = 1;
                if (AbstractC3360h.h(C8, aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class n extends AbstractC3160z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f26777a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ E3.h f26778b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f26779c;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.y$n$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public /* synthetic */ class C0668a extends C3136a implements X5.n {
                C0668a(Object obj) {
                    super(2, obj, y.class, "handleCvcCompletionState", "handleCvcCompletionState(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcCompletionState;)V", 4);
                }

                @Override // X5.n
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(E3.c cVar, P5.d dVar) {
                    return a.h((y) this.receiver, cVar, dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(E3.h hVar, y yVar, P5.d dVar) {
                super(2, dVar);
                this.f26778b = hVar;
                this.f26779c = yVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object h(y yVar, E3.c cVar, P5.d dVar) {
                yVar.t0(cVar);
                return I.f6487a;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new a(this.f26778b, this.f26779c, dVar);
            }

            @Override // X5.n
            public final Object invoke(M m8, P5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = Q5.b.e();
                int i8 = this.f26777a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        L5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    L5.t.b(obj);
                    InterfaceC3349K d8 = this.f26778b.d();
                    C0668a c0668a = new C0668a(this.f26779c);
                    this.f26777a = 1;
                    if (AbstractC3360h.h(d8, c0668a, this) == e8) {
                        return e8;
                    }
                }
                return I.f6487a;
            }
        }

        n() {
            super(1);
        }

        public final void a(E3.d cvcRecollectionData) {
            boolean z8;
            StripeIntent V7;
            AbstractC3159y.i(cvcRecollectionData, "cvcRecollectionData");
            String b8 = cvcRecollectionData.b();
            if (b8 == null) {
                b8 = "";
            }
            String str = b8;
            EnumC1870e a8 = cvcRecollectionData.a();
            Y2.d dVar = (Y2.d) y.this.t().getValue();
            if (dVar != null && (V7 = dVar.V()) != null && !V7.a()) {
                z8 = true;
            } else {
                z8 = false;
            }
            E3.h hVar = new E3.h(new E3.a(str, a8, null, z8, 4, null));
            AbstractC2825i.d(ViewModelKt.getViewModelScope(y.this), null, null, new a(hVar, y.this, null), 3, null);
            y.this.r().m(new InterfaceC4021c.d(hVar));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E3.d) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class o extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f26780a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f26781b;

        /* renamed from: d, reason: collision with root package name */
        int f26783d;

        o(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26781b = obj;
            this.f26783d |= Integer.MIN_VALUE;
            return y.this.C0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class p extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26784a;

        p(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new p(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((p) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a8;
            Object e8 = Q5.b.e();
            int i8 = this.f26784a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                    a8 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                I3.h hVar = y.this.f26714D;
                u.l e9 = y.this.k0().e();
                u.g b8 = y.this.k0().b();
                boolean B8 = y.this.f26734X.B();
                boolean f8 = y.this.k0().f();
                this.f26784a = 1;
                a8 = hVar.a(e9, b8, B8, f8, this);
                if (a8 == e8) {
                    return e8;
                }
            }
            return L5.s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class q extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26786a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3601c f26788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(AbstractC3601c abstractC3601c, P5.d dVar) {
            super(2, dVar);
            this.f26788c = abstractC3601c;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new q(this.f26788c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((q) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26786a;
            if (i8 != 0) {
                if (i8 == 1) {
                    L5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                y yVar = y.this;
                this.f26786a = 1;
                obj = yVar.e0(this);
                if (obj == e8) {
                    return e8;
                }
            }
            y.this.J0((StripeIntent) obj, this.f26788c);
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class r extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final r f26789a = new r();

        r() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1880b invoke(Y2.d dVar) {
            if (dVar != null) {
                return dVar.f();
            }
            return null;
        }
    }

    /* loaded from: classes4.dex */
    static final class s extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ EventReporter f26790a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f26791b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(EventReporter eventReporter, y yVar) {
            super(0);
            this.f26790a = eventReporter;
            this.f26791b = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5548invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5548invoke() {
            this.f26790a.s((AbstractC3991f) this.f26791b.y().getValue());
            this.f26791b.f0();
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
            AbstractC3159y.i(owner, "owner");
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
    static final class u extends AbstractC3160z implements Function1 {
        u() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I3.m invoke(y3.h hVar) {
            y3.h D02 = y.this.D0(hVar, c.f26741a);
            InterfaceC3983b interfaceC3983b = null;
            if (D02 == null) {
                return null;
            }
            if (D02 instanceof h.b) {
                h.d a8 = ((h.b) D02).a();
                if (a8 != null) {
                    interfaceC3983b = a8.a();
                }
                return new m.b(interfaceC3983b);
            }
            if (D02 instanceof h.c) {
                return m.c.f4080a;
            }
            if (D02 instanceof h.a) {
                return new m.a(((h.a) D02).b());
            }
            throw new L5.p();
        }
    }

    /* loaded from: classes4.dex */
    static final class v extends AbstractC3160z implements X5.p {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.paymentsheet.h f26795b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class a extends C3156v implements Function0 {
            a(Object obj) {
                super(0, obj, y.class, "checkoutWithGooglePay", "checkoutWithGooglePay()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5549invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5549invoke() {
                ((y) this.receiver).h0();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b extends C3156v implements Function0 {
            b(Object obj) {
                super(0, obj, com.stripe.android.paymentsheet.h.class, "launchLink", "launchLink()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5550invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5550invoke() {
                ((com.stripe.android.paymentsheet.h) this.receiver).h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(com.stripe.android.paymentsheet.h hVar) {
            super(4);
            this.f26795b = hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        
            if (r15.a0() == true) goto L8;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final I3.n a(java.lang.Boolean r12, java.lang.String r13, boolean r14, Y2.d r15) {
            /*
                r11 = this;
                I3.n$a r0 = I3.n.f4081g
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
                java.util.List r2 = M5.AbstractC1246t.m()
            L1d:
                r6 = r2
                com.stripe.android.paymentsheet.y r2 = com.stripe.android.paymentsheet.y.this
                com.stripe.android.googlepaylauncher.h$d r7 = r2.q0()
                com.stripe.android.paymentsheet.y r2 = com.stripe.android.paymentsheet.y.this
                y3.b r4 = com.stripe.android.paymentsheet.y.P(r2)
                com.stripe.android.paymentsheet.y$v$a r8 = new com.stripe.android.paymentsheet.y$v$a
                com.stripe.android.paymentsheet.y r2 = com.stripe.android.paymentsheet.y.this
                r8.<init>(r2)
                com.stripe.android.paymentsheet.y$v$b r9 = new com.stripe.android.paymentsheet.y$v$b
                com.stripe.android.paymentsheet.h r2 = r11.f26795b
                r9.<init>(r2)
                if (r15 == 0) goto L3e
                com.stripe.android.model.StripeIntent r1 = r15.V()
            L3e:
                boolean r10 = r1 instanceof com.stripe.android.model.u
                r1 = r12
                r2 = r13
                r5 = r14
                I3.n r12 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.v.a(java.lang.Boolean, java.lang.String, boolean, Y2.d):I3.n");
        }

        @Override // X5.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((Boolean) obj, (String) obj2, ((Boolean) obj3).booleanValue(), (Y2.d) obj4);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(PaymentSheetContractV2.a args, EventReporter eventReporter, I3.h paymentSheetLoader, H3.c customerRepository, q3.q prefsRepository, InterfaceC3684d logger, P5.g workContext, SavedStateHandle savedStateHandle, com.stripe.android.paymentsheet.h linkHandler, e.d intentConfirmationHandlerFactory, InterfaceC3167b.a cardAccountRangeRepositoryFactory, InterfaceC1211t.a editInteractorFactory, k3.i errorReporter, InterfaceC3802a cvcRecollectionHandler) {
        super(args.b(), eventReporter, customerRepository, workContext, savedStateHandle, linkHandler, editInteractorFactory, cardAccountRangeRepositoryFactory, true);
        EnumC3987b enumC3987b;
        h.d dVar;
        I2.d dVar2;
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(eventReporter, "eventReporter");
        AbstractC3159y.i(paymentSheetLoader, "paymentSheetLoader");
        AbstractC3159y.i(customerRepository, "customerRepository");
        AbstractC3159y.i(prefsRepository, "prefsRepository");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(linkHandler, "linkHandler");
        AbstractC3159y.i(intentConfirmationHandlerFactory, "intentConfirmationHandlerFactory");
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(editInteractorFactory, "editInteractorFactory");
        AbstractC3159y.i(errorReporter, "errorReporter");
        AbstractC3159y.i(cvcRecollectionHandler, "cvcRecollectionHandler");
        this.f26713C = args;
        this.f26714D = paymentSheetLoader;
        this.f26715E = prefsRepository;
        this.f26716F = logger;
        this.f26717G = errorReporter;
        this.f26718H = cvcRecollectionHandler;
        l6.v a8 = AbstractC3351M.a(Boolean.TRUE);
        this.f26719I = a8;
        this.f26720J = a8;
        M3.c cVar = new M3.c(f(), A0(), r().f(), d(), v4.g.m(t(), r.f26789a), y(), g(), k(), new s(eventReporter, this));
        this.f26721K = cVar;
        l6.u b8 = AbstractC3340B.b(1, 0, null, 6, null);
        this.f26722L = b8;
        this.f26723M = b8;
        l6.v a9 = AbstractC3351M.a(null);
        this.f26724N = a9;
        this.f26725O = c.f26742b;
        InterfaceC3349K m8 = v4.g.m(a9, new g());
        this.f26726P = m8;
        u.k o8 = args.b().o();
        u.k.a c8 = o8 != null ? o8.c() : null;
        switch (c8 == null ? -1 : e.f26747a[c8.ordinal()]) {
            case -1:
            case 8:
                enumC3987b = EnumC3987b.f39756f;
                break;
            case 0:
            default:
                throw new L5.p();
            case 1:
                enumC3987b = EnumC3987b.f39751a;
                break;
            case 2:
                enumC3987b = EnumC3987b.f39752b;
                break;
            case 3:
                enumC3987b = EnumC3987b.f39753c;
                break;
            case 4:
                enumC3987b = EnumC3987b.f39754d;
                break;
            case 5:
                enumC3987b = EnumC3987b.f39755e;
                break;
            case 6:
                enumC3987b = EnumC3987b.f39757g;
                break;
            case 7:
                enumC3987b = EnumC3987b.f39758h;
                break;
        }
        this.f26728R = enumC3987b;
        u.k c9 = args.c();
        if (c9 != null) {
            if (c9.e() == null && !A0()) {
                logger.c("GooglePayConfiguration.currencyCode is required in order to use Google Pay when processing a Setup Intent");
            } else {
                if (e.f26748b[c9.f().ordinal()] == 1) {
                    dVar2 = I2.d.f3910b;
                } else {
                    dVar2 = I2.d.f3911c;
                }
                dVar = new h.d(dVar2, c9.p(), f().s(), args.b().i().f(), args.b().i().s(), false, false, 96, null);
                this.f26729S = dVar;
                this.f26730T = AbstractC3360h.H(cVar.h(), ViewModelKt.getViewModelScope(this), InterfaceC3344F.a.b(InterfaceC3344F.f34585a, 0L, 0L, 3, null), null);
                this.f26731U = v4.g.m(m8, i.f26759a);
                this.f26732V = v4.g.f(linkHandler.g(), linkHandler.e().d(), d(), t(), new v(linkHandler));
                this.f26733W = v4.g.m(a9, new u());
                this.f26734X = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
                C3115g.f33382a.c(this, savedStateHandle);
                AbstractC2825i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
                eventReporter.j(f(), args.e() instanceof u.l.a);
                AbstractC2825i.d(ViewModelKt.getViewModelScope(this), workContext, null, new b(null), 2, null);
            }
        }
        dVar = null;
        this.f26729S = dVar;
        this.f26730T = AbstractC3360h.H(cVar.h(), ViewModelKt.getViewModelScope(this), InterfaceC3344F.a.b(InterfaceC3344F.f34585a, 0L, 0L, 3, null), null);
        this.f26731U = v4.g.m(m8, i.f26759a);
        this.f26732V = v4.g.f(linkHandler.g(), linkHandler.e().d(), d(), t(), new v(linkHandler));
        this.f26733W = v4.g.m(a9, new u());
        this.f26734X = intentConfirmationHandlerFactory.d(N.h(ViewModelKt.getViewModelScope(this), workContext));
        C3115g.f33382a.c(this, savedStateHandle);
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), null, null, new a(linkHandler, this, null), 3, null);
        eventReporter.j(f(), args.e() instanceof u.l.a);
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), workContext, null, new b(null), 2, null);
    }

    private final void B0() {
        this.f26718H.b((AbstractC3991f) y().getValue(), new n());
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
    public final java.lang.Object C0(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.stripe.android.paymentsheet.y.o
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.paymentsheet.y$o r0 = (com.stripe.android.paymentsheet.y.o) r0
            int r1 = r0.f26783d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26783d = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$o r0 = new com.stripe.android.paymentsheet.y$o
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26781b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f26783d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            L5.t.b(r7)
            goto L71
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f26780a
            com.stripe.android.paymentsheet.y r2 = (com.stripe.android.paymentsheet.y) r2
            L5.t.b(r7)
            goto L55
        L3d:
            L5.t.b(r7)
            P5.g r7 = r6.B()
            com.stripe.android.paymentsheet.y$p r2 = new com.stripe.android.paymentsheet.y$p
            r2.<init>(r3)
            r0.f26780a = r6
            r0.f26783d = r5
            java.lang.Object r7 = i6.AbstractC2825i.g(r7, r2, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            r2 = r6
        L55:
            L5.s r7 = (L5.s) r7
            java.lang.Object r7 = r7.k()
            java.lang.Throwable r5 = L5.s.e(r7)
            if (r5 != 0) goto L6e
            I3.l r7 = (I3.l) r7
            r0.f26780a = r3
            r0.f26783d = r4
            java.lang.Object r7 = r2.y0(r7, r0)
            if (r7 != r1) goto L71
            return r1
        L6e:
            r2.x0(r5)
        L71:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.C0(P5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y3.h D0(y3.h hVar, c cVar) {
        if (this.f26725O != cVar) {
            return null;
        }
        return hVar;
    }

    private final void E0(Throwable th) {
        this.f26716F.a("Payment Sheet error", th);
        this.f26722L.d(new x.c(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC3991f G0(AbstractC3991f abstractC3991f) {
        r.b bVar;
        if (!(abstractC3991f instanceof AbstractC3991f.C0916f) || !z.c(this)) {
            return abstractC3991f;
        }
        AbstractC3991f.C0916f c0916f = (AbstractC3991f.C0916f) abstractC3991f;
        com.stripe.android.model.r i8 = c0916f.i();
        if (i8 instanceof r.b) {
            bVar = (r.b) i8;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            bVar = new r.b(null, null, null, 7, null);
        }
        return AbstractC3991f.C0916f.f(c0916f, null, null, r.b.e(bVar, (String) ((Q) j().getValue()).k().getValue(), null, null, null, 14, null), 3, null);
    }

    private final void H0(n.b bVar) {
        boolean d8;
        com.stripe.android.paymentsheet.k c8 = bVar.c();
        if (AbstractC3159y.d(c8, k.f.f26036a)) {
            w0(new AbstractC3792b.c(bVar.a()), bVar.b());
            return;
        }
        if (AbstractC3159y.d(c8, k.a.f26031a)) {
            w0(AbstractC3792b.a.f38245a, bVar.b());
            return;
        }
        if (c8 instanceof k.c) {
            w0(new AbstractC3792b.C0884b(((k.c) bVar.c()).a()), bVar.b());
            return;
        }
        if (AbstractC3159y.d(c8, k.b.f26032a)) {
            E0(bVar.a());
            return;
        }
        if (AbstractC3159y.d(c8, k.e.f26035a)) {
            d8 = true;
        } else {
            d8 = AbstractC3159y.d(c8, k.d.f26034a);
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
    public final void J0(StripeIntent stripeIntent, AbstractC3601c abstractC3601c) {
        if (abstractC3601c instanceof AbstractC3601c.C0846c) {
            v0(stripeIntent, null, false);
            return;
        }
        if (abstractC3601c instanceof AbstractC3601c.d) {
            AbstractC3601c.d dVar = (AbstractC3601c.d) abstractC3601c;
            w0(new AbstractC3792b.c(dVar.b()), AbstractC3598a.a(dVar.b()));
        } else if (abstractC3601c instanceof AbstractC3601c.a) {
            M0(this, null, 1, null);
        }
    }

    private final void L0(InterfaceC3983b interfaceC3983b) {
        h.d dVar;
        l6.v vVar = this.f26724N;
        if (interfaceC3983b != null) {
            dVar = new h.d(interfaceC3983b);
        } else {
            dVar = null;
        }
        vVar.setValue(new h.b(dVar));
        x().set("processing", Boolean.FALSE);
    }

    static /* synthetic */ void M0(y yVar, InterfaceC3983b interfaceC3983b, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC3983b = null;
        }
        yVar.L0(interfaceC3983b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(boolean z8) {
        this.f26719I.setValue(Boolean.valueOf(z8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(c cVar) {
        this.f26725O = cVar;
        x().set("processing", Boolean.TRUE);
        this.f26724N.setValue(h.c.f39830b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e0(P5.d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.stripe.android.paymentsheet.y.f
            if (r0 == 0) goto L13
            r0 = r5
            com.stripe.android.paymentsheet.y$f r0 = (com.stripe.android.paymentsheet.y.f) r0
            int r1 = r0.f26751c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26751c = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$f r0 = new com.stripe.android.paymentsheet.y$f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f26749a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f26751c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            L5.t.b(r5)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            L5.t.b(r5)
            l6.K r5 = r4.t()
            l6.f r5 = l6.AbstractC3360h.t(r5)
            r0.f26751c = r3
            java.lang.Object r5 = l6.AbstractC3360h.u(r5, r0)
            if (r5 != r1) goto L45
            return r1
        L45:
            Y2.d r5 = (Y2.d) r5
            com.stripe.android.model.StripeIntent r5 = r5.V()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.e0(P5.d):java.lang.Object");
    }

    private final void g0(AbstractC3991f abstractC3991f, c cVar) {
        this.f26725O = cVar;
        i0(abstractC3991f);
    }

    private final void i0(AbstractC3991f abstractC3991f) {
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), B(), null, new h(abstractC3991f, null), 2, null);
    }

    private final List j0(Y2.d dVar, C3649b c3649b) {
        Object bVar;
        if (f().u() == u.n.f26494d) {
            return L3.u.f6429a.a(this, dVar, c3649b);
        }
        if (!((Collection) c3649b.c().getValue()).isEmpty()) {
            bVar = new InterfaceC4021c.j(C1203k.f5243r.a(this, dVar, c3649b, w()), p0());
        } else {
            bVar = new InterfaceC4021c.b(C1201i.f5189r.a(this, dVar));
        }
        return AbstractC1246t.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(E3.c cVar) {
        AbstractC3991f.C0916f c0916f;
        r.b bVar;
        Object value = y().getValue();
        if (value instanceof AbstractC3991f.C0916f) {
            c0916f = (AbstractC3991f.C0916f) value;
        } else {
            c0916f = null;
        }
        if (c0916f != null) {
            if (cVar instanceof c.a) {
                bVar = new r.b(((c.a) cVar).a(), null, null, 6, null);
            } else if (AbstractC3159y.d(cVar, c.b.f1982a)) {
                bVar = new r.b("", null, null, 6, null);
            } else {
                throw new L5.p();
            }
            M(new AbstractC3991f.C0916f(c0916f.v(), c0916f.k(), bVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void u0(h.a aVar) {
        int i8 = 1;
        I i9 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (AbstractC3159y.d(aVar, h.a.C0610a.f25987a)) {
            M0(this, null, 1, null);
            return;
        }
        if (aVar instanceof h.a.f) {
            M(new AbstractC3991f.C0916f(((h.a.f) aVar).a(), AbstractC3991f.C0916f.b.f39822c, null, 4, null));
            g0((AbstractC3991f) y().getValue(), c.f26741a);
            return;
        }
        if (aVar instanceof h.a.c) {
            F0(((h.a.c) aVar).a());
            return;
        }
        if (AbstractC3159y.d(aVar, h.a.d.f25991a)) {
            O0(c.f26741a);
            return;
        }
        if (aVar instanceof h.a.e) {
            AbstractC3991f a8 = ((h.a.e) aVar).a();
            if (a8 != null) {
                M(a8);
                g0((AbstractC3991f) y().getValue(), c.f26742b);
                i9 = I.f6487a;
            }
            if (i9 == null) {
                g0((AbstractC3991f) y().getValue(), c.f26742b);
                return;
            }
            return;
        }
        if (AbstractC3159y.d(aVar, h.a.g.f25995a)) {
            this.f26725O = c.f26742b;
            this.f26724N.setValue(new h.b(objArr2 == true ? 1 : 0, i8, objArr == true ? 1 : 0));
        } else if (AbstractC3159y.d(aVar, h.a.C0611h.f25996a)) {
            this.f26725O = c.f26742b;
            this.f26724N.setValue(h.c.f39830b);
        } else if (AbstractC3159y.d(aVar, h.a.b.f25988a)) {
            f0();
        }
    }

    private final void v0(StripeIntent stripeIntent, EnumC3653f enumC3653f, boolean z8) {
        com.stripe.android.model.o oVar;
        AbstractC3991f abstractC3991f = (AbstractC3991f) y().getValue();
        n().m(abstractC3991f, enumC3653f);
        if (abstractC3991f != null && AbstractC3992g.a(abstractC3991f)) {
            p().i();
        }
        if (abstractC3991f instanceof AbstractC3991f.e) {
            com.stripe.android.model.o v8 = stripeIntent.v();
            boolean a8 = K3.d.a((AbstractC3991f.e) abstractC3991f, this.f26713C.e());
            abstractC3991f = null;
            if (a8) {
                oVar = v8;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                abstractC3991f = new AbstractC3991f.C0916f(oVar, null, null, 6, null);
            }
        }
        if (abstractC3991f != null) {
            this.f26715E.a(abstractC3991f);
        }
        if (z8) {
            this.f26722L.d(x.b.f26711a);
        } else {
            this.f26724N.setValue(new h.a(new j()));
        }
    }

    private final void w0(AbstractC3792b abstractC3792b, InterfaceC3983b interfaceC3983b) {
        n().g((AbstractC3991f) y().getValue(), abstractC3792b);
        L0(interfaceC3983b);
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
    public final java.lang.Object y0(I3.l r7, P5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.stripe.android.paymentsheet.y.k
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.paymentsheet.y$k r0 = (com.stripe.android.paymentsheet.y.k) r0
            int r1 = r0.f26765e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26765e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$k r0 = new com.stripe.android.paymentsheet.y$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f26763c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f26765e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r8)
            goto L85
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.Object r7 = r0.f26762b
            I3.l r7 = (I3.l) r7
            java.lang.Object r2 = r0.f26761a
            com.stripe.android.paymentsheet.y r2 = (com.stripe.android.paymentsheet.y) r2
            L5.t.b(r8)
            goto L53
        L40:
            L5.t.b(r8)
            com.stripe.android.paymentsheet.e r8 = r6.f26734X
            r0.f26761a = r6
            r0.f26762b = r7
            r0.f26765e = r4
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
            q3.f r8 = r8.a()
            r2.v0(r7, r8, r4)
            goto L74
        L67:
            I3.j r8 = r7.n()
            if (r8 == 0) goto L77
            I3.j r7 = r7.n()
            r2.x0(r7)
        L74:
            L5.I r7 = L5.I.f6487a
            return r7
        L77:
            r8 = 0
            r0.f26761a = r8
            r0.f26762b = r8
            r0.f26765e = r3
            java.lang.Object r7 = r2.z0(r7, r0)
            if (r7 != r1) goto L85
            return r1
        L85:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.y0(I3.l, P5.d):java.lang.Object");
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
    public final java.lang.Object z0(I3.l r10, P5.d r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.stripe.android.paymentsheet.y.l
            if (r0 == 0) goto L13
            r0 = r11
            com.stripe.android.paymentsheet.y$l r0 = (com.stripe.android.paymentsheet.y.l) r0
            int r1 = r0.f26770e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26770e = r1
            goto L18
        L13:
            com.stripe.android.paymentsheet.y$l r0 = new com.stripe.android.paymentsheet.y$l
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f26768c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f26770e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r10 = r0.f26767b
            I3.l r10 = (I3.l) r10
            java.lang.Object r0 = r0.f26766a
            com.stripe.android.paymentsheet.y r0 = (com.stripe.android.paymentsheet.y) r0
            L5.t.b(r11)
            goto L70
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            L5.t.b(r11)
            q3.b r11 = r9.i()
            I3.a r2 = r10.c()
            r11.d(r2)
            y3.f r11 = r10.i()
            r9.M(r11)
            Y2.d r11 = r10.f()
            r9.J(r11)
            com.stripe.android.paymentsheet.h r11 = r9.p()
            I3.g r2 = r10.e()
            r11.m(r2)
            com.stripe.android.paymentsheet.e r11 = r9.f26734X
            r0.f26766a = r9
            r0.f26767b = r10
            r0.f26770e = r3
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
            y2.b r11 = p2.AbstractC3598a.a(r11)
            goto L87
        L86:
            r11 = r2
        L87:
            r0.L0(r11)
            z3.b r11 = r0.r()
            Y2.d r10 = r10.f()
            q3.b r1 = r0.i()
            java.util.List r10 = r0.j0(r10, r1)
            r11.l(r10)
            i6.M r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            com.stripe.android.paymentsheet.y$m r6 = new com.stripe.android.paymentsheet.y$m
            r6.<init>(r2)
            r7 = 3
            r8 = 0
            r4 = 0
            r5 = 0
            i6.AbstractC2825i.d(r3, r4, r5, r6, r7, r8)
            L5.I r10 = L5.I.f6487a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.y.z0(I3.l, P5.d):java.lang.Object");
    }

    @Override // M3.a
    public InterfaceC3349K A() {
        return this.f26732V;
    }

    public final boolean A0() {
        return A.a(this.f26713C.e());
    }

    @Override // M3.a
    public void D(AbstractC3991f.e.d paymentSelection) {
        AbstractC3159y.i(paymentSelection, "paymentSelection");
        M(paymentSelection);
        n().s((AbstractC3991f) y().getValue());
        f0();
    }

    @Override // M3.a
    public void E(AbstractC3991f abstractC3991f) {
        if (!AbstractC3159y.d(abstractC3991f, y().getValue())) {
            M(abstractC3991f);
        }
    }

    public void F0(AbstractC3601c paymentResult) {
        AbstractC3159y.i(paymentResult, "paymentResult");
        AbstractC2825i.d(ViewModelKt.getViewModelScope(this), B(), null, new q(paymentResult, null), 2, null);
    }

    @Override // M3.a
    public void G(InterfaceC3983b interfaceC3983b) {
        L0(interfaceC3983b);
    }

    @Override // M3.a
    public void H() {
        n().onDismiss();
        this.f26722L.d(x.a.f26710a);
    }

    @Override // M3.a
    public void I(com.stripe.android.paymentsheet.j jVar) {
        this.f26727Q = jVar;
    }

    public final void K0(ActivityResultCaller activityResultCaller, LifecycleOwner lifecycleOwner) {
        AbstractC3159y.i(activityResultCaller, "activityResultCaller");
        AbstractC3159y.i(lifecycleOwner, "lifecycleOwner");
        p().l(activityResultCaller);
        this.f26734X.P(activityResultCaller, lifecycleOwner);
        lifecycleOwner.getLifecycle().addObserver(new t());
    }

    @Override // M3.a
    public void b() {
        if (this.f26724N.getValue() instanceof h.b) {
            this.f26724N.setValue(new h.b(null));
        }
    }

    public final void f0() {
        if (z.d(this)) {
            B0();
        } else {
            g0((AbstractC3991f) y().getValue(), c.f26742b);
        }
    }

    public final void h0() {
        g0(AbstractC3991f.c.f39776a, c.f26741a);
    }

    public final PaymentSheetContractV2.a k0() {
        return this.f26713C;
    }

    public final InterfaceC3349K l0() {
        return this.f26726P;
    }

    @Override // M3.a
    public InterfaceC3349K m() {
        return this.f26731U;
    }

    public final c m0() {
        return this.f26725O;
    }

    public final InterfaceC3349K n0() {
        return this.f26720J;
    }

    public final InterfaceC3802a o0() {
        return this.f26718H;
    }

    public final InterfaceC4021c.j.b p0() {
        if (z.a(this)) {
            return new InterfaceC4021c.j.b.C0928b(j());
        }
        return InterfaceC4021c.j.b.a.f40179a;
    }

    public final h.d q0() {
        return this.f26729S;
    }

    public final l6.z r0() {
        return this.f26723M;
    }

    @Override // M3.a
    public com.stripe.android.paymentsheet.j s() {
        return this.f26727Q;
    }

    public final l6.v s0() {
        return this.f26724N;
    }

    @Override // M3.a
    public InterfaceC3349K u() {
        return this.f26730T;
    }

    @Override // M3.a
    public InterfaceC3349K z() {
        return this.f26733W;
    }
}
