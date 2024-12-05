package androidx.lifecycle;

import L5.C1224h;
import L5.I;
import L5.t;
import i6.AbstractC2825i;
import i6.C2812b0;
import i6.J0;
import i6.L0;
import i6.M;
import i6.X;
import k6.s;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {107, 112, 114}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowLiveDataConversions$asFlow$1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
    final /* synthetic */ LiveData<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements X5.n {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData<T> liveData, Observer<T> observer, P5.d dVar) {
            super(2, dVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new AnonymousClass1(this.$this_asFlow, this.$observer, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.l implements X5.n {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LiveData<T> liveData, Observer<T> observer, P5.d dVar) {
            super(2, dVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new AnonymousClass2(this.$this_asFlow, this.$observer, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, P5.d dVar) {
        super(2, dVar);
        this.$this_asFlow = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, dVar);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Observer observer;
        Object e8 = Q5.b.e();
        ?? r12 = this.label;
        try {
            if (r12 != 0) {
                if (r12 != 1) {
                    if (r12 != 2) {
                        if (r12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Throwable th = (Throwable) this.L$0;
                        t.b(obj);
                        throw th;
                    }
                    Observer observer2 = (Observer) this.L$0;
                    t.b(obj);
                    r12 = observer2;
                    throw new C1224h();
                }
                Observer observer3 = (Observer) this.L$0;
                t.b(obj);
                observer = observer3;
            } else {
                t.b(obj);
                final s sVar = (s) this.L$0;
                Observer observer4 = new Observer() { // from class: androidx.lifecycle.e
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj2) {
                        s.this.y(obj2);
                    }
                };
                J0 G8 = C2812b0.c().G();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, observer4, null);
                this.L$0 = observer4;
                this.label = 1;
                observer = observer4;
                if (AbstractC2825i.g(G8, anonymousClass1, this) == e8) {
                    return e8;
                }
            }
            this.L$0 = observer;
            this.label = 2;
            r12 = observer;
            if (X.a(this) == e8) {
                return e8;
            }
            throw new C1224h();
        } catch (Throwable th2) {
            P5.g plus = C2812b0.c().G().plus(L0.f31717a);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_asFlow, r12, null);
            this.L$0 = th2;
            this.label = 3;
            if (AbstractC2825i.g(plus, anonymousClass2, this) == e8) {
                return e8;
            }
            throw th2;
        }
    }

    @Override // X5.n
    public final Object invoke(s sVar, P5.d dVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(sVar, dVar)).invokeSuspend(I.f6487a);
    }
}
