package androidx.lifecycle;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.O;

/* loaded from: classes3.dex */
final class Transformations$distinctUntilChanged$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ O $firstTime;
    final /* synthetic */ MediatorLiveData<X> $outputLiveData;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$distinctUntilChanged$1(MediatorLiveData<X> mediatorLiveData, O o8) {
        super(1);
        this.$outputLiveData = mediatorLiveData;
        this.$firstTime = o8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m5462invoke((Transformations$distinctUntilChanged$1) obj);
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5462invoke(X x8) {
        Object value = this.$outputLiveData.getValue();
        if (this.$firstTime.f34158a || ((value == null && x8 != 0) || !(value == null || AbstractC3255y.d(value, x8)))) {
            this.$firstTime.f34158a = false;
            this.$outputLiveData.setValue(x8);
        }
    }
}
