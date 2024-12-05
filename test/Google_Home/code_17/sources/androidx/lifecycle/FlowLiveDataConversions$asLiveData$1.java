package androidx.lifecycle;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowLiveDataConversions$asLiveData$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    final /* synthetic */ InterfaceC3706f $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(InterfaceC3706f interfaceC3706f, S5.d dVar) {
        super(2, dVar);
        this.$this_asLiveData = interfaceC3706f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, dVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(LiveDataScope<T> liveDataScope, S5.d dVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
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
            InterfaceC3706f interfaceC3706f = this.$this_asLiveData;
            InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // o6.InterfaceC3707g
                public final Object emit(T t8, S5.d dVar) {
                    Object emit = liveDataScope.emit(t8, dVar);
                    if (emit == T5.b.e()) {
                        return emit;
                    }
                    return I.f8278a;
                }
            };
            this.label = 1;
            if (interfaceC3706f.collect(interfaceC3707g, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }
}
