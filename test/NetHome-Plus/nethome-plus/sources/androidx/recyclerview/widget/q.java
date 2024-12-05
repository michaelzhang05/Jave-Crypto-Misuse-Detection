package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: SimpleItemAnimator.java */
/* loaded from: classes.dex */
public abstract class q extends RecyclerView.l {
    private static final boolean DEBUG = false;
    private static final String TAG = "SimpleItemAnimator";
    boolean mSupportsChangeAnimations = true;

    public abstract boolean animateAdd(RecyclerView.c0 c0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animateAppearance(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        if (cVar != null && ((i2 = cVar.a) != (i3 = cVar2.a) || cVar.f1421b != cVar2.f1421b)) {
            return animateMove(c0Var, i2, cVar.f1421b, i3, cVar2.f1421b);
        }
        return animateAdd(c0Var);
    }

    public abstract boolean animateChange(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, int i2, int i3, int i4, int i5);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animateChange(RecyclerView.c0 c0Var, RecyclerView.c0 c0Var2, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2;
        int i3;
        int i4 = cVar.a;
        int i5 = cVar.f1421b;
        if (c0Var2.shouldIgnore()) {
            int i6 = cVar.a;
            i3 = cVar.f1421b;
            i2 = i6;
        } else {
            i2 = cVar2.a;
            i3 = cVar2.f1421b;
        }
        return animateChange(c0Var, c0Var2, i4, i5, i2, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animateDisappearance(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.a;
        int i3 = cVar.f1421b;
        View view = c0Var.itemView;
        int left = cVar2 == null ? view.getLeft() : cVar2.a;
        int top = cVar2 == null ? view.getTop() : cVar2.f1421b;
        if (!c0Var.isRemoved() && (i2 != left || i3 != top)) {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            return animateMove(c0Var, i2, i3, left, top);
        }
        return animateRemove(c0Var);
    }

    public abstract boolean animateMove(RecyclerView.c0 c0Var, int i2, int i3, int i4, int i5);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean animatePersistence(RecyclerView.c0 c0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2) {
        int i2 = cVar.a;
        int i3 = cVar2.a;
        if (i2 == i3 && cVar.f1421b == cVar2.f1421b) {
            dispatchMoveFinished(c0Var);
            return false;
        }
        return animateMove(c0Var, i2, cVar.f1421b, i3, cVar2.f1421b);
    }

    public abstract boolean animateRemove(RecyclerView.c0 c0Var);

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean canReuseUpdatedViewHolder(RecyclerView.c0 c0Var) {
        return !this.mSupportsChangeAnimations || c0Var.isInvalid();
    }

    public final void dispatchAddFinished(RecyclerView.c0 c0Var) {
        onAddFinished(c0Var);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchAddStarting(RecyclerView.c0 c0Var) {
        onAddStarting(c0Var);
    }

    public final void dispatchChangeFinished(RecyclerView.c0 c0Var, boolean z) {
        onChangeFinished(c0Var, z);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchChangeStarting(RecyclerView.c0 c0Var, boolean z) {
        onChangeStarting(c0Var, z);
    }

    public final void dispatchMoveFinished(RecyclerView.c0 c0Var) {
        onMoveFinished(c0Var);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchMoveStarting(RecyclerView.c0 c0Var) {
        onMoveStarting(c0Var);
    }

    public final void dispatchRemoveFinished(RecyclerView.c0 c0Var) {
        onRemoveFinished(c0Var);
        dispatchAnimationFinished(c0Var);
    }

    public final void dispatchRemoveStarting(RecyclerView.c0 c0Var) {
        onRemoveStarting(c0Var);
    }

    public boolean getSupportsChangeAnimations() {
        return this.mSupportsChangeAnimations;
    }

    public void onAddFinished(RecyclerView.c0 c0Var) {
    }

    public void onAddStarting(RecyclerView.c0 c0Var) {
    }

    public void onChangeFinished(RecyclerView.c0 c0Var, boolean z) {
    }

    public void onChangeStarting(RecyclerView.c0 c0Var, boolean z) {
    }

    public void onMoveFinished(RecyclerView.c0 c0Var) {
    }

    public void onMoveStarting(RecyclerView.c0 c0Var) {
    }

    public void onRemoveFinished(RecyclerView.c0 c0Var) {
    }

    public void onRemoveStarting(RecyclerView.c0 c0Var) {
    }

    public void setSupportsChangeAnimations(boolean z) {
        this.mSupportsChangeAnimations = z;
    }
}
