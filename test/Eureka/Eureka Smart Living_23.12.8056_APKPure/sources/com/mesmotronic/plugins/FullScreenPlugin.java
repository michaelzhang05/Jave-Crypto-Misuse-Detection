package com.mesmotronic.plugins;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import org.apache.cordova.f;
import org.json.JSONArray;

/* loaded from: classes.dex */
public class FullScreenPlugin extends org.apache.cordova.b {
    public static final String ACTION_IMMERSIVE_HEIGHT = "immersiveHeight";
    public static final String ACTION_IMMERSIVE_MODE = "immersiveMode";
    public static final String ACTION_IMMERSIVE_WIDTH = "immersiveWidth";
    public static final String ACTION_IS_IMMERSIVE_MODE_SUPPORTED = "isImmersiveModeSupported";
    public static final String ACTION_IS_SUPPORTED = "isSupported";
    public static final String ACTION_LEAN_MODE = "leanMode";
    public static final String ACTION_RESET_WINDOW = "resetScreen";
    public static final String ACTION_SET_SYSTEM_UI_VISIBILITY = "setSystemUiVisibility";
    public static final String ACTION_SHOW_SYSTEM_UI = "showSystemUI";
    public static final String ACTION_SHOW_UNDER_STATUS_BAR = "showUnderStatusBar";
    public static final String ACTION_SHOW_UNDER_SYSTEM_UI = "showUnderSystemUI";

    /* renamed from: c, reason: collision with root package name */
    private org.apache.cordova.a f6048c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f6049d;

    /* renamed from: e, reason: collision with root package name */
    private Window f6050e;

    /* renamed from: f, reason: collision with root package name */
    private View f6051f;

    /* renamed from: g, reason: collision with root package name */
    private int f6052g = 0;

    /* renamed from: h, reason: collision with root package name */
    private final Handler f6053h = new Handler();

