package com.facebook.t.r;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.t.g;
import java.lang.ref.WeakReference;

/* compiled from: RCTCodelessLoggingEventListener.java */
/* loaded from: classes.dex */
public class d {

    /* compiled from: RCTCodelessLoggingEventListener.java */
    /* loaded from: classes.dex */
    public static class a implements View.OnTouchListener {

        /* renamed from: f, reason: collision with root package name */
        private com.facebook.t.r.g.a f9543f;

        /* renamed from: g, reason: collision with root package name */
        private WeakReference<View> f9544g;

        /* renamed from: h, reason: collision with root package name */
        private WeakReference<View> f9545h;

        /* renamed from: i, reason: collision with root package name */
        private View.OnTouchListener f9546i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f9547j;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: RCTCodelessLoggingEventListener.java */
        /* renamed from: com.facebook.t.r.d$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0146a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f9548f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f9549g;

            RunnableC0146a(String str, Bundle bundle) {
                this.f9548f = str;
                this.f9549g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (com.facebook.internal.a0.f.a.c(this)) {
                    return;
                }
                try {
                    g.j(com.facebook.f.e()).i(this.f9548f, this.f9549g);
                } catch (Throwable th) {
                    com.facebook.internal.a0.f.a.b(th, this);
                }
            }
        }

        public a(com.facebook.t.r.g.a aVar, View view, View view2) {
            this.f9547j = false;
            if (aVar == null || view == null || view2 == null) {
                return;
            }
            this.f9546i = com.facebook.t.r.g.f.h(view2);
            this.f9543f = aVar;
            this.f9544g = new WeakReference<>(view2);
            this.f9545h = new WeakReference<>(view);
            this.f9547j = true;
        }

        private void b() {
            com.facebook.t.r.g.a aVar = this.f9543f;
            if (aVar == null) {
                return;
            }
            String b2 = aVar.b();
            Bundle f2 = c.f(this.f9543f, this.f9545h.get(), this.f9544g.get());
            if (f2.containsKey("_valueToSum")) {
                f2.putDouble("_valueToSum", com.facebook.t.u.b.g(f2.getString("_valueToSum")));
            }
            f2.putString("_is_fb_codeless", "1");
            com.facebook.f.m().execute(new RunnableC0146a(b2, f2));
        }

        public boolean a() {
            return this.f9547j;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                b();
            }
            View.OnTouchListener onTouchListener = this.f9546i;
            return onTouchListener != null && onTouchListener.onTouch(view, motionEvent);
        }
    }

    public static a a(com.facebook.t.r.g.a aVar, View view, View view2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            return new a(aVar, view, view2);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }
}
