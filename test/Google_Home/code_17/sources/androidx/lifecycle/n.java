package androidx.lifecycle;

import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.ViewModelInitializer;
import androidx.lifecycle.viewmodel.internal.ViewModelProviders;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class n {
    static {
        ViewModelProvider.Factory.Companion companion = ViewModelProvider.Factory.Companion;
    }

    public static ViewModel a(ViewModelProvider.Factory factory, InterfaceC2963c modelClass, CreationExtras extras) {
        AbstractC3255y.i(modelClass, "modelClass");
        AbstractC3255y.i(extras, "extras");
        return factory.create(Z5.a.a(modelClass), extras);
    }

    public static ViewModel b(ViewModelProvider.Factory factory, Class modelClass) {
        AbstractC3255y.i(modelClass, "modelClass");
        return ViewModelProviders.INSTANCE.unsupportedCreateViewModel$lifecycle_viewmodel_release();
    }

    public static ViewModel c(ViewModelProvider.Factory factory, Class modelClass, CreationExtras extras) {
        AbstractC3255y.i(modelClass, "modelClass");
        AbstractC3255y.i(extras, "extras");
        return factory.create(modelClass);
    }

    public static ViewModelProvider.Factory d(ViewModelInitializer... viewModelInitializerArr) {
        return ViewModelProvider.Factory.Companion.from(viewModelInitializerArr);
    }
}
