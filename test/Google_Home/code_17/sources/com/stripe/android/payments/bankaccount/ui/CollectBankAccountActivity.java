package com.stripe.android.payments.bankaccount.ui;

import O5.C1352h;
import O5.I;
import O5.InterfaceC1355k;
import O5.l;
import O5.p;
import O5.t;
import a6.InterfaceC1668n;
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
import j3.InterfaceC3189a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3252v;
import kotlin.jvm.internal.U;
import l6.M;
import o6.InterfaceC3687A;
import o6.InterfaceC3707g;
import r3.c;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class CollectBankAccountActivity extends AppCompatActivity {

    /* renamed from: b, reason: collision with root package name */
    private r3.c f26174b;

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1355k f26173a = l.b(new f());

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f26175c = new ViewModelLazy(U.b(com.stripe.android.payments.bankaccount.ui.b.class), new d(this), new g(), new e(null, this));

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class a extends C3252v implements Function1 {
        a(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0);
        }

        public final void d(FinancialConnectionsSheetInstantDebitsResult p02) {
            AbstractC3255y.i(p02, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).u(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((FinancialConnectionsSheetInstantDebitsResult) obj);
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b extends C3252v implements Function1 {
        b(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        public final void d(FinancialConnectionsSheetResult p02) {
            AbstractC3255y.i(p02, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).t(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            d((FinancialConnectionsSheetResult) obj);
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26176a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f26178a;

            a(CollectBankAccountActivity collectBankAccountActivity) {
                this.f26178a = collectBankAccountActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.ui.a aVar, S5.d dVar) {
                if (aVar instanceof a.b) {
                    this.f26178a.v((a.b) aVar);
                } else if (aVar instanceof a.C0543a) {
                    this.f26178a.u((a.C0543a) aVar);
                }
                return I.f8278a;
            }
        }

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f26176a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            } else {
                t.b(obj);
                InterfaceC3687A s8 = CollectBankAccountActivity.this.s().s();
                a aVar = new a(CollectBankAccountActivity.this);
                this.f26176a = 1;
                if (s8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f26179a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f26179a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f26180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f26181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f26180a = function0;
            this.f26181b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26180a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f26181b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends AbstractC3256z implements Function0 {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountContract.a invoke() {
            CollectBankAccountContract.a.C0532a c0532a = CollectBankAccountContract.a.f26116g;
            Intent intent = CollectBankAccountActivity.this.getIntent();
            AbstractC3255y.h(intent, "getIntent(...)");
            return c0532a.a(intent);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends AbstractC3256z implements Function0 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f26184a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CollectBankAccountActivity collectBankAccountActivity) {
                super(0);
                this.f26184a = collectBankAccountActivity;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CollectBankAccountContract.a invoke() {
                CollectBankAccountContract.a r8 = this.f26184a.r();
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
        return (CollectBankAccountContract.a) this.f26173a.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.payments.bankaccount.ui.b s() {
        return (com.stripe.android.payments.bankaccount.ui.b) this.f26175c.getValue();
    }

    private final void t(InterfaceC3189a interfaceC3189a) {
        r3.c b8;
        if (interfaceC3189a instanceof InterfaceC3189a.C0772a) {
            b8 = c.a.d(r3.c.f38586a, this, new a(s()), null, null, 12, null);
        } else if (interfaceC3189a instanceof InterfaceC3189a.b) {
            b8 = c.a.b(r3.c.f38586a, this, new b(s()), null, null, 12, null);
        } else {
            throw new p();
        }
        this.f26174b = b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(a.C0543a c0543a) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.c(c0543a.a()).b()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(a.b bVar) {
        r3.c cVar = this.f26174b;
        if (cVar == null) {
            AbstractC3255y.y("financialConnectionsPaymentsProxy");
            cVar = null;
        }
        cVar.a(bVar.a(), bVar.b(), bVar.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC3189a interfaceC3189a;
        super.onCreate(bundle);
        CollectBankAccountContract.a r8 = r();
        if (r8 != null) {
            interfaceC3189a = r8.b();
        } else {
            interfaceC3189a = null;
        }
        if (interfaceC3189a == null) {
            u(new a.C0543a(new d.c(new IllegalStateException("Configuration not provided"))));
            return;
        }
        CollectBankAccountContract.a r9 = r();
        if (r9 != null) {
            t(r9.b());
            LifecycleOwnerKt.getLifecycleScope(this).launchWhenStarted(new c(null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
