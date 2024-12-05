package androidx.lifecycle;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.lifecycle.Lifecycle;
import l6.M;
import n6.s;
import n6.v;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowExtKt$flowWithLifecycle$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ InterfaceC3706f $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
        final /* synthetic */ s $$this$callbackFlow;
        final /* synthetic */ InterfaceC3706f $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3706f interfaceC3706f, s sVar, S5.d dVar) {
            super(2, dVar);
            this.$this_flowWithLifecycle = interfaceC3706f;
            this.$$this$callbackFlow = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, dVar);
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
                InterfaceC3706f interfaceC3706f = this.$this_flowWithLifecycle;
                final s sVar = this.$$this$callbackFlow;
                InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // o6.InterfaceC3707g
                    public final Object emit(T t8, S5.d dVar) {
                        Object d8 = s.this.d(t8, dVar);
                        if (d8 == T5.b.e()) {
                            return d8;
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

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC3706f interfaceC3706f, S5.d dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = interfaceC3706f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                sVar = (s) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            s sVar2 = (s) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, sVar2, null);
            this.L$0 = sVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == e8) {
                return e8;
            }
            sVar = sVar2;
        }
        v.a.a(sVar, null, 1, null);
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(s sVar, S5.d dVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(sVar, dVar)).invokeSuspend(I.f8278a);
    }
}
