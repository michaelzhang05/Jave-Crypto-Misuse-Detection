package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f122a;

    /* renamed from: b, reason: collision with root package name */
    private final a5.e f123b = new a5.e();

    /* renamed from: c, reason: collision with root package name */
    private e5.a f124c;

    /* renamed from: d, reason: collision with root package name */
    private OnBackInvokedCallback f125d;

    /* renamed from: e, reason: collision with root package name */
    private OnBackInvokedDispatcher f126e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f127f;

    /* loaded from: classes.dex */
    private final class LifecycleOnBackPressedCancellable implements androidx.lifecycle.k, androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.lifecycle.h f128a;

        /* renamed from: b, reason: collision with root package name */
        private final m f129b;

        /* renamed from: c, reason: collision with root package name */
        private androidx.activity.a f130c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f131d;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, androidx.lifecycle.h hVar, m mVar) {
            f5.h.e(hVar, "lifecycle");
            f5.h.e(mVar, "onBackPressedCallback");
            this.f131d = onBackPressedDispatcher;
            this.f128a = hVar;
            this.f129b = mVar;
            hVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f128a.c(this);
            this.f129b.e(this);
            androidx.activity.a aVar = this.f130c;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f130c = null;
        }

        @Override // androidx.lifecycle.k
        public void d(androidx.lifecycle.m mVar, h.a aVar) {
            f5.h.e(mVar, "source");
            f5.h.e(aVar, "event");
            if (aVar == h.a.ON_START) {
                this.f130c = this.f131d.c(this.f129b);
                return;
            }
            if (aVar != h.a.ON_STOP) {
                if (aVar == h.a.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar2 = this.f130c;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    static final class a extends f5.i implements e5.a {
        a() {
            super(0);
        }

        @Override // e5.a
        public /* bridge */ /* synthetic */ Object a() {
            c();
            return z4.k.f10059a;
        }

        public final void c() {
            OnBackPressedDispatcher.this.g();
        }
    }

    /* loaded from: classes.dex */
    static final class b extends f5.i implements e5.a {
        b() {
            super(0);
        }

        @Override // e5.a
        public /* bridge */ /* synthetic */ Object a() {
            c();
            return z4.k.f10059a;
        }

        public final void c() {
            OnBackPressedDispatcher.this.e();
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f134a = new c();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(e5.a aVar) {
            f5.h.e(aVar, "$onBackInvoked");
            aVar.a();
        }

        public final OnBackInvokedCallback b(final e5.a aVar) {
            f5.h.e(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.r
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.c.c(e5.a.this);
                }
            };
        }

        public final void d(Object obj, int i6, Object obj2) {
            f5.h.e(obj, "dispatcher");
            f5.h.e(obj2, "callback");
            n.a(obj).registerOnBackInvokedCallback(i6, o.a(obj2));
        }

        public final void e(Object obj, Object obj2) {
            f5.h.e(obj, "dispatcher");
            f5.h.e(obj2, "callback");
            n.a(obj).unregisterOnBackInvokedCallback(o.a(obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class d implements androidx.activity.a {

        /* renamed from: a, reason: collision with root package name */
        private final m f135a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnBackPressedDispatcher f136b;

        public d(OnBackPressedDispatcher onBackPressedDispatcher, m mVar) {
            f5.h.e(mVar, "onBackPressedCallback");
            this.f136b = onBackPressedDispatcher;
            this.f135a = mVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f136b.f123b.remove(this.f135a);
            this.f135a.e(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.f135a.g(null);
                this.f136b.g();
            }
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f122a = runnable;
        if (Build.VERSION.SDK_INT >= 33) {
            this.f124c = new a();
            this.f125d = c.f134a.b(new b());
        }
    }

    public final void b(androidx.lifecycle.m mVar, m mVar2) {
        f5.h.e(mVar, "owner");
        f5.h.e(mVar2, "onBackPressedCallback");
        androidx.lifecycle.h r5 = mVar.r();
        if (r5.b() == h.b.DESTROYED) {
            return;
        }
        mVar2.a(new LifecycleOnBackPressedCancellable(this, r5, mVar2));
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            mVar2.g(this.f124c);
        }
    }

    public final androidx.activity.a c(m mVar) {
        f5.h.e(mVar, "onBackPressedCallback");
        this.f123b.add(mVar);
        d dVar = new d(this, mVar);
        mVar.a(dVar);
        if (Build.VERSION.SDK_INT >= 33) {
            g();
            mVar.g(this.f124c);
        }
        return dVar;
    }

    public final boolean d() {
        a5.e eVar = this.f123b;
        if ((eVar instanceof Collection) && eVar.isEmpty()) {
            return false;
        }
        Iterator<E> it = eVar.iterator();
        while (it.hasNext()) {
            if (((m) it.next()).c()) {
                return true;
            }
        }
        return false;
    }

    public final void e() {
        Object obj;
        a5.e eVar = this.f123b;
        ListIterator<E> listIterator = eVar.listIterator(eVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((m) obj).c()) {
                    break;
                }
            }
        }
        m mVar = (m) obj;
        if (mVar != null) {
            mVar.b();
            return;
        }
        Runnable runnable = this.f122a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void f(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        f5.h.e(onBackInvokedDispatcher, "invoker");
        this.f126e = onBackInvokedDispatcher;
        g();
    }

    public final void g() {
        boolean d6 = d();
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f126e;
        OnBackInvokedCallback onBackInvokedCallback = this.f125d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (d6 && !this.f127f) {
            c.f134a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f127f = true;
        } else {
            if (d6 || !this.f127f) {
                return;
            }
            c.f134a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f127f = false;
        }
    }
}
