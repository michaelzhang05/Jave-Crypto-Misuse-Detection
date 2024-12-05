package com.stripe.android.payments.core.authentication.threeds2;

import android.app.Application;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import e6.InterfaceC2643c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import n3.AbstractC3464j;
import w0.AbstractC3839a;

/* loaded from: classes4.dex */
public final class e implements ViewModelProvider.Factory {

    /* renamed from: a, reason: collision with root package name */
    private final Function0 f25254a;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Stripe3ds2TransactionContract.a f25255a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Stripe3ds2TransactionContract.a aVar) {
            super(0);
            this.f25255a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.f25255a.j();
        }
    }

    public e(Function0 argsSupplier) {
        AbstractC3159y.i(argsSupplier, "argsSupplier");
        this.f25254a = argsSupplier;
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
        Stripe3ds2TransactionContract.a aVar = (Stripe3ds2TransactionContract.a) this.f25254a.invoke();
        Application a8 = A2.b.a(extras);
        d a9 = AbstractC3464j.a().a(a8).d(aVar.c()).c(new a(aVar)).b(aVar.i()).e(AbstractC3839a.c(a8)).build().a().c(aVar).a(SavedStateHandleSupport.createSavedStateHandle(extras)).b(a8).build().a();
        AbstractC3159y.g(a9, "null cannot be cast to non-null type T of com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionViewModelFactory.create");
        return a9;
    }
}
