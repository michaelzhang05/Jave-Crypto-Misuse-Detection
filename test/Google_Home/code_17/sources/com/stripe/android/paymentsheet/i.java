package com.stripe.android.paymentsheet;

import B3.f;
import O5.C1352h;
import O5.I;
import a6.InterfaceC1668n;
import androidx.lifecycle.ViewModelKt;
import b3.C1970d;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final b f27072g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f27073h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3698L f27074a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27075b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f27076c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f27077d;

    /* renamed from: e, reason: collision with root package name */
    private final o6.w f27078e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3698L f27079f;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27080a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0608a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f27082a;

            C0608a(i iVar) {
                this.f27082a = iVar;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(B3.f fVar, S5.d dVar) {
                B2.b bVar;
                f.C0009f c0009f = null;
                if (fVar != null) {
                    bVar = fVar.b(this.f27082a.f27075b, ((Boolean) this.f27082a.f27077d.invoke()).booleanValue());
                } else {
                    bVar = null;
                }
                if (fVar instanceof f.C0009f) {
                    c0009f = (f.C0009f) fVar;
                }
                boolean z8 = false;
                if (c0009f != null && c0009f.l()) {
                    z8 = true;
                }
                this.f27082a.e(bVar, z8);
                return I.f8278a;
            }
        }

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27080a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L interfaceC3698L = i.this.f27074a;
                C0608a c0608a = new C0608a(i.this);
                this.f27080a = 1;
                if (interfaceC3698L.collect(c0608a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ P3.a f27083a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(P3.a aVar) {
                super(0);
                this.f27083a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                C1970d c1970d = (C1970d) this.f27083a.t().getValue();
                return Boolean.valueOf((c1970d != null ? c1970d.W() : null) instanceof com.stripe.android.model.u);
            }
        }

        private b() {
        }

        public final i a(P3.a viewModel) {
            boolean z8;
            AbstractC3255y.i(viewModel, "viewModel");
            M viewModelScope = ViewModelKt.getViewModelScope(viewModel);
            InterfaceC3698L y8 = viewModel.y();
            String v8 = viewModel.f().v();
            if (viewModel.f().w() == u.n.f27549d) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new i(viewModelScope, y8, v8, z8, new a(viewModel));
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public i(M coroutineScope, InterfaceC3698L selection, String merchantDisplayName, boolean z8, Function0 isSetupFlowProvider) {
        AbstractC3255y.i(coroutineScope, "coroutineScope");
        AbstractC3255y.i(selection, "selection");
        AbstractC3255y.i(merchantDisplayName, "merchantDisplayName");
        AbstractC3255y.i(isSetupFlowProvider, "isSetupFlowProvider");
        this.f27074a = selection;
        this.f27075b = merchantDisplayName;
        this.f27076c = z8;
        this.f27077d = isSetupFlowProvider;
        o6.w a8 = AbstractC3700N.a(null);
        this.f27078e = a8;
        this.f27079f = a8;
        AbstractC3364k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    public final InterfaceC3698L d() {
        return this.f27079f;
    }

    public final void e(B2.b bVar, boolean z8) {
        B3.d dVar;
        boolean z9;
        o6.w wVar = this.f27078e;
        if (bVar != null) {
            if (!z8 && !this.f27076c) {
                z9 = false;
            } else {
                z9 = true;
            }
            dVar = new B3.d(bVar, z9);
        } else {
            dVar = null;
        }
        wVar.setValue(dVar);
    }
}
