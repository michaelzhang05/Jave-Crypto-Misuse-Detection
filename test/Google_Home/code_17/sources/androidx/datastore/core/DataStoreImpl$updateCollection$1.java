package androidx.datastore.core;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$updateCollection$1", f = "DataStoreImpl.kt", l = {80, 81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$updateCollection$1 extends l implements InterfaceC1668n {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$updateCollection$1(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new DataStoreImpl$updateCollection$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DataStoreImpl.InitDataStore initDataStore;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    t.b(obj);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            initDataStore = ((DataStoreImpl) this.this$0).readAndInit;
            this.label = 1;
            if (initDataStore.awaitComplete(this) == e8) {
                return e8;
            }
        }
        InterfaceC3706f n8 = AbstractC3708h.n(this.this$0.getCoordinator().getUpdateNotifications());
        final DataStoreImpl<T> dataStoreImpl = this.this$0;
        InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.datastore.core.DataStoreImpl$updateCollection$1.1
            @Override // o6.InterfaceC3707g
            public final Object emit(I i9, d dVar) {
                Object readDataAndUpdateCache;
                if (!(((DataStoreImpl) dataStoreImpl).inMemoryCache.getCurrentState() instanceof Final)) {
                    readDataAndUpdateCache = dataStoreImpl.readDataAndUpdateCache(true, dVar);
                    return readDataAndUpdateCache == b.e() ? readDataAndUpdateCache : I.f8278a;
                }
                return I.f8278a;
            }
        };
        this.label = 2;
        if (n8.collect(interfaceC3707g, this) == e8) {
            return e8;
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(InterfaceC3707g interfaceC3707g, d dVar) {
        return ((DataStoreImpl$updateCollection$1) create(interfaceC3707g, dVar)).invokeSuspend(I.f8278a);
    }
}
