package com.facebook.t.r;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.facebook.t.g;
import java.lang.ref.WeakReference;

/* compiled from: CodelessLoggingEventListener.java */
/* loaded from: classes.dex */
public class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CodelessLoggingEventListener.java */
    /* renamed from: com.facebook.t.r.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class RunnableC0143a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9510f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Bundle f9511g;

        RunnableC0143a(String str, Bundle bundle) {
            this.f9510f = str;
            this.f9511g = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                g.j(com.facebook.f.e()).i(this.f9510f, this.f9511g);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* compiled from: CodelessLoggingEventListener.java */
    /* loaded from: classes.dex */
    public static class b implements View.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        private com.facebook.t.r.g.a f9512f;

        /* renamed from: g, reason: collision with root package name */
        private WeakReference<View> f9513g;

        /* renamed from: h, reason: collision with root package name */
        private WeakReference<View> f9514h;

        /* renamed from: i, reason: collision with root package name */
        private View.OnClickListener f9515i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f9516j;

        /* synthetic */ b(com.facebook.t.r.g.a aVar, View view, View view2, RunnableC0143a runnableC0143a) {
            this(aVar, view, view2);
        }

        public boolean a() {
            return this.f9516j;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                View.OnClickListener onClickListener = this.f9515i;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                if (this.f9514h.get() == null || this.f9513g.get() == null) {
                    return;
                }
                a.a(this.f9512f, this.f9514h.get(), this.f9513g.get());
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }

        private b(com.facebook.t.r.g.a aVar, View view, View view2) {
            this.f9516j = false;
            if (aVar == null || view == null || view2 == null) {
                return;
            }
            this.f9515i = com.facebook.t.r.g.f.g(view2);
            this.f9512f = aVar;
            this.f9513g = new WeakReference<>(view2);
            this.f9514h = new WeakReference<>(view);
            this.f9516j = true;
        }
    }

    /* compiled from: CodelessLoggingEventListener.java */
    /* loaded from: classes.dex */
    public static class c implements AdapterView.OnItemClickListener {

        /* renamed from: f, reason: collision with root package name */
        private com.facebook.t.r.g.a f9517f;

        /* renamed from: g, reason: collision with root package name */
        private WeakReference<AdapterView> f9518g;

        /* renamed from: h, reason: collision with root package name */
        private WeakReference<View> f9519h;

        /* renamed from: i, reason: collision with root package name */
        private AdapterView.OnItemClickListener f9520i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f9521j;

        /* synthetic */ c(com.facebook.t.r.g.a aVar, View view, AdapterView adapterView, RunnableC0143a runnableC0143a) {
            this(aVar, view, adapterView);
        }

        public boolean a() {
            return this.f9521j;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            AdapterView.OnItemClickListener onItemClickListener = this.f9520i;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i2, j2);
            }
            if (this.f9519h.get() == null || this.f9518g.get() == null) {
                return;
            }
            a.a(this.f9517f, this.f9519h.get(), this.f9518g.get());
        }

        private c(com.facebook.t.r.g.a aVar, View view, AdapterView adapterView) {
            this.f9521j = false;
            if (aVar == null || view == null || adapterView == null) {
                return;
            }
            this.f9520i = adapterView.getOnItemClickListener();
            this.f9517f = aVar;
            this.f9518g = new WeakReference<>(adapterView);
            this.f9519h = new WeakReference<>(view);
            this.f9521j = true;
        }
    }

    static /* synthetic */ void a(com.facebook.t.r.g.a aVar, View view, View view2) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            d(aVar, view, view2);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }

    public static b b(com.facebook.t.r.g.a aVar, View view, View view2) {
        RunnableC0143a runnableC0143a = null;
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            return new b(aVar, view, view2, runnableC0143a);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    public static c c(com.facebook.t.r.g.a aVar, View view, AdapterView adapterView) {
        RunnableC0143a runnableC0143a = null;
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return null;
        }
        try {
            return new c(aVar, view, adapterView, runnableC0143a);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
            return null;
        }
    }

    private static void d(com.facebook.t.r.g.a aVar, View view, View view2) {
        if (com.facebook.internal.a0.f.a.c(a.class)) {
            return;
        }
        try {
            String b2 = aVar.b();
            Bundle f2 = com.facebook.t.r.c.f(aVar, view, view2);
            if (f2.containsKey("_valueToSum")) {
                f2.putDouble("_valueToSum", com.facebook.t.u.b.g(f2.getString("_valueToSum")));
            }
            f2.putString("_is_fb_codeless", "1");
            com.facebook.f.m().execute(new RunnableC0143a(b2, f2));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, a.class);
        }
    }
}
