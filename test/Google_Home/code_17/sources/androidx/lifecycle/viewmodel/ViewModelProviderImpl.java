package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class ViewModelProviderImpl {
    private final CreationExtras extras;
    private final ViewModelProvider.Factory factory;
    private final ViewModelStore store;

    public ViewModelProviderImpl(ViewModelStore store, ViewModelProvider.Factory factory, CreationExtras extras) {
        AbstractC3255y.i(store, "store");
        AbstractC3255y.i(factory, "factory");
        AbstractC3255y.i(extras, "extras");
        this.store = store;
        this.factory = factory;
        this.extras = extras;
    }

    public static /* synthetic */ ViewModel getViewModel$lifecycle_viewmodel_release$default(ViewModelProviderImpl viewModelProviderImpl, InterfaceC2963c interfaceC2963c, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = ViewModelProviders.INSTANCE.getDefaultKey$lifecycle_viewmodel_release(interfaceC2963c);
        }
        return viewModelProviderImpl.getViewModel$lifecycle_viewmodel_release(interfaceC2963c, str);
    }

    public final <T extends ViewModel> T getViewModel$lifecycle_viewmodel_release(InterfaceC2963c modelClass, String key) {
        AbstractC3255y.i(modelClass, "modelClass");
        AbstractC3255y.i(key, "key");
        T t8 = (T) this.store.get(key);
        if (modelClass.c(t8)) {
            Object obj = this.factory;
            if (obj instanceof ViewModelProvider.OnRequeryFactory) {
                AbstractC3255y.f(t8);
                ((ViewModelProvider.OnRequeryFactory) obj).onRequery(t8);
            }
            AbstractC3255y.g(t8, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
            return t8;
        }
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.extras);
        mutableCreationExtras.set(ViewModelProviders.ViewModelKey.INSTANCE, key);
        T t9 = (T) ViewModelProviderImpl_androidKt.createViewModel(this.factory, modelClass, mutableCreationExtras);
        this.store.put(key, t9);
        return t9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProviderImpl(ViewModelStoreOwner owner, ViewModelProvider.Factory factory, CreationExtras extras) {
        this(owner.getViewModelStore(), factory, extras);
        AbstractC3255y.i(owner, "owner");
        AbstractC3255y.i(factory, "factory");
        AbstractC3255y.i(extras, "extras");
    }
}
