package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.b;
import androidx.appcompat.view.f;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.a2;
import androidx.appcompat.widget.o3;
import androidx.appcompat.widget.p3;
import androidx.core.content.res.h;
import androidx.core.view.b1;
import androidx.core.view.c3;
import androidx.core.view.w0;
import androidx.core.view.w2;
import androidx.core.view.x;
import androidx.core.view.y2;
import androidx.lifecycle.h;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k extends androidx.appcompat.app.g implements g.a, LayoutInflater.Factory2 {

    /* renamed from: j0, reason: collision with root package name */
    private static final l.g f343j0 = new l.g();

    /* renamed from: k0, reason: collision with root package name */
    private static final boolean f344k0 = false;

    /* renamed from: l0, reason: collision with root package name */
    private static final int[] f345l0 = {R.attr.windowBackground};

    /* renamed from: m0, reason: collision with root package name */
    private static final boolean f346m0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: n0, reason: collision with root package name */
    private static final boolean f347n0 = true;
    private boolean A;
    ViewGroup B;
    private TextView C;
    private View D;
    private boolean E;
    private boolean F;
    boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    private boolean L;
    private s[] M;
    private s N;
    private boolean O;
    private boolean P;
    private boolean Q;
    boolean R;
    private Configuration S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private o X;
    private o Y;
    boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    int f348a0;

    /* renamed from: b0, reason: collision with root package name */
    private final Runnable f349b0;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f350c0;

    /* renamed from: d0, reason: collision with root package name */
    private Rect f351d0;

    /* renamed from: e0, reason: collision with root package name */
    private Rect f352e0;

    /* renamed from: f0, reason: collision with root package name */
    private w f353f0;

    /* renamed from: g0, reason: collision with root package name */
    private a0 f354g0;

    /* renamed from: h0, reason: collision with root package name */
    private OnBackInvokedDispatcher f355h0;

    /* renamed from: i0, reason: collision with root package name */
    private OnBackInvokedCallback f356i0;

    /* renamed from: j, reason: collision with root package name */
    final Object f357j;

    /* renamed from: k, reason: collision with root package name */
    final Context f358k;

    /* renamed from: l, reason: collision with root package name */
    Window f359l;

    /* renamed from: m, reason: collision with root package name */
    private m f360m;

    /* renamed from: n, reason: collision with root package name */
    final androidx.appcompat.app.d f361n;

    /* renamed from: o, reason: collision with root package name */
    androidx.appcompat.app.a f362o;

    /* renamed from: p, reason: collision with root package name */
    MenuInflater f363p;

    /* renamed from: q, reason: collision with root package name */
    private CharSequence f364q;

    /* renamed from: r, reason: collision with root package name */
    private a2 f365r;

    /* renamed from: s, reason: collision with root package name */
    private f f366s;

    /* renamed from: t, reason: collision with root package name */
    private t f367t;

    /* renamed from: u, reason: collision with root package name */
    androidx.appcompat.view.b f368u;

    /* renamed from: v, reason: collision with root package name */
    ActionBarContextView f369v;

    /* renamed from: w, reason: collision with root package name */
    PopupWindow f370w;

    /* renamed from: x, reason: collision with root package name */
    Runnable f371x;

    /* renamed from: y, reason: collision with root package name */
    w2 f372y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f373z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            if ((kVar.f348a0 & 1) != 0) {
                kVar.f0(0);
            }
            k kVar2 = k.this;
            if ((kVar2.f348a0 & 4096) != 0) {
                kVar2.f0(108);
            }
            k kVar3 = k.this;
            kVar3.Z = false;
            kVar3.f348a0 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements w0 {
        b() {
        }

        @Override // androidx.core.view.w0
        public c3 a(View view, c3 c3Var) {
            int k6 = c3Var.k();
            int c12 = k.this.c1(c3Var, null);
            if (k6 != c12) {
                c3Var = c3Var.p(c3Var.i(), c12, c3Var.j(), c3Var.h());
            }
            return b1.c0(view, c3Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            k.this.d0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* loaded from: classes.dex */
        class a extends y2 {
            a() {
            }

            @Override // androidx.core.view.x2
            public void a(View view) {
                k.this.f369v.setAlpha(1.0f);
                k.this.f372y.h(null);
                k.this.f372y = null;
            }

            @Override // androidx.core.view.y2, androidx.core.view.x2
            public void b(View view) {
                k.this.f369v.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f370w.showAtLocation(kVar.f369v, 55, 0, 0);
            k.this.g0();
            if (!k.this.R0()) {
                k.this.f369v.setAlpha(1.0f);
                k.this.f369v.setVisibility(0);
            } else {
                k.this.f369v.setAlpha(0.0f);
                k kVar2 = k.this;
                kVar2.f372y = b1.e(kVar2.f369v).b(1.0f);
                k.this.f372y.h(new a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends y2 {
        e() {
        }

        @Override // androidx.core.view.x2
        public void a(View view) {
            k.this.f369v.setAlpha(1.0f);
            k.this.f372y.h(null);
            k.this.f372y = null;
        }

        @Override // androidx.core.view.y2, androidx.core.view.x2
        public void b(View view) {
            k.this.f369v.setVisibility(0);
            if (k.this.f369v.getParent() instanceof View) {
                b1.n0((View) k.this.f369v.getParent());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class f implements m.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z5) {
            k.this.W(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback s02 = k.this.s0();
            if (s02 == null) {
                return true;
            }
            s02.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f381a;

        /* loaded from: classes.dex */
        class a extends y2 {
            a() {
            }

            @Override // androidx.core.view.x2
            public void a(View view) {
                k.this.f369v.setVisibility(8);
                k kVar = k.this;
                PopupWindow popupWindow = kVar.f370w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (kVar.f369v.getParent() instanceof View) {
                    b1.n0((View) k.this.f369v.getParent());
                }
                k.this.f369v.k();
                k.this.f372y.h(null);
                k kVar2 = k.this;
                kVar2.f372y = null;
                b1.n0(kVar2.B);
            }
        }

        public g(b.a aVar) {
            this.f381a = aVar;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean a(androidx.appcompat.view.b bVar, Menu menu) {
            b1.n0(k.this.B);
            return this.f381a.a(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            return this.f381a.b(bVar, menuItem);
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            return this.f381a.c(bVar, menu);
        }

        @Override // androidx.appcompat.view.b.a
        public void d(androidx.appcompat.view.b bVar) {
            this.f381a.d(bVar);
            k kVar = k.this;
            if (kVar.f370w != null) {
                kVar.f359l.getDecorView().removeCallbacks(k.this.f371x);
            }
            k kVar2 = k.this;
            if (kVar2.f369v != null) {
                kVar2.g0();
                k kVar3 = k.this;
                kVar3.f372y = b1.e(kVar3.f369v).b(0.0f);
                k.this.f372y.h(new a());
            }
            k kVar4 = k.this;
            androidx.appcompat.app.d dVar = kVar4.f361n;
            if (dVar != null) {
                dVar.o(kVar4.f368u);
            }
            k kVar5 = k.this;
            kVar5.f368u = null;
            b1.n0(kVar5.B);
            k.this.a1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i6 = configuration.densityDpi;
            int i7 = configuration2.densityDpi;
            if (i6 != i7) {
                configuration3.densityDpi = i7;
            }
        }

        static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class i {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class j {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        static androidx.core.os.i b(Configuration configuration) {
            LocaleList locales;
            String languageTags;
            locales = configuration.getLocales();
            languageTags = locales.toLanguageTags();
            return androidx.core.os.i.c(languageTags);
        }

        public static void c(androidx.core.os.i iVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(iVar.h());
            LocaleList.setDefault(forLanguageTags);
        }

        static void d(Configuration configuration, androidx.core.os.i iVar) {
            LocaleList forLanguageTags;
            forLanguageTags = LocaleList.forLanguageTags(iVar.h());
            configuration.setLocales(forLanguageTags);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.k$k, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0009k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            i6 = configuration.colorMode;
            int i14 = i6 & 3;
            i7 = configuration2.colorMode;
            if (i14 != (i7 & 3)) {
                i12 = configuration3.colorMode;
                i13 = configuration2.colorMode;
                configuration3.colorMode = i12 | (i13 & 3);
            }
            i8 = configuration.colorMode;
            int i15 = i8 & 12;
            i9 = configuration2.colorMode;
            if (i15 != (i9 & 12)) {
                i10 = configuration3.colorMode;
                i11 = configuration2.colorMode;
                configuration3.colorMode = i10 | (i11 & 12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class l {
        static OnBackInvokedDispatcher a(Activity activity) {
            OnBackInvokedDispatcher onBackInvokedDispatcher;
            onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
            return onBackInvokedDispatcher;
        }

        static OnBackInvokedCallback b(Object obj, final k kVar) {
            Objects.requireNonNull(kVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: androidx.appcompat.app.s
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    k.this.A0();
                }
            };
            androidx.activity.n.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void c(Object obj, Object obj2) {
            androidx.activity.n.a(obj).unregisterOnBackInvokedCallback(androidx.activity.o.a(obj2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m extends androidx.appcompat.view.k {

        /* renamed from: b, reason: collision with root package name */
        private boolean f384b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f385c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f386d;

        m(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f385c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f385c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f384b = true;
                callback.onContentChanged();
            } finally {
                this.f384b = false;
            }
        }

        public void d(Window.Callback callback, int i6, Menu menu) {
            try {
                this.f386d = true;
                callback.onPanelClosed(i6, menu);
            } finally {
                this.f386d = false;
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f385c ? a().dispatchKeyEvent(keyEvent) : k.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || k.this.D0(keyEvent.getKeyCode(), keyEvent);
        }

        final ActionMode e(ActionMode.Callback callback) {
            f.a aVar = new f.a(k.this.f358k, callback);
            androidx.appcompat.view.b U0 = k.this.U0(aVar);
            if (U0 != null) {
                return aVar.e(U0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f384b) {
                a().onContentChanged();
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i6, Menu menu) {
            if (i6 != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i6, menu);
            }
            return false;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public View onCreatePanelView(int i6) {
            return super.onCreatePanelView(i6);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onMenuOpened(int i6, Menu menu) {
            super.onMenuOpened(i6, menu);
            k.this.G0(i6);
            return true;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public void onPanelClosed(int i6, Menu menu) {
            if (this.f386d) {
                a().onPanelClosed(i6, menu);
            } else {
                super.onPanelClosed(i6, menu);
                k.this.H0(i6);
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public boolean onPreparePanel(int i6, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i6 == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i6, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i6) {
            androidx.appcompat.view.menu.g gVar;
            s q02 = k.this.q0(0, true);
            if (q02 == null || (gVar = q02.f405j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i6);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i6);
            }
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return k.this.y0() ? e(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // androidx.appcompat.view.k, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i6) {
            return (k.this.y0() && i6 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class n extends o {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f388c;

        n(Context context) {
            super();
            this.f388c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.k.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.k.o
        public int c() {
            return i.a(this.f388c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.k.o
        public void d() {
            k.this.Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public abstract class o {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f390a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                o.this.d();
            }
        }

        o() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f390a;
            if (broadcastReceiver != null) {
                try {
                    k.this.f358k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f390a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b6 = b();
            if (b6 == null || b6.countActions() == 0) {
                return;
            }
            if (this.f390a == null) {
                this.f390a = new a();
            }
            k.this.f358k.registerReceiver(this.f390a, b6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class p extends o {

        /* renamed from: c, reason: collision with root package name */
        private final e0 f393c;

        p(e0 e0Var) {
            super();
            this.f393c = e0Var;
        }

        @Override // androidx.appcompat.app.k.o
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.k.o
        public int c() {
            return this.f393c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.k.o
        public void d() {
            k.this.Q();
        }
    }

    /* loaded from: classes.dex */
    private static class q {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class r extends ContentFrameLayout {
        public r(Context context) {
            super(context);
        }

        private boolean b(int i6, int i7) {
            return i6 < -5 || i7 < -5 || i6 > getWidth() + 5 || i7 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return k.this.e0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            k.this.Y(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i6) {
            setBackgroundDrawable(e.a.b(getContext(), i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class s {

        /* renamed from: a, reason: collision with root package name */
        int f396a;

        /* renamed from: b, reason: collision with root package name */
        int f397b;

        /* renamed from: c, reason: collision with root package name */
        int f398c;

        /* renamed from: d, reason: collision with root package name */
        int f399d;

        /* renamed from: e, reason: collision with root package name */
        int f400e;

        /* renamed from: f, reason: collision with root package name */
        int f401f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f402g;

        /* renamed from: h, reason: collision with root package name */
        View f403h;

        /* renamed from: i, reason: collision with root package name */
        View f404i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.g f405j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.e f406k;

        /* renamed from: l, reason: collision with root package name */
        Context f407l;

        /* renamed from: m, reason: collision with root package name */
        boolean f408m;

        /* renamed from: n, reason: collision with root package name */
        boolean f409n;

        /* renamed from: o, reason: collision with root package name */
        boolean f410o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f411p;

        /* renamed from: q, reason: collision with root package name */
        boolean f412q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f413r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f414s;

        s(int i6) {
            this.f396a = i6;
        }

        androidx.appcompat.view.menu.n a(m.a aVar) {
            if (this.f405j == null) {
                return null;
            }
            if (this.f406k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.f407l, d.g.f6223j);
                this.f406k = eVar;
                eVar.h(aVar);
                this.f405j.b(this.f406k);
            }
            return this.f406k.f(this.f402g);
        }

        public boolean b() {
            if (this.f403h == null) {
                return false;
            }
            return this.f404i != null || this.f406k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.f405j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.f406k);
            }
            this.f405j = gVar;
            if (gVar == null || (eVar = this.f406k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(d.a.f6114a, typedValue, true);
            int i6 = typedValue.resourceId;
            if (i6 != 0) {
                newTheme.applyStyle(i6, true);
            }
            newTheme.resolveAttribute(d.a.C, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 == 0) {
                i7 = d.i.f6247b;
            }
            newTheme.applyStyle(i7, true);
            androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f407l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(d.j.f6371y0);
            this.f397b = obtainStyledAttributes.getResourceId(d.j.B0, 0);
            this.f401f = obtainStyledAttributes.getResourceId(d.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class t implements m.a {
        t() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z5) {
            androidx.appcompat.view.menu.g D = gVar.D();
            boolean z6 = D != gVar;
            k kVar = k.this;
            if (z6) {
                gVar = D;
            }
            s j02 = kVar.j0(gVar);
            if (j02 != null) {
                if (!z6) {
                    k.this.Z(j02, z5);
                } else {
                    k.this.V(j02.f396a, j02, D);
                    k.this.Z(j02, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback s02;
            if (gVar != gVar.D()) {
                return true;
            }
            k kVar = k.this;
            if (!kVar.G || (s02 = kVar.s0()) == null || k.this.R) {
                return true;
            }
            s02.onMenuOpened(108, gVar);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    private boolean C0(int i6, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        s q02 = q0(i6, true);
        if (q02.f410o) {
            return false;
        }
        return M0(q02, keyEvent);
    }

    private boolean F0(int i6, KeyEvent keyEvent) {
        boolean z5;
        a2 a2Var;
        if (this.f368u != null) {
            return false;
        }
        boolean z6 = true;
        s q02 = q0(i6, true);
        if (i6 != 0 || (a2Var = this.f365r) == null || !a2Var.g() || ViewConfiguration.get(this.f358k).hasPermanentMenuKey()) {
            boolean z7 = q02.f410o;
            if (z7 || q02.f409n) {
                Z(q02, true);
                z6 = z7;
            } else {
                if (q02.f408m) {
                    if (q02.f413r) {
                        q02.f408m = false;
                        z5 = M0(q02, keyEvent);
                    } else {
                        z5 = true;
                    }
                    if (z5) {
                        J0(q02, keyEvent);
                    }
                }
                z6 = false;
            }
        } else if (this.f365r.c()) {
            z6 = this.f365r.d();
        } else {
            if (!this.R && M0(q02, keyEvent)) {
                z6 = this.f365r.e();
            }
            z6 = false;
        }
        if (z6) {
            AudioManager audioManager = (AudioManager) this.f358k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void J0(androidx.appcompat.app.k.s r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.k.J0(androidx.appcompat.app.k$s, android.view.KeyEvent):void");
    }

    private boolean L0(s sVar, int i6, KeyEvent keyEvent, int i7) {
        androidx.appcompat.view.menu.g gVar;
        boolean z5 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((sVar.f408m || M0(sVar, keyEvent)) && (gVar = sVar.f405j) != null) {
            z5 = gVar.performShortcut(i6, keyEvent, i7);
        }
        if (z5 && (i7 & 1) == 0 && this.f365r == null) {
            Z(sVar, true);
        }
        return z5;
    }

    private boolean M0(s sVar, KeyEvent keyEvent) {
        a2 a2Var;
        a2 a2Var2;
        a2 a2Var3;
        if (this.R) {
            return false;
        }
        if (sVar.f408m) {
            return true;
        }
        s sVar2 = this.N;
        if (sVar2 != null && sVar2 != sVar) {
            Z(sVar2, false);
        }
        Window.Callback s02 = s0();
        if (s02 != null) {
            sVar.f404i = s02.onCreatePanelView(sVar.f396a);
        }
        int i6 = sVar.f396a;
        boolean z5 = i6 == 0 || i6 == 108;
        if (z5 && (a2Var3 = this.f365r) != null) {
            a2Var3.f();
        }
        if (sVar.f404i == null) {
            if (z5) {
                K0();
            }
            androidx.appcompat.view.menu.g gVar = sVar.f405j;
            if (gVar == null || sVar.f413r) {
                if (gVar == null && (!w0(sVar) || sVar.f405j == null)) {
                    return false;
                }
                if (z5 && this.f365r != null) {
                    if (this.f366s == null) {
                        this.f366s = new f();
                    }
                    this.f365r.a(sVar.f405j, this.f366s);
                }
                sVar.f405j.d0();
                if (!s02.onCreatePanelMenu(sVar.f396a, sVar.f405j)) {
                    sVar.c(null);
                    if (z5 && (a2Var = this.f365r) != null) {
                        a2Var.a(null, this.f366s);
                    }
                    return false;
                }
                sVar.f413r = false;
            }
            sVar.f405j.d0();
            Bundle bundle = sVar.f414s;
            if (bundle != null) {
                sVar.f405j.P(bundle);
                sVar.f414s = null;
            }
            if (!s02.onPreparePanel(0, sVar.f404i, sVar.f405j)) {
                if (z5 && (a2Var2 = this.f365r) != null) {
                    a2Var2.a(null, this.f366s);
                }
                sVar.f405j.c0();
                return false;
            }
            boolean z6 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            sVar.f411p = z6;
            sVar.f405j.setQwertyMode(z6);
            sVar.f405j.c0();
        }
        sVar.f408m = true;
        sVar.f409n = false;
        this.N = sVar;
        return true;
    }

    private void N0(boolean z5) {
        a2 a2Var = this.f365r;
        if (a2Var == null || !a2Var.g() || (ViewConfiguration.get(this.f358k).hasPermanentMenuKey() && !this.f365r.b())) {
            s q02 = q0(0, true);
            q02.f412q = true;
            Z(q02, false);
            J0(q02, null);
            return;
        }
        Window.Callback s02 = s0();
        if (this.f365r.c() && z5) {
            this.f365r.d();
            if (this.R) {
                return;
            }
            s02.onPanelClosed(108, q0(0, true).f405j);
            return;
        }
        if (s02 == null || this.R) {
            return;
        }
        if (this.Z && (this.f348a0 & 1) != 0) {
            this.f359l.getDecorView().removeCallbacks(this.f349b0);
            this.f349b0.run();
        }
        s q03 = q0(0, true);
        androidx.appcompat.view.menu.g gVar = q03.f405j;
        if (gVar == null || q03.f413r || !s02.onPreparePanel(0, q03.f404i, gVar)) {
            return;
        }
        s02.onMenuOpened(108, q03.f405j);
        this.f365r.e();
    }

    private boolean O(boolean z5) {
        return P(z5, true);
    }

    private int O0(int i6) {
        if (i6 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i6 != 9) {
            return i6;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean P(boolean z5, boolean z6) {
        if (this.R) {
            return false;
        }
        int U = U();
        int z02 = z0(this.f358k, U);
        androidx.core.os.i T = Build.VERSION.SDK_INT < 33 ? T(this.f358k) : null;
        if (!z6 && T != null) {
            T = p0(this.f358k.getResources().getConfiguration());
        }
        boolean Z0 = Z0(z02, T, z5);
        if (U == 0) {
            o0(this.f358k).e();
        } else {
            o oVar = this.X;
            if (oVar != null) {
                oVar.a();
            }
        }
        if (U == 3) {
            n0(this.f358k).e();
        } else {
            o oVar2 = this.Y;
            if (oVar2 != null) {
                oVar2.a();
            }
        }
        return Z0;
    }

    private void R() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.f359l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f358k.obtainStyledAttributes(d.j.f6371y0);
        obtainStyledAttributes.getValue(d.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(d.j.L0, contentFrameLayout.getMinWidthMinor());
        if (obtainStyledAttributes.hasValue(d.j.I0)) {
            obtainStyledAttributes.getValue(d.j.I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (obtainStyledAttributes.hasValue(d.j.J0)) {
            obtainStyledAttributes.getValue(d.j.J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (obtainStyledAttributes.hasValue(d.j.G0)) {
            obtainStyledAttributes.getValue(d.j.G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (obtainStyledAttributes.hasValue(d.j.H0)) {
            obtainStyledAttributes.getValue(d.j.H0, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void S(Window window) {
        if (this.f359l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof m) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        m mVar = new m(callback);
        this.f360m = mVar;
        window.setCallback(mVar);
        androidx.appcompat.widget.c3 u5 = androidx.appcompat.widget.c3.u(this.f358k, null, f345l0);
        Drawable h6 = u5.h(0);
        if (h6 != null) {
            window.setBackgroundDrawable(h6);
        }
        u5.w();
        this.f359l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f355h0 != null) {
            return;
        }
        K(null);
    }

    private boolean S0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f359l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || b1.T((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private int U() {
        int i6 = this.T;
        return i6 != -100 ? i6 : androidx.appcompat.app.g.m();
    }

    private void W0() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void X() {
        o oVar = this.X;
        if (oVar != null) {
            oVar.a();
        }
        o oVar2 = this.Y;
        if (oVar2 != null) {
            oVar2.a();
        }
    }

    private androidx.appcompat.app.c X0() {
        for (Context context = this.f358k; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Y0(Configuration configuration) {
        Activity activity = (Activity) this.f357j;
        if (activity instanceof androidx.lifecycle.m) {
            if (!((androidx.lifecycle.m) activity).r().b().b(h.b.CREATED)) {
                return;
            }
        } else if (!this.Q || this.R) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean Z0(int r9, androidx.core.os.i r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f358k
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.a0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f358k
            int r1 = r8.m0(r1)
            android.content.res.Configuration r2 = r8.S
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f358k
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            androidx.core.os.i r2 = r8.p0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            androidx.core.os.i r0 = r8.p0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r0 == 0) goto L47
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L47
            r2 = r3 | 4
            r3 = r2 | 8192(0x2000, float:1.148E-41)
        L47:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L71
            if (r11 == 0) goto L71
            boolean r11 = r8.P
            if (r11 == 0) goto L71
            boolean r11 = androidx.appcompat.app.k.f346m0
            if (r11 != 0) goto L5a
            boolean r11 = r8.Q
            if (r11 == 0) goto L71
        L5a:
            java.lang.Object r11 = r8.f357j
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L71
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L71
            java.lang.Object r11 = r8.f357j
            android.app.Activity r11 = (android.app.Activity) r11
            androidx.core.app.b.o(r11)
            r11 = 1
            goto L72
        L71:
            r11 = 0
        L72:
            if (r11 != 0) goto L7f
            if (r3 == 0) goto L7f
            r11 = r3 & r1
            if (r11 != r3) goto L7b
            r6 = 1
        L7b:
            r8.b1(r4, r0, r6, r5)
            goto L80
        L7f:
            r7 = r11
        L80:
            if (r7 == 0) goto L9c
            java.lang.Object r11 = r8.f357j
            boolean r1 = r11 instanceof androidx.appcompat.app.c
            if (r1 == 0) goto L9c
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L91
            androidx.appcompat.app.c r11 = (androidx.appcompat.app.c) r11
            r11.j0(r9)
        L91:
            r9 = r3 & 4
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r8.f357j
            androidx.appcompat.app.c r9 = (androidx.appcompat.app.c) r9
            r9.i0(r10)
        L9c:
            if (r7 == 0) goto Lb1
            if (r0 == 0) goto Lb1
            android.content.Context r9 = r8.f358k
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            androidx.core.os.i r9 = r8.p0(r9)
            r8.Q0(r9)
        Lb1:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.k.Z0(int, androidx.core.os.i, boolean):boolean");
    }

    private Configuration a0(Context context, int i6, androidx.core.os.i iVar, Configuration configuration, boolean z5) {
        int i7 = i6 != 1 ? i6 != 2 ? z5 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i7 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            P0(configuration2, iVar);
        }
        return configuration2;
    }

    private ViewGroup b0() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f358k.obtainStyledAttributes(d.j.f6371y0);
        if (!obtainStyledAttributes.hasValue(d.j.D0)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(d.j.M0, false)) {
            G(1);
        } else if (obtainStyledAttributes.getBoolean(d.j.D0, false)) {
            G(108);
        }
        if (obtainStyledAttributes.getBoolean(d.j.E0, false)) {
            G(109);
        }
        if (obtainStyledAttributes.getBoolean(d.j.F0, false)) {
            G(10);
        }
        this.J = obtainStyledAttributes.getBoolean(d.j.f6376z0, false);
        obtainStyledAttributes.recycle();
        i0();
        this.f359l.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f358k);
        if (this.K) {
            viewGroup = (ViewGroup) from.inflate(this.I ? d.g.f6228o : d.g.f6227n, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) from.inflate(d.g.f6219f, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            this.f358k.getTheme().resolveAttribute(d.a.f6117d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new androidx.appcompat.view.d(this.f358k, typedValue.resourceId) : this.f358k).inflate(d.g.f6229p, (ViewGroup) null);
            a2 a2Var = (a2) viewGroup.findViewById(d.f.f6203p);
            this.f365r = a2Var;
            a2Var.setWindowCallback(s0());
            if (this.H) {
                this.f365r.k(109);
            }
            if (this.E) {
                this.f365r.k(2);
            }
            if (this.F) {
                this.f365r.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.G + ", windowActionBarOverlay: " + this.H + ", android:windowIsFloating: " + this.J + ", windowActionModeOverlay: " + this.I + ", windowNoTitle: " + this.K + " }");
        }
        b1.D0(viewGroup, new b());
        if (this.f365r == null) {
            this.C = (TextView) viewGroup.findViewById(d.f.M);
        }
        p3.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(d.f.f6189b);
        ViewGroup viewGroup2 = (ViewGroup) this.f359l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f359l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void b1(int i6, androidx.core.os.i iVar, boolean z5, Configuration configuration) {
        Resources resources = this.f358k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i6 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            P0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 26) {
            c0.a(resources);
        }
        int i8 = this.U;
        if (i8 != 0) {
            this.f358k.setTheme(i8);
            if (i7 >= 23) {
                this.f358k.getTheme().applyStyle(this.U, true);
            }
        }
        if (z5 && (this.f357j instanceof Activity)) {
            Y0(configuration2);
        }
    }

    private void d1(View view) {
        Context context;
        int i6;
        if ((b1.N(view) & 8192) != 0) {
            context = this.f358k;
            i6 = d.c.f6142b;
        } else {
            context = this.f358k;
            i6 = d.c.f6141a;
        }
        view.setBackgroundColor(androidx.core.content.a.c(context, i6));
    }

    private void h0() {
        if (this.A) {
            return;
        }
        this.B = b0();
        CharSequence r02 = r0();
        if (!TextUtils.isEmpty(r02)) {
            a2 a2Var = this.f365r;
            if (a2Var != null) {
                a2Var.setWindowTitle(r02);
            } else if (K0() != null) {
                K0().t(r02);
            } else {
                TextView textView = this.C;
                if (textView != null) {
                    textView.setText(r02);
                }
            }
        }
        R();
        I0(this.B);
        this.A = true;
        s q02 = q0(0, false);
        if (this.R) {
            return;
        }
        if (q02 == null || q02.f405j == null) {
            x0(108);
        }
    }

    private void i0() {
        if (this.f359l == null) {
            Object obj = this.f357j;
            if (obj instanceof Activity) {
                S(((Activity) obj).getWindow());
            }
        }
        if (this.f359l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration k0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f6 = configuration.fontScale;
            float f7 = configuration2.fontScale;
            if (f6 != f7) {
                configuration3.fontScale = f7;
            }
            int i6 = configuration.mcc;
            int i7 = configuration2.mcc;
            if (i6 != i7) {
                configuration3.mcc = i7;
            }
            int i8 = configuration.mnc;
            int i9 = configuration2.mnc;
            if (i8 != i9) {
                configuration3.mnc = i9;
            }
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 24) {
                j.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i11 = configuration.touchscreen;
            int i12 = configuration2.touchscreen;
            if (i11 != i12) {
                configuration3.touchscreen = i12;
            }
            int i13 = configuration.keyboard;
            int i14 = configuration2.keyboard;
            if (i13 != i14) {
                configuration3.keyboard = i14;
            }
            int i15 = configuration.keyboardHidden;
            int i16 = configuration2.keyboardHidden;
            if (i15 != i16) {
                configuration3.keyboardHidden = i16;
            }
            int i17 = configuration.navigation;
            int i18 = configuration2.navigation;
            if (i17 != i18) {
                configuration3.navigation = i18;
            }
            int i19 = configuration.navigationHidden;
            int i20 = configuration2.navigationHidden;
            if (i19 != i20) {
                configuration3.navigationHidden = i20;
            }
            int i21 = configuration.orientation;
            int i22 = configuration2.orientation;
            if (i21 != i22) {
                configuration3.orientation = i22;
            }
            int i23 = configuration.screenLayout & 15;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 15)) {
                configuration3.screenLayout |= i24 & 15;
            }
            int i25 = configuration.screenLayout & 192;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 192)) {
                configuration3.screenLayout |= i26 & 192;
            }
            int i27 = configuration.screenLayout & 48;
            int i28 = configuration2.screenLayout;
            if (i27 != (i28 & 48)) {
                configuration3.screenLayout |= i28 & 48;
            }
            int i29 = configuration.screenLayout & 768;
            int i30 = configuration2.screenLayout;
            if (i29 != (i30 & 768)) {
                configuration3.screenLayout |= i30 & 768;
            }
            if (i10 >= 26) {
                C0009k.a(configuration, configuration2, configuration3);
            }
            int i31 = configuration.uiMode & 15;
            int i32 = configuration2.uiMode;
            if (i31 != (i32 & 15)) {
                configuration3.uiMode |= i32 & 15;
            }
            int i33 = configuration.uiMode & 48;
            int i34 = configuration2.uiMode;
            if (i33 != (i34 & 48)) {
                configuration3.uiMode |= i34 & 48;
            }
            int i35 = configuration.screenWidthDp;
            int i36 = configuration2.screenWidthDp;
            if (i35 != i36) {
                configuration3.screenWidthDp = i36;
            }
            int i37 = configuration.screenHeightDp;
            int i38 = configuration2.screenHeightDp;
            if (i37 != i38) {
                configuration3.screenHeightDp = i38;
            }
            int i39 = configuration.smallestScreenWidthDp;
            int i40 = configuration2.smallestScreenWidthDp;
            if (i39 != i40) {
                configuration3.smallestScreenWidthDp = i40;
            }
            h.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private int m0(Context context) {
        if (!this.W && (this.f357j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i6 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f357j.getClass()), i6 >= 29 ? 269221888 : i6 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.V = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e6) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e6);
                this.V = 0;
            }
        }
        this.W = true;
        return this.V;
    }

    private o n0(Context context) {
        if (this.Y == null) {
            this.Y = new n(context);
        }
        return this.Y;
    }

    private o o0(Context context) {
        if (this.X == null) {
            this.X = new p(e0.a(context));
        }
        return this.X;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void t0() {
        /*
            r3 = this;
            r3.h0()
            boolean r0 = r3.G
            if (r0 == 0) goto L37
            androidx.appcompat.app.a r0 = r3.f362o
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f357j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            androidx.appcompat.app.g0 r0 = new androidx.appcompat.app.g0
            java.lang.Object r1 = r3.f357j
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.H
            r0.<init>(r1, r2)
        L1d:
            r3.f362o = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            androidx.appcompat.app.g0 r0 = new androidx.appcompat.app.g0
            java.lang.Object r1 = r3.f357j
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            androidx.appcompat.app.a r0 = r3.f362o
            if (r0 == 0) goto L37
            boolean r1 = r3.f350c0
            r0.r(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.k.t0():void");
    }

    private boolean u0(s sVar) {
        View view = sVar.f404i;
        if (view != null) {
            sVar.f403h = view;
            return true;
        }
        if (sVar.f405j == null) {
            return false;
        }
        if (this.f367t == null) {
            this.f367t = new t();
        }
        View view2 = (View) sVar.a(this.f367t);
        sVar.f403h = view2;
        return view2 != null;
    }

    private boolean v0(s sVar) {
        sVar.d(l0());
        sVar.f402g = new r(sVar.f407l);
        sVar.f398c = 81;
        return true;
    }

    private boolean w0(s sVar) {
        Resources.Theme theme;
        Context context = this.f358k;
        int i6 = sVar.f396a;
        if ((i6 == 0 || i6 == 108) && this.f365r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(d.a.f6117d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(d.a.f6118e, typedValue, true);
            } else {
                theme2.resolveAttribute(d.a.f6118e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        sVar.c(gVar);
        return true;
    }

    private void x0(int i6) {
        this.f348a0 = (1 << i6) | this.f348a0;
        if (this.Z) {
            return;
        }
        b1.i0(this.f359l.getDecorView(), this.f349b0);
        this.Z = true;
    }

    @Override // androidx.appcompat.app.g
    public void A() {
        androidx.appcompat.app.a r5 = r();
        if (r5 != null) {
            r5.s(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A0() {
        boolean z5 = this.O;
        this.O = false;
        s q02 = q0(0, false);
        if (q02 != null && q02.f410o) {
            if (!z5) {
                Z(q02, true);
            }
            return true;
        }
        androidx.appcompat.view.b bVar = this.f368u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a r5 = r();
        return r5 != null && r5.h();
    }

    @Override // androidx.appcompat.app.g
    public void B(Bundle bundle) {
    }

    boolean B0(int i6, KeyEvent keyEvent) {
        if (i6 == 4) {
            this.O = (keyEvent.getFlags() & 128) != 0;
        } else if (i6 == 82) {
            C0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public void C() {
        P(true, false);
    }

    @Override // androidx.appcompat.app.g
    public void D() {
        androidx.appcompat.app.a r5 = r();
        if (r5 != null) {
            r5.s(false);
        }
    }

    boolean D0(int i6, KeyEvent keyEvent) {
        androidx.appcompat.app.a r5 = r();
        if (r5 != null && r5.o(i6, keyEvent)) {
            return true;
        }
        s sVar = this.N;
        if (sVar != null && L0(sVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            s sVar2 = this.N;
            if (sVar2 != null) {
                sVar2.f409n = true;
            }
            return true;
        }
        if (this.N == null) {
            s q02 = q0(0, true);
            M0(q02, keyEvent);
            boolean L0 = L0(q02, keyEvent.getKeyCode(), keyEvent, 1);
            q02.f408m = false;
            if (L0) {
                return true;
            }
        }
        return false;
    }

    boolean E0(int i6, KeyEvent keyEvent) {
        if (i6 != 4) {
            if (i6 == 82) {
                F0(0, keyEvent);
                return true;
            }
        } else if (A0()) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.g
    public boolean G(int i6) {
        int O0 = O0(i6);
        if (this.K && O0 == 108) {
            return false;
        }
        if (this.G && O0 == 1) {
            this.G = false;
        }
        if (O0 == 1) {
            W0();
            this.K = true;
            return true;
        }
        if (O0 == 2) {
            W0();
            this.E = true;
            return true;
        }
        if (O0 == 5) {
            W0();
            this.F = true;
            return true;
        }
        if (O0 == 10) {
            W0();
            this.I = true;
            return true;
        }
        if (O0 == 108) {
            W0();
            this.G = true;
            return true;
        }
        if (O0 != 109) {
            return this.f359l.requestFeature(O0);
        }
        W0();
        this.H = true;
        return true;
    }

    void G0(int i6) {
        androidx.appcompat.app.a r5;
        if (i6 != 108 || (r5 = r()) == null) {
            return;
        }
        r5.i(true);
    }

    @Override // androidx.appcompat.app.g
    public void H(int i6) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f358k).inflate(i6, viewGroup);
        this.f360m.c(this.f359l.getCallback());
    }

    void H0(int i6) {
        if (i6 == 108) {
            androidx.appcompat.app.a r5 = r();
            if (r5 != null) {
                r5.i(false);
                return;
            }
            return;
        }
        if (i6 == 0) {
            s q02 = q0(i6, true);
            if (q02.f410o) {
                Z(q02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.g
    public void I(View view) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f360m.c(this.f359l.getCallback());
    }

    void I0(ViewGroup viewGroup) {
    }

    @Override // androidx.appcompat.app.g
    public void J(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f360m.c(this.f359l.getCallback());
    }

    @Override // androidx.appcompat.app.g
    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.K(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f355h0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f356i0) != null) {
            l.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f356i0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f357j;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = l.a((Activity) this.f357j);
            }
        }
        this.f355h0 = onBackInvokedDispatcher;
        a1();
    }

    final androidx.appcompat.app.a K0() {
        return this.f362o;
    }

    @Override // androidx.appcompat.app.g
    public void L(int i6) {
        this.U = i6;
    }

    @Override // androidx.appcompat.app.g
    public final void M(CharSequence charSequence) {
        this.f364q = charSequence;
        a2 a2Var = this.f365r;
        if (a2Var != null) {
            a2Var.setWindowTitle(charSequence);
            return;
        }
        if (K0() != null) {
            K0().t(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    void P0(Configuration configuration, androidx.core.os.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.d(configuration, iVar);
        } else {
            h.d(configuration, iVar.d(0));
            h.c(configuration, iVar.d(0));
        }
    }

    public boolean Q() {
        return O(true);
    }

    void Q0(androidx.core.os.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.c(iVar);
        } else {
            Locale.setDefault(iVar.d(0));
        }
    }

    final boolean R0() {
        ViewGroup viewGroup;
        return this.A && (viewGroup = this.B) != null && b1.U(viewGroup);
    }

    androidx.core.os.i T(Context context) {
        androidx.core.os.i q6;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 33 || (q6 = androidx.appcompat.app.g.q()) == null) {
            return null;
        }
        androidx.core.os.i p02 = p0(context.getApplicationContext().getResources().getConfiguration());
        androidx.core.os.i b6 = i6 >= 24 ? b0.b(q6, p02) : q6.f() ? androidx.core.os.i.e() : androidx.core.os.i.c(q6.d(0).toString());
        return b6.f() ? p02 : b6;
    }

    boolean T0() {
        if (this.f355h0 == null) {
            return false;
        }
        s q02 = q0(0, false);
        return (q02 != null && q02.f410o) || this.f368u != null;
    }

    public androidx.appcompat.view.b U0(b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        androidx.appcompat.view.b bVar = this.f368u;
        if (bVar != null) {
            bVar.c();
        }
        g gVar = new g(aVar);
        androidx.appcompat.app.a r5 = r();
        if (r5 != null) {
            androidx.appcompat.view.b u5 = r5.u(gVar);
            this.f368u = u5;
            if (u5 != null && (dVar = this.f361n) != null) {
                dVar.m(u5);
            }
        }
        if (this.f368u == null) {
            this.f368u = V0(gVar);
        }
        a1();
        return this.f368u;
    }

    void V(int i6, s sVar, Menu menu) {
        if (menu == null) {
            if (sVar == null && i6 >= 0) {
                s[] sVarArr = this.M;
                if (i6 < sVarArr.length) {
                    sVar = sVarArr[i6];
                }
            }
            if (sVar != null) {
                menu = sVar.f405j;
            }
        }
        if ((sVar == null || sVar.f410o) && !this.R) {
            this.f360m.d(this.f359l.getCallback(), i6, menu);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.appcompat.view.b V0(androidx.appcompat.view.b.a r8) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.k.V0(androidx.appcompat.view.b$a):androidx.appcompat.view.b");
    }

    void W(androidx.appcompat.view.menu.g gVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        this.f365r.l();
        Window.Callback s02 = s0();
        if (s02 != null && !this.R) {
            s02.onPanelClosed(108, gVar);
        }
        this.L = false;
    }

    void Y(int i6) {
        Z(q0(i6, true), true);
    }

    void Z(s sVar, boolean z5) {
        ViewGroup viewGroup;
        a2 a2Var;
        if (z5 && sVar.f396a == 0 && (a2Var = this.f365r) != null && a2Var.c()) {
            W(sVar.f405j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f358k.getSystemService("window");
        if (windowManager != null && sVar.f410o && (viewGroup = sVar.f402g) != null) {
            windowManager.removeView(viewGroup);
            if (z5) {
                V(sVar.f396a, sVar, null);
            }
        }
        sVar.f408m = false;
        sVar.f409n = false;
        sVar.f410o = false;
        sVar.f403h = null;
        sVar.f412q = true;
        if (this.N == sVar) {
            this.N = null;
        }
        if (sVar.f396a == 0) {
            a1();
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        s j02;
        Window.Callback s02 = s0();
        if (s02 == null || this.R || (j02 = j0(gVar.D())) == null) {
            return false;
        }
        return s02.onMenuItemSelected(j02.f396a, menuItem);
    }

    void a1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean T0 = T0();
            if (T0 && this.f356i0 == null) {
                this.f356i0 = l.b(this.f355h0, this);
            } else {
                if (T0 || (onBackInvokedCallback = this.f356i0) == null) {
                    return;
                }
                l.c(this.f355h0, onBackInvokedCallback);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        N0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View c0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z5;
        w wVar;
        boolean z6 = false;
        if (this.f353f0 == null) {
            String string = this.f358k.obtainStyledAttributes(d.j.f6371y0).getString(d.j.C0);
            if (string == null) {
                wVar = new w();
            } else {
                try {
                    this.f353f0 = (w) this.f358k.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    wVar = new w();
                }
            }
            this.f353f0 = wVar;
        }
        boolean z7 = f344k0;
        if (z7) {
            if (this.f354g0 == null) {
                this.f354g0 = new a0();
            }
            if (this.f354g0.a(attributeSet)) {
                z5 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    z6 = S0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    z6 = true;
                }
                z5 = z6;
            }
        } else {
            z5 = false;
        }
        return this.f353f0.r(view, str, context, attributeSet, z5, z7, true, o3.c());
    }

    final int c1(c3 c3Var, Rect rect) {
        boolean z5;
        boolean z6;
        int k6 = c3Var != null ? c3Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f369v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z5 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f369v.getLayoutParams();
            if (this.f369v.isShown()) {
                if (this.f351d0 == null) {
                    this.f351d0 = new Rect();
                    this.f352e0 = new Rect();
                }
                Rect rect2 = this.f351d0;
                Rect rect3 = this.f352e0;
                if (c3Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c3Var.i(), c3Var.k(), c3Var.j(), c3Var.h());
                }
                p3.a(this.B, rect2, rect3);
                int i6 = rect2.top;
                int i7 = rect2.left;
                int i8 = rect2.right;
                c3 K = b1.K(this.B);
                int i9 = K == null ? 0 : K.i();
                int j6 = K == null ? 0 : K.j();
                if (marginLayoutParams.topMargin == i6 && marginLayoutParams.leftMargin == i7 && marginLayoutParams.rightMargin == i8) {
                    z6 = false;
                } else {
                    marginLayoutParams.topMargin = i6;
                    marginLayoutParams.leftMargin = i7;
                    marginLayoutParams.rightMargin = i8;
                    z6 = true;
                }
                if (i6 <= 0 || this.D != null) {
                    View view = this.D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i10 = marginLayoutParams2.height;
                        int i11 = marginLayoutParams.topMargin;
                        if (i10 != i11 || marginLayoutParams2.leftMargin != i9 || marginLayoutParams2.rightMargin != j6) {
                            marginLayoutParams2.height = i11;
                            marginLayoutParams2.leftMargin = i9;
                            marginLayoutParams2.rightMargin = j6;
                            this.D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f358k);
                    this.D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i9;
                    layoutParams.rightMargin = j6;
                    this.B.addView(this.D, -1, layoutParams);
                }
                View view3 = this.D;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    d1(this.D);
                }
                if (!this.I && r5) {
                    k6 = 0;
                }
                z5 = r5;
                r5 = z6;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z5 = false;
            } else {
                z5 = false;
                r5 = false;
            }
            if (r5) {
                this.f369v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.D;
        if (view4 != null) {
            view4.setVisibility(z5 ? 0 : 8);
        }
        return k6;
    }

    void d0() {
        androidx.appcompat.view.menu.g gVar;
        a2 a2Var = this.f365r;
        if (a2Var != null) {
            a2Var.l();
        }
        if (this.f370w != null) {
            this.f359l.getDecorView().removeCallbacks(this.f371x);
            if (this.f370w.isShowing()) {
                try {
                    this.f370w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f370w = null;
        }
        g0();
        s q02 = q0(0, false);
        if (q02 == null || (gVar = q02.f405j) == null) {
            return;
        }
        gVar.close();
    }

    @Override // androidx.appcompat.app.g
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        h0();
        ((ViewGroup) this.B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f360m.c(this.f359l.getCallback());
    }

    boolean e0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f357j;
        if (((obj instanceof x.a) || (obj instanceof u)) && (decorView = this.f359l.getDecorView()) != null && androidx.core.view.x.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f360m.b(this.f359l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? B0(keyCode, keyEvent) : E0(keyCode, keyEvent);
    }

    void f0(int i6) {
        s q02;
        s q03 = q0(i6, true);
        if (q03.f405j != null) {
            Bundle bundle = new Bundle();
            q03.f405j.Q(bundle);
            if (bundle.size() > 0) {
                q03.f414s = bundle;
            }
            q03.f405j.d0();
            q03.f405j.clear();
        }
        q03.f413r = true;
        q03.f412q = true;
        if ((i6 != 108 && i6 != 0) || this.f365r == null || (q02 = q0(0, false)) == null) {
            return;
        }
        q02.f408m = false;
        M0(q02, null);
    }

    @Override // androidx.appcompat.app.g
    public Context g(Context context) {
        this.P = true;
        int z02 = z0(context, U());
        if (androidx.appcompat.app.g.u(context)) {
            androidx.appcompat.app.g.N(context);
        }
        androidx.core.os.i T = T(context);
        if (f347n0 && (context instanceof ContextThemeWrapper)) {
            try {
                q.a((ContextThemeWrapper) context, a0(context, z02, T, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof androidx.appcompat.view.d) {
            try {
                ((androidx.appcompat.view.d) context).a(a0(context, z02, T, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f346m0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = h.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration a02 = a0(context, z02, T, !configuration2.equals(configuration3) ? k0(configuration2, configuration3) : null, true);
        androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(context, d.i.f6248c);
        dVar.a(a02);
        boolean z5 = false;
        try {
            z5 = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z5) {
            h.f.a(dVar.getTheme());
        }
        return super.g(dVar);
    }

    void g0() {
        w2 w2Var = this.f372y;
        if (w2Var != null) {
            w2Var.c();
        }
    }

    @Override // androidx.appcompat.app.g
    public View j(int i6) {
        h0();
        return this.f359l.findViewById(i6);
    }

    s j0(Menu menu) {
        s[] sVarArr = this.M;
        int length = sVarArr != null ? sVarArr.length : 0;
        for (int i6 = 0; i6 < length; i6++) {
            s sVar = sVarArr[i6];
            if (sVar != null && sVar.f405j == menu) {
                return sVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.app.g
    public Context l() {
        return this.f358k;
    }

    final Context l0() {
        androidx.appcompat.app.a r5 = r();
        Context k6 = r5 != null ? r5.k() : null;
        return k6 == null ? this.f358k : k6;
    }

    @Override // androidx.appcompat.app.g
    public int n() {
        return this.T;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return c0(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.g
    public MenuInflater p() {
        if (this.f363p == null) {
            t0();
            androidx.appcompat.app.a aVar = this.f362o;
            this.f363p = new androidx.appcompat.view.g(aVar != null ? aVar.k() : this.f358k);
        }
        return this.f363p;
    }

    androidx.core.os.i p0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? j.b(configuration) : androidx.core.os.i.c(i.b(configuration.locale));
    }

    protected s q0(int i6, boolean z5) {
        s[] sVarArr = this.M;
        if (sVarArr == null || sVarArr.length <= i6) {
            s[] sVarArr2 = new s[i6 + 1];
            if (sVarArr != null) {
                System.arraycopy(sVarArr, 0, sVarArr2, 0, sVarArr.length);
            }
            this.M = sVarArr2;
            sVarArr = sVarArr2;
        }
        s sVar = sVarArr[i6];
        if (sVar != null) {
            return sVar;
        }
        s sVar2 = new s(i6);
        sVarArr[i6] = sVar2;
        return sVar2;
    }

    @Override // androidx.appcompat.app.g
    public androidx.appcompat.app.a r() {
        t0();
        return this.f362o;
    }

    final CharSequence r0() {
        Object obj = this.f357j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f364q;
    }

    @Override // androidx.appcompat.app.g
    public void s() {
        LayoutInflater from = LayoutInflater.from(this.f358k);
        if (from.getFactory() == null) {
            androidx.core.view.y.a(from, this);
        } else {
            if (from.getFactory2() instanceof k) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    final Window.Callback s0() {
        return this.f359l.getCallback();
    }

    @Override // androidx.appcompat.app.g
    public void t() {
        if (K0() == null || r().l()) {
            return;
        }
        x0(0);
    }

    @Override // androidx.appcompat.app.g
    public void w(Configuration configuration) {
        androidx.appcompat.app.a r5;
        if (this.G && this.A && (r5 = r()) != null) {
            r5.m(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f358k);
        this.S = new Configuration(this.f358k.getResources().getConfiguration());
        P(false, false);
    }

    @Override // androidx.appcompat.app.g
    public void x(Bundle bundle) {
        String str;
        this.P = true;
        O(false);
        i0();
        Object obj = this.f357j;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.r.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a K0 = K0();
                if (K0 == null) {
                    this.f350c0 = true;
                } else {
                    K0.r(true);
                }
            }
            androidx.appcompat.app.g.d(this);
        }
        this.S = new Configuration(this.f358k.getResources().getConfiguration());
        this.Q = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f357j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.g.E(r3)
        L9:
            boolean r0 = r3.Z
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f359l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f349b0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.R = r0
            int r0 = r3.T
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f357j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            l.g r0 = androidx.appcompat.app.k.f343j0
            java.lang.Object r1 = r3.f357j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.T
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            l.g r0 = androidx.appcompat.app.k.f343j0
            java.lang.Object r1 = r3.f357j
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f362o
            if (r0 == 0) goto L5b
            r0.n()
        L5b:
            r3.X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.k.y():void");
    }

    public boolean y0() {
        return this.f373z;
    }

    @Override // androidx.appcompat.app.g
    public void z(Bundle bundle) {
        h0();
    }

    int z0(Context context, int i6) {
        o o02;
        if (i6 == -100) {
            return -1;
        }
        if (i6 != -1) {
            if (i6 != 0) {
                if (i6 != 1 && i6 != 2) {
                    if (i6 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    o02 = n0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                o02 = o0(context);
            }
            return o02.c();
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private k(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        androidx.appcompat.app.c X0;
        this.f372y = null;
        this.f373z = true;
        this.T = -100;
        this.f349b0 = new a();
        this.f358k = context;
        this.f361n = dVar;
        this.f357j = obj;
        if (this.T == -100 && (obj instanceof Dialog) && (X0 = X0()) != null) {
            this.T = X0.e0().n();
        }
        if (this.T == -100) {
            l.g gVar = f343j0;
            Integer num = (Integer) gVar.get(obj.getClass().getName());
            if (num != null) {
                this.T = num.intValue();
                gVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            S(window);
        }
        androidx.appcompat.widget.k.h();
    }
}
