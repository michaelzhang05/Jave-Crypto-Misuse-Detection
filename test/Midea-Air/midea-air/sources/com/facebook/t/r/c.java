package com.facebook.t.r;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.FacebookException;
import com.facebook.internal.m;
import com.facebook.internal.n;
import com.facebook.internal.p;
import com.facebook.internal.x;
import com.facebook.t.r.a;
import com.facebook.t.r.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CodelessMatcher.java */
/* loaded from: classes.dex */
public class c {
    private static final String a = "com.facebook.t.r.c";

    /* renamed from: b, reason: collision with root package name */
    private static c f9530b;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f9531c = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private Set<Activity> f9532d = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: e, reason: collision with root package name */
    private Set<ViewTreeObserverOnGlobalLayoutListenerC0145c> f9533e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    private HashSet<String> f9534f = new HashSet<>();

    /* renamed from: g, reason: collision with root package name */
    private HashMap<Integer, HashSet<String>> f9535g = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodelessMatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                c.a(c.this);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* compiled from: CodelessMatcher.java */
    /* loaded from: classes.dex */
    public static class b {
        private WeakReference<View> a;

        /* renamed from: b, reason: collision with root package name */
        private String f9537b;

        public b(View view, String str) {
            this.a = new WeakReference<>(view);
            this.f9537b = str;
        }

