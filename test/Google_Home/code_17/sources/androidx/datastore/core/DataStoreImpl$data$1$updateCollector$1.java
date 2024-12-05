package androidx.datastore.core;

import O5.C1352h;
import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.M;
import o6.InterfaceC3687A;
import o6.InterfaceC3707g;

@f(c = "androidx.datastore.core.DataStoreImpl$data$1$updateCollector$1", f = "DataStoreImpl.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataStoreImpl$data$1$updateCollector$1 extends l implements InterfaceC1668n {
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1$updateCollector$1(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new DataStoreImpl$data$1$updateCollector$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3687A interfaceC3687A;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            interfaceC3687A = ((DataStoreImpl) this.this$0).updateCollection;
            InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.datastore.core.DataStoreImpl$data$1$updateCollector$1.1
                @Override // o6.InterfaceC3707g
                public final Object emit(I i9, d dVar) {
                    return I.f8278a;
                }
            };
            this.label = 1;
            if (interfaceC3687A.collect(interfaceC3707g, this) == e8) {
                return e8;
            }
        }
        throw new C1352h();
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((DataStoreImpl$data$1$updateCollector$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