    /* renamed from: i, reason: collision with root package name */
    private final Runnable f6054i = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: com.mesmotronic.plugins.FullScreenPlugin$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class ViewOnFocusChangeListenerC0093a implements View.OnFocusChangeListener {
            ViewOnFocusChangeListenerC0093a() {
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z5) {
                if (z5) {
                    FullScreenPlugin.this.f6051f.setSystemUiVisibility(5894);
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements View.OnSystemUiVisibilityChangeListener {
            b() {
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i6) {
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(5894);
            }
        }

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullScreenPlugin.this.q();
                FullScreenPlugin.this.f6050e.addFlags(1024);
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(5894);
                FullScreenPlugin.this.f6051f.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0093a());
                FullScreenPlugin.this.f6051f.setOnSystemUiVisibilityChangeListener(new b());
                FullScreenPlugin.this.f6048c.success();
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6058a;

        b(int i6) {
            this.f6058a = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullScreenPlugin.this.q();
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(this.f6058a);
                FullScreenPlugin.this.f6048c.success();
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullScreenPlugin.this.n();
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m5.h f6061a;

        d(m5.h hVar) {
            this.f6061a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f6061a.getActivity().getWindow().clearFlags(2048);
            FullScreenPlugin fullScreenPlugin = FullScreenPlugin.this;
            fullScreenPlugin.r(((org.apache.cordova.b) fullScreenPlugin).f8369a.c("StatusBarBackgroundColor", "#000000"));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Point point = new Point();
                FullScreenPlugin.this.f6051f.getDisplay().getRealSize(point);
                FullScreenPlugin.this.f6048c.sendPluginResult(new org.apache.cordova.f(f.a.OK, point.x));
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Point point = new Point();
                FullScreenPlugin.this.f6051f.getDisplay().getRealSize(point);
                FullScreenPlugin.this.f6048c.sendPluginResult(new org.apache.cordova.f(f.a.OK, point.y));
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Runnable {

        /* loaded from: classes.dex */
        class a implements View.OnSystemUiVisibilityChangeListener {
            a() {
            }

            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i6) {
                if ((FullScreenPlugin.this.f6052g & 2) != 0 && (i6 & 2) == 0) {
                    FullScreenPlugin.this.o();
                }
                FullScreenPlugin.this.f6052g = i6;
            }
        }

        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullScreenPlugin.this.q();
                FullScreenPlugin.this.f6052g = 1798;
                FullScreenPlugin.this.f6051f.setOnSystemUiVisibilityChangeListener(new a());
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(1798);
                FullScreenPlugin.this.f6048c.success();
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullScreenPlugin.this.q();
                FullScreenPlugin.this.f6050e.clearFlags(201327616);
                FullScreenPlugin.this.f6051f.setOnSystemUiVisibilityChangeListener(null);
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(0);
                FullScreenPlugin.this.f6048c.sendPluginResult(new org.apache.cordova.f(f.a.OK, true));
                FullScreenPlugin.this.f6048c.success();
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullScreenPlugin.this.q();
                FullScreenPlugin.this.f6050e.setFlags(67108864, 67108864);
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(1792);
                FullScreenPlugin.this.f6048c.success();
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(0);
                FullScreenPlugin.this.f6048c.success();
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullScreenPlugin.this.q();
                FullScreenPlugin.this.f6050e.setFlags(134217728, 134217728);
                FullScreenPlugin.this.f6050e.setFlags(67108864, 67108864);
                FullScreenPlugin.this.f6051f.setSystemUiVisibility(768);
                FullScreenPlugin.this.f6048c.success();
            } catch (Exception e6) {
                FullScreenPlugin.this.f6048c.error(e6.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.f6053h.removeCallbacks(this.f6054i);
        this.f6053h.postDelayed(this.f6054i, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        Window window = this.f8371cordova.getActivity().getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        try {
            window.getClass().getDeclaredMethod("setStatusBarColor", Integer.TYPE).invoke(window, Integer.valueOf(Color.parseColor(str)));
        } catch (IllegalArgumentException | Exception unused) {
        }
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        this.f6048c = aVar;
        androidx.appcompat.app.c activity = this.f8371cordova.getActivity();
        this.f6049d = activity;
        Window window = activity.getWindow();
        this.f6050e = window;
        this.f6051f = window.getDecorView();
        if (ACTION_IS_SUPPORTED.equals(str)) {
            return m();
        }
        if (ACTION_IS_IMMERSIVE_MODE_SUPPORTED.equals(str)) {
            return l();
        }
        if (ACTION_IMMERSIVE_WIDTH.equals(str)) {
            return k();
        }
        if (ACTION_IMMERSIVE_HEIGHT.equals(str)) {
            return i();
        }
        if (ACTION_LEAN_MODE.equals(str)) {
            return n();
        }
        if (ACTION_SHOW_SYSTEM_UI.equals(str)) {
            return t();
        }
        if (ACTION_SHOW_UNDER_STATUS_BAR.equals(str)) {
            return u();
        }
        if (ACTION_SHOW_UNDER_SYSTEM_UI.equals(str)) {
            return v();
        }
        if (ACTION_IMMERSIVE_MODE.equals(str)) {
            return j();
        }
        if (ACTION_SET_SYSTEM_UI_VISIBILITY.equals(str)) {
            return s(jSONArray.getInt(0));
        }
        if (ACTION_RESET_WINDOW.equals(str)) {
            return p();
        }
        return false;
    }

    protected boolean i() {
        this.f6049d.runOnUiThread(new f());
        return true;
    }

    @Override // org.apache.cordova.b
    public void initialize(m5.h hVar, m5.k kVar) {
        super.initialize(hVar, kVar);
        this.f8371cordova.getActivity().runOnUiThread(new d(hVar));
    }

    protected boolean j() {
        if (l()) {
            this.f6049d.runOnUiThread(new a());
            return true;
        }
        this.f6048c.error("Not supported");
        return false;
    }

    protected boolean k() {
        this.f6049d.runOnUiThread(new e());
        return true;
    }

    protected boolean l() {
        this.f6048c.sendPluginResult(new org.apache.cordova.f(f.a.OK, true));
        return true;
    }

    protected boolean m() {
        this.f6048c.sendPluginResult(new org.apache.cordova.f(f.a.OK, true));
        return true;
    }

    protected boolean n() {
        if (m()) {
            this.f6049d.runOnUiThread(new g());
            return true;
        }
        this.f6048c.error("Not supported");
        return false;
    }

    protected boolean p() {
        this.f6049d.runOnUiThread(new j());
        return true;
    }

    protected void q() {
        this.f6051f.setOnFocusChangeListener(null);
        this.f6051f.setOnSystemUiVisibilityChangeListener(null);
        this.f6050e.clearFlags(2048);
    }

    protected boolean s(int i6) {
        if (m()) {
            this.f6049d.runOnUiThread(new b(i6));
            return true;
        }
        this.f6048c.error("Not supported");
        return false;
    }

    protected boolean t() {
        if (m()) {
            this.f6049d.runOnUiThread(new h());
            return true;
        }
        this.f6048c.error("Not supported");
        return false;
    }

    protected boolean u() {
        if (l()) {
            this.f6049d.runOnUiThread(new i());
            return true;
        }
        this.f6048c.error("Not supported");
        return false;
    }

    protected boolean v() {
        if (l()) {
            this.f6049d.runOnUiThread(new k());
            return true;
        }
        this.f6048c.error("Not supported");
        return false;
    }
}
