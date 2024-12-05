package androidx.datastore.core;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.M;

@f(c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", f = "DataStoreImpl.kt", l = {339}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataStoreImpl$transformAndWrite$2$newData$1 extends l implements InterfaceC1668n {
    final /* synthetic */ Data<T> $curData;
    final /* synthetic */ InterfaceC1668n $transform;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$transformAndWrite$2$newData$1(InterfaceC1668n interfaceC1668n, Data<T> data, d dVar) {
        super(2, dVar);
        this.$transform = interfaceC1668n;
        this.$curData = data;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new DataStoreImpl$transformAndWrite$2$newData$1(this.$transform, this.$curData, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            InterfaceC1668n interfaceC1668n = this.$transform;
            Object value = this.$curData.getValue();
            this.label = 1;
            obj = interfaceC1668n.invoke(value, this);
            if (obj == e8) {
                return e8;
            }
        }
        return obj;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((DataStoreImpl$transformAndWrite$2$newData$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
