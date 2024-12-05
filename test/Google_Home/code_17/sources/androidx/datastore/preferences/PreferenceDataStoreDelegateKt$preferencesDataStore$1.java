package androidx.datastore.preferences;

import P5.AbstractC1378t;
import android.content.Context;
import androidx.datastore.core.DataMigration;
import androidx.datastore.preferences.core.Preferences;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class PreferenceDataStoreDelegateKt$preferencesDataStore$1 extends AbstractC3256z implements Function1 {
    public static final PreferenceDataStoreDelegateKt$preferencesDataStore$1 INSTANCE = new PreferenceDataStoreDelegateKt$preferencesDataStore$1();

    PreferenceDataStoreDelegateKt$preferencesDataStore$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<DataMigration<Preferences>> invoke(Context it) {
        AbstractC3255y.i(it, "it");
        return AbstractC1378t.m();
    }
}
