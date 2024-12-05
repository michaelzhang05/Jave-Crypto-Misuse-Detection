package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import H3.f;
import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import h4.Q;
import h6.InterfaceC2963c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3689C;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3687A;
import o6.InterfaceC3698L;
import o6.v;
import o6.w;
import y4.g;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Q f27312a;

    /* renamed from: b, reason: collision with root package name */
    private final w f27313b;

    /* renamed from: c, reason: collision with root package name */
    private final v f27314c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3687A f27315d;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final CvcRecollectionContract.a f27316a;

        public a(CvcRecollectionContract.a args) {
            AbstractC3255y.i(args, "args");
            this.f27316a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            return new d(new H3.a(this.f27316a.g(), this.f27316a.b(), null, this.f27316a.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27317a;

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
            int i8 = this.f27317a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = d.this.f27314c;
                a.C0630a c0630a = a.C0630a.f27267a;
                this.f27317a = 1;
                if (vVar.emit(c0630a, this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27319a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f27321c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, S5.d dVar) {
            super(2, dVar);
            this.f27321c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f27321c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27319a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = d.this.f27314c;
                a.c cVar = new a.c(this.f27321c);
                this.f27319a = 1;
                if (vVar.emit(cVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public d(H3.a args) {
        AbstractC3255y.i(args, "args");
        this.f27312a = new Q(null, g.n(args.a()), null, false, 13, null);
        String c8 = args.c();
        boolean d8 = args.d();
        String b8 = args.b();
        this.f27313b = AbstractC3700N.a(new f(c8, d8, new H3.g(b8 == null ? "" : b8, args.a())));
        v b9 = AbstractC3689C.b(0, 0, null, 7, null);
        this.f27314c = b9;
        this.f27315d = AbstractC3708h.a(b9);
    }

    private final void e() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    private final void f(String str) {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new c(str, null), 3, null);
    }

    private final void g(String str) {
        Object value;
        f fVar;
        w wVar = this.f27313b;
        do {
            value = wVar.getValue();
            fVar = (f) value;
        } while (!wVar.c(value, f.b(fVar, null, false, fVar.c().f(str), 3, null)));
    }

    public final InterfaceC3687A b() {
        return this.f27315d;
    }

    public final InterfaceC3698L c() {
        return this.f27313b;
    }

    public final void d(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c action) {
        AbstractC3255y.i(action, "action");
        if (action instanceof c.b) {
            f(((f) c().getValue()).c().b());
        } else if (action instanceof c.a) {
            e();
        } else if (action instanceof c.C0636c) {
            g(((c.C0636c) action).a());
        }
    }
}
