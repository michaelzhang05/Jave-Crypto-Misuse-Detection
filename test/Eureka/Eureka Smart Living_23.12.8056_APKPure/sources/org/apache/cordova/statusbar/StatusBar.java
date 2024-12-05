package org.apache.cordova.statusbar;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import java.util.Arrays;
import m5.k;
import m5.o;
import org.apache.cordova.f;
import org.json.JSONException;

/* loaded from: classes.dex */
public class StatusBar extends org.apache.cordova.b {

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m5.h f8584a;

        a(m5.h hVar) {
            this.f8584a = hVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8584a.getActivity().getWindow().clearFlags(2048);
            StatusBar statusBar = StatusBar.this;
            statusBar.i(((org.apache.cordova.b) statusBar).f8369a.a("StatusBarOverlaysWebView", true));
            StatusBar statusBar2 = StatusBar.this;
            statusBar2.g(((org.apache.cordova.b) statusBar2).f8369a.c("StatusBarBackgroundColor", "#000000"));
            String c6 = ((org.apache.cordova.b) StatusBar.this).f8369a.c("StatusBarStyle", "lightcontent");
            if (c6.equalsIgnoreCase("blacktranslucent") || c6.equalsIgnoreCase("blackopaque")) {
                o.g("StatusBar", c6 + " is deprecated and will be removed in next major release, use lightcontent");
            }
            StatusBar.this.h(c6);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f8586a;

        b(Window window) {
            this.f8586a = window;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8586a.getDecorView().setSystemUiVisibility(this.f8586a.getDecorView().getSystemUiVisibility() & (-1025) & (-5));
            this.f8586a.clearFlags(1024);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Window f8588a;

        c(Window window) {
            this.f8588a = window;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8588a.getDecorView().setSystemUiVisibility(this.f8588a.getDecorView().getSystemUiVisibility() | 1024 | 4);
            this.f8588a.addFlags(1024);
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m5.e f8590a;

        d(m5.e eVar) {
            this.f8590a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatusBar.this.g(this.f8590a.b(0));
            } catch (JSONException unused) {
                o.c("StatusBar", "Invalid hexString argument, use f.i. '#777777'");
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m5.e f8592a;

        e(m5.e eVar) {
            this.f8592a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                StatusBar.this.i(this.f8592a.a(0));
            } catch (JSONException unused) {
                o.c("StatusBar", "Invalid boolean argument");
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StatusBar.this.h("default");
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StatusBar.this.h("lightcontent");
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {
        h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StatusBar.this.h("blacktranslucent");
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StatusBar.this.h("blackopaque");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        Window window = this.f8371cordova.getActivity().getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        try {
            window.getClass().getMethod("setStatusBarColor", Integer.TYPE).invoke(window, Integer.valueOf(Color.parseColor(str)));
        } catch (IllegalArgumentException unused) {
            o.c("StatusBar", "Invalid hexString argument, use f.i. '#999999'");
        } catch (Exception unused2) {
            o.g("StatusBar", "Method window.setStatusBarColor not found for SDK level " + Build.VERSION.SDK_INT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        int i6;
        if (Build.VERSION.SDK_INT < 23 || str == null || str.isEmpty()) {
            return;
        }
        View decorView = this.f8371cordova.getActivity().getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        String[] strArr = {"lightcontent", "blacktranslucent", "blackopaque"};
        if (Arrays.asList("default").contains(str.toLowerCase())) {
            i6 = systemUiVisibility | 8192;
        } else {
            if (!Arrays.asList(strArr).contains(str.toLowerCase())) {
                o.c("StatusBar", "Invalid style, must be either 'default', 'lightcontent' or the deprecated 'blacktranslucent' and 'blackopaque'");
                return;
            }
            i6 = systemUiVisibility & (-8193);
        }
        decorView.setSystemUiVisibility(i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z5) {
        Window window = this.f8371cordova.getActivity().getWindow();
        if (!z5) {
            window.getDecorView().setSystemUiVisibility(256);
        } else {
            window.getDecorView().setSystemUiVisibility(1280);
            window.setStatusBarColor(0);
        }
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, m5.e eVar, org.apache.cordova.a aVar) {
        o.f("StatusBar", "Executing action: " + str);
        Window window = this.f8371cordova.getActivity().getWindow();
        if ("_ready".equals(str)) {
            aVar.sendPluginResult(new org.apache.cordova.f(f.a.OK, (window.getAttributes().flags & 1024) == 0));
            return true;
        }
        if ("show".equals(str)) {
            this.f8371cordova.getActivity().runOnUiThread(new b(window));
            return true;
        }
        if ("hide".equals(str)) {
            this.f8371cordova.getActivity().runOnUiThread(new c(window));
            return true;
        }
        if ("backgroundColorByHexString".equals(str)) {
            this.f8371cordova.getActivity().runOnUiThread(new d(eVar));
            return true;
        }
        if ("overlaysWebView".equals(str)) {
            this.f8371cordova.getActivity().runOnUiThread(new e(eVar));
            return true;
        }
        if ("styleDefault".equals(str)) {
            this.f8371cordova.getActivity().runOnUiThread(new f());
            return true;
        }
        if ("styleLightContent".equals(str)) {
            this.f8371cordova.getActivity().runOnUiThread(new g());
            return true;
        }
        if ("styleBlackTranslucent".equals(str)) {
            this.f8371cordova.getActivity().runOnUiThread(new h());
            return true;
        }
        if (!"styleBlackOpaque".equals(str)) {
            return false;
        }
        this.f8371cordova.getActivity().runOnUiThread(new i());
        return true;
    }

    @Override // org.apache.cordova.b
    public void initialize(m5.h hVar, k kVar) {
        o.f("StatusBar", "StatusBar: initialization");
        super.initialize(hVar, kVar);
        this.f8371cordova.getActivity().runOnUiThread(new a(hVar));
    }
}
