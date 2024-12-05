package androidx.datastore.preferences.core;

import P5.d;
import X5.n;
import androidx.datastore.core.DataStore;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3358f;

/* loaded from: classes3.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {
    private final DataStore<Preferences> delegate;

    public PreferenceDataStore(DataStore<Preferences> delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC3358f getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(n nVar, d dVar) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(nVar, null), dVar);
    }
}
