package androidx.compose.foundation.gestures;

import O5.I;
import O5.s;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import g6.i;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3372o;

/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    private final MutableVector<ContentInViewModifier.Request> requests = new MutableVector<>(new ContentInViewModifier.Request[16], 0);

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewModifier.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        InterfaceC3372o[] interfaceC3372oArr = new InterfaceC3372o[size];
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC3372oArr[i8] = mutableVector.getContent()[i8].getContinuation();
        }
        for (int i9 = 0; i9 < size; i9++) {
            interfaceC3372oArr[i9].t(th);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean enqueue(ContentInViewModifier.Request request) {
        AbstractC3255y.i(request, "request");
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            InterfaceC3372o continuation = request.getContinuation();
            s.a aVar = s.f8302b;
            continuation.resumeWith(s.b(I.f8278a));
            return false;
        }
        request.getContinuation().i(new BringIntoViewRequestPriorityQueue$enqueue$1(this, request));
        i iVar = new i(0, this.requests.getSize() - 1);
        int e8 = iVar.e();
        int f8 = iVar.f();
        if (e8 <= f8) {
            while (true) {
                Rect rect2 = (Rect) this.requests.getContent()[f8].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect intersect = rect.intersect(rect2);
                    if (AbstractC3255y.d(intersect, rect)) {
                        this.requests.add(f8 + 1, request);
                        return true;
                    }
                    if (!AbstractC3255y.d(intersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= f8) {
                            while (true) {
                                this.requests.getContent()[f8].getContinuation().t(cancellationException);
                                if (size == f8) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (f8 == e8) {
                    break;
                }
                f8--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(Function1 block) {
        AbstractC3255y.i(block, "block");
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize();
        if (size > 0) {
            int i8 = size - 1;
            Object[] content = mutableVector.getContent();
            do {
                block.invoke(((ContentInViewModifier.Request) content[i8]).getCurrentBounds().invoke());
                i8--;
            } while (i8 >= 0);
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.isEmpty();
    }

    public final void resumeAndRemoveAll() {
        i iVar = new i(0, this.requests.getSize() - 1);
        int e8 = iVar.e();
        int f8 = iVar.f();
        if (e8 <= f8) {
            while (true) {
                this.requests.getContent()[e8].getContinuation().resumeWith(s.b(I.f8278a));
                if (e8 == f8) {
                    break;
                } else {
                    e8++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(Function1 block) {
        AbstractC3255y.i(block, "block");
        while (this.requests.isNotEmpty() && ((Boolean) block.invoke(((ContentInViewModifier.Request) this.requests.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((ContentInViewModifier.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(s.b(I.f8278a));
        }
    }
}
