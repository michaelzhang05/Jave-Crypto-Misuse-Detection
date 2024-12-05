package com.airbnb.epoxy.preload;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.epoxy.a0;
import com.airbnb.epoxy.l;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.preload.c;
import com.airbnb.epoxy.s;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.collections.b0;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.u;

/* compiled from: EpoxyPreloader.kt */
/* loaded from: classes.dex */
public final class b<P extends c> extends RecyclerView.t {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private IntRange f7856b;

    /* renamed from: c, reason: collision with root package name */
    private IntProgression f7857c;

    /* renamed from: d, reason: collision with root package name */
    private int f7858d;

    /* renamed from: e, reason: collision with root package name */
    private int f7859e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Class<? extends s<?>>, com.airbnb.epoxy.preload.a<?, ?, ? extends P>> f7860f;

    /* renamed from: g, reason: collision with root package name */
    private final d<P> f7861g;

    /* renamed from: h, reason: collision with root package name */
    private final f f7862h;

    /* renamed from: i, reason: collision with root package name */
    private final com.airbnb.epoxy.d f7863i;

    /* renamed from: j, reason: collision with root package name */
    private final int f7864j;

    /* compiled from: EpoxyPreloader.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public final <P extends c> b<P> a(l lVar, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, u> function2, int i2, List<? extends com.airbnb.epoxy.preload.a<? extends s<?>, ? extends h, ? extends P>> list) {
            kotlin.jvm.internal.l.g(lVar, "epoxyAdapter");
            kotlin.jvm.internal.l.g(function0, "requestHolderFactory");
            kotlin.jvm.internal.l.g(function2, "errorHandler");
            kotlin.jvm.internal.l.g(list, "modelPreloaders");
            return new b<>(lVar, (Function0) function0, function2, i2, (List) list);
        }

        public final <P extends c> b<P> b(n nVar, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, u> function2, int i2, List<? extends com.airbnb.epoxy.preload.a<? extends s<?>, ? extends h, ? extends P>> list) {
            kotlin.jvm.internal.l.g(nVar, "epoxyController");
            kotlin.jvm.internal.l.g(function0, "requestHolderFactory");
            kotlin.jvm.internal.l.g(function2, "errorHandler");
            kotlin.jvm.internal.l.g(list, "modelPreloaders");
            return new b<>(nVar, function0, function2, i2, list);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    private b(com.airbnb.epoxy.d dVar, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, u> function2, int i2, List<? extends com.airbnb.epoxy.preload.a<?, ?, ? extends P>> list) {
        int t;
        int e2;
        int b2;
        this.f7863i = dVar;
        this.f7864j = i2;
        IntRange.a aVar = IntRange.f19496j;
        this.f7856b = aVar.a();
        this.f7857c = aVar.a();
        this.f7858d = -1;
        t = kotlin.collections.u.t(list, 10);
        e2 = n0.e(t);
        b2 = kotlin.ranges.f.b(e2, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
        for (Object obj : list) {
            linkedHashMap.put(((com.airbnb.epoxy.preload.a) obj).b(), obj);
        }
        this.f7860f = linkedHashMap;
        this.f7861g = new d<>(this.f7864j, function0);
        this.f7862h = new f(this.f7863i, function2);
        if (this.f7864j > 0) {
            return;
        }
        throw new IllegalArgumentException(("maxItemsToPreload must be greater than 0. Was " + this.f7864j).toString());
    }

    private final IntProgression a(int i2, int i3, boolean z) {
        int i4 = z ? i3 + 1 : i2 - 1;
        int i5 = this.f7864j;
        return IntProgression.f19488f.a(c(i4), c((z ? i5 - 1 : 1 - i5) + i4), z ? 1 : -1);
    }

    private final int c(int i2) {
        return Math.min(this.f7858d - 1, Math.max(i2, 0));
    }

    private final boolean d(int i2) {
        return Math.abs(i2) > 75;
    }

    private final boolean e(int i2) {
        return i2 == -1 || i2 >= this.f7858d;
    }

    private final void f(int i2) {
        s<?> b2 = a0.b(this.f7863i, i2);
        if (!(b2 instanceof s)) {
            b2 = null;
        }
        if (b2 != null) {
            com.airbnb.epoxy.preload.a<?, ?, ? extends P> aVar = this.f7860f.get(b2.getClass());
            com.airbnb.epoxy.preload.a<?, ?, ? extends P> aVar2 = aVar instanceof com.airbnb.epoxy.preload.a ? aVar : null;
            if (aVar2 != null) {
                Iterator it = this.f7862h.c(aVar2, b2, i2).iterator();
                while (it.hasNext()) {
                    aVar2.d(b2, this.f7861g.b(), (g) it.next());
                }
            }
        }
    }

    public final void b() {
        this.f7861g.a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
        kotlin.jvm.internal.l.g(recyclerView, "recyclerView");
        this.f7859e = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
        Set s0;
        kotlin.jvm.internal.l.g(recyclerView, "recyclerView");
        if ((i2 == 0 && i3 == 0) || d(i2) || d(i3)) {
            return;
        }
        RecyclerView.g adapter = recyclerView.getAdapter();
        this.f7858d = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (!e(findFirstVisibleItemPosition) && !e(findLastVisibleItemPosition)) {
                IntRange intRange = new IntRange(findFirstVisibleItemPosition, findLastVisibleItemPosition);
                if (kotlin.jvm.internal.l.a(intRange, this.f7856b)) {
                    return;
                }
                IntProgression a2 = a(findFirstVisibleItemPosition, findLastVisibleItemPosition, intRange.getF19489g() > this.f7856b.getF19489g() || intRange.getF19490h() > this.f7856b.getF19490h());
                s0 = b0.s0(a2, this.f7857c);
                Iterator it = s0.iterator();
                while (it.hasNext()) {
                    f(((Number) it.next()).intValue());
                }
                this.f7856b = intRange;
                this.f7857c = a2;
                return;
            }
            IntRange.a aVar = IntRange.f19496j;
            this.f7856b = aVar.a();
            this.f7857c = aVar.a();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(com.airbnb.epoxy.n r8, kotlin.jvm.functions.Function0<? extends P> r9, kotlin.jvm.functions.Function2<? super android.content.Context, ? super java.lang.RuntimeException, kotlin.u> r10, int r11, java.util.List<? extends com.airbnb.epoxy.preload.a<?, ?, ? extends P>> r12) {
        /*
            r7 = this;
            java.lang.String r0 = "epoxyController"
            kotlin.jvm.internal.l.g(r8, r0)
            java.lang.String r0 = "requestHolderFactory"
            kotlin.jvm.internal.l.g(r9, r0)
            java.lang.String r0 = "errorHandler"
            kotlin.jvm.internal.l.g(r10, r0)
            java.lang.String r0 = "modelPreloaders"
            kotlin.jvm.internal.l.g(r12, r0)
            com.airbnb.epoxy.o r2 = r8.getAdapter()
            java.lang.String r8 = "epoxyController.adapter"
            kotlin.jvm.internal.l.b(r2, r8)
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.epoxy.preload.b.<init>(com.airbnb.epoxy.n, kotlin.a0.c.a, kotlin.a0.c.p, int, java.util.List):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(l lVar, Function0<? extends P> function0, Function2<? super Context, ? super RuntimeException, u> function2, int i2, List<? extends com.airbnb.epoxy.preload.a<?, ?, ? extends P>> list) {
        this((com.airbnb.epoxy.d) lVar, (Function0) function0, function2, i2, (List) list);
        kotlin.jvm.internal.l.g(lVar, "adapter");
        kotlin.jvm.internal.l.g(function0, "requestHolderFactory");
        kotlin.jvm.internal.l.g(function2, "errorHandler");
        kotlin.jvm.internal.l.g(list, "modelPreloaders");
    }
}
