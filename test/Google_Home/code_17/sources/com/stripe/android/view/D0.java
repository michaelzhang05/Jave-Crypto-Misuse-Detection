package com.stripe.android.view;

import P5.AbstractC1378t;
import a6.InterfaceC1668n;
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
import h6.InterfaceC2963c;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import m2.AbstractC3407E;
import m2.AbstractC3420f;
import n2.C3470g;
import n2.InterfaceC3466c;
import o6.AbstractC3700N;

/* loaded from: classes4.dex */
public final class D0 extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Object f28406a;

    /* renamed from: b, reason: collision with root package name */
    private String f28407b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f28408c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3466c f28409d;

    /* renamed from: e, reason: collision with root package name */
    private final Resources f28410e;

    /* renamed from: f, reason: collision with root package name */
    private final C2671z f28411f;

    /* renamed from: g, reason: collision with root package name */
    private volatile InterfaceC3390x0 f28412g;

    /* renamed from: h, reason: collision with root package name */
    private final Set f28413h;

    /* renamed from: i, reason: collision with root package name */
    private final o6.w f28414i;

    /* renamed from: j, reason: collision with root package name */
    private final o6.w f28415j;

    /* renamed from: k, reason: collision with root package name */
    private final o6.w f28416k;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f28417a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f28418b;

        /* renamed from: c, reason: collision with root package name */
        private final String f28419c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f28420d;

        public a(Application application, Object obj, String str, boolean z8) {
            AbstractC3255y.i(application, "application");
            this.f28417a = application;
            this.f28418b = obj;
            this.f28419c = str;
            this.f28420d = z8;
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
            return new D0(this.f28417a, SavedStateHandleSupport.createSavedStateHandle(extras), this.f28418b, this.f28419c, this.f28420d, null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28421a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f28423c;

        /* loaded from: classes4.dex */
        public static final class a implements AbstractC3420f.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f28424a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ D0 f28425b;

            a(boolean z8, D0 d02) {
                this.f28424a = z8;
                this.f28425b = d02;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, S5.d dVar) {
            super(2, dVar);
            this.f28423c = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f28423c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f28421a == 0) {
                O5.t.b(obj);
                D0.this.f().setValue(kotlin.coroutines.jvm.internal.b.a(true));
                Object obj2 = D0.this.f28406a;
                D0 d02 = D0.this;
                boolean z8 = this.f28423c;
                Throwable e8 = O5.s.e(obj2);
                if (e8 == null) {
                    android.support.v4.media.a.a(obj2);
                    AbstractC3420f.b(null, o.p.f25587i, null, null, null, d02.e(), new a(z8, d02), 14, null);
                } else {
                    d02.d().setValue(O5.s.a(O5.s.b(O5.t.a(e8))));
                    d02.f().setValue(kotlin.coroutines.jvm.internal.b.a(false));
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ D0(android.app.Application r8, androidx.lifecycle.SavedStateHandle r9, java.lang.Object r10, java.lang.String r11, boolean r12, n2.InterfaceC3466c r13, int r14, kotlin.jvm.internal.AbstractC3247p r15) {
        /*
            r7 = this;
            r15 = r14 & 8
            if (r15 == 0) goto L5
            r11 = 0
        L5:
            r4 = r11
            r11 = r14 & 32
            if (r11 == 0) goto L19
            n2.d r11 = n2.C3467d.f35370a
            android.content.Context r13 = r8.getApplicationContext()
            java.lang.String r14 = "getApplicationContext(...)"
            kotlin.jvm.internal.AbstractC3255y.h(r13, r14)
            n2.c r13 = r11.a(r13)
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.D0.<init>(android.app.Application, androidx.lifecycle.SavedStateHandle, java.lang.Object, java.lang.String, boolean, n2.c, int, kotlin.jvm.internal.p):void");
    }

    private final String b(com.stripe.android.model.o oVar, int i8) {
        o.g gVar = oVar.f25470h;
        if (gVar != null) {
            return this.f28410e.getString(i8, this.f28411f.b(gVar));
        }
        return null;
    }

    private final void c(boolean z8) {
        InterfaceC3390x0 d8;
        InterfaceC3390x0 interfaceC3390x0 = this.f28412g;
        if (interfaceC3390x0 != null) {
            InterfaceC3390x0.a.a(interfaceC3390x0, null, 1, null);
        }
        if (z8) {
            this.f28409d.c();
        }
        d8 = AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new b(z8, null), 3, null);
        this.f28412g = d8;
    }

    public final o6.w d() {
        return this.f28414i;
    }

    public final Set e() {
        return this.f28413h;
    }

    public final o6.w f() {
        return this.f28416k;
    }

    public final String g() {
        return this.f28407b;
    }

    public final o6.w h() {
        return this.f28415j;
    }

    public final void i(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        String b8 = b(paymentMethod, AbstractC3407E.f34854f);
        if (b8 != null) {
            this.f28415j.setValue(b8);
            this.f28415j.setValue(null);
        }
        c(false);
    }

    public final void j(com.stripe.android.model.o paymentMethod) {
        AbstractC3255y.i(paymentMethod, "paymentMethod");
        String b8 = b(paymentMethod, AbstractC3407E.f34817G0);
        if (b8 != null) {
            this.f28415j.setValue(b8);
            this.f28415j.setValue(null);
        }
    }

    public final void k(String str) {
        this.f28407b = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(Application application, SavedStateHandle savedStateHandle, Object obj, String str, boolean z8, InterfaceC3466c eventReporter) {
        super(application);
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(savedStateHandle, "savedStateHandle");
        AbstractC3255y.i(eventReporter, "eventReporter");
        this.f28406a = obj;
        this.f28407b = str;
        this.f28408c = z8;
        this.f28409d = eventReporter;
        this.f28410e = application.getResources();
        this.f28411f = new C2671z(application);
        this.f28413h = AbstractC1378t.b1(AbstractC1378t.r(z8 ? "PaymentSession" : null, "PaymentMethodsActivity"));
        this.f28414i = AbstractC3700N.a(null);
        this.f28415j = AbstractC3700N.a(null);
        this.f28416k = AbstractC3700N.a(Boolean.FALSE);
        C3470g.f35374a.c(this, savedStateHandle);
        c(true);
    }
}
