package androidx.lifecycle.viewmodel.internal;

import W5.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class DefaultViewModelProviderFactory implements ViewModelProvider.Factory {
    public static final DefaultViewModelProviderFactory INSTANCE = new DefaultViewModelProviderFactory();

    private DefaultViewModelProviderFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls) {
        return n.b(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return n.c(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(InterfaceC2643c modelClass, CreationExtras extras) {
        AbstractC3159y.i(modelClass, "modelClass");
        AbstractC3159y.i(extras, "extras");
        return (T) JvmViewModelProviders.INSTANCE.createViewModel(a.a(modelClass));
    }
}
