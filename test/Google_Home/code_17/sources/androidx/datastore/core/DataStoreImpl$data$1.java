package androidx.datastore.core;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.O;
import n6.s;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$data$1 extends l implements InterfaceC1668n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC1668n {
        final /* synthetic */ InterfaceC3390x0 $updateCollector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3390x0 interfaceC3390x0, d dVar) {
            super(2, dVar);
            this.$updateCollector = interfaceC3390x0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$updateCollector, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$updateCollector.start();
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(InterfaceC3707g interfaceC3707g, d dVar) {
            return ((AnonymousClass1) create(interfaceC3707g, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC1669o {
        final /* synthetic */ InterfaceC3390x0 $updateCollector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC3390x0 interfaceC3390x0, d dVar) {
            super(3, dVar);
            this.$updateCollector = interfaceC3390x0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                InterfaceC3390x0.a.a(this.$updateCollector, null, 1, null);
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1669o
        public final Object invoke(InterfaceC3707g interfaceC3707g, Throwable th, d dVar) {
            return new AnonymousClass2(this.$updateCollector, dVar).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, dVar);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3390x0 d8;
        InterfaceC3706f interfaceC3706f;
        Object e8 = b.e();
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
            d8 = AbstractC3364k.d(sVar, null, O.LAZY, new DataStoreImpl$data$1$updateCollector$1(this.this$0, null), 1, null);
            interfaceC3706f = ((DataStoreImpl) this.this$0).internalDataFlow;
            InterfaceC3706f F8 = AbstractC3708h.F(AbstractC3708h.H(interfaceC3706f, new AnonymousClass1(d8, null)), new AnonymousClass2(d8, null));
            InterfaceC3707g interfaceC3707g = new InterfaceC3707g() { // from class: androidx.datastore.core.DataStoreImpl$data$1.3
                @Override // o6.InterfaceC3707g
                public final Object emit(T t8, d dVar) {
                    Object d9 = s.this.d(t8, dVar);
                    if (d9 == b.e()) {
                        return d9;
                    }
                    return I.f8278a;
                }
            };
            this.label = 1;
            if (F8.collect(interfaceC3707g, this) == e8) {
                return e8;
            }
        }
        return I.f8278a;
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(s sVar, d dVar) {
        return ((DataStoreImpl$data$1) create(sVar, dVar)).invokeSuspend(I.f8278a);
    }
}
