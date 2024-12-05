package androidx.lifecycle;

import L5.I;
import L5.t;
import androidx.lifecycle.Lifecycle;
import i6.M;
import k6.s;
import k6.v;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowExtKt$flowWithLifecycle$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ InterfaceC3358f $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
        final /* synthetic */ s $$this$callbackFlow;
        final /* synthetic */ InterfaceC3358f $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3358f interfaceC3358f, s sVar, P5.d dVar) {
            super(2, dVar);
            this.$this_flowWithLifecycle = interfaceC3358f;
            this.$$this$callbackFlow = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                InterfaceC3358f interfaceC3358f = this.$this_flowWithLifecycle;
                final s sVar = this.$$this$callbackFlow;
                InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // l6.InterfaceC3359g
                    public final Object emit(T t8, P5.d dVar) {
                        Object i9 = s.this.i(t8, dVar);
                        if (i9 == Q5.b.e()) {
                            return i9;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC3358f interfaceC3358f, P5.d dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = interfaceC3358f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        Object e8 = Q5.b.e();
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
        return I.f6487a;
    }

    @Override // X5.n
    public final Object invoke(s sVar, P5.d dVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(sVar, dVar)).invokeSuspend(I.f6487a);
    }
}
