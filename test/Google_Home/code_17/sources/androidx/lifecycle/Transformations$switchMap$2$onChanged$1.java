package androidx.lifecycle;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class Transformations$switchMap$2$onChanged$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ MediatorLiveData $result;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m5467invoke(obj);
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5467invoke(Object obj) {
        this.$result.setValue(obj);
    }
}
