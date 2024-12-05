package androidx.compose.runtime.saveable;

import a6.InterfaceC1668n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;

/* loaded from: classes.dex */
public interface SaveableStateHolder {
    @Composable
    void SaveableStateProvider(Object obj, InterfaceC1668n interfaceC1668n, Composer composer, int i8);

    void removeState(Object obj);
}
