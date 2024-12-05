package androidx.datastore.core;

import L5.I;
import L5.InterfaceC1227k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class DataStoreImpl$writeActor$1 extends AbstractC3160z implements Function1 {
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$writeActor$1(DataStoreImpl<T> dataStoreImpl) {
        super(1);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return I.f6487a;
    }

    public final void invoke(Throwable th) {
        InterfaceC1227k interfaceC1227k;
        if (th != null) {
            ((DataStoreImpl) this.this$0).inMemoryCache.tryUpdate(new Final(th));
        }
        interfaceC1227k = ((DataStoreImpl) this.this$0).storageConnectionDelegate;
        if (interfaceC1227k.isInitialized()) {
            this.this$0.getStorageConnection$datastore_core_release().close();
        }
    }
}
