package com.stripe.android.view;

import L5.s;
import M5.AbstractC1246t;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import e6.InterfaceC2643c;
import j2.C3057I;
import j2.InterfaceC3061a;
import java.util.Set;
import k2.C3112d;
import k2.C3115g;
import k2.InterfaceC3111c;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import x4.C3927b;
import x4.InterfaceC3926a;

/* renamed from: com.stripe.android.view.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2456l extends AndroidViewModel {

    /* renamed from: g, reason: collision with root package name */
    private static final a f27842g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f27843h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final SavedStateHandle f27844a;

    /* renamed from: b, reason: collision with root package name */
    private final C3057I f27845b;

    /* renamed from: c, reason: collision with root package name */
    private final C2440d f27846c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3926a f27847d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3111c f27848e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f27849f;

    /* renamed from: com.stripe.android.view.l$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.l$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final C3057I f27850a;

        /* renamed from: b, reason: collision with root package name */
        private final C2440d f27851b;

        public b(C3057I stripe, C2440d args) {
            AbstractC3159y.i(stripe, "stripe");
            AbstractC3159y.i(args, "args");
            this.f27850a = stripe;
            this.f27851b = args;
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
            return new C2456l(A2.b.a(extras), SavedStateHandleSupport.createSavedStateHandle(extras), this.f27850a, this.f27851b, null, null, 48, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.l$c */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27852a;

        /* renamed from: b, reason: collision with root package name */
        Object f27853b;

        /* renamed from: c, reason: collision with root package name */
        Object f27854c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f27855d;

        /* renamed from: f, reason: collision with root package name */
        int f27857f;

        c(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27855d = obj;
            this.f27857f |= Integer.MIN_VALUE;
            Object a8 = C2456l.this.a(null, null, this);
            return a8 == Q5.b.e() ? a8 : L5.s.a(a8);
        }
    }

    /* renamed from: com.stripe.android.view.l$d */
    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P5.d f27858a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C2456l f27859b;

        d(P5.d dVar, C2456l c2456l) {
            this.f27858a = dVar;
            this.f27859b = c2456l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.l$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f27860a;

        /* renamed from: b, reason: collision with root package name */
        Object f27861b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f27862c;

        /* renamed from: e, reason: collision with root package name */
        int f27864e;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f27862c = obj;
            this.f27864e |= Integer.MIN_VALUE;
            Object b8 = C2456l.this.b(null, this);
            return b8 == Q5.b.e() ? b8 : L5.s.a(b8);
        }
    }

    /* renamed from: com.stripe.android.view.l$f */
    /* loaded from: classes4.dex */
    public static final class f implements InterfaceC3061a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ P5.d f27865a;

        f(P5.d dVar) {
            this.f27865a = dVar;
        }

        @Override // j2.InterfaceC3061a
        public void a(Exception e8) {
            AbstractC3159y.i(e8, "e");
            P5.d dVar = this.f27865a;
            s.a aVar = L5.s.f6511b;
            dVar.resumeWith(L5.s.b(L5.s.a(L5.s.b(L5.t.a(e8)))));
        }

        @Override // j2.InterfaceC3061a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(com.stripe.android.model.o result) {
            AbstractC3159y.i(result, "result");
            this.f27865a.resumeWith(L5.s.b(L5.s.a(L5.s.b(result))));
        }
    }

    public /* synthetic */ C2456l(Application application, SavedStateHandle savedStateHandle, C3057I c3057i, C2440d c2440d, InterfaceC3926a interfaceC3926a, InterfaceC3111c interfaceC3111c, int i8, AbstractC3151p abstractC3151p) {
        this(application, savedStateHandle, c3057i, c2440d, (i8 & 16) != 0 ? C3927b.f39488a.a() : interfaceC3926a, (i8 & 32) != 0 ? C3112d.f33378a.a(application) : interfaceC3111c);
    }

    private final boolean c() {
        Boolean bool = (Boolean) this.f27844a.get("FROM_INTERACTED_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final boolean d() {
        Boolean bool = (Boolean) this.f27844a.get("FROM_SHOWN_EVENT_REPORTED");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private final void i(boolean z8) {
        this.f27844a.set("FROM_INTERACTED_EVENT_REPORTED", Boolean.valueOf(z8));
    }

    private final void j(boolean z8) {
        this.f27844a.set("FROM_SHOWN_EVENT_REPORTED", Boolean.valueOf(z8));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.Object a(j2.AbstractC3066f r5, com.stripe.android.model.o r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.view.C2456l.c
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.view.l$c r0 = (com.stripe.android.view.C2456l.c) r0
            int r1 = r0.f27857f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27857f = r1
            goto L18
        L13:
            com.stripe.android.view.l$c r0 = new com.stripe.android.view.l$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f27855d
            Q5.b.e()
            int r1 = r0.f27857f
            r2 = 1
            if (r1 == 0) goto L43
            if (r1 != r2) goto L3b
            java.lang.Object r5 = r0.f27854c
            com.stripe.android.model.o r5 = (com.stripe.android.model.o) r5
            java.lang.Object r5 = r0.f27853b
            android.support.v4.media.a.a(r5)
            java.lang.Object r5 = r0.f27852a
            com.stripe.android.view.l r5 = (com.stripe.android.view.C2456l) r5
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r5 = r7.k()
            return r5
        L3b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L43:
            L5.t.b(r7)
            r0.f27852a = r4
            r0.f27853b = r5
            r0.f27854c = r6
            r0.f27857f = r2
            P5.i r5 = new P5.i
            P5.d r7 = Q5.b.c(r0)
            r5.<init>(r7)
            java.lang.String r6 = r6.f24408a
            com.stripe.android.view.l$d r6 = new com.stripe.android.view.l$d
            r6.<init>(r5, r4)
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2456l.a(j2.f, com.stripe.android.model.o, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.stripe.android.model.p r11, P5.d r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.stripe.android.view.C2456l.e
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.view.l$e r0 = (com.stripe.android.view.C2456l.e) r0
            int r1 = r0.f27864e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27864e = r1
            goto L18
        L13:
            com.stripe.android.view.l$e r0 = new com.stripe.android.view.l$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f27862c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f27864e
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r11 = r0.f27861b
            com.stripe.android.model.p r11 = (com.stripe.android.model.p) r11
            java.lang.Object r11 = r0.f27860a
            com.stripe.android.view.l r11 = (com.stripe.android.view.C2456l) r11
            L5.t.b(r12)
            goto L6d
        L31:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L39:
            L5.t.b(r12)
            r0.f27860a = r10
            r0.f27861b = r11
            r0.f27864e = r3
            P5.i r12 = new P5.i
            P5.d r2 = Q5.b.c(r0)
            r12.<init>(r2)
            j2.I r3 = r10.f27845b
            com.stripe.android.model.p r4 = r10.k(r11)
            com.stripe.android.view.l$f r7 = new com.stripe.android.view.l$f
            r7.<init>(r12)
            r8 = 6
            r9 = 0
            r5 = 0
            r6 = 0
            j2.C3057I.e(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r12 = r12.a()
            java.lang.Object r11 = Q5.b.e()
            if (r12 != r11) goto L6a
            kotlin.coroutines.jvm.internal.h.c(r0)
        L6a:
            if (r12 != r1) goto L6d
            return r1
        L6d:
            L5.s r12 = (L5.s) r12
            java.lang.Object r11 = r12.k()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.C2456l.b(com.stripe.android.model.p, P5.d):java.lang.Object");
    }

    public final void e() {
        this.f27848e.a();
    }

    public final void f() {
        if (!c()) {
            this.f27848e.e(this.f27846c.f().f24550a);
            i(true);
        }
    }

    public final void g() {
        if (!d()) {
            this.f27848e.b(this.f27846c.f().f24550a);
            j(true);
        }
    }

    public final void h() {
        this.f27848e.d(this.f27846c.f().f24550a);
    }

    public final com.stripe.android.model.p k(com.stripe.android.model.p params) {
        com.stripe.android.model.p e8;
        AbstractC3159y.i(params, "params");
        e8 = params.e((r38 & 1) != 0 ? params.f24583a : null, (r38 & 2) != 0 ? params.f24584b : false, (r38 & 4) != 0 ? params.f24585c : null, (r38 & 8) != 0 ? params.f24586d : null, (r38 & 16) != 0 ? params.f24587e : null, (r38 & 32) != 0 ? params.f24588f : null, (r38 & 64) != 0 ? params.f24589g : null, (r38 & 128) != 0 ? params.f24590h : null, (r38 & 256) != 0 ? params.f24591i : null, (r38 & 512) != 0 ? params.f24592j : null, (r38 & 1024) != 0 ? params.f24593k : null, (r38 & 2048) != 0 ? params.f24594l : null, (r38 & 4096) != 0 ? params.f24595m : null, (r38 & 8192) != 0 ? params.f24596n : null, (r38 & 16384) != 0 ? params.f24597o : null, (r38 & 32768) != 0 ? params.f24598p : null, (r38 & 65536) != 0 ? params.f24599q : null, (r38 & 131072) != 0 ? params.f24600r : null, (r38 & 262144) != 0 ? params.f24601s : this.f27849f, (r38 & 524288) != 0 ? params.f24602t : null);
        return e8;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2456l(Application application, SavedStateHandle savedStateHandle, C3057I stripe, C2440d args, InterfaceC3926a errorMessageTranslator, InterfaceC3111c eventReporter) {
        super(application);
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(stripe, "stripe");
        AbstractC3159y.i(args, "args");
        AbstractC3159y.i(errorMessageTranslator, "errorMessageTranslator");
        AbstractC3159y.i(eventReporter, "eventReporter");
        this.f27844a = savedStateHandle;
        this.f27845b = stripe;
        this.f27846c = args;
        this.f27847d = errorMessageTranslator;
        this.f27848e = eventReporter;
        this.f27849f = AbstractC1246t.b1(AbstractC1246t.r("AddPaymentMethodActivity", args.k() ? "PaymentSession" : null));
        C3115g.f33382a.c(this, savedStateHandle);
        if (d()) {
            return;
        }
        eventReporter.b(args.f().f24550a);
        j(true);
    }
}
