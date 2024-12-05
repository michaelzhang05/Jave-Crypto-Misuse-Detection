package androidx.compose.ui.platform;

import L5.C1224h;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ InterfaceC3349K $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(InterfaceC3349K interfaceC3349K, MotionDurationScaleImpl motionDurationScaleImpl, P5.d dVar) {
        super(2, dVar);
        this.$durationScaleStateFlow = interfaceC3349K;
        this.$it = motionDurationScaleImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.$durationScaleStateFlow, this.$it, dVar);
    }

    @Override // X5.n
    public final Object invoke(i6.M m8, P5.d dVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            L5.t.b(obj);
        } else {
            L5.t.b(obj);
            InterfaceC3349K interfaceC3349K = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                @Override // l6.InterfaceC3359g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, P5.d dVar) {
                    return emit(((Number) obj2).floatValue(), dVar);
                }

                public final Object emit(float f8, P5.d dVar) {
                    MotionDurationScaleImpl.this.setScaleFactor(f8);
                    return L5.I.f6487a;
                }
            };
            this.label = 1;
            if (interfaceC3349K.collect(interfaceC3359g, this) == e8) {
                return e8;
            }
        }
        throw new C1224h();
    }
}
