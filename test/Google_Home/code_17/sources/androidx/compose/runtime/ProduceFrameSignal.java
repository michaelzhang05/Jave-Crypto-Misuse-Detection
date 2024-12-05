package androidx.compose.runtime;

import O5.I;
import O5.s;
import kotlin.jvm.internal.AbstractC3255y;
import l6.C3374p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, S5.d dVar) {
        Object obj2;
        Object obj3;
        C3374p c3374p;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return I.f8278a;
            }
            I i8 = I.f8278a;
            C3374p c3374p2 = new C3374p(T5.b.c(dVar), 1);
            c3374p2.C();
            synchronized (obj) {
                try {
                    Object obj7 = this.pendingFrameContinuation;
                    obj3 = RecomposerKt.ProduceAnotherFrame;
                    if (obj7 == obj3) {
                        obj4 = RecomposerKt.FramePending;
                        this.pendingFrameContinuation = obj4;
                        c3374p = c3374p2;
                    } else {
                        this.pendingFrameContinuation = c3374p2;
                        c3374p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c3374p != null) {
                s.a aVar = s.f8302b;
                c3374p.resumeWith(s.b(I.f8278a));
            }
            Object y8 = c3374p2.y();
            if (y8 == T5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == T5.b.e()) {
                return y8;
            }
            return I.f8278a;
        }
    }

    public final S5.d requestFrameLocked() {
        Object obj;
        Object obj2;
        boolean d8;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof S5.d) {
            obj4 = RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (S5.d) obj5;
        }
        obj = RecomposerKt.ProduceAnotherFrame;
        if (!AbstractC3255y.d(obj5, obj)) {
            obj2 = RecomposerKt.FramePending;
            d8 = AbstractC3255y.d(obj5, obj2);
        } else {
            d8 = true;
        }
        if (!d8) {
            if (obj5 == null) {
                obj3 = RecomposerKt.ProduceAnotherFrame;
                this.pendingFrameContinuation = obj3;
            } else {
                throw new IllegalStateException(("invalid pendingFrameContinuation " + obj5).toString());
            }
        }
        return null;
    }

    public final void takeFrameRequestLocked() {
        Object obj;
        Object obj2 = this.pendingFrameContinuation;
        obj = RecomposerKt.FramePending;
        if (obj2 == obj) {
            this.pendingFrameContinuation = null;
            return;
        }
        throw new IllegalStateException("frame not pending".toString());
    }
}
