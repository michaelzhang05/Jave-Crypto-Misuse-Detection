package com.stripe.android.paymentsheet.addresselement;

import A3.AbstractC0956f;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.addresselement.AddressElementActivityContract;
import h6.InterfaceC2963c;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class c extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.paymentsheet.addresselement.a f26632a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f26633b;

    /* renamed from: c, reason: collision with root package name */
    private final L5.a f26634c;

    /* loaded from: classes4.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final Function0 f26635a;

        /* renamed from: b, reason: collision with root package name */
        private final Function0 f26636b;

        public a(Function0 applicationSupplier, Function0 starterArgsSupplier) {
            AbstractC3255y.i(applicationSupplier, "applicationSupplier");
            AbstractC3255y.i(starterArgsSupplier, "starterArgsSupplier");
            this.f26635a = applicationSupplier;
            this.f26636b = starterArgsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3255y.i(modelClass, "modelClass");
            c a8 = AbstractC0956f.a().a((Context) this.f26635a.invoke()).b((AddressElementActivityContract.a) this.f26636b.invoke()).build().a();
            AbstractC3255y.g(a8, "null cannot be cast to non-null type T of com.stripe.android.paymentsheet.addresselement.AddressElementViewModel.Factory.create");
            return a8;
        }
    }

    public c(com.stripe.android.paymentsheet.addresselement.a navigator, L5.a inputAddressViewModelSubcomponentBuilderProvider, L5.a autoCompleteViewModelSubcomponentBuilderProvider) {
        AbstractC3255y.i(navigator, "navigator");
        AbstractC3255y.i(inputAddressViewModelSubcomponentBuilderProvider, "inputAddressViewModelSubcomponentBuilderProvider");
        AbstractC3255y.i(autoCompleteViewModelSubcomponentBuilderProvider, "autoCompleteViewModelSubcomponentBuilderProvider");
        this.f26632a = navigator;
        this.f26633b = inputAddressViewModelSubcomponentBuilderProvider;
        this.f26634c = autoCompleteViewModelSubcomponentBuilderProvider;
    }

    public final L5.a a() {
        return this.f26634c;
    }

    public final L5.a b() {
        return this.f26633b;
    }

    public final com.stripe.android.paymentsheet.addresselement.a c() {
        return this.f26632a;
    }
}
