package androidx.lifecycle;

import L5.I;
import L5.t;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowLiveDataConversions$asLiveData$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ InterfaceC3358f $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(InterfaceC3358f interfaceC3358f, P5.d dVar) {
        super(2, dVar);
        this.$this_asLiveData = interfaceC3358f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, dVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // X5.n
    public final Object invoke(LiveDataScope<T> liveDataScope, P5.d dVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            InterfaceC3358f interfaceC3358f = this.$this_asLiveData;
            InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // l6.InterfaceC3359g
                public final Object emit(T t8, P5.d dVar) {
                    Object emit = liveDataScope.emit(t8, dVar);
                    if (emit == Q5.b.e()) {
                        return emit;
                    }
                    return I.f6487a;
                }
            };
            this.label = 1;
            if (interfaceC3358f.collect(interfaceC3359g, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }
}
