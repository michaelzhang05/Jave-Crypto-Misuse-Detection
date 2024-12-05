package androidx.datastore.core;

import L5.I;
import X5.n;
import i6.AbstractC2829k;
import i6.InterfaceC2855x0;
import i6.M;
import k6.d;
import k6.g;
import k6.h;
import k6.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes3.dex */
public final class SimpleActor<T> {
    private final n consumeMessage;
    private final d messageQueue;
    private final AtomicInt remainingMessages;
    private final M scope;

    /* renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends AbstractC3160z implements Function1 {
        final /* synthetic */ Function1 $onComplete;
        final /* synthetic */ n $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, SimpleActor<T> simpleActor, n nVar) {
            super(1);
            this.$onComplete = function1;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = nVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f6487a;
        }

        public final void invoke(Throwable th) {
            I i8;
            this.$onComplete.invoke(th);
            ((SimpleActor) this.this$0).messageQueue.p(th);
            do {
                Object f8 = h.f(((SimpleActor) this.this$0).messageQueue.d());
                if (f8 != null) {
                    this.$onUndeliveredElement.invoke(f8, th);
                    i8 = I.f6487a;
                } else {
                    i8 = null;
                }
            } while (i8 != null);
        }
    }

    public SimpleActor(M scope, Function1 onComplete, n onUndeliveredElement, n consumeMessage) {
        AbstractC3159y.i(scope, "scope");
        AbstractC3159y.i(onComplete, "onComplete");
        AbstractC3159y.i(onUndeliveredElement, "onUndeliveredElement");
        AbstractC3159y.i(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInt(0);
        InterfaceC2855x0 interfaceC2855x0 = (InterfaceC2855x0) scope.getCoroutineContext().get(InterfaceC2855x0.f31809n0);
        if (interfaceC2855x0 != null) {
            interfaceC2855x0.u(new AnonymousClass1(onComplete, this, onUndeliveredElement));
        }
    }

    public final void offer(T t8) {
        Object y8 = this.messageQueue.y(t8);
        if (y8 instanceof h.a) {
            Throwable e8 = h.e(y8);
            if (e8 == null) {
                throw new o("Channel was closed normally");
            }
            throw e8;
        }
        if (h.i(y8)) {
            if (this.remainingMessages.getAndIncrement() == 0) {
                AbstractC2829k.d(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
