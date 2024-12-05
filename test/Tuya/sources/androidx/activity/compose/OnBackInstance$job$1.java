package androidx.activity.compose;

import L5.I;
import L5.t;
import P5.d;
import Q5.b;
import X5.n;
import X5.o;
import i6.M;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import l6.AbstractC3360h;
import l6.InterfaceC3358f;
import l6.InterfaceC3359g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", l = {154}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OnBackInstance$job$1 extends l implements n {
    final /* synthetic */ n $onBack;
    Object L$0;
    int label;
    final /* synthetic */ OnBackInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.activity.compose.OnBackInstance$job$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements o {
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
                this.$completed.f33757a = true;
                return I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // X5.o
        public final Object invoke(InterfaceC3359g interfaceC3359g, Throwable th, d dVar) {
            return new AnonymousClass1(this.$completed, dVar).invokeSuspend(I.f6487a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackInstance$job$1(n nVar, OnBackInstance onBackInstance, d dVar) {
        super(2, dVar);
        this.$onBack = nVar;
        this.this$0 = onBackInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new OnBackInstance$job$1(this.$onBack, this.this$0, dVar);
    }

    @Override // X5.n
    public final Object invoke(M m8, d dVar) {
        return ((OnBackInstance$job$1) create(m8, dVar)).invokeSuspend(I.f6487a);
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
            n nVar = this.$onBack;
            InterfaceC3358f D8 = AbstractC3360h.D(AbstractC3360h.m(this.this$0.getChannel()), new AnonymousClass1(o9, null));
            this.L$0 = o9;
            this.label = 1;
            if (nVar.invoke(D8, this) == e8) {
                return e8;
            }
            o8 = o9;
        }
        if (o8.f33757a) {
            return I.f6487a;
        }
        throw new IllegalStateException("You must collect the progress flow".toString());
    }
}
