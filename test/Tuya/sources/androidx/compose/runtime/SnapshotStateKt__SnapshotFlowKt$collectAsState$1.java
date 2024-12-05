package androidx.compose.runtime;

import L5.I;
import L5.t;
import X5.n;
import i6.AbstractC2825i;
import i6.M;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends kotlin.coroutines.jvm.internal.l implements n {
    final /* synthetic */ P5.g $context;
    final /* synthetic */ InterfaceC3358f $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.l implements n {
        final /* synthetic */ ProduceStateScope<R> $$this$produceState;
        final /* synthetic */ InterfaceC3358f $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC3358f interfaceC3358f, ProduceStateScope<R> produceStateScope, P5.d dVar) {
            super(2, dVar);
            this.$this_collectAsState = interfaceC3358f;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f6487a);
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
                InterfaceC3358f interfaceC3358f = this.$this_collectAsState;
                final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                    @Override // l6.InterfaceC3359g
                    public final Object emit(T t8, P5.d dVar) {
                        produceStateScope.setValue(t8);
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
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(P5.g gVar, InterfaceC3358f interfaceC3358f, P5.d dVar) {
        super(2, dVar);
        this.$context = gVar;
        this.$this_collectAsState = interfaceC3358f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final P5.d create(Object obj, P5.d dVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, dVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    @Override // X5.n
    public final Object invoke(ProduceStateScope<R> produceStateScope, P5.d dVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(produceStateScope, dVar)).invokeSuspend(I.f6487a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = Q5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1 && i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            if (AbstractC3159y.d(this.$context, P5.h.f7994a)) {
                InterfaceC3358f interfaceC3358f = this.$this_collectAsState;
                InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1.1
                    @Override // l6.InterfaceC3359g
                    public final Object emit(T t8, P5.d dVar) {
                        produceStateScope.setValue(t8);
                        return I.f6487a;
                    }
                };
                this.label = 1;
                if (interfaceC3358f.collect(interfaceC3359g, this) == e8) {
                    return e8;
                }
            } else {
                P5.g gVar = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                this.label = 2;
                if (AbstractC2825i.g(gVar, anonymousClass2, this) == e8) {
                    return e8;
                }
            }
        }
        return I.f6487a;
    }
}
