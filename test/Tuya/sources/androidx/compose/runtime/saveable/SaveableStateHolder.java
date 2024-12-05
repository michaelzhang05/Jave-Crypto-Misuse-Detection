package androidx.compose.runtime.saveable;

import X5.n;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;

/* loaded from: classes.dex */
public interface SaveableStateHolder {
    @Composable
    void SaveableStateProvider(Object obj, n nVar, Composer composer, int i8);

    void removeState(Object obj);
}
