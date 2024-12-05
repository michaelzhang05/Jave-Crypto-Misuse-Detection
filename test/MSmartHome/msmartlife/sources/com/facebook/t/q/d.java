package com.facebook.t.q;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.facebook.t.m;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* compiled from: MetadataViewObserver.java */
/* loaded from: classes.dex */
final class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: f, reason: collision with root package name */
    private static final String f9502f = d.class.getCanonicalName();

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Integer, d> f9503g = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    private WeakReference<Activity> f9506j;

    /* renamed from: h, reason: collision with root package name */
    private final Set<String> f9504h = new HashSet();

    /* renamed from: i, reason: collision with root package name */
    private final Handler f9505i = new Handler(Looper.getMainLooper());

    /* renamed from: k, reason: collision with root package name */
    private AtomicBoolean f9507k = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetadataViewObserver.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f9508f;

        a(View view) {
            this.f9508f = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                View view = this.f9508f;
                if (view instanceof EditText) {
                    d.a(d.this, view);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    private d(Activity activity) {
        this.f9506j = new WeakReference<>(activity);
    }

    static /* synthetic */ void a(d dVar, View view) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            dVar.d(view);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    private static String b(String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return null;
        }
        try {
            return "r2".equals(str) ? str2.replaceAll("[^\\d.]", HttpUrl.FRAGMENT_ENCODE_SET) : str2;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
            return null;
        }
    }

    private void c(View view) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            f(new a(view));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    private void d(View view) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
            if (!lowerCase.isEmpty() && !this.f9504h.contains(lowerCase) && lowerCase.length() <= 100) {
                this.f9504h.add(lowerCase);
                HashMap hashMap = new HashMap();
                List<String> b2 = b.b(view);
                List<String> list = null;
                for (c cVar : c.e()) {
                    String b3 = b(cVar.d(), lowerCase);
                    if (cVar.f().isEmpty() || b.f(b3, cVar.f())) {
                        if (b.e(b2, cVar.c())) {
                            e(hashMap, cVar.d(), b3);
                        } else {
                            if (list == null) {
                                list = b.a(view);
                            }
                            if (b.e(list, cVar.c())) {
                                e(hashMap, cVar.d(), b3);
                            }
                        }
                    }
                }
                m.m(hashMap);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    private static void e(Map<String, String> map, String str, String str2) {
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        char c2 = 65535;
        try {
            switch (str.hashCode()) {
                case 3585:
                    if (str.equals("r3")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3586:
                    if (str.equals("r4")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3587:
                    if (str.equals("r5")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3588:
                    if (str.equals("r6")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                if (!str2.startsWith("m") && !str2.startsWith("b") && !str2.startsWith("ge")) {
                    str2 = "f";
                }
                str2 = "m";
            } else if (c2 != 1 && c2 != 2) {
                if (c2 == 3 && str2.contains("-")) {
                    str2 = str2.split("-")[0];
                }
            } else {
                str2 = str2.replaceAll("[^a-z]+", HttpUrl.FRAGMENT_ENCODE_SET);
            }
            map.put(str, str2);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    private void f(Runnable runnable) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f9505i.post(runnable);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    private void g() {
        View e2;
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (this.f9507k.getAndSet(true) || (e2 = com.facebook.t.u.b.e(this.f9506j.get())) == null) {
                return;
            }
            ViewTreeObserver viewTreeObserver = e2.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalFocusChangeListener(this);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(Activity activity) {
        d dVar;
        if (com.facebook.internal.a0.f.a.c(d.class)) {
            return;
        }
        try {
            int hashCode = activity.hashCode();
            Map<Integer, d> map = f9503g;
            if (!map.containsKey(Integer.valueOf(hashCode))) {
                dVar = new d(activity);
                map.put(Integer.valueOf(activity.hashCode()), dVar);
            } else {
                dVar = map.get(Integer.valueOf(hashCode));
            }
            dVar.g();
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, d.class);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(View view, View view2) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        if (view != null) {
            try {
                c(view);
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
                return;
            }
        }
        if (view2 != null) {
            c(view2);
        }
    }
}
