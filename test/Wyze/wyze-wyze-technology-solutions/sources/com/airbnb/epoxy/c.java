package com.airbnb.epoxy;

import android.os.Handler;
import androidx.recyclerview.widget.f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AsyncEpoxyDiffer.java */
/* loaded from: classes.dex */
public class c {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private final e f7800b;

    /* renamed from: c, reason: collision with root package name */
    private final f.d<s<?>> f7801c;

    /* renamed from: e, reason: collision with root package name */
    private volatile List<? extends s<?>> f7803e;

    /* renamed from: d, reason: collision with root package name */
    private final d f7802d = new d(null);

    /* renamed from: f, reason: collision with root package name */
    private volatile List<? extends s<?>> f7804f = Collections.emptyList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncEpoxyDiffer.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C0096c f7805f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7806g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f7807h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f7808i;

        a(C0096c c0096c, int i2, List list, List list2) {
            this.f7805f = c0096c;
            this.f7806g = i2;
            this.f7807h = list;
            this.f7808i = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.c a = androidx.recyclerview.widget.f.a(this.f7805f);
            c cVar = c.this;
            int i2 = this.f7806g;
            List list = this.f7807h;
            cVar.h(i2, list, k.b(this.f7808i, list, a));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncEpoxyDiffer.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f7810f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f7811g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ k f7812h;

        b(List list, int i2, k kVar) {
            this.f7810f = list;
            this.f7811g = i2;
            this.f7812h = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean j2 = c.this.j(this.f7810f, this.f7811g);
            if (this.f7812h == null || !j2) {
                return;
            }
            c.this.f7800b.d(this.f7812h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncEpoxyDiffer.java */
    /* renamed from: com.airbnb.epoxy.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0096c extends f.b {
        final List<? extends s<?>> a;

        /* renamed from: b, reason: collision with root package name */
        final List<? extends s<?>> f7814b;

        /* renamed from: c, reason: collision with root package name */
        private final f.d<s<?>> f7815c;

        C0096c(List<? extends s<?>> list, List<? extends s<?>> list2, f.d<s<?>> dVar) {
            this.a = list;
            this.f7814b = list2;
            this.f7815c = dVar;
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean areContentsTheSame(int i2, int i3) {
            return this.f7815c.a(this.a.get(i2), this.f7814b.get(i3));
        }

        @Override // androidx.recyclerview.widget.f.b
        public boolean areItemsTheSame(int i2, int i3) {
            return this.f7815c.b(this.a.get(i2), this.f7814b.get(i3));
        }

        @Override // androidx.recyclerview.widget.f.b
        public Object getChangePayload(int i2, int i3) {
            return this.f7815c.c(this.a.get(i2), this.f7814b.get(i3));
        }

        @Override // androidx.recyclerview.widget.f.b
        public int getNewListSize() {
            return this.f7814b.size();
        }

        @Override // androidx.recyclerview.widget.f.b
        public int getOldListSize() {
            return this.a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AsyncEpoxyDiffer.java */
    /* loaded from: classes.dex */
    public static class d {
        private volatile int a;

        /* renamed from: b, reason: collision with root package name */
        private volatile int f7816b;

        private d() {
        }

        synchronized boolean a(int i2) {
            boolean z;
            z = this.a == i2 && i2 > this.f7816b;
            if (z) {
                this.f7816b = i2;
            }
            return z;
        }

        synchronized boolean b() {
            boolean c2;
            c2 = c();
            this.f7816b = this.a;
            return c2;
        }

        synchronized boolean c() {
            return this.a > this.f7816b;
        }

        synchronized int d() {
            int i2;
            i2 = this.a + 1;
            this.a = i2;
            return i2;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AsyncEpoxyDiffer.java */
    /* loaded from: classes.dex */
    public interface e {
        void d(k kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Handler handler, e eVar, f.d<s<?>> dVar) {
        this.a = new w(handler);
        this.f7800b = eVar;
        this.f7801c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(int i2, List<? extends s<?>> list, k kVar) {
        b0.f7799h.execute(new b(list, i2, kVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean j(List<? extends s<?>> list, int i2) {
        if (!this.f7802d.a(i2)) {
            return false;
        }
        this.f7803e = list;
        if (list == null) {
            this.f7804f = Collections.emptyList();
        } else {
            this.f7804f = Collections.unmodifiableList(list);
        }
        return true;
    }

    public boolean d() {
        return this.f7802d.b();
    }

    public synchronized boolean e(List<s<?>> list) {
        boolean d2;
        d2 = d();
        j(list, this.f7802d.d());
        return d2;
    }

    public List<? extends s<?>> f() {
        return this.f7804f;
    }

    public boolean g() {
        return this.f7802d.c();
    }

    public void i(List<? extends s<?>> list) {
        int d2;
        List<? extends s<?>> list2;
        synchronized (this) {
            d2 = this.f7802d.d();
            list2 = this.f7803e;
        }
        if (list == list2) {
            h(d2, list, k.f(list2));
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (list2 != null && !list2.isEmpty()) {
                this.a.execute(new a(new C0096c(list2, list, this.f7801c), d2, list, list2));
                return;
            } else {
                h(d2, list, k.e(list));
                return;
            }
        }
        h(d2, null, (list2 == null || list2.isEmpty()) ? null : k.a(list2));
    }
}
