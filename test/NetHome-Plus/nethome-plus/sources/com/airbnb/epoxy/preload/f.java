package com.airbnb.epoxy.preload;

import android.content.Context;
import android.view.View;
import com.airbnb.epoxy.a0;
import com.airbnb.epoxy.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.l;
import kotlin.u;

/* compiled from: PreloadableViewDataProvider.kt */
/* loaded from: classes.dex */
public final class f {
    private final Map<a, List<g<?>>> a;

    /* renamed from: b, reason: collision with root package name */
    private final com.airbnb.epoxy.d f7865b;

    /* renamed from: c, reason: collision with root package name */
    private final Function2<Context, RuntimeException, u> f7866c;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PreloadableViewDataProvider.kt */
    /* loaded from: classes.dex */
    public static final class a {
        private final Class<? extends s<?>> a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7867b;

        /* renamed from: c, reason: collision with root package name */
        private final int f7868c;

        /* renamed from: d, reason: collision with root package name */
        private final Object f7869d;

        public a(Class<? extends s<?>> cls, int i2, int i3, Object obj) {
            l.g(cls, "epoxyModelClass");
            this.a = cls;
            this.f7867b = i2;
            this.f7868c = i3;
            this.f7869d = obj;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (l.a(this.a, aVar.a)) {
                        if (this.f7867b == aVar.f7867b) {
                            if (!(this.f7868c == aVar.f7868c) || !l.a(this.f7869d, aVar.f7869d)) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            Class<? extends s<?>> cls = this.a;
            int hashCode = (((((cls != null ? cls.hashCode() : 0) * 31) + this.f7867b) * 31) + this.f7868c) * 31;
            Object obj = this.f7869d;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        public String toString() {
            return "CacheKey(epoxyModelClass=" + this.a + ", spanSize=" + this.f7867b + ", viewType=" + this.f7868c + ", signature=" + this.f7869d + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(com.airbnb.epoxy.d dVar, Function2<? super Context, ? super RuntimeException, u> function2) {
        l.g(dVar, "adapter");
        l.g(function2, "errorHandler");
        this.f7865b = dVar;
        this.f7866c = function2;
        this.a = new LinkedHashMap();
    }

    private final <T extends s<?>, U extends h, P extends c> g<U> a(View view, com.airbnb.epoxy.preload.a<T, U, P> aVar, T t) {
        int width = (view.getWidth() - view.getPaddingLeft()) - view.getPaddingRight();
        int height = (view.getHeight() - view.getPaddingTop()) - view.getPaddingBottom();
        if (width > 0 && height > 0) {
            return new g<>(view.getId(), width, height, aVar.a(view));
        }
        Function2<Context, RuntimeException, u> function2 = this.f7866c;
        Context context = view.getContext();
        l.b(context, "context");
        function2.invoke(context, new EpoxyPreloadException(view.getClass().getSimpleName() + " in " + t.getClass().getSimpleName() + " has zero size. A size must be set to allow preloading."));
        return null;
    }

    private final <T extends s<?>> a b(com.airbnb.epoxy.preload.a<T, ?, ?> aVar, T t, int i2) {
        return new a(t.getClass(), this.f7865b.n() ? t.spanSize(this.f7865b.l(), i2, this.f7865b.getItemCount()) : 1, a0.d(t), aVar.e(t));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends s<?>, U extends h, P extends c> List<g<U>> d(com.airbnb.epoxy.preload.a<T, U, P> aVar, T t, a aVar2) {
        com.airbnb.epoxy.u uVar;
        View view;
        List<View> a2;
        com.airbnb.epoxy.e a3 = a0.a(this.f7865b);
        l.b(a3, "adapter.boundViewHoldersInternal()");
        Iterator<com.airbnb.epoxy.u> it = a3.iterator();
        while (true) {
            if (!it.hasNext()) {
                uVar = null;
                break;
            }
            uVar = it.next();
            com.airbnb.epoxy.u uVar2 = uVar;
            l.b(uVar2, "it");
            s<?> c2 = uVar2.c();
            boolean z = false;
            if (l.a(b0.b(c2.getClass()), b0.b(t.getClass())) && androidx.core.view.u.N(uVar2.itemView) && androidx.core.view.u.O(uVar2.itemView) && l.a(b(aVar, c2, uVar2.getAdapterPosition()), aVar2)) {
                z = true;
            }
        }
        com.airbnb.epoxy.u uVar3 = uVar;
        if (uVar3 == null || (view = uVar3.itemView) == 0) {
            return null;
        }
        l.b(view, "holderMatch?.itemView ?: return null");
        Object c3 = a0.c(uVar3);
        if (!aVar.c().isEmpty()) {
            a2 = e(view, aVar.c(), t);
        } else if (view instanceof e) {
            a2 = ((e) view).a();
        } else {
            a2 = c3 instanceof e ? ((e) c3).a() : t.i();
        }
        if (a2.isEmpty()) {
            Function2<Context, RuntimeException, u> function2 = this.f7866c;
            Context context = view.getContext();
            l.b(context, "rootView.context");
            function2.invoke(context, new EpoxyPreloadException("No preloadable views were found in " + t.getClass().getSimpleName()));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = a2.iterator();
        while (it2.hasNext()) {
            y.y(arrayList, f((View) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            g a4 = a((View) it3.next(), aVar, t);
            if (a4 != null) {
                arrayList2.add(a4);
            }
        }
        return arrayList2;
    }

    private final <T extends s<?>> List<View> e(View view, List<Integer> list, T t) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            View findViewById = view.findViewById(intValue);
            if (findViewById == null) {
                Function2<Context, RuntimeException, u> function2 = this.f7866c;
                Context context = view.getContext();
                l.b(context, "context");
                function2.invoke(context, new EpoxyPreloadException("View with id " + intValue + " in " + t.getClass().getSimpleName() + " could not be found."));
            }
            if (findViewById != null) {
                arrayList.add(findViewById);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T extends View> List<View> f(T t) {
        List<View> e2;
        if (t instanceof e) {
            List<View> a2 = ((e) t).a();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = a2.iterator();
            while (it.hasNext()) {
                y.y(arrayList, f((View) it.next()));
            }
            return arrayList;
        }
        e2 = kotlin.collections.s.e(t);
        return e2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends s<?>, U extends h, P extends c> List<g<U>> c(com.airbnb.epoxy.preload.a<T, U, P> aVar, T t, int i2) {
        List<g<U>> i3;
        l.g(aVar, "preloader");
        l.g(t, "epoxyModel");
        a b2 = b(aVar, t, i2);
        Map<a, List<g<?>>> map = this.a;
        Object obj = map.get(b2);
        if (obj == null) {
            obj = d(aVar, t, b2);
            map.put(b2, obj);
        }
        if (!(obj instanceof List)) {
            obj = null;
        }
        List<g<U>> list = (List) obj;
        if (list != null) {
            return list;
        }
        i3 = t.i();
        return i3;
    }
}
