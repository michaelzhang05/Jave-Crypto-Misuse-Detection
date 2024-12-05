package androidx.compose.runtime;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.M;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
    final /* synthetic */ S5.g $context;
    final /* synthetic */ InterfaceC3706f $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {
        final /* synthetic */ ProduceStateScope<R> $$this$produceState;
        final /* synthetic */ InterfaceC3706f $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC3706f interfaceC3706f, ProduceStateScope<R> produceStateScope, S5.d dVar) {
            super(2, dVar);
            this.$this_collectAsState = interfaceC3706f;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, dVar);
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
                InterfaceC3706f interfaceC3706f = this.$this_collectAsState;
                final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                    @Override // o6.InterfaceC3707g
                    public final Object emit(T t8, S5.d dVar) {
                        produceStateScope.setValue(t8);
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
            return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(S5.g gVar, InterfaceC3706f interfaceC3706f, S5.d dVar) {
        super(2, dVar);
        this.$context = gVar;
        this.$this_collectAsState = interfaceC3706f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final S5.d create(Object obj, S5.d dVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, dVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(ProduceStateScope<R> produceStateScope, S5.d dVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(produceStateScope, dVar)).invokeSuspend(I.f8278a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = T5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1 && i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            if (AbstractC3255y.d(this.$context, S5.h.f9825a)) {
                InterfaceC3706f interfaceC3706f = this.$this_collectAsState;
                InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1.1
                    @Override // o6.InterfaceC3707g
                    public final Object emit(T t8, S5.d dVar) {
                        produceStateScope.setValue(t8);
                        return I.f8278a;
                    }
                };
                this.label = 1;
                if (interfaceC3706f.collect(interfaceC3707g, this) == e8) {
                    return e8;
                }
            } else {
                S5.g gVar = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                this.label = 2;
                if (AbstractC3360i.g(gVar, anonymousClass2, this) == e8) {
                    return e8;
                }
            }
        }
        return I.f8278a;
    }
}
