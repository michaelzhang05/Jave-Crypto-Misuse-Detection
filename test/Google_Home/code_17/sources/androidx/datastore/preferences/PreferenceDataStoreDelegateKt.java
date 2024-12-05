package androidx.datastore.preferences;

import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import d6.InterfaceC2759d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.M;
import l6.N;
import l6.U0;

/* loaded from: classes3.dex */
public final class PreferenceDataStoreDelegateKt {
    public static final InterfaceC2759d preferencesDataStore(String name, ReplaceFileCorruptionHandler<Preferences> replaceFileCorruptionHandler, Function1 produceMigrations, M scope) {
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(produceMigrations, "produceMigrations");
        AbstractC3255y.i(scope, "scope");
        return new PreferenceDataStoreSingletonDelegate(name, replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC2759d preferencesDataStore$default(String str, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, M m8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 4) != 0) {
            function1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            m8 = N.a(C3347b0.b().plus(U0.b(null, 1, null)));
        }
        return preferencesDataStore(str, replaceFileCorruptionHandler, function1, m8);
    }
}
