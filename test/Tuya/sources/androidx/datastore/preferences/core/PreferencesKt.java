package androidx.datastore.preferences.core;

import P5.d;
import X5.n;
import androidx.datastore.core.DataStore;

/* loaded from: classes3.dex */
public final class PreferencesKt {
    public static final Object edit(DataStore<Preferences> dataStore, n nVar, d dVar) {
        return dataStore.updateData(new PreferencesKt$edit$2(nVar, null), dVar);
    }
}
