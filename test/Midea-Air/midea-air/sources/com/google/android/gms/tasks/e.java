package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class e<TResult> {
    private final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue<d<TResult>> f16344b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f16345c;

    public final void a(Task<TResult> task) {
        d<TResult> poll;
        synchronized (this.a) {
            if (this.f16344b != null && !this.f16345c) {
                this.f16345c = true;
                while (true) {
                    synchronized (this.a) {
                        poll = this.f16344b.poll();
                        if (poll == null) {
                            this.f16345c = false;
                            return;
                        }
                    }
                    poll.a(task);
                }
            }
        }
    }

    public final void b(d<TResult> dVar) {
        synchronized (this.a) {
            if (this.f16344b == null) {
                this.f16344b = new ArrayDeque();
            }
            this.f16344b.add(dVar);
        }
    }
}
