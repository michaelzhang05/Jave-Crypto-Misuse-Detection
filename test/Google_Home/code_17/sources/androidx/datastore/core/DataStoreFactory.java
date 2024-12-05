package androidx.datastore.core;

import P5.AbstractC1378t;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3347b0;
import l6.M;
import l6.N;
import l6.U0;

/* loaded from: classes3.dex */
public final class DataStoreFactory {
    public static final DataStoreFactory INSTANCE = new DataStoreFactory();

    private DataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, M m8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 4) != 0) {
            list = AbstractC1378t.m();
        }
        if ((i8 & 8) != 0) {
            m8 = N.a(Actual_jvmKt.ioDispatcher().plus(U0.b(null, 1, null)));
        }
        return dataStoreFactory.create(storage, replaceFileCorruptionHandler, list, m8);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, Function0 produceFile) {
        AbstractC3255y.i(serializer, "serializer");
        AbstractC3255y.i(migrations, "migrations");
        AbstractC3255y.i(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function0 produceFile) {
        AbstractC3255y.i(serializer, "serializer");
        AbstractC3255y.i(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, Function0 produceFile) {
        AbstractC3255y.i(serializer, "serializer");
        AbstractC3255y.i(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public static /* synthetic */ DataStore create$default(DataStoreFactory dataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, M m8, Function0 function0, int i8, Object obj) {
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = (i8 & 2) != 0 ? null : replaceFileCorruptionHandler;
        if ((i8 & 4) != 0) {
            list = AbstractC1378t.m();
        }
        List list2 = list;
        if ((i8 & 8) != 0) {
            m8 = N.a(C3347b0.b().plus(U0.b(null, 1, null)));
        }
        return dataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, m8, function0);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        AbstractC3255y.i(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        AbstractC3255y.i(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations) {
        AbstractC3255y.i(storage, "storage");
        AbstractC3255y.i(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, M scope, Function0 produceFile) {
        AbstractC3255y.i(serializer, "serializer");
        AbstractC3255y.i(migrations, "migrations");
        AbstractC3255y.i(scope, "scope");
        AbstractC3255y.i(produceFile, "produceFile");
        return create(new FileStorage(serializer, null, produceFile, 2, null), replaceFileCorruptionHandler, migrations, scope);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, M scope) {
        AbstractC3255y.i(storage, "storage");
        AbstractC3255y.i(migrations, "migrations");
        AbstractC3255y.i(scope, "scope");
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, AbstractC1378t.e(DataMigrationInitializer.Companion.getInitializer(migrations)), replaceFileCorruptionHandler, scope);
    }
}
