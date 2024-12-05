package androidx.datastore.preferences.core;

import S5.d;
import a6.InterfaceC1668n;
import androidx.datastore.core.DataStore;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3706f;

/* loaded from: classes3.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    public PreferenceDataStore(DataStore<Preferences> delegate) {
        AbstractC3255y.i(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC3706f getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC1668n interfaceC1668n, d dVar) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(interfaceC1668n, null), dVar);
    }
}
