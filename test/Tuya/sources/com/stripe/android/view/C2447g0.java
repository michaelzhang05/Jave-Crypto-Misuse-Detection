package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import b3.C1867b;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import x2.j;

/* renamed from: com.stripe.android.view.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2447g0 extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final String f27718a;

    /* renamed from: b, reason: collision with root package name */
    private final e3.m f27719b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f27720c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f27721d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f27722e;

    /* renamed from: com.stripe.android.view.g0$a */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        Object f27723a;

        /* renamed from: b, reason: collision with root package name */
        int f27724b;

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            l6.v vVar;
            Object obj2;
            Object e8 = Q5.b.e();
            int i8 = this.f27724b;
            if (i8 != 0) {
                if (i8 == 1) {
                    vVar = (l6.v) this.f27723a;
                    L5.t.b(obj);
                    obj2 = ((L5.s) obj).k();
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                L5.t.b(obj);
                l6.v vVar2 = C2447g0.this.f27721d;
                e3.m mVar = C2447g0.this.f27719b;
                j.c cVar = new j.c(C2447g0.this.f27718a, null, null, 6, null);
                this.f27723a = vVar2;
                this.f27724b = 1;
                Object x8 = mVar.x(cVar, this);
                if (x8 == e8) {
                    return e8;
                }
                vVar = vVar2;
                obj2 = x8;
            }
            if (L5.s.e(obj2) != null) {
                obj2 = new C1867b(null, 1, null);
            }
            vVar.setValue(obj2);
            return L5.I.f6487a;
        }
    }

    /* renamed from: com.stripe.android.view.g0$b */
    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Application f27726a;

        /* renamed from: com.stripe.android.view.g0$b$a */
        /* loaded from: classes4.dex */
        static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f27727a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f27727a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return this.f27727a;
            }
        }

        public b(Application application) {
            AbstractC3159y.i(application, "application");
            this.f27726a = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return androidx.lifecycle.n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return androidx.lifecycle.n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3159y.i(modelClass, "modelClass");
            String e8 = j2.r.f33061c.a(this.f27726a).e();
            return new C2447g0(this.f27726a, e8, new com.stripe.android.networking.a(this.f27726a, new a(e8), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2447g0(Application application, String publishableKey, e3.m stripeRepository) {
        super(application);
        AbstractC3159y.i(application, "application");
        AbstractC3159y.i(publishableKey, "publishableKey");
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        this.f27718a = publishableKey;
        this.f27719b = stripeRepository;
        l6.v a8 = AbstractC3351M.a(null);
        this.f27721d = a8;
        this.f27722e = AbstractC3360h.b(a8);
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
    }

    public final InterfaceC3349K d() {
        return this.f27722e;
    }

    public final Integer e() {
        return this.f27720c;
    }

    public final void f(Integer num) {
        this.f27720c = num;
    }
}
