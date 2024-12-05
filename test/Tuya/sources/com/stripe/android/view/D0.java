package com.stripe.android.view;

import M5.AbstractC1246t;
import android.app.Application;
import android.content.res.Resources;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.model.o;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import j2.AbstractC3053E;
import j2.AbstractC3066f;
import java.util.Set;
import k2.C3115g;
import k2.InterfaceC3111c;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;

/* loaded from: classes4.dex */
public final class D0 extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27351a;

    /* renamed from: b, reason: collision with root package name */
    private String f27352b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27353c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3111c f27354d;

    /* renamed from: e, reason: collision with root package name */
    private final Resources f27355e;

    /* renamed from: f, reason: collision with root package name */
    private final C2477z f27356f;

    /* renamed from: g, reason: collision with root package name */
    private volatile InterfaceC2855x0 f27357g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f27358h;

    /* renamed from: i, reason: collision with root package name */
    private final l6.v f27359i;

    /* renamed from: j, reason: collision with root package name */
    private final l6.v f27360j;

    /* renamed from: k, reason: collision with root package name */
    private final l6.v f27361k;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f27362a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f27363b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27364c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f27365d;

        public a(Application application, Object obj, String str, boolean z8) {
            AbstractC3159y.i(application, "application");
            this.f27362a = application;
            this.f27363b = obj;
            this.f27364c = str;
            this.f27365d = z8;
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
            return new D0(this.f27362a, SavedStateHandleSupport.createSavedStateHandle(extras), this.f27363b, this.f27364c, this.f27365d, null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27366a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27368c;

        /* loaded from: classes4.dex */
        public static final class a implements AbstractC3066f.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f27369a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ D0 f27370b;

            a(boolean z8, D0 d02) {
                this.f27369a = z8;
                this.f27370b = d02;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, P5.d dVar) {
            super(2, dVar);
            this.f27368c = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f27368c, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f27366a == 0) {
                L5.t.b(obj);
                D0.this.f().setValue(kotlin.coroutines.jvm.internal.b.a(true));
                Object obj2 = D0.this.f27351a;
                D0 d02 = D0.this;
                boolean z8 = this.f27368c;
                Throwable e8 = L5.s.e(obj2);
                if (e8 == null) {
                    android.support.v4.media.a.a(obj2);
                    AbstractC3066f.b(null, o.p.f24532i, null, null, null, d02.e(), new a(z8, d02), 14, null);
                } else {
                    d02.d().setValue(L5.s.a(L5.s.b(L5.t.a(e8))));
                    d02.f().setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ D0(android.app.Application r8, androidx.lifecycle.SavedStateHandle r9, java.lang.Object r10, java.lang.String r11, boolean r12, k2.InterfaceC3111c r13, int r14, kotlin.jvm.internal.AbstractC3151p r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L5
            r11 = 0
        L5:
            r4 = r11
            r11 = r14 & 32
            if (r11 == 0) goto L19
            k2.d r11 = k2.C3112d.f33378a
            android.content.Context r13 = r8.getApplicationContext()
            java.lang.String r14 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3159y.h(r13, r14)
            k2.c r13 = r11.a(r13)
        L19:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.D0.<init>(android.app.Application, androidx.lifecycle.SavedStateHandle, java.lang.Object, java.lang.String, boolean, k2.c, int, kotlin.jvm.internal.p):void");
    }

    private final String b(com.stripe.android.model.o oVar, int i8) {
        o.g gVar = oVar.f24415h;
        if (gVar != null) {
            return this.f27355e.getString(i8, this.f27356f.b(gVar));
        }
        return null;
    }

    private final void c(boolean z8) {
        InterfaceC2855x0 d8;
        InterfaceC2855x0 interfaceC2855x0 = this.f27357g;
        if (interfaceC2855x0 != null) {
            InterfaceC2855x0.a.a(interfaceC2855x0, null, 1, null);
        }
        if (z8) {
            this.f27354d.c();
        }
        d8 = AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new b(z8, null), 3, null);
        this.f27357g = d8;
    }

    public final l6.v d() {
        return this.f27359i;
    }

    public final Set e() {
        return this.f27358h;
    }

    public final l6.v f() {
        return this.f27361k;
    }

    public final String g() {
        return this.f27352b;
    }

    public final l6.v h() {
        return this.f27360j;
    }

    public final void i(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        String b8 = b(paymentMethod, AbstractC3053E.f32878f);
        if (b8 != null) {
            this.f27360j.setValue(b8);
            this.f27360j.setValue(null);
        }
        c(false);
    }

    public final void j(com.stripe.android.model.o paymentMethod) {
        AbstractC3159y.i(paymentMethod, "paymentMethod");
        String b8 = b(paymentMethod, AbstractC3053E.f32841G0);
        if (b8 != null) {
            this.f27360j.setValue(b8);
            this.f27360j.setValue(null);
        }
    }

    public final void k(String str) {
        this.f27352b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Application application, SavedStateHandle savedStateHandle, Object obj, String str, boolean z8, InterfaceC3111c eventReporter) {
        super(application);
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(savedStateHandle, "savedStateHandle");
        AbstractC3159y.i(eventReporter, "eventReporter");
        this.f27351a = obj;
        this.f27352b = str;
        this.f27353c = z8;
        this.f27354d = eventReporter;
        this.f27355e = application.getResources();
        this.f27356f = new C2477z(application);
        this.f27358h = AbstractC1246t.b1(AbstractC1246t.r(z8 ? "PaymentSession" : null, "PaymentMethodsActivity"));
        this.f27359i = AbstractC3351M.a(null);
        this.f27360j = AbstractC3351M.a(null);
        this.f27361k = AbstractC3351M.a(Boolean.FALSE);
        C3115g.f33382a.c(this, savedStateHandle);
        c(true);
    }
}
