package androidx.lifecycle;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class Transformations$map$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ Function1 $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$map$1(MediatorLiveData<Y> mediatorLiveData, Function1 function1) {
        super(1);
        this.$result = mediatorLiveData;
        this.$transform = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m5463invoke((Transformations$map$1) obj);
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5463invoke(X x8) {
        this.$result.setValue(this.$transform.invoke(x8));
    }
}
