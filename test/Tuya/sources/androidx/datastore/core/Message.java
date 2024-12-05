package androidx.datastore.core;

import P5.g;
import X5.n;
import i6.InterfaceC2854x;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public abstract class Message<T> {

    /* loaded from: classes3.dex */
    public static final class Read<T> extends Message<T> {
        private final State<T> lastState;

        public Read(State<T> state) {
            super(null);
            this.lastState = state;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Update<T> extends Message<T> {
        private final InterfaceC2854x ack;
        private final g callerContext;
        private final State<T> lastState;
        private final n transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(n transform, InterfaceC2854x ack, State<T> state, g callerContext) {
            super(null);
            AbstractC3159y.i(transform, "transform");
            AbstractC3159y.i(ack, "ack");
            AbstractC3159y.i(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        public final InterfaceC2854x getAck() {
            return this.ack;
        }

        public final g getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final n getTransform() {
            return this.transform;
        }
    }

    private Message() {
    }

    public abstract State<T> getLastState();

    public /* synthetic */ Message(AbstractC3151p abstractC3151p) {
        this();
    }
}
