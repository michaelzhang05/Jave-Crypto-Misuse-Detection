package com.airbnb.epoxy;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: UnboundedViewPool.kt */
/* loaded from: classes.dex */
public final class l0 extends RecyclerView.u {

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray<Queue<RecyclerView.c0>> f7847c = new SparseArray<>();

    private final Queue<RecyclerView.c0> m(int i2) {
        Queue<RecyclerView.c0> queue = this.f7847c.get(i2);
        if (queue != null) {
            return queue;
        }
        LinkedList linkedList = new LinkedList();
        this.f7847c.put(i2, linkedList);
        return linkedList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void b() {
        this.f7847c.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public RecyclerView.c0 f(int i2) {
        Queue<RecyclerView.c0> queue = this.f7847c.get(i2);
        if (queue != null) {
            return queue.poll();
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.u
    public void i(RecyclerView.c0 c0Var) {
        kotlin.jvm.internal.l.g(c0Var, "viewHolder");
        m(c0Var.getItemViewType()).add(c0Var);
    }
}
