package androidx.datastore;

import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import d6.InterfaceC2759d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.M;
import l6.N;
import l6.U0;

/* loaded from: classes3.dex */
public final class DataStoreDelegateKt {
    public static final <T> InterfaceC2759d dataStore(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function1 produceMigrations, M scope) {
        AbstractC3255y.i(fileName, "fileName");
        AbstractC3255y.i(serializer, "serializer");
        AbstractC3255y.i(produceMigrations, "produceMigrations");
        AbstractC3255y.i(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC2759d dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, M m8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 8) != 0) {
            function1 = DataStoreDelegateKt$dataStore$1.INSTANCE;
        }
        if ((i8 & 16) != 0) {
            m8 = N.a(C3347b0.b().plus(U0.b(null, 1, null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, function1, m8);
    }
}
