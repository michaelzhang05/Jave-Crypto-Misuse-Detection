package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import E3.f;
import L5.I;
import L5.t;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionContract;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.a;
import com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c;
import e4.Q;
import e6.InterfaceC2643c;
import i6.AbstractC2829k;
import i6.M;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3340B;
import l6.AbstractC3351M;
import l6.AbstractC3360h;
import l6.InterfaceC3349K;
import l6.u;
import l6.v;
import l6.z;
import v4.g;

/* loaded from: classes4.dex */
public final class d extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final Q f26257a;

    /* renamed from: b, reason: collision with root package name */
    private final v f26258b;

    /* renamed from: c, reason: collision with root package name */
    private final u f26259c;

    /* renamed from: d, reason: collision with root package name */
    private final z f26260d;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final CvcRecollectionContract.a f26261a;

        public a(CvcRecollectionContract.a args) {
            AbstractC3159y.i(args, "args");
            this.f26261a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2643c interfaceC2643c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2643c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3159y.i(modelClass, "modelClass");
            AbstractC3159y.i(extras, "extras");
            return new d(new E3.a(this.f26261a.e(), this.f26261a.c(), null, this.f26261a.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26262a;

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
            int i8 = this.f26262a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                u uVar = d.this.f26259c;
                a.C0634a c0634a = a.C0634a.f26212a;
                this.f26262a = 1;
                if (uVar.emit(c0634a, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26264a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f26266c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, P5.d dVar) {
            super(2, dVar);
            this.f26266c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f26266c, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26264a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                u uVar = d.this.f26259c;
                a.c cVar = new a.c(this.f26266c);
                this.f26264a = 1;
                if (uVar.emit(cVar, this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    public d(E3.a args) {
        AbstractC3159y.i(args, "args");
        this.f26257a = new Q(null, g.n(args.a()), null, false, 13, null);
        String c8 = args.c();
        boolean d8 = args.d();
        String b8 = args.b();
        this.f26258b = AbstractC3351M.a(new f(c8, d8, new E3.g(b8 == null ? "" : b8, args.a())));
        u b9 = AbstractC3340B.b(0, 0, null, 7, null);
        this.f26259c = b9;
        this.f26260d = AbstractC3360h.a(b9);
    }

    private final void e() {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    private final void f(String str) {
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), null, null, new c(str, null), 3, null);
    }

    private final void g(String str) {
        Object value;
        f fVar;
        v vVar = this.f26258b;
        do {
            value = vVar.getValue();
            fVar = (f) value;
        } while (!vVar.a(value, f.b(fVar, null, false, fVar.c().f(str), 3, null)));
    }

    public final z b() {
        return this.f26260d;
    }

    public final InterfaceC3349K c() {
        return this.f26258b;
    }

    public final void d(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c action) {
        AbstractC3159y.i(action, "action");
        if (action instanceof c.b) {
            f(((f) c().getValue()).c().b());
        } else if (action instanceof c.a) {
            e();
        } else if (action instanceof c.C0640c) {
            g(((c.C0640c) action).a());
        }
    }
}
