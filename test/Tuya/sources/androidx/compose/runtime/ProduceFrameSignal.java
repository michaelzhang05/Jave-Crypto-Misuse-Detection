package androidx.compose.runtime;

import L5.I;
import L5.s;
import i6.C2839p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ProduceFrameSignal {
    private Object pendingFrameContinuation;

    public final Object awaitFrameRequest(Object obj, P5.d dVar) {
        Object obj2;
        Object obj3;
        C2839p c2839p;
        Object obj4;
        Object obj5;
        synchronized (obj) {
            Object obj6 = this.pendingFrameContinuation;
            obj2 = RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return I.f6487a;
            }
            I i8 = I.f6487a;
            C2839p c2839p2 = new C2839p(Q5.b.c(dVar), 1);
            c2839p2.B();
            synchronized (obj) {
                try {
                    Object obj7 = this.pendingFrameContinuation;
                    obj3 = RecomposerKt.ProduceAnotherFrame;
                    if (obj7 == obj3) {
                        obj4 = RecomposerKt.FramePending;
                        this.pendingFrameContinuation = obj4;
                        c2839p = c2839p2;
                    } else {
                        this.pendingFrameContinuation = c2839p2;
                        c2839p = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c2839p != null) {
                s.a aVar = s.f6511b;
                c2839p.resumeWith(s.b(I.f6487a));
            }
            Object y8 = c2839p2.y();
            if (y8 == Q5.b.e()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            if (y8 == Q5.b.e()) {
                return y8;
            }
            return I.f6487a;
        }
    }

    public final P5.d requestFrameLocked() {
        Object obj;
        Object obj2;
        boolean d8;
        Object obj3;
        Object obj4;
        Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof P5.d) {
            obj4 = RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (P5.d) obj5;
        }
        obj = RecomposerKt.ProduceAnotherFrame;
        if (!AbstractC3159y.d(obj5, obj)) {
            obj2 = RecomposerKt.FramePending;
            d8 = AbstractC3159y.d(obj5, obj2);
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
