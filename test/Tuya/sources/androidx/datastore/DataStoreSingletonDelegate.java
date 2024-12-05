package androidx.datastore;

import P6.AbstractC1285k;
import a6.InterfaceC1579d;
import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.DataStoreFactory;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.core.okio.OkioSerializer;
import androidx.datastore.core.okio.OkioStorage;
import e6.i;
import i6.M;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class DataStoreSingletonDelegate<T> implements InterfaceC1579d {

    @GuardedBy("lock")
    private volatile DataStore<T> INSTANCE;
    private final ReplaceFileCorruptionHandler<T> corruptionHandler;
    private final String fileName;
    private final Object lock;
    private final Function1 produceMigrations;
    private final M scope;
    private final OkioSerializer<T> serializer;

    public DataStoreSingletonDelegate(String fileName, OkioSerializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function1 produceMigrations, M scope) {
        AbstractC3159y.i(fileName, "fileName");
        AbstractC3159y.i(serializer, "serializer");
        AbstractC3159y.i(produceMigrations, "produceMigrations");
        AbstractC3159y.i(scope, "scope");
        this.fileName = fileName;
        this.serializer = serializer;
        this.corruptionHandler = replaceFileCorruptionHandler;
        this.produceMigrations = produceMigrations;
        this.scope = scope;
        this.lock = new Object();
    }

    @Override // a6.InterfaceC1579d
    public DataStore<T> getValue(Context thisRef, i property) {
        DataStore<T> dataStore;
        AbstractC3159y.i(thisRef, "thisRef");
        AbstractC3159y.i(property, "property");
        DataStore<T> dataStore2 = this.INSTANCE;
        if (dataStore2 != null) {
            return dataStore2;
        }
        synchronized (this.lock) {
            try {
                if (this.INSTANCE == null) {
                    Context applicationContext = thisRef.getApplicationContext();
                    DataStoreFactory dataStoreFactory = DataStoreFactory.INSTANCE;
                    OkioStorage okioStorage = new OkioStorage(AbstractC1285k.f8090b, this.serializer, null, new DataStoreSingletonDelegate$getValue$1$1(applicationContext, this), 4, null);
                    ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler = this.corruptionHandler;
                    Function1 function1 = this.produceMigrations;
                    AbstractC3159y.h(applicationContext, "applicationContext");
                    this.INSTANCE = dataStoreFactory.create(okioStorage, replaceFileCorruptionHandler, (List) function1.invoke(applicationContext), this.scope);
                }
                dataStore = this.INSTANCE;
                AbstractC3159y.f(dataStore);
            } catch (Throwable th) {
                throw th;
            }
        }
        return dataStore;
    }
}
