package androidx.datastore.core;

import O5.I;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;
import n6.d;
import n6.g;
import n6.h;
import n6.o;

/* loaded from: classes3.dex */
public final class SimpleActor<T> {
    private final InterfaceC1668n consumeMessage;
    private final d messageQueue;
    private final AtomicInt remainingMessages;
    private final M scope;

    /* renamed from: androidx.datastore.core.SimpleActor$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    static final class AnonymousClass1 extends AbstractC3256z implements Function1 {
        final /* synthetic */ Function1 $onComplete;
        final /* synthetic */ InterfaceC1668n $onUndeliveredElement;
        final /* synthetic */ SimpleActor<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Function1 function1, SimpleActor<T> simpleActor, InterfaceC1668n interfaceC1668n) {
            super(1);
            this.$onComplete = function1;
            this.this$0 = simpleActor;
            this.$onUndeliveredElement = interfaceC1668n;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8278a;
        }

        public final void invoke(Throwable th) {
            I i8;
            this.$onComplete.invoke(th);
            ((SimpleActor) this.this$0).messageQueue.q(th);
            do {
                Object f8 = h.f(((SimpleActor) this.this$0).messageQueue.e());
                if (f8 != null) {
                    this.$onUndeliveredElement.invoke(f8, th);
                    i8 = I.f8278a;
                } else {
                    i8 = null;
                }
            } while (i8 != null);
        }
    }

    public SimpleActor(M scope, Function1 onComplete, InterfaceC1668n onUndeliveredElement, InterfaceC1668n consumeMessage) {
        AbstractC3255y.i(scope, "scope");
        AbstractC3255y.i(onComplete, "onComplete");
        AbstractC3255y.i(onUndeliveredElement, "onUndeliveredElement");
        AbstractC3255y.i(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInt(0);
        InterfaceC3390x0 interfaceC3390x0 = (InterfaceC3390x0) scope.getCoroutineContext().get(InterfaceC3390x0.f34661n0);
        if (interfaceC3390x0 != null) {
            interfaceC3390x0.s(new AnonymousClass1(onComplete, this, onUndeliveredElement));
        }
    }

    public final void offer(T t8) {
        Object w8 = this.messageQueue.w(t8);
        if (w8 instanceof h.a) {
            Throwable e8 = h.e(w8);
            if (e8 == null) {
                throw new o("Channel was closed normally");
            }
            throw e8;
        }
        if (h.i(w8)) {
            if (this.remainingMessages.getAndIncrement() == 0) {
                AbstractC3364k.d(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
