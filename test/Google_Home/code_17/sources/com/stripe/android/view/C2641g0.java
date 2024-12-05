package com.stripe.android.view;

import A2.j;
import a6.InterfaceC1668n;
import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import e3.C2788b;
import h6.InterfaceC2963c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3698L;

/* renamed from: com.stripe.android.view.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2641g0 extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final String f28773a;

    /* renamed from: b, reason: collision with root package name */
    private final h3.m f28774b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f28775c;

    /* renamed from: d, reason: collision with root package name */
    private final o6.w f28776d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f28777e;

    /* renamed from: com.stripe.android.view.g0$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f28778a;

        /* renamed from: b, reason: collision with root package name */
        int f28779b;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            o6.w wVar;
            Object obj2;
            Object e8 = T5.b.e();
            int i8 = this.f28779b;
            if (i8 != 0) {
                if (i8 == 1) {
                    wVar = (o6.w) this.f28778a;
                    O5.t.b(obj);
                    obj2 = ((O5.s) obj).j();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                o6.w wVar2 = C2641g0.this.f28776d;
                h3.m mVar = C2641g0.this.f28774b;
                j.c cVar = new j.c(C2641g0.this.f28773a, null, null, 6, null);
                this.f28778a = wVar2;
                this.f28779b = 1;
                Object g8 = mVar.g(cVar, this);
                if (g8 == e8) {
                    return e8;
                }
                wVar = wVar2;
                obj2 = g8;
            }
            if (O5.s.e(obj2) != null) {
                obj2 = new C2788b(null, 1, null);
            }
            wVar.setValue(obj2);
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.stripe.android.view.g0$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f28781a;

        /* renamed from: com.stripe.android.view.g0$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f28782a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f28782a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f28782a;
            }
        }

        public b(Application application) {
            AbstractC3255y.i(application, "application");
            this.f28781a = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3255y.i(modelClass, "modelClass");
            String g8 = m2.r.f35037c.a(this.f28781a).g();
            return new C2641g0(this.f28781a, g8, new com.stripe.android.networking.a(this.f28781a, new a(g8), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2641g0(Application application, String publishableKey, h3.m stripeRepository) {
        super(application);
        AbstractC3255y.i(application, "application");
        AbstractC3255y.i(publishableKey, "publishableKey");
        AbstractC3255y.i(stripeRepository, "stripeRepository");
        this.f28773a = publishableKey;
        this.f28774b = stripeRepository;
        o6.w a8 = AbstractC3700N.a(null);
        this.f28776d = a8;
        this.f28777e = AbstractC3708h.b(a8);
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    public final InterfaceC3698L d() {
        return this.f28777e;
    }

    public final Integer e() {
        return this.f28775c;
    }

    public final void f(Integer num) {
        this.f28775c = num;
    }
}
