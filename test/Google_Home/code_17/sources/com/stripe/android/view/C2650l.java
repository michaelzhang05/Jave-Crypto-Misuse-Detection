package com.stripe.android.view;

import O5.s;
import P5.AbstractC1378t;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import h6.InterfaceC2963c;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.C3411I;
import m2.InterfaceC3415a;
import n2.C3467d;
import n2.C3470g;
import n2.InterfaceC3466c;

/* renamed from: com.stripe.android.view.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2650l extends AndroidViewModel {

    /* renamed from: g, reason: collision with root package name */
    private static final a f28897g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f28898h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f28899a;

    /* renamed from: b, reason: collision with root package name */
    private final C3411I f28900b;

    /* renamed from: c, reason: collision with root package name */
    private final C2634d f28901c;

    /* renamed from: d, reason: collision with root package name */
    private final A4.a f28902d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3466c f28903e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f28904f;

    /* renamed from: com.stripe.android.view.l$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.l$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final C3411I f28905a;

        /* renamed from: b, reason: collision with root package name */
        private final C2634d f28906b;

        public b(C3411I stripe, C2634d args) {
            AbstractC3255y.i(stripe, "stripe");
            AbstractC3255y.i(args, "args");
            this.f28905a = stripe;
            this.f28906b = args;
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
            return new C2650l(D2.b.a(extras), SavedStateHandleSupport.createSavedStateHandle(extras), this.f28905a, this.f28906b, null, null, 48, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28907a;

        /* renamed from: b, reason: collision with root package name */
        Object f28908b;

        /* renamed from: c, reason: collision with root package name */
        Object f28909c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f28910d;

        /* renamed from: f, reason: collision with root package name */
        int f28912f;

        c(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28910d = obj;
            this.f28912f |= Integer.MIN_VALUE;
            Object a8 = C2650l.this.a(null, null, this);
            return a8 == T5.b.e() ? a8 : O5.s.a(a8);
        }
    }

    /* renamed from: com.stripe.android.view.l$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S5.d f28913a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2650l f28914b;

        d(S5.d dVar, C2650l c2650l) {
            this.f28913a = dVar;
            this.f28914b = c2650l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.l$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f28915a;

        /* renamed from: b, reason: collision with root package name */
        Object f28916b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f28917c;

        /* renamed from: e, reason: collision with root package name */
        int f28919e;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28917c = obj;
            this.f28919e |= Integer.MIN_VALUE;
            Object b8 = C2650l.this.b(null, this);
            return b8 == T5.b.e() ? b8 : O5.s.a(b8);
        }
    }

    /* renamed from: com.stripe.android.view.l$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3415a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ S5.d f28920a;

        f(S5.d dVar) {
            this.f28920a = dVar;
        }

        @Override // m2.InterfaceC3415a
        public void a(Exception e8) {
            AbstractC3255y.i(e8, "e");
            S5.d dVar = this.f28920a;
            s.a aVar = O5.s.f8302b;
            dVar.resumeWith(O5.s.b(O5.s.a(O5.s.b(O5.t.a(e8)))));
        }

        @Override // m2.InterfaceC3415a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(com.stripe.android.model.o result) {
            AbstractC3255y.i(result, "result");
            this.f28920a.resumeWith(O5.s.b(O5.s.a(O5.s.b(result))));
        }
    }

    public /* synthetic */ C2650l(Application application, SavedStateHandle savedStateHandle, C3411I c3411i, C2634d c2634d, A4.a aVar, InterfaceC3466c interfaceC3466c, int i8, AbstractC3247p abstractC3247p) {
        this(application, savedStateHandle, c3411i, c2634d, (i8 & 16) != 0 ? A4.b.f483a.a() : aVar, (i8 & 32) != 0 ? C3467d.f35370a.a(application) : interfaceC3466c);
    }

    private final boolean c() {
        Boolean bool = (Boolean) this.f28899a.get("FROM_INTERACTED_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean d() {
        Boolean bool = (Boolean) this.f28899a.get("FROM_SHOWN_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void i(boolean z8) {
        this.f28899a.set("FROM_INTERACTED_EVENT_REPORTED", Boolean.valueOf(z8));
    }

    private final void j(boolean z8) {
        this.f28899a.set("FROM_SHOWN_EVENT_REPORTED", Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object a(m2.AbstractC3420f r5, com.stripe.android.model.o r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.view.C2650l.c
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.view.l$c r0 = (com.stripe.android.view.C2650l.c) r0
            int r1 = r0.f28912f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28912f = r1
            goto L18
        L13:
            com.stripe.android.view.l$c r0 = new com.stripe.android.view.l$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f28910d
            T5.b.e()
            int r1 = r0.f28912f
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 != r2) goto L3b
            java.lang.Object r5 = r0.f28909c
            com.stripe.android.model.o r5 = (com.stripe.android.model.o) r5
            java.lang.Object r5 = r0.f28908b
            android.support.v4.media.a.a(r5)
            java.lang.Object r5 = r0.f28907a
            com.stripe.android.view.l r5 = (com.stripe.android.view.C2650l) r5
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r5 = r7.j()
            return r5
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            O5.t.b(r7)
            r0.f28907a = r4
            r0.f28908b = r5
            r0.f28909c = r6
            r0.f28912f = r2
            S5.i r5 = new S5.i
            S5.d r7 = T5.b.c(r0)
            r5.<init>(r7)
            java.lang.String r6 = r6.f25463a
            com.stripe.android.view.l$d r6 = new com.stripe.android.view.l$d
            r6.<init>(r5, r4)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2650l.a(m2.f, com.stripe.android.model.o, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.stripe.android.model.p r11, S5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.view.C2650l.e
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.view.l$e r0 = (com.stripe.android.view.C2650l.e) r0
            int r1 = r0.f28919e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28919e = r1
            goto L18
        L13:
            com.stripe.android.view.l$e r0 = new com.stripe.android.view.l$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f28917c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f28919e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.f28916b
            com.stripe.android.model.p r11 = (com.stripe.android.model.p) r11
            java.lang.Object r11 = r0.f28915a
            com.stripe.android.view.l r11 = (com.stripe.android.view.C2650l) r11
            O5.t.b(r12)
            goto L6d
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            O5.t.b(r12)
            r0.f28915a = r10
            r0.f28916b = r11
            r0.f28919e = r3
            S5.i r12 = new S5.i
            S5.d r2 = T5.b.c(r0)
            r12.<init>(r2)
            m2.I r3 = r10.f28900b
            com.stripe.android.model.p r4 = r10.k(r11)
            com.stripe.android.view.l$f r7 = new com.stripe.android.view.l$f
            r7.<init>(r12)
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            m2.C3411I.e(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = r12.a()
            java.lang.Object r11 = T5.b.e()
            if (r12 != r11) goto L6a
            kotlin.coroutines.jvm.internal.h.c(r0)
        L6a:
            if (r12 != r1) goto L6d
            return r1
        L6d:
            O5.s r12 = (O5.s) r12
            java.lang.Object r11 = r12.j()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2650l.b(com.stripe.android.model.p, S5.d):java.lang.Object");
    }

    public final void e() {
        this.f28903e.a();
    }

    public final void f() {
        if (!c()) {
            this.f28903e.e(this.f28901c.h().f25605a);
            i(true);
        }
    }

    public final void g() {
        if (!d()) {
            this.f28903e.b(this.f28901c.h().f25605a);
            j(true);
        }
    }

    public final void h() {
        this.f28903e.d(this.f28901c.h().f25605a);
    }

    public final com.stripe.android.model.p k(com.stripe.android.model.p params) {
        com.stripe.android.model.p g8;
        AbstractC3255y.i(params, "params");
        g8 = params.g((r38 & 1) != 0 ? params.f25638a : null, (r38 & 2) != 0 ? params.f25639b : false, (r38 & 4) != 0 ? params.f25640c : null, (r38 & 8) != 0 ? params.f25641d : null, (r38 & 16) != 0 ? params.f25642e : null, (r38 & 32) != 0 ? params.f25643f : null, (r38 & 64) != 0 ? params.f25644g : null, (r38 & 128) != 0 ? params.f25645h : null, (r38 & 256) != 0 ? params.f25646i : null, (r38 & 512) != 0 ? params.f25647j : null, (r38 & 1024) != 0 ? params.f25648k : null, (r38 & 2048) != 0 ? params.f25649l : null, (r38 & 4096) != 0 ? params.f25650m : null, (r38 & 8192) != 0 ? params.f25651n : null, (r38 & 16384) != 0 ? params.f25652o : null, (r38 & 32768) != 0 ? params.f25653p : null, (r38 & 65536) != 0 ? params.f25654q : null, (r38 & 131072) != 0 ? params.f25655r : null, (r38 & 262144) != 0 ? params.f25656s : this.f28904f, (r38 & 524288) != 0 ? params.f25657t : null);
        return g8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2650l(Application application, SavedStateHandle savedStateHandle, C3411I stripe, C2634d args, A4.a errorMessageTranslator, InterfaceC3466c eventReporter) {
        super(application);
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(stripe, "stripe");
        AbstractC3255y.i(args, "args");
        AbstractC3255y.i(errorMessageTranslator, "errorMessageTranslator");
        AbstractC3255y.i(eventReporter, "eventReporter");
        this.f28899a = savedStateHandle;
        this.f28900b = stripe;
        this.f28901c = args;
        this.f28902d = errorMessageTranslator;
        this.f28903e = eventReporter;
        this.f28904f = AbstractC1378t.b1(AbstractC1378t.r("AddPaymentMethodActivity", args.p() ? "PaymentSession" : null));
        C3470g.f35374a.c(this, savedStateHandle);
        if (d()) {
            return;
        }
        eventReporter.b(args.h().f25605a);
        j(true);
    }
}
