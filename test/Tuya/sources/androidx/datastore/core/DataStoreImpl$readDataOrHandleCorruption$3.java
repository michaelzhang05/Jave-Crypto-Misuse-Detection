package androidx.datastore.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.T;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {395, 396, 398}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$readDataOrHandleCorruption$3 extends l implements Function1 {
    final /* synthetic */ T $newData;
    final /* synthetic */ Q $version;
    Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataOrHandleCorruption$3(T t8, DataStoreImpl<T> dataStoreImpl, Q q8, d dVar) {
        super(1, dVar);
        this.$newData = t8;
        this.this$0 = dataStoreImpl;
        this.$version = q8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(d dVar) {
        return new DataStoreImpl$readDataOrHandleCorruption$3(this.$newData, this.this$0, this.$version, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(d dVar) {
        return ((DataStoreImpl$readDataOrHandleCorruption$3) create(dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Q q8;
        T t8;
        Q q9;
        Object e8 = b.e();
        int i8 = this.label;
        try {
        } catch (CorruptionException unused) {
            Q q10 = this.$version;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            Object obj2 = this.$newData.f33761a;
            this.L$0 = q10;
            this.label = 3;
            Object writeData$datastore_core_release = dataStoreImpl.writeData$datastore_core_release(obj2, true, this);
            if (writeData$datastore_core_release == e8) {
                return e8;
            }
            q8 = q10;
            obj = writeData$datastore_core_release;
        }
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        q8 = (Q) this.L$0;
                        t.b(obj);
                        q8.f33759a = ((Number) obj).intValue();
                        return I.f6487a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q9 = (Q) this.L$0;
                t.b(obj);
                q9.f33759a = ((Number) obj).intValue();
                return I.f6487a;
            }
            t8 = (T) this.L$0;
            t.b(obj);
        } else {
            t.b(obj);
            t8 = this.$newData;
            DataStoreImpl<T> dataStoreImpl2 = this.this$0;
            this.L$0 = t8;
            this.label = 1;
            obj = dataStoreImpl2.readDataFromFileOrDefault(this);
            if (obj == e8) {
                return e8;
            }
        }
        t8.f33761a = obj;
        q9 = this.$version;
        InterProcessCoordinator coordinator = this.this$0.getCoordinator();
        this.L$0 = q9;
        this.label = 2;
        obj = coordinator.getVersion(this);
        if (obj == e8) {
            return e8;
        }
        q9.f33759a = ((Number) obj).intValue();
        return I.f6487a;
    }
}
