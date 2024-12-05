package androidx.compose.ui.platform;

import O5.C1352h;
import a6.InterfaceC1668n;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1", f = "WindowRecomposer.android.kt", l = {389}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    final /* synthetic */ InterfaceC3698L $durationScaleStateFlow;
    final /* synthetic */ MotionDurationScaleImpl $it;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(InterfaceC3698L interfaceC3698L, MotionDurationScaleImpl motionDurationScaleImpl, S5.d dVar) {
        super(2, dVar);
        this.$durationScaleStateFlow = interfaceC3698L;
        this.$it = motionDurationScaleImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        return new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1(this.$durationScaleStateFlow, this.$it, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O5.t.b(obj);
        } else {
            O5.t.b(obj);
            InterfaceC3698L interfaceC3698L = this.$durationScaleStateFlow;
            final MotionDurationScaleImpl motionDurationScaleImpl = this.$it;
            InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1.1
                @Override // o6.InterfaceC3707g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, S5.d dVar) {
                    return emit(((Number) obj2).floatValue(), dVar);
                }

                public final Object emit(float f8, S5.d dVar) {
                    MotionDurationScaleImpl.this.setScaleFactor(f8);
                    return O5.I.f8278a;
                }
            };
            this.label = 1;
            if (interfaceC3698L.collect(interfaceC3707g, this) == e8) {
                return e8;
            }
        }
        throw new C1352h();
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(l6.M m8, S5.d dVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
    }
}
