package com.stripe.android.googlepaylauncher;

import L5.I;
import L5.InterfaceC1227k;
import L5.t;
import X5.n;
import android.content.Context;
import j2.C3073m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;
import r2.InterfaceC3684d;
import s0.C3723m;

/* loaded from: classes4.dex */
public final class b implements I2.g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23836a;

    /* renamed from: b, reason: collision with root package name */
    private final I2.d f23837b;

    /* renamed from: c, reason: collision with root package name */
    private final C3073m.a f23838c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f23839d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23840e;

    /* renamed from: f, reason: collision with root package name */
    private final I2.h f23841f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3684d f23842g;

    /* renamed from: h, reason: collision with root package name */
    private final C3073m f23843h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1227k f23844i;

    /* loaded from: classes4.dex */
    static final class a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f23845a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f23846b;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            a aVar = new a(dVar);
            aVar.f23846b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3359g interfaceC3359g;
            Object e8 = Q5.b.e();
            int i8 = this.f23845a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3359g = (InterfaceC3359g) this.f23846b;
                t.b(obj);
            } else {
                t.b(obj);
                interfaceC3359g = (InterfaceC3359g) this.f23846b;
                b bVar = b.this;
                this.f23846b = interfaceC3359g;
                this.f23845a = 1;
                obj = bVar.e(this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f23846b = null;
            this.f23845a = 2;
            if (interfaceC3359g.emit(obj, this) == e8) {
                return e8;
            }
            return I.f6487a;
        }

        @Override // X5.n
        public final Object invoke(InterfaceC3359g interfaceC3359g, P5.d dVar) {
            return ((a) create(interfaceC3359g, dVar)).invokeSuspend(I.f6487a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0473b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f23848a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f23849b;

        /* renamed from: d, reason: collision with root package name */
        int f23851d;

        C0473b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f23849b = obj;
            this.f23851d |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3723m invoke() {
            return b.this.f23841f.a(b.this.f23837b);
        }
    }

    public b(Context context, I2.d environment, C3073m.a billingAddressParameters, boolean z8, boolean z9, I2.h paymentsClientFactory, InterfaceC3684d logger) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(environment, "environment");
        AbstractC3159y.i(billingAddressParameters, "billingAddressParameters");
        AbstractC3159y.i(paymentsClientFactory, "paymentsClientFactory");
        AbstractC3159y.i(logger, "logger");
        this.f23836a = context;
        this.f23837b = environment;
        this.f23838c = billingAddressParameters;
        this.f23839d = z8;
        this.f23840e = z9;
        this.f23841f = paymentsClientFactory;
        this.f23842g = logger;
        this.f23843h = new C3073m(context, false, 2, null);
        this.f23844i = L5.l.b(new c());
    }

    private final C3723m d() {
        return (C3723m) this.f23844i.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(P5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.stripe.android.googlepaylauncher.b.C0473b
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.googlepaylauncher.b$b r0 = (com.stripe.android.googlepaylauncher.b.C0473b) r0
            int r1 = r0.f23851d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23851d = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.b$b r0 = new com.stripe.android.googlepaylauncher.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23849b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f23851d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f23848a
            com.stripe.android.googlepaylauncher.b r0 = (com.stripe.android.googlepaylauncher.b) r0
            L5.t.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto L8f
        L2e:
            r8 = move-exception
            goto L98
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            L5.t.b(r8)
            L5.s$a r8 = L5.s.f6511b     // Catch: java.lang.Throwable -> L5e
            j2.m r8 = r7.f23843h     // Catch: java.lang.Throwable -> L5e
            j2.m$a r2 = r7.f23838c     // Catch: java.lang.Throwable -> L5e
            boolean r5 = r7.f23839d     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch: java.lang.Throwable -> L5e
            boolean r6 = r7.f23840e     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)     // Catch: java.lang.Throwable -> L5e
            org.json.JSONObject r8 = r8.c(r2, r5, r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5e
            s0.e r8 = s0.C3715e.s(r8)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r8 = L5.s.b(r8)     // Catch: java.lang.Throwable -> L5e
            goto L69
        L5e:
            r8 = move-exception
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r8 = L5.t.a(r8)
            java.lang.Object r8 = L5.s.b(r8)
        L69:
            java.lang.Throwable r2 = L5.s.e(r8)
            if (r2 != 0) goto Ld6
            java.lang.String r2 = "getOrElse(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r8, r2)
            s0.e r8 = (s0.C3715e) r8
            s0.m r2 = r7.d()     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.tasks.Task r8 = r2.s(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "isReadyToPay(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r8, r2)     // Catch: java.lang.Throwable -> L96
            r0.f23848a = r7     // Catch: java.lang.Throwable -> L96
            r0.f23851d = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = s6.b.a(r8, r0)     // Catch: java.lang.Throwable -> L96
            if (r8 != r1) goto L8e
            return r1
        L8e:
            r0 = r7
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = L5.s.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto La2
        L96:
            r8 = move-exception
            r0 = r7
        L98:
            L5.s$a r1 = L5.s.f6511b
            java.lang.Object r8 = L5.t.a(r8)
            java.lang.Object r8 = L5.s.b(r8)
        La2:
            java.lang.Throwable r1 = L5.s.e(r8)
            if (r1 == 0) goto Laf
            r2.d r2 = r0.f23842g
            java.lang.String r4 = "Google Pay check failed."
            r2.a(r4, r1)
        Laf:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
            boolean r2 = L5.s.g(r8)
            if (r2 == 0) goto Lba
            r8 = r1
        Lba:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            r2.d r0 = r0.f23842g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Pay ready? "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            kotlin.jvm.internal.AbstractC3159y.f(r8)
            return r8
        Ld6:
            r2.d r8 = r7.f23842g
            java.lang.String r0 = "Google Pay json parsing failed."
            r8.a(r0, r2)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.b.e(P5.d):java.lang.Object");
    }

    @Override // I2.g
    public InterfaceC3358f isReady() {
        return AbstractC3360h.x(new a(null));
    }

    public /* synthetic */ b(Context context, I2.d dVar, C3073m.a aVar, boolean z8, boolean z9, I2.h hVar, InterfaceC3684d interfaceC3684d, int i8, AbstractC3151p abstractC3151p) {
        this(context, dVar, aVar, z8, z9, (i8 & 32) != 0 ? new I2.a(context) : hVar, (i8 & 64) != 0 ? InterfaceC3684d.f37570a.b() : interfaceC3684d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r10, com.stripe.android.googlepaylauncher.h.d r11, r2.InterfaceC3684d r12) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3159y.i(r10, r0)
            java.lang.String r0 = "googlePayConfig"
            kotlin.jvm.internal.AbstractC3159y.i(r11, r0)
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.AbstractC3159y.i(r12, r0)
            android.content.Context r2 = r10.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r2, r0)
            I2.d r3 = r11.e()
            com.stripe.android.googlepaylauncher.h$b r0 = r11.c()
            j2.m$a r4 = com.stripe.android.googlepaylauncher.a.b(r0)
            boolean r5 = r11.f()
            boolean r6 = r11.b()
            I2.a r7 = new I2.a
            r7.<init>(r10)
            r1 = r9
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.b.<init>(android.content.Context, com.stripe.android.googlepaylauncher.h$d, r2.d):void");
    }
}
