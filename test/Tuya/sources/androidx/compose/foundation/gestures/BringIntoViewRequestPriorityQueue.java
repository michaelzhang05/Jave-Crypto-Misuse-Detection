package androidx.compose.foundation.gestures;

import L5.I;
import L5.s;
import androidx.compose.foundation.gestures.ContentInViewModifier;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import d6.i;
import i6.InterfaceC2837o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    private final MutableVector<ContentInViewModifier.Request> requests = new MutableVector<>(new ContentInViewModifier.Request[16], 0);

    public final void cancelAndRemoveAll(Throwable th) {
        MutableVector<ContentInViewModifier.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        InterfaceC2837o[] interfaceC2837oArr = new InterfaceC2837o[size];
        for (int i8 = 0; i8 < size; i8++) {
            interfaceC2837oArr[i8] = mutableVector.getContent()[i8].getContinuation();
        }
        for (int i9 = 0; i9 < size; i9++) {
            interfaceC2837oArr[i9].v(th);
        }
        if (!this.requests.isEmpty()) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public final boolean enqueue(ContentInViewModifier.Request request) {
        AbstractC3159y.i(request, "request");
        Rect rect = (Rect) request.getCurrentBounds().invoke();
        if (rect == null) {
            InterfaceC2837o continuation = request.getContinuation();
            s.a aVar = s.f6511b;
            continuation.resumeWith(s.b(I.f6487a));
            return false;
        }
        request.getContinuation().j(new BringIntoViewRequestPriorityQueue$enqueue$1(this, request));
        i iVar = new i(0, this.requests.getSize() - 1);
        int g8 = iVar.g();
        int h8 = iVar.h();
        if (g8 <= h8) {
            while (true) {
                Rect rect2 = (Rect) this.requests.getContent()[h8].getCurrentBounds().invoke();
                if (rect2 != null) {
                    Rect intersect = rect.intersect(rect2);
                    if (AbstractC3159y.d(intersect, rect)) {
                        this.requests.add(h8 + 1, request);
                        return true;
                    }
                    if (!AbstractC3159y.d(intersect, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= h8) {
                            while (true) {
                                this.requests.getContent()[h8].getContinuation().v(cancellationException);
                                if (size == h8) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (h8 == g8) {
                    break;
                }
                h8--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(Function1 block) {
        AbstractC3159y.i(block, "block");
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
        int g8 = iVar.g();
        int h8 = iVar.h();
        if (g8 <= h8) {
            while (true) {
                this.requests.getContent()[g8].getContinuation().resumeWith(s.b(I.f6487a));
                if (g8 == h8) {
                    break;
                } else {
                    g8++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(Function1 block) {
        AbstractC3159y.i(block, "block");
        while (this.requests.isNotEmpty() && ((Boolean) block.invoke(((ContentInViewModifier.Request) this.requests.last()).getCurrentBounds().invoke())).booleanValue()) {
            ((ContentInViewModifier.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation().resumeWith(s.b(I.f6487a));
        }
    }
}
