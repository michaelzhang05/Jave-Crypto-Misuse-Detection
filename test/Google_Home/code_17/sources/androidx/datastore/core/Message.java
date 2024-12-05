package androidx.datastore.core;

import S5.g;
import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3389x;

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
        private final InterfaceC3389x ack;
        private final g callerContext;
        private final State<T> lastState;
        private final InterfaceC1668n transform;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Update(InterfaceC1668n transform, InterfaceC3389x ack, State<T> state, g callerContext) {
            super(null);
            AbstractC3255y.i(transform, "transform");
            AbstractC3255y.i(ack, "ack");
            AbstractC3255y.i(callerContext, "callerContext");
            this.transform = transform;
            this.ack = ack;
            this.lastState = state;
            this.callerContext = callerContext;
        }

        public final InterfaceC3389x getAck() {
            return this.ack;
        }

        public final g getCallerContext() {
            return this.callerContext;
        }

        @Override // androidx.datastore.core.Message
        public State<T> getLastState() {
            return this.lastState;
        }

        public final InterfaceC1668n getTransform() {
            return this.transform;
        }
    }

    private Message() {
    }

    public abstract State<T> getLastState();

    public /* synthetic */ Message(AbstractC3247p abstractC3247p) {
        this();
    }
}
