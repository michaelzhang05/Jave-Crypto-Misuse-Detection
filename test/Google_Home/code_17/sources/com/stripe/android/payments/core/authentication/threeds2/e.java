package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import h6.InterfaceC2963c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import q3.AbstractC3843j;
import v0.AbstractC4085a;

/* loaded from: classes4.dex */
public final class e implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f26309a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stripe3ds2TransactionContract.a f26310a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Stripe3ds2TransactionContract.a aVar) {
            super(0);
            this.f26310a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f26310a.l();
        }
    }

    public e(Function0 argsSupplier) {
        AbstractC3255y.i(argsSupplier, "argsSupplier");
        this.f26309a = argsSupplier;
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
        Stripe3ds2TransactionContract.a aVar = (Stripe3ds2TransactionContract.a) this.f26309a.invoke();
        Application a8 = D2.b.a(extras);
        d a9 = AbstractC3843j.a().a(a8).d(aVar.b()).c(new a(aVar)).b(aVar.i()).e(AbstractC4085a.c(a8)).build().a().c(aVar).a(SavedStateHandleSupport.createSavedStateHandle(extras)).b(a8).build().a();
        AbstractC3255y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.create");
        return a9;
    }
}
