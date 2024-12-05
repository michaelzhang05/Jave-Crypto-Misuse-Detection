package androidx.datastore;

import a6.InterfaceC1579d;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import i6.C2812b0;
import i6.M;
import i6.N;
import i6.U0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class DataStoreDelegateKt {
    public static final <T> InterfaceC1579d dataStore(String fileName, Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function1 produceMigrations, M scope) {
        AbstractC3159y.i(fileName, "fileName");
        AbstractC3159y.i(serializer, "serializer");
        AbstractC3159y.i(produceMigrations, "produceMigrations");
        AbstractC3159y.i(scope, "scope");
        return new DataStoreSingletonDelegate(fileName, new OkioSerializerWrapper(serializer), replaceFileCorruptionHandler, produceMigrations, scope);
    }

    public static /* synthetic */ InterfaceC1579d dataStore$default(String str, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, Function1 function1, M m8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 8) != 0) {
            function1 = DataStoreDelegateKt$dataStore$1.INSTANCE;
        }
        if ((i8 & 16) != 0) {
            m8 = N.a(C2812b0.b().plus(U0.b(null, 1, null)));
        }
        return dataStore(str, serializer, replaceFileCorruptionHandler, function1, m8);
    }
}
