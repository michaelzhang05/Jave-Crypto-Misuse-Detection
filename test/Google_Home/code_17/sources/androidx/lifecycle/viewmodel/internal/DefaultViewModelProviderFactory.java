package androidx.lifecycle.viewmodel.internal;

import Z5.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

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
    public <T extends ViewModel> T create(InterfaceC2963c modelClass, CreationExtras extras) {
        AbstractC3255y.i(modelClass, "modelClass");
        AbstractC3255y.i(extras, "extras");
        return (T) JvmViewModelProviders.INSTANCE.createViewModel(a.a(modelClass));
    }
}
