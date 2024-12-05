package androidx.lifecycle.viewmodel;

import W5.a;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import e6.InterfaceC2643c;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ViewModelProviderImpl_androidKt {
    public static final <VM extends ViewModel> VM createViewModel(ViewModelProvider.Factory factory, InterfaceC2643c modelClass, CreationExtras extras) {
        AbstractC3159y.i(factory, "factory");
        AbstractC3159y.i(modelClass, "modelClass");
        AbstractC3159y.i(extras, "extras");
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
