package com.stripe.android.payments.bankaccount.ui;

import L5.C1224h;
import L5.I;
import L5.InterfaceC1227k;
import L5.l;
import L5.p;
import L5.t;
import X5.n;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResult;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetInstantDebitsResult;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.d;
import com.stripe.android.payments.bankaccount.ui.a;
import com.stripe.android.payments.bankaccount.ui.b;
import g3.InterfaceC2712a;
import i6.M;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3156v;
import kotlin.jvm.internal.U;
import l6.InterfaceC3359g;
import l6.z;
import o3.c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CollectBankAccountActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    private o3.c f25119b;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1227k f25118a = l.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f25120c = new ViewModelLazy(U.b(com.stripe.android.payments.bankaccount.ui.b.class), new d(this), new g(), new e(null, this));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3156v implements Function1 {
        a(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0);
        }

        public final void d(FinancialConnectionsSheetInstantDebitsResult p02) {
            AbstractC3159y.i(p02, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).u(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((FinancialConnectionsSheetInstantDebitsResult) obj);
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C3156v implements Function1 {
        b(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        public final void d(FinancialConnectionsSheetResult p02) {
            AbstractC3159y.i(p02, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).t(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((FinancialConnectionsSheetResult) obj);
            return I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f25121a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3359g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f25123a;

            a(CollectBankAccountActivity collectBankAccountActivity) {
                this.f25123a = collectBankAccountActivity;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.ui.a aVar, P5.d dVar) {
                if (aVar instanceof a.b) {
                    this.f25123a.v((a.b) aVar);
                } else if (aVar instanceof a.C0547a) {
                    this.f25123a.u((a.C0547a) aVar);
                }
                return I.f6487a;
            }
        }

        c(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f25121a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                z s8 = CollectBankAccountActivity.this.s().s();
                a aVar = new a(CollectBankAccountActivity.this);
                this.f25121a = 1;
                if (s8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25124a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f25124a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f25124a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f25125a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f25126b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f25125a = function0;
            this.f25126b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f25125a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f25126b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3160z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountContract.a invoke() {
            CollectBankAccountContract.a.C0536a c0536a = CollectBankAccountContract.a.f25061g;
            Intent intent = CollectBankAccountActivity.this.getIntent();
            AbstractC3159y.h(intent, "getIntent(...)");
            return c0536a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3160z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f25129a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CollectBankAccountActivity collectBankAccountActivity) {
                super(0);
                this.f25129a = collectBankAccountActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CollectBankAccountContract.a invoke() {
                CollectBankAccountContract.a r8 = this.f25129a.r();
                if (r8 != null) {
                    return r8;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new b.c(new a(CollectBankAccountActivity.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountContract.a r() {
        return (CollectBankAccountContract.a) this.f25118a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.payments.bankaccount.ui.b s() {
        return (com.stripe.android.payments.bankaccount.ui.b) this.f25120c.getValue();
    }

    private final void t(InterfaceC2712a interfaceC2712a) {
        o3.c b8;
        if (interfaceC2712a instanceof InterfaceC2712a.C0747a) {
            b8 = c.a.d(o3.c.f36378a, this, new a(s()), null, null, 12, null);
        } else if (interfaceC2712a instanceof InterfaceC2712a.b) {
            b8 = c.a.b(o3.c.f36378a, this, new b(s()), null, null, 12, null);
        } else {
            throw new p();
        }
        this.f25119b = b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(a.C0547a c0547a) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.c(c0547a.a()).c()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(a.b bVar) {
        o3.c cVar = this.f25119b;
        if (cVar == null) {
            AbstractC3159y.y("financialConnectionsPaymentsProxy");
            cVar = null;
        }
        cVar.a(bVar.a(), bVar.b(), bVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC2712a interfaceC2712a;
        super.onCreate(bundle);
        CollectBankAccountContract.a r8 = r();
        if (r8 != null) {
            interfaceC2712a = r8.c();
        } else {
            interfaceC2712a = null;
        }
        if (interfaceC2712a == null) {
            u(new a.C0547a(new d.c(new IllegalStateException("Configuration not provided"))));
            return;
        }
        CollectBankAccountContract.a r9 = r();
        if (r9 != null) {
            t(r9.c());
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new c(null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
