package androidx.datastore.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import androidx.datastore.core.DataStoreImpl;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$updateCollection$1", f = "DataStoreImpl.kt", l = {80, 81}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$updateCollection$1 extends l implements n {
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
                    return I.f6487a;
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
        InterfaceC3358f l8 = AbstractC3360h.l(this.this$0.getCoordinator().getUpdateNotifications());
        final DataStoreImpl<T> dataStoreImpl = this.this$0;
        InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.datastore.core.DataStoreImpl$updateCollection$1.1
            @Override // l6.InterfaceC3359g
            public final Object emit(I i9, d dVar) {
                Object readDataAndUpdateCache;
                if (!(((DataStoreImpl) dataStoreImpl).inMemoryCache.getCurrentState() instanceof Final)) {
                    readDataAndUpdateCache = dataStoreImpl.readDataAndUpdateCache(true, dVar);
                    return readDataAndUpdateCache == b.e() ? readDataAndUpdateCache : I.f6487a;
                }
                return I.f6487a;
            }
        };
        this.label = 2;
        if (l8.collect(interfaceC3359g, this) == e8) {
            return e8;
        }
        return I.f6487a;
    }

    @Override // X5.n
    public final Object invoke(InterfaceC3359g interfaceC3359g, d dVar) {
        return ((DataStoreImpl$updateCollection$1) create(interfaceC3359g, dVar)).invokeSuspend(I.f6487a);
    }
}
