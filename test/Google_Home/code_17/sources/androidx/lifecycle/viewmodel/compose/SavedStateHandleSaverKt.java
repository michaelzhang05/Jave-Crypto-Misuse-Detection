package androidx.lifecycle.viewmodel.compose;

import O5.x;
import android.os.Bundle;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.core.os.BundleKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.savedstate.SavedStateRegistry;
import d6.InterfaceC2758c;
import d6.InterfaceC2759d;
import d6.InterfaceC2760e;
import h6.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.U;

/* loaded from: classes3.dex */
public final class SavedStateHandleSaverKt {
    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(Saver<T, ? extends Object> saver) {
        AbstractC3255y.g(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new SavedStateHandleSaverKt$mutableStateSaver$1$1(saver), new SavedStateHandleSaverKt$mutableStateSaver$1$2(saver));
    }

    @SavedStateHandleSaveableApi
    /* renamed from: saveable, reason: collision with other method in class */
    public static final <T> T m5468saveable(SavedStateHandle savedStateHandle, String key, final Saver<T, ? extends Object> saver, Function0 init) {
        T t8;
        Object obj;
        AbstractC3255y.i(savedStateHandle, "<this>");
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(saver, "saver");
        AbstractC3255y.i(init, "init");
        Bundle bundle = (Bundle) savedStateHandle.get(key);
        if (bundle == null || (obj = bundle.get("value")) == null || (t8 = saver.restore(obj)) == null) {
            t8 = (T) init.invoke();
        }
        final T t9 = t8;
        savedStateHandle.setSavedStateProvider(key, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.lifecycle.viewmodel.compose.b
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                Bundle saveable$lambda$1;
                saveable$lambda$1 = SavedStateHandleSaverKt.saveable$lambda$1(Saver.this, t9);
                return saveable$lambda$1;
            }
        });
        return t8;
    }

    public static /* synthetic */ Object saveable$default(SavedStateHandle savedStateHandle, String str, Saver saver, Function0 function0, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        return m5468saveable(savedStateHandle, str, saver, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle saveable$lambda$1(Saver saver, Object value) {
        AbstractC3255y.i(saver, "$saver");
        AbstractC3255y.i(value, "$value");
        return BundleKt.bundleOf(x.a("value", saver.save(new SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion), value)));
    }

    private static final InterfaceC2759d saveable$lambda$3(SavedStateHandle this_saveable, Saver saver, Function0 init, Object obj, i property) {
        String str;
        AbstractC3255y.i(this_saveable, "$this_saveable");
        AbstractC3255y.i(saver, "$saver");
        AbstractC3255y.i(init, "$init");
        AbstractC3255y.i(property, "property");
        if (obj != null) {
            str = U.b(obj.getClass()).a() + '.';
        } else {
            str = "";
        }
        final Object m5468saveable = m5468saveable(this_saveable, str + property.getName(), (Saver<Object, ? extends Object>) saver, init);
        return new InterfaceC2759d() { // from class: androidx.lifecycle.viewmodel.compose.c
            @Override // d6.InterfaceC2759d
            public final Object getValue(Object obj2, i iVar) {
                Object saveable$lambda$3$lambda$2;
                saveable$lambda$3$lambda$2 = SavedStateHandleSaverKt.saveable$lambda$3$lambda$2(m5468saveable, obj2, iVar);
                return saveable$lambda$3$lambda$2;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object saveable$lambda$3$lambda$2(Object value, Object obj, i iVar) {
        AbstractC3255y.i(value, "$value");
        AbstractC3255y.i(iVar, "<anonymous parameter 1>");
        return value;
    }

    private static final InterfaceC2760e saveable$lambda$4(SavedStateHandle this_saveable, Saver stateSaver, Function0 init, Object obj, i property) {
        String str;
        AbstractC3255y.i(this_saveable, "$this_saveable");
        AbstractC3255y.i(stateSaver, "$stateSaver");
        AbstractC3255y.i(init, "$init");
        AbstractC3255y.i(property, "property");
        if (obj != null) {
            str = U.b(obj.getClass()).a() + '.';
        } else {
            str = "";
        }
        final MutableState saveable = saveable(this_saveable, str + property.getName(), stateSaver, init);
        return new InterfaceC2760e() { // from class: androidx.lifecycle.viewmodel.compose.SavedStateHandleSaverKt$saveable$3$1
            /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.Object] */
            @Override // d6.InterfaceC2760e, d6.InterfaceC2759d
            public T getValue(Object obj2, i property2) {
                AbstractC3255y.i(property2, "property");
                return saveable.getValue();
            }

            @Override // d6.InterfaceC2760e
            public void setValue(Object obj2, i property2, T t8) {
                AbstractC3255y.i(property2, "property");
                saveable.setValue(t8);
            }
        };
    }

    @SavedStateHandleSaveableApi
    public static final <T, M extends MutableState<T>> InterfaceC2758c saveableMutableState(SavedStateHandle savedStateHandle, Saver<T, ? extends Object> stateSaver, Function0 init) {
        AbstractC3255y.i(savedStateHandle, "<this>");
        AbstractC3255y.i(stateSaver, "stateSaver");
        AbstractC3255y.i(init, "init");
        return new a(savedStateHandle, stateSaver, init);
    }

    public static /* synthetic */ InterfaceC2758c saveableMutableState$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveableMutableState(savedStateHandle, saver, function0);
    }

    @SavedStateHandleSaveableApi
    public static final <T> MutableState<T> saveable(SavedStateHandle savedStateHandle, String key, Saver<T, ? extends Object> stateSaver, Function0 init) {
        AbstractC3255y.i(savedStateHandle, "<this>");
        AbstractC3255y.i(key, "key");
        AbstractC3255y.i(stateSaver, "stateSaver");
        AbstractC3255y.i(init, "init");
        return (MutableState) m5468saveable(savedStateHandle, key, mutableStateSaver(stateSaver), init);
    }

    public static /* synthetic */ InterfaceC2758c saveable$default(SavedStateHandle savedStateHandle, Saver saver, Function0 function0, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            saver = SaverKt.autoSaver();
        }
        return saveable(savedStateHandle, saver, function0);
    }

    @SavedStateHandleSaveableApi
    public static final <T> InterfaceC2758c saveable(SavedStateHandle savedStateHandle, Saver<T, ? extends Object> saver, Function0 init) {
        AbstractC3255y.i(savedStateHandle, "<this>");
        AbstractC3255y.i(saver, "saver");
        AbstractC3255y.i(init, "init");
        return new a(savedStateHandle, saver, init);
    }
}
