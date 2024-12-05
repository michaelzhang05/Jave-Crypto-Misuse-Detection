package com.airbnb.epoxy.preload;

import com.airbnb.epoxy.preload.c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.IntIterator;
import kotlin.collections.u;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.l;
import kotlin.ranges.IntRange;

/* compiled from: PreloadTargetProvider.kt */
/* loaded from: classes.dex */
public final class d<P extends c> {
    private final ArrayDeque<P> a;

    public d(int i2, Function0<? extends P> function0) {
        IntRange i3;
        int t;
        l.g(function0, "requestHolderFactory");
        i3 = kotlin.ranges.f.i(0, i2);
        t = u.t(i3, 10);
        ArrayList arrayList = new ArrayList(t);
        Iterator<Integer> it = i3.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).a();
            arrayList.add(function0.invoke());
        }
        this.a = new ArrayDeque<>(arrayList);
    }

    public final void a() {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((c) it.next()).clear();
        }
    }

    public final P b() {
        P poll = this.a.poll();
        this.a.offer(poll);
        poll.clear();
        l.b(poll, "result");
        return poll;
    }
}
