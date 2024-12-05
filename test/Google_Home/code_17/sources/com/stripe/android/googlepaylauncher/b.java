package com.stripe.android.googlepaylauncher;

import O5.I;
import O5.InterfaceC1355k;
import O5.t;
import a6.InterfaceC1668n;
import android.content.Context;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.C3427m;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;
import r0.C3905m;
import u2.InterfaceC4057d;

/* loaded from: classes4.dex */
public final class b implements L2.g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f24891a;

    /* renamed from: b, reason: collision with root package name */
    private final L2.d f24892b;

    /* renamed from: c, reason: collision with root package name */
    private final C3427m.a f24893c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f24894d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f24895e;

    /* renamed from: f, reason: collision with root package name */
    private final L2.h f24896f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC4057d f24897g;

    /* renamed from: h, reason: collision with root package name */
    private final C3427m f24898h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC1355k f24899i;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f24900a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f24901b;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            a aVar = new a(dVar);
            aVar.f24901b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            InterfaceC3707g interfaceC3707g;
            Object e8 = T5.b.e();
            int i8 = this.f24900a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC3707g = (InterfaceC3707g) this.f24901b;
                t.b(obj);
            } else {
                t.b(obj);
                interfaceC3707g = (InterfaceC3707g) this.f24901b;
                b bVar = b.this;
                this.f24901b = interfaceC3707g;
                this.f24900a = 1;
                obj = bVar.e(this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f24901b = null;
            this.f24900a = 2;
            if (interfaceC3707g.emit(obj, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(InterfaceC3707g interfaceC3707g, S5.d dVar) {
            return ((a) create(interfaceC3707g, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.googlepaylauncher.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0469b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f24903a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24904b;

        /* renamed from: d, reason: collision with root package name */
        int f24906d;

        C0469b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24904b = obj;
            this.f24906d |= Integer.MIN_VALUE;
            return b.this.e(this);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3905m invoke() {
            return b.this.f24896f.a(b.this.f24892b);
        }
    }

    public b(Context context, L2.d environment, C3427m.a billingAddressParameters, boolean z8, boolean z9, L2.h paymentsClientFactory, InterfaceC4057d logger) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(environment, "environment");
        AbstractC3255y.i(billingAddressParameters, "billingAddressParameters");
        AbstractC3255y.i(paymentsClientFactory, "paymentsClientFactory");
        AbstractC3255y.i(logger, "logger");
        this.f24891a = context;
        this.f24892b = environment;
        this.f24893c = billingAddressParameters;
        this.f24894d = z8;
        this.f24895e = z9;
        this.f24896f = paymentsClientFactory;
        this.f24897g = logger;
        this.f24898h = new C3427m(context, false, 2, null);
        this.f24899i = O5.l.b(new c());
    }

    private final C3905m d() {
        return (C3905m) this.f24899i.getValue();
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
    public final java.lang.Object e(S5.d r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.stripe.android.googlepaylauncher.b.C0469b
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.googlepaylauncher.b$b r0 = (com.stripe.android.googlepaylauncher.b.C0469b) r0
            int r1 = r0.f24906d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24906d = r1
            goto L18
        L13:
            com.stripe.android.googlepaylauncher.b$b r0 = new com.stripe.android.googlepaylauncher.b$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24904b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f24906d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r0 = r0.f24903a
            com.stripe.android.googlepaylauncher.b r0 = (com.stripe.android.googlepaylauncher.b) r0
            O5.t.b(r8)     // Catch: java.lang.Throwable -> L2e
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
            O5.t.b(r8)
            O5.s$a r8 = O5.s.f8302b     // Catch: java.lang.Throwable -> L5e
            m2.m r8 = r7.f24898h     // Catch: java.lang.Throwable -> L5e
            m2.m$a r2 = r7.f24893c     // Catch: java.lang.Throwable -> L5e
            boolean r5 = r7.f24894d     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)     // Catch: java.lang.Throwable -> L5e
            boolean r6 = r7.f24895e     // Catch: java.lang.Throwable -> L5e
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r6)     // Catch: java.lang.Throwable -> L5e
            org.json.JSONObject r8 = r8.c(r2, r5, r6)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L5e
            r0.e r8 = r0.C3897e.p(r8)     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r8 = O5.s.b(r8)     // Catch: java.lang.Throwable -> L5e
            goto L69
        L5e:
            r8 = move-exception
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r8 = O5.t.a(r8)
            java.lang.Object r8 = O5.s.b(r8)
        L69:
            java.lang.Throwable r2 = O5.s.e(r8)
            if (r2 != 0) goto Ld6
            java.lang.String r2 = "getOrElse(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r8, r2)
            r0.e r8 = (r0.C3897e) r8
            r0.m r2 = r7.d()     // Catch: java.lang.Throwable -> L96
            com.google.android.gms.tasks.Task r8 = r2.s(r8)     // Catch: java.lang.Throwable -> L96
            java.lang.String r2 = "isReadyToPay(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r8, r2)     // Catch: java.lang.Throwable -> L96
            r0.f24903a = r7     // Catch: java.lang.Throwable -> L96
            r0.f24906d = r4     // Catch: java.lang.Throwable -> L96
            java.lang.Object r8 = v6.b.a(r8, r0)     // Catch: java.lang.Throwable -> L96
            if (r8 != r1) goto L8e
            return r1
        L8e:
            r0 = r7
        L8f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = O5.s.b(r8)     // Catch: java.lang.Throwable -> L2e
            goto La2
        L96:
            r8 = move-exception
            r0 = r7
        L98:
            O5.s$a r1 = O5.s.f8302b
            java.lang.Object r8 = O5.t.a(r8)
            java.lang.Object r8 = O5.s.b(r8)
        La2:
            java.lang.Throwable r1 = O5.s.e(r8)
            if (r1 == 0) goto Laf
            u2.d r2 = r0.f24897g
            java.lang.String r4 = "Google Pay check failed."
            r2.a(r4, r1)
        Laf:
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.b.a(r3)
            boolean r2 = O5.s.g(r8)
            if (r2 == 0) goto Lba
            r8 = r1
        Lba:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            u2.d r0 = r0.f24897g
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Google Pay ready? "
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.d(r1)
            kotlin.jvm.internal.AbstractC3255y.f(r8)
            return r8
        Ld6:
            u2.d r8 = r7.f24897g
            java.lang.String r0 = "Google Pay json parsing failed."
            r8.a(r0, r2)
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.b.a(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.b.e(S5.d):java.lang.Object");
    }

    @Override // L2.g
    public InterfaceC3706f isReady() {
        return AbstractC3708h.z(new a(null));
    }

    public /* synthetic */ b(Context context, L2.d dVar, C3427m.a aVar, boolean z8, boolean z9, L2.h hVar, InterfaceC4057d interfaceC4057d, int i8, AbstractC3247p abstractC3247p) {
        this(context, dVar, aVar, z8, z9, (i8 & 32) != 0 ? new L2.a(context) : hVar, (i8 & 64) != 0 ? InterfaceC4057d.f39950a.b() : interfaceC4057d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(android.content.Context r10, com.stripe.android.googlepaylauncher.h.d r11, u2.InterfaceC4057d r12) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.AbstractC3255y.i(r10, r0)
            java.lang.String r0 = "googlePayConfig"
            kotlin.jvm.internal.AbstractC3255y.i(r11, r0)
            java.lang.String r0 = "logger"
            kotlin.jvm.internal.AbstractC3255y.i(r12, r0)
            android.content.Context r2 = r10.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r2, r0)
            L2.d r3 = r11.g()
            com.stripe.android.googlepaylauncher.h$b r0 = r11.b()
            m2.m$a r4 = com.stripe.android.googlepaylauncher.a.b(r0)
            boolean r5 = r11.h()
            boolean r6 = r11.a()
            L2.a r7 = new L2.a
            r7.<init>(r10)
            r1 = r9
            r8 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.googlepaylauncher.b.<init>(android.content.Context, com.stripe.android.googlepaylauncher.h$d, u2.d):void");
    }
}
