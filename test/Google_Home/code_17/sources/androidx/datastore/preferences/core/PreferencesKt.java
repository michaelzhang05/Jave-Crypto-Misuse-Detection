package androidx.datastore.preferences.core;

import S5.d;
import a6.InterfaceC1668n;
import androidx.datastore.core.DataStore;

/* loaded from: classes3.dex */
public final class PreferencesKt {
    public static final Object edit(DataStore<Preferences> dataStore, InterfaceC1668n interfaceC1668n, d dVar) {
        return dataStore.updateData(new PreferencesKt$edit$2(interfaceC1668n, null), dVar);
    }
}
