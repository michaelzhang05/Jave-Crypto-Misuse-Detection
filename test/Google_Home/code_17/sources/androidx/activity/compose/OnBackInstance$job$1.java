package androidx.activity.compose;

import O5.I;
import O5.t;
import S5.d;
import T5.b;
import a6.InterfaceC1668n;
import a6.InterfaceC1669o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import l6.M;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;
import o6.InterfaceC3707g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends l implements InterfaceC1668n {
    final /* synthetic */ InterfaceC1668n $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC1669o {
        final /* synthetic */ O $completed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(O o8, d dVar) {
            super(3, dVar);
            this.$completed = o8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$completed.f34158a = true;
                return I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1669o
        public final Object invoke(InterfaceC3707g interfaceC3707g, Throwable th, d dVar) {
            return new AnonymousClass1(this.$completed, dVar).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(InterfaceC1668n interfaceC1668n, OnBackInstance onBackInstance, d dVar) {
        super(2, dVar);
        this.$onBack = interfaceC1668n;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new OnBackInstance$job$1(this.$onBack, this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        O o8;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                o8 = (O) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            O o9 = new O();
            InterfaceC1668n interfaceC1668n = this.$onBack;
            InterfaceC3706f F8 = AbstractC3708h.F(AbstractC3708h.o(this.this$0.getChannel()), new AnonymousClass1(o9, null));
            this.L$0 = o9;
            this.label = 1;
            if (interfaceC1668n.invoke(F8, this) == e8) {
                return e8;
            }
            o8 = o9;
        }
        if (o8.f34158a) {
            return I.f8278a;
        }
        throw new IllegalStateException("You must collect the progress flow".toString());
    }

    @Override // a6.InterfaceC1668n
    public final Object invoke(M m8, d dVar) {
        return ((OnBackInstance$job$1) create(m8, dVar)).invokeSuspend(I.f8278a);
    }
}
