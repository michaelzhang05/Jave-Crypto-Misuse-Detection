package androidx.datastore.core;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import X5.o;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.O;
import k6.s;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$data$1 extends l implements n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends l implements n {
        final /* synthetic */ InterfaceC2855x0 $updateCollector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC2855x0 interfaceC2855x0, d dVar) {
            super(2, dVar);
            this.$updateCollector = interfaceC2855x0;
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
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X5.n
        public final Object invoke(InterfaceC3359g interfaceC3359g, d dVar) {
            return ((AnonymousClass1) create(interfaceC3359g, dVar)).invokeSuspend(I.f6487a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends l implements o {
        final /* synthetic */ InterfaceC2855x0 $updateCollector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC2855x0 interfaceC2855x0, d dVar) {
            super(3, dVar);
            this.$updateCollector = interfaceC2855x0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                InterfaceC2855x0.a.a(this.$updateCollector, null, 1, null);
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X5.o
        public final Object invoke(InterfaceC3359g interfaceC3359g, Throwable th, d dVar) {
            return new AnonymousClass2(this.$updateCollector, dVar).invokeSuspend(I.f6487a);
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
        InterfaceC2855x0 d8;
        InterfaceC3358f interfaceC3358f;
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
            d8 = AbstractC2829k.d(sVar, null, O.LAZY, new DataStoreImpl$data$1$updateCollector$1(this.this$0, null), 1, null);
            interfaceC3358f = ((DataStoreImpl) this.this$0).internalDataFlow;
            InterfaceC3358f D8 = AbstractC3360h.D(AbstractC3360h.F(interfaceC3358f, new AnonymousClass1(d8, null)), new AnonymousClass2(d8, null));
            InterfaceC3359g interfaceC3359g = new InterfaceC3359g() { // from class: androidx.datastore.core.DataStoreImpl$data$1.3
                @Override // l6.InterfaceC3359g
                public final Object emit(T t8, d dVar) {
                    Object i9 = s.this.i(t8, dVar);
                    if (i9 == b.e()) {
                        return i9;
                    }
                    return I.f6487a;
                }
            };
            this.label = 1;
            if (D8.collect(interfaceC3359g, this) == e8) {
                return e8;
            }
        }
        return I.f6487a;
    }

    @Override // X5.n
    public final Object invoke(s sVar, d dVar) {
        return ((DataStoreImpl$data$1) create(sVar, dVar)).invokeSuspend(I.f6487a);
    }
}
