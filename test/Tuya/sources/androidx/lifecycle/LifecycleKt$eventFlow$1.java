package androidx.lifecycle;

import L5.I;
import L5.t;
import androidx.lifecycle.Lifecycle;
import k6.q;
import k6.s;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.LifecycleKt$eventFlow$1", f = "Lifecycle.kt", l = {388}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LifecycleKt$eventFlow$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ Lifecycle $this_eventFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.LifecycleKt$eventFlow$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3160z implements Function0 {
        final /* synthetic */ LifecycleEventObserver $observer;
        final /* synthetic */ Lifecycle $this_eventFlow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
            super(0);
            this.$this_eventFlow = lifecycle;
            this.$observer = lifecycleEventObserver;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5456invoke();
            return I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5456invoke() {
            this.$this_eventFlow.removeObserver(this.$observer);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$eventFlow$1(Lifecycle lifecycle, P5.d dVar) {
        super(2, dVar);
        this.$this_eventFlow = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        LifecycleKt$eventFlow$1 lifecycleKt$eventFlow$1 = new LifecycleKt$eventFlow$1(this.$this_eventFlow, dVar);
        lifecycleKt$eventFlow$1.L$0 = obj;
        return lifecycleKt$eventFlow$1;
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
            final s sVar = (s) this.L$0;
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.lifecycle.i
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    s.this.y(event);
                }
            };
            this.$this_eventFlow.addObserver(lifecycleEventObserver);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_eventFlow, lifecycleEventObserver);
            this.label = 1;
            if (q.a(sVar, anonymousClass1, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }

    @Override // X5.n
    public final Object invoke(s sVar, P5.d dVar) {
        return ((LifecycleKt$eventFlow$1) create(sVar, dVar)).invokeSuspend(I.f6487a);
    }
}
