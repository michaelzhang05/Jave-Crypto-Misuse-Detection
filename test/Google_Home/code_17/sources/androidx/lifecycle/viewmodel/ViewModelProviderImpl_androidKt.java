package androidx.lifecycle.viewmodel;

import Z5.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import h6.InterfaceC2963c;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, InterfaceC2963c modelClass, CreationExtras extras) {
        AbstractC3255y.i(factory, "factory");
        AbstractC3255y.i(modelClass, "modelClass");
        AbstractC3255y.i(extras, "extras");
        try {
            try {
                return (VM) factory.create(modelClass, extras);
            } catch (AbstractMethodError unused) {
                return (VM) factory.create(a.a(modelClass));
            }
        } catch (AbstractMethodError unused2) {
            return (VM) factory.create(a.a(modelClass), extras);
        }
    }
}
