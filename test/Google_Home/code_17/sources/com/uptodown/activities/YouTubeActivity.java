package com.uptodown.activities;

import O5.InterfaceC1355k;
import W4.C0;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedCallback;
import g2.EnumC2863c;
import g2.InterfaceC2865e;
import h2.AbstractC2897a;
import h2.InterfaceC2898b;
import i2.C2977a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes4.dex */
public final class YouTubeActivity extends AbstractActivityC2683a {

    /* renamed from: Q, reason: collision with root package name */
    public static final a f30155Q = new a(null);

    /* renamed from: O, reason: collision with root package name */
    private InterfaceC2865e f30157O;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f30156N = O5.l.b(new b());

    /* renamed from: P, reason: collision with root package name */
    private final e f30158P = new e();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C0 invoke() {
            return C0.c(YouTubeActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2898b {
        c() {
        }

        @Override // h2.InterfaceC2898b
        public void a(View fullscreenView, Function0 exitFullscreen) {
            AbstractC3255y.i(fullscreenView, "fullscreenView");
            AbstractC3255y.i(exitFullscreen, "exitFullscreen");
            YouTubeActivity.this.a3().f11710c.setVisibility(8);
            YouTubeActivity.this.a3().f11709b.setVisibility(0);
            YouTubeActivity.this.a3().f11709b.addView(fullscreenView);
        }

        @Override // h2.InterfaceC2898b
        public void onExitFullscreen() {
            YouTubeActivity.this.a3().f11710c.setVisibility(0);
            YouTubeActivity.this.a3().f11709b.setVisibility(8);
            YouTubeActivity.this.a3().f11709b.removeAllViews();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2897a {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f30162b;

        d(String str) {
            this.f30162b = str;
        }

        @Override // h2.AbstractC2897a, h2.c
        public void c(InterfaceC2865e youTubePlayer) {
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            YouTubeActivity.this.f30157O = youTubePlayer;
            youTubePlayer.e(this.f30162b, 0.0f);
        }

        @Override // h2.AbstractC2897a, h2.c
        public void h(InterfaceC2865e youTubePlayer, EnumC2863c error) {
            AbstractC3255y.i(youTubePlayer, "youTubePlayer");
            AbstractC3255y.i(error, "error");
            super.h(youTubePlayer, error);
            YouTubeActivity.this.finish();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends OnBackPressedCallback {
        e() {
            super(true);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public void handleOnBackPressed() {
            YouTubeActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C0 a3() {
        return (C0) this.f30156N.getValue();
    }

    private final void b3(String str) {
        C2977a c8 = new C2977a.C0764a().e(1).f(1).c();
        a3().f11710c.e(new d(str), c8);
        a3().f11710c.c(new c());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        InterfaceC2865e interfaceC2865e;
        AbstractC3255y.i(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i8 = newConfig.orientation;
        if ((i8 == 1 || i8 == 2) && (interfaceC2865e = this.f30157O) != null) {
            AbstractC3255y.f(interfaceC2865e);
            interfaceC2865e.b();
        }
    }

    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        String str;
        Bundle extras;
        super.onCreate(bundle);
        setContentView(a3().getRoot());
        Window window = getWindow();
        AbstractC3255y.h(window, "window");
        Q2(window);
        getOnBackPressedDispatcher().addCallback(this, this.f30158P);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("id_youtube")) {
            str = extras.getString("id_youtube");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            b3(str);
        } else {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        a3().f11710c.h();
    }
}
