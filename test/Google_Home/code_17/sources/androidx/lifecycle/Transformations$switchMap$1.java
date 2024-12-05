package androidx.lifecycle;

import O5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.T;

/* loaded from: classes3.dex */
final class Transformations$switchMap$1 extends AbstractC3256z implements Function1 {
    final /* synthetic */ T $liveData;
    final /* synthetic */ MediatorLiveData<Y> $result;
    final /* synthetic */ Function1 $transform;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.Transformations$switchMap$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        final /* synthetic */ MediatorLiveData<Y> $result;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediatorLiveData<Y> mediatorLiveData) {
            super(1);
            this.$result = mediatorLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5466invoke((AnonymousClass1) obj);
            return I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5466invoke(Y y8) {
            this.$result.setValue(y8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$1(Function1 function1, T t8, MediatorLiveData<Y> mediatorLiveData) {
        super(1);
        this.$transform = function1;
        this.$liveData = t8;
        this.$result = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m5465invoke((Transformations$switchMap$1) obj);
        return I.f8278a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m5465invoke(X x8) {
        LiveData liveData = (LiveData) this.$transform.invoke(x8);
        Object obj = this.$liveData.f34162a;
        if (obj != liveData) {
            if (obj != null) {
                MediatorLiveData<Y> mediatorLiveData = this.$result;
                AbstractC3255y.f(obj);
                mediatorLiveData.removeSource((LiveData) obj);
            }
            this.$liveData.f34162a = liveData;
            if (liveData != null) {
                MediatorLiveData<Y> mediatorLiveData2 = this.$result;
                AbstractC3255y.f(liveData);
                mediatorLiveData2.addSource(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(this.$result)));
            }
        }
    }
}