        public View a() {
            WeakReference<View> weakReference = this.a;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public String b() {
            return this.f9537b;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: CodelessMatcher.java */
    /* renamed from: com.facebook.t.r.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ViewTreeObserverOnGlobalLayoutListenerC0145c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<View> f9538f;

        /* renamed from: g, reason: collision with root package name */
        private List<com.facebook.t.r.g.a> f9539g;

        /* renamed from: h, reason: collision with root package name */
        private final Handler f9540h;

        /* renamed from: i, reason: collision with root package name */
        private HashSet<String> f9541i;

        /* renamed from: j, reason: collision with root package name */
        private final String f9542j;

        public ViewTreeObserverOnGlobalLayoutListenerC0145c(View view, Handler handler, HashSet<String> hashSet, String str) {
            this.f9538f = new WeakReference<>(view);
            this.f9540h = handler;
            this.f9541i = hashSet;
            this.f9542j = str;
            handler.postDelayed(this, 200L);
        }

        private void a(b bVar, View view, com.facebook.t.r.g.a aVar) {
            if (aVar == null) {
                return;
            }
            try {
                View a = bVar.a();
                if (a == null) {
                    return;
                }
                View a2 = com.facebook.t.r.g.f.a(a);
                if (a2 != null && com.facebook.t.r.g.f.p(a, a2)) {
                    d(bVar, view, aVar);
                    return;
                }
                if (a.getClass().getName().startsWith("com.facebook.react")) {
                    return;
                }
                if (!(a instanceof AdapterView)) {
                    b(bVar, view, aVar);
                } else if (a instanceof ListView) {
                    c(bVar, view, aVar);
                }
            } catch (Exception e2) {
                x.U(c.b(), e2);
            }
        }

        private void b(b bVar, View view, com.facebook.t.r.g.a aVar) {
            View a = bVar.a();
            if (a == null) {
                return;
            }
            String b2 = bVar.b();
            View.OnClickListener g2 = com.facebook.t.r.g.f.g(a);
            boolean z = (g2 instanceof a.b) && ((a.b) g2).a();
            if (this.f9541i.contains(b2) || z) {
                return;
            }
            a.setOnClickListener(com.facebook.t.r.a.b(aVar, view, a));
            this.f9541i.add(b2);
        }

        private void c(b bVar, View view, com.facebook.t.r.g.a aVar) {
            AdapterView adapterView = (AdapterView) bVar.a();
            if (adapterView == null) {
                return;
            }
            String b2 = bVar.b();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z = (onItemClickListener instanceof a.c) && ((a.c) onItemClickListener).a();
            if (this.f9541i.contains(b2) || z) {
                return;
            }
            adapterView.setOnItemClickListener(com.facebook.t.r.a.c(aVar, view, adapterView));
            this.f9541i.add(b2);
        }

        private void d(b bVar, View view, com.facebook.t.r.g.a aVar) {
            View a = bVar.a();
            if (a == null) {
                return;
            }
            String b2 = bVar.b();
            View.OnTouchListener h2 = com.facebook.t.r.g.f.h(a);
            boolean z = (h2 instanceof d.a) && ((d.a) h2).a();
            if (this.f9541i.contains(b2) || z) {
                return;
            }
            a.setOnTouchListener(d.a(aVar, view, a));
            this.f9541i.add(b2);
        }

        public static List<b> f(com.facebook.t.r.g.a aVar, View view, List<com.facebook.t.r.g.c> list, int i2, int i3, String str) {
            String str2 = str + "." + String.valueOf(i3);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i2 >= list.size()) {
                arrayList.add(new b(view, str2));
            } else {
                com.facebook.t.r.g.c cVar = list.get(i2);
                if (cVar.a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List<View> g2 = g((ViewGroup) parent);
                        int size = g2.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            arrayList.addAll(f(aVar, g2.get(i4), list, i2 + 1, i4, str2));
                        }
                    }
                    return arrayList;
                }
                if (cVar.a.equals(".")) {
                    arrayList.add(new b(view, str2));
                    return arrayList;
                }
                if (!h(view, cVar, i3)) {
                    return arrayList;
                }
                if (i2 == list.size() - 1) {
                    arrayList.add(new b(view, str2));
                }
            }
            if (view instanceof ViewGroup) {
                List<View> g3 = g((ViewGroup) view);
                int size2 = g3.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.addAll(f(aVar, g3.get(i5), list, i2 + 1, i5, str2));
                }
            }
            return arrayList;
        }

        private static List<View> g(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static boolean h(android.view.View r5, com.facebook.t.r.g.c r6, int r7) {
            /*
                Method dump skipped, instructions count: 265
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.t.r.c.ViewTreeObserverOnGlobalLayoutListenerC0145c.h(android.view.View, com.facebook.t.r.g.c, int):boolean");
        }

        private void i() {
            if (this.f9539g == null || this.f9538f.get() == null) {
                return;
            }
            for (int i2 = 0; i2 < this.f9539g.size(); i2++) {
                e(this.f9539g.get(i2), this.f9538f.get());
            }
        }

        public void e(com.facebook.t.r.g.a aVar, View view) {
            if (aVar == null || view == null) {
                return;
            }
            if (TextUtils.isEmpty(aVar.a()) || aVar.a().equals(this.f9542j)) {
                List<com.facebook.t.r.g.c> e2 = aVar.e();
                if (e2.size() > 25) {
                    return;
                }
                Iterator<b> it = f(aVar, view, e2, 0, -1, this.f9542j).iterator();
                while (it.hasNext()) {
                    a(it.next(), view, aVar);
                }
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            i();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            i();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                m j2 = n.j(com.facebook.f.f());
                if (j2 != null && j2.b()) {
                    List<com.facebook.t.r.g.a> f2 = com.facebook.t.r.g.a.f(j2.d());
                    this.f9539g = f2;
                    if (f2 == null || (view = this.f9538f.get()) == null) {
                        return;
                    }
                    ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalLayoutListener(this);
                        viewTreeObserver.addOnScrollChangedListener(this);
                    }
                    i();
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    private c() {
    }

    static /* synthetic */ void a(c cVar) {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return;
        }
        try {
            cVar.g();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
        }
    }

    static /* synthetic */ String b() {
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            return a;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    public static synchronized c e() {
        synchronized (c.class) {
            if (com.facebook.internal.a0.f.a.c(c.class)) {
                return null;
            }
            try {
                if (f9530b == null) {
                    f9530b = new c();
                }
                return f9530b;
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, c.class);
                return null;
            }
        }
    }

    public static Bundle f(com.facebook.t.r.g.a aVar, View view, View view2) {
        List<com.facebook.t.r.g.b> d2;
        List<b> f2;
        if (com.facebook.internal.a0.f.a.c(c.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            if (aVar != null && (d2 = aVar.d()) != null) {
                for (com.facebook.t.r.g.b bVar : d2) {
                    String str = bVar.f9578b;
                    if (str != null && str.length() > 0) {
                        bundle.putString(bVar.a, bVar.f9578b);
                    } else if (bVar.f9579c.size() > 0) {
                        if (bVar.f9580d.equals("relative")) {
                            f2 = ViewTreeObserverOnGlobalLayoutListenerC0145c.f(aVar, view2, bVar.f9579c, 0, -1, view2.getClass().getSimpleName());
                        } else {
                            f2 = ViewTreeObserverOnGlobalLayoutListenerC0145c.f(aVar, view, bVar.f9579c, 0, -1, view.getClass().getSimpleName());
                        }
                        Iterator<b> it = f2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                b next = it.next();
                                if (next.a() != null) {
                                    String k2 = com.facebook.t.r.g.f.k(next.a());
                                    if (k2.length() > 0) {
                                        bundle.putString(bVar.a, k2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, c.class);
            return null;
        }
    }

    private void g() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            for (Activity activity : this.f9532d) {
                if (activity != null) {
                    this.f9533e.add(new ViewTreeObserverOnGlobalLayoutListenerC0145c(com.facebook.t.u.b.e(activity), this.f9531c, this.f9534f, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    private void i() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                g();
            } else {
                this.f9531c.post(new a());
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    public void c(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (p.b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f9532d.add(activity);
                this.f9534f.clear();
                if (this.f9535g.containsKey(Integer.valueOf(activity.hashCode()))) {
                    this.f9534f = this.f9535g.get(Integer.valueOf(activity.hashCode()));
                }
                i();
                return;
            }
            throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    public void d(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            this.f9535g.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    public void h(Activity activity) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (p.b()) {
                return;
            }
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                this.f9532d.remove(activity);
                this.f9533e.clear();
                this.f9535g.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f9534f.clone());
                this.f9534f.clear();
                return;
            }
            throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }
}
