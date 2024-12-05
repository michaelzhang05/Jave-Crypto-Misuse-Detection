package androidx.datastore.core;

import L5.C1224h;
import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.InterfaceC3359g;
import l6.z;

@f(c = "androidx.datastore.core.DataStoreImpl$data$1$updateCollector$1", f = "DataStoreImpl.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DataStoreImpl$data$1$updateCollector$1 extends l implements n {
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

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((DataStoreImpl$data$1$updateCollector$1) create(m8, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        z zVar;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            zVar = ((DataStoreImpl) this.this$0).updateCollection;
            InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.datastore.core.DataStoreImpl$data$1$updateCollector$1.1
                @Override // l6.InterfaceC3359g
                public final Object emit(I i9, d dVar) {
                    return I.f6487a;
                }
            };
            this.label = 1;
            if (zVar.collect(interfaceC3359g, this) == e8) {
                return e8;
            }
        }
        throw new C1224h();
    }
}
