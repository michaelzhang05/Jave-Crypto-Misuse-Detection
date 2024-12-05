package androidx.activity;

import androidx.lifecycle.f;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private final Runnable a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f76b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    private class LifecycleOnBackPressedCancellable implements h, androidx.activity.a {
        private final f a;

        /* renamed from: b, reason: collision with root package name */
        private final b f77b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f78c;

        LifecycleOnBackPressedCancellable(f fVar, b bVar) {
            this.a = fVar;
            this.f77b = bVar;
            fVar.a(this);
        }

        @Override // androidx.lifecycle.h
        public void a(j jVar, f.a aVar) {
            if (aVar == f.a.ON_START) {
                this.f78c = OnBackPressedDispatcher.this.b(this.f77b);
                return;
            }
            if (aVar == f.a.ON_STOP) {
                androidx.activity.a aVar2 = this.f78c;
                if (aVar2 != null) {
                    aVar2.cancel();
                    return;
                }
                return;
            }
            if (aVar == f.a.ON_DESTROY) {
                cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.a.c(this);
            this.f77b.e(this);
            androidx.activity.a aVar = this.f78c;
            if (aVar != null) {
                aVar.cancel();
                this.f78c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {
        private final b a;

        a(b bVar) {
            this.a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f76b.remove(this.a);
            this.a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a(j jVar, b bVar) {
        f lifecycle = jVar.getLifecycle();
        if (lifecycle.b() == f.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(lifecycle, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f76b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f76b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
