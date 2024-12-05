package com.airbnb.epoxy;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* compiled from: ActivityRecyclerPool.kt */
/* loaded from: classes.dex */
public final class a {
    private final ArrayList<PoolReference> a = new ArrayList<>(5);

    public final void a(PoolReference poolReference) {
        kotlin.jvm.internal.l.g(poolReference, "pool");
        if (b.a(poolReference.c())) {
            poolReference.getViewPool().b();
            this.a.remove(poolReference);
        }
    }

    public final PoolReference b(Context context, Function0<? extends RecyclerView.u> function0) {
        androidx.lifecycle.f lifecycle;
        kotlin.jvm.internal.l.g(context, "context");
        kotlin.jvm.internal.l.g(function0, "poolFactory");
        Iterator<PoolReference> it = this.a.iterator();
        kotlin.jvm.internal.l.b(it, "pools.iterator()");
        PoolReference poolReference = null;
        while (it.hasNext()) {
            PoolReference next = it.next();
            kotlin.jvm.internal.l.b(next, "iterator.next()");
            PoolReference poolReference2 = next;
            if (poolReference2.c() == context) {
                if (poolReference != null) {
                    throw new IllegalStateException("A pool was already found");
                }
                poolReference = poolReference2;
            } else if (b.a(poolReference2.c())) {
                poolReference2.getViewPool().b();
                it.remove();
            }
        }
        if (poolReference == null) {
            poolReference = new PoolReference(context, function0.invoke(), this);
            boolean z = context instanceof androidx.lifecycle.j;
            Object obj = context;
            if (!z) {
                obj = null;
            }
            androidx.lifecycle.j jVar = (androidx.lifecycle.j) obj;
            if (jVar != null && (lifecycle = jVar.getLifecycle()) != null) {
                lifecycle.a(poolReference);
            }
            this.a.add(poolReference);
        }
        return poolReference;
    }
}
