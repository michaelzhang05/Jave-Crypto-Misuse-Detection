package com.facebook.t.r;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import cm.aptoide.pt.install.installer.RootCommandOnSubscribe;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.i;
import com.facebook.internal.p;
import com.facebook.internal.r;
import com.facebook.internal.x;
import com.facebook.l;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewIndexer.java */
/* loaded from: classes.dex */
public class e {
    private static final String a = "com.facebook.t.r.e";

    /* renamed from: b, reason: collision with root package name */
    private static e f9551b;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference<Activity> f9553d;

    /* renamed from: e, reason: collision with root package name */
    private Timer f9554e;

    /* renamed from: f, reason: collision with root package name */
    private String f9555f = null;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f9552c = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* loaded from: classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                Activity activity = (Activity) e.a(e.this).get();
                View e2 = com.facebook.t.u.b.e(activity);
                if (activity != null && e2 != null) {
                    String simpleName = activity.getClass().getSimpleName();
                    if (com.facebook.t.r.b.k()) {
                        if (p.b()) {
                            com.facebook.t.r.g.e.a();
                            return;
                        }
                        FutureTask futureTask = new FutureTask(new CallableC0147e(e2));
                        e.b(e.this).post(futureTask);
                        String str = HttpUrl.FRAGMENT_ENCODE_SET;
                        try {
                            str = (String) futureTask.get(1L, TimeUnit.SECONDS);
                        } catch (Exception e3) {
                            Log.e(e.c(), "Failed to take screenshot.", e3);
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("screenname", simpleName);
                            jSONObject.put("screenshot", str);
                            JSONArray jSONArray = new JSONArray();
                            jSONArray.put(com.facebook.t.r.g.f.d(e2));
                            jSONObject.put("view", jSONArray);
                        } catch (JSONException unused) {
                            Log.e(e.c(), "Failed to create JSONObject");
                        }
                        e.d(e.this, jSONObject.toString());
                    }
                }
            } catch (Exception e4) {
                Log.e(e.c(), "UI Component tree indexing failure!", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ TimerTask f9557f;

        b(TimerTask timerTask) {
            this.f9557f = timerTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                try {
                    if (e.e(e.this) != null) {
                        e.e(e.this).cancel();
                    }
                    e.h(e.this, null);
                    e.f(e.this, new Timer());
                    e.e(e.this).scheduleAtFixedRate(this.f9557f, 0L, 1000L);
                } catch (Exception e2) {
                    Log.e(e.c(), "Error scheduling indexing job", e2);
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9559f;

        c(String str) {
            this.f9559f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            GraphRequest i2;
            if (com.facebook.internal.a0.f.a.c(this)) {
                return;
            }
            try {
                String Y = x.Y(this.f9559f);
                AccessToken g2 = AccessToken.g();
                if ((Y == null || !Y.equals(e.g(e.this))) && (i2 = e.i(this.f9559f, g2, com.facebook.f.f(), "app_indexing")) != null) {
                    i g3 = i2.g();
                    try {
                        JSONObject h2 = g3.h();
                        if (h2 != null) {
                            if ("true".equals(h2.optString(RootCommandOnSubscribe.SUCCESS_OUTPUT_CONFIRMATION))) {
                                r.g(l.APP_EVENTS, e.c(), "Successfully send UI component tree to server");
                                e.h(e.this, Y);
                            }
                            if (h2.has("is_app_indexing_enabled")) {
                                com.facebook.t.r.b.o(Boolean.valueOf(h2.getBoolean("is_app_indexing_enabled")));
                                return;
                            }
                            return;
                        }
                        Log.e(e.c(), "Error sending UI component tree to Facebook: " + g3.g());
                    } catch (JSONException e2) {
                        Log.e(e.c(), "Error decoding server response.", e2);
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.a0.f.a.b(th, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ViewIndexer.java */
    /* loaded from: classes.dex */
    public static class d implements GraphRequest.f {
        d() {
        }

        @Override // com.facebook.GraphRequest.f
        public void b(i iVar) {
            r.g(l.APP_EVENTS, e.c(), "App index sent to FB!");
        }
    }

    /* compiled from: ViewIndexer.java */
    /* renamed from: com.facebook.t.r.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class CallableC0147e implements Callable<String> {

        /* renamed from: f, reason: collision with root package name */
        private WeakReference<View> f9561f;

        CallableC0147e(View view) {
            this.f9561f = new WeakReference<>(view);
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String call() {
            View view = this.f9561f.get();
            if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                return HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
            view.draw(new Canvas(createBitmap));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }
    }

    public e(Activity activity) {
        this.f9553d = new WeakReference<>(activity);
        f9551b = this;
    }

    static /* synthetic */ WeakReference a(e eVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return eVar.f9553d;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ Handler b(e eVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return eVar.f9552c;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ String c() {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return a;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ void d(e eVar, String str) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return;
        }
        try {
            eVar.k(str);
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
        }
    }

    static /* synthetic */ Timer e(e eVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return eVar.f9554e;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ Timer f(e eVar, Timer timer) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            eVar.f9554e = timer;
            return timer;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ String g(e eVar) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            return eVar.f9555f;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    static /* synthetic */ String h(e eVar, String str) {
        if (com.facebook.internal.a0.f.a.c(e.class)) {
            return null;
        }
        try {
            eVar.f9555f = str;
            return str;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    public static GraphRequest i(String str, AccessToken accessToken, String str2, String str3) {
        if (com.facebook.internal.a0.f.a.c(e.class) || str == null) {
            return null;
        }
        try {
            GraphRequest L = GraphRequest.L(accessToken, String.format(Locale.US, "%s/app_indexing", str2), null, null);
            Bundle y = L.y();
            if (y == null) {
                y = new Bundle();
            }
            y.putString("tree", str);
            y.putString("app_version", com.facebook.t.u.b.d());
            y.putString("platform", "android");
            y.putString("request_type", str3);
            if (str3.equals("app_indexing")) {
                y.putString("device_session_id", com.facebook.t.r.b.j());
            }
            L.a0(y);
            L.W(new d());
            return L;
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, e.class);
            return null;
        }
    }

    private void k(String str) {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            com.facebook.f.m().execute(new c(str));
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    public void j() {
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            try {
                com.facebook.f.m().execute(new b(new a()));
            } catch (RejectedExecutionException e2) {
                Log.e(a, "Error scheduling indexing job", e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }

    public void l() {
        Timer timer;
        if (com.facebook.internal.a0.f.a.c(this)) {
            return;
        }
        try {
            if (this.f9553d.get() == null || (timer = this.f9554e) == null) {
                return;
            }
            try {
                timer.cancel();
                this.f9554e = null;
            } catch (Exception e2) {
                Log.e(a, "Error unscheduling indexing job", e2);
            }
        } catch (Throwable th) {
            com.facebook.internal.a0.f.a.b(th, this);
        }
    }
}
