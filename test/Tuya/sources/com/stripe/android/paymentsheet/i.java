package com.stripe.android.paymentsheet;

import L5.C1224h;
import L5.I;
import androidx.lifecycle.ViewModelKt;
import com.stripe.android.paymentsheet.u;
import i6.AbstractC2829k;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;
import y2.InterfaceC3983b;
import y3.AbstractC3991f;
import y3.C3989d;

/* loaded from: classes4.dex */
public final class i {

    /* renamed from: g, reason: collision with root package name */
    public static final b f26017g = new b(null);

    /* renamed from: h, reason: collision with root package name */
    public static final int f26018h = 8;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3349K f26019a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26020b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f26021c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f26022d;

    /* renamed from: e, reason: collision with root package name */
    private final l6.v f26023e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3349K f26024f;

    /* loaded from: classes4.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f26025a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.i$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0612a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f26027a;

            C0612a(i iVar) {
                this.f26027a = iVar;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3991f abstractC3991f, P5.d dVar) {
                InterfaceC3983b interfaceC3983b;
                AbstractC3991f.C0916f c0916f = null;
                if (abstractC3991f != null) {
                    interfaceC3983b = abstractC3991f.c(this.f26027a.f26020b, ((Boolean) this.f26027a.f26022d.invoke()).booleanValue());
                } else {
                    interfaceC3983b = null;
                }
                if (abstractC3991f instanceof AbstractC3991f.C0916f) {
                    c0916f = (AbstractC3991f.C0916f) abstractC3991f;
                }
                boolean z8 = false;
                if (c0916f != null && c0916f.j()) {
                    z8 = true;
                }
                this.f26027a.e(interfaceC3983b, z8);
                return I.f6487a;
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f26025a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K interfaceC3349K = i.this.f26019a;
                C0612a c0612a = new C0612a(i.this);
                this.f26025a = 1;
                if (interfaceC3349K.collect(c0612a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ M3.a f26028a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(M3.a aVar) {
                super(0);
                this.f26028a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                Y2.d dVar = (Y2.d) this.f26028a.t().getValue();
                return Boolean.valueOf((dVar != null ? dVar.V() : null) instanceof com.stripe.android.model.u);
            }
        }

        private b() {
        }

        public final i a(M3.a viewModel) {
            boolean z8;
            AbstractC3159y.i(viewModel, "viewModel");
            M viewModelScope = ViewModelKt.getViewModelScope(viewModel);
            InterfaceC3349K y8 = viewModel.y();
            String s8 = viewModel.f().s();
            if (viewModel.f().u() == u.n.f26494d) {
                z8 = true;
            } else {
                z8 = false;
            }
            return new i(viewModelScope, y8, s8, z8, new a(viewModel));
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public i(M coroutineScope, InterfaceC3349K selection, String merchantDisplayName, boolean z8, Function0 isSetupFlowProvider) {
        AbstractC3159y.i(coroutineScope, "coroutineScope");
        AbstractC3159y.i(selection, "selection");
        AbstractC3159y.i(merchantDisplayName, "merchantDisplayName");
        AbstractC3159y.i(isSetupFlowProvider, "isSetupFlowProvider");
        this.f26019a = selection;
        this.f26020b = merchantDisplayName;
        this.f26021c = z8;
        this.f26022d = isSetupFlowProvider;
        l6.v a8 = AbstractC3351M.a(null);
        this.f26023e = a8;
        this.f26024f = a8;
        AbstractC2829k.d(coroutineScope, null, null, new a(null), 3, null);
    }

    public final InterfaceC3349K d() {
        return this.f26024f;
    }

    public final void e(InterfaceC3983b interfaceC3983b, boolean z8) {
        C3989d c3989d;
        boolean z9;
        l6.v vVar = this.f26023e;
        if (interfaceC3983b != null) {
            if (!z8 && !this.f26021c) {
                z9 = false;
            } else {
                z9 = true;
            }
            c3989d = new C3989d(interfaceC3983b, z9);
        } else {
            c3989d = null;
        }
        vVar.setValue(c3989d);
    }
}
