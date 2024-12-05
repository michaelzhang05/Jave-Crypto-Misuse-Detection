package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class JvmViewModelProviders {
    public static final JvmViewModelProviders INSTANCE = new JvmViewModelProviders();

    private JvmViewModelProviders() {
    }

    public final <T extends ViewModel> T createViewModel(Class<T> modelClass) {
        AbstractC3255y.i(modelClass, "modelClass");
        try {
            T newInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            AbstractC3255y.h(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return newInstance;
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        }
    }
}
