package com.uptodown.tv.ui.activity;

import M5.AbstractC1246t;
import N4.f;
import N4.w;
import S4.j;
import W4.r;
import X4.C1498h;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.BackgroundManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import com.uptodown.tv.ui.activity.TvMainActivity;
import g6.n;
import h5.b;
import i5.C2784b;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3323k;

/* loaded from: classes5.dex */
public final class TvMainActivity extends b implements r {

    /* renamed from: d, reason: collision with root package name */
    private AlertDialog f29835d;

    /* renamed from: e, reason: collision with root package name */
    public Fragment f29836e;

    private final void s(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: h5.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvMainActivity.t(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        if (!isFinishing()) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void u() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f29835d;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f29323b;
        if (aVar.W(this) && !aVar.k0(this)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getString(com.uptodown.R.string.tracking_disabled_warning_gdpr));
            builder.setPositiveButton(com.uptodown.R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: h5.d
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMainActivity.v(TvMainActivity.this, dialogInterface, i8);
                }
            });
            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: h5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMainActivity.w(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            this.f29835d = builder.create();
            if (!isFinishing() && (alertDialog = this.f29835d) != null) {
                alertDialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(TvMainActivity this$0, DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(this$0, "this$0");
        dialogInterface.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) TvPrivacyPreferences.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(DialogInterface dialogInterface, int i8) {
        AbstractC3159y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final boolean z(Intent intent) {
        if ((intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    @Override // W4.r
    public void c(int i8) {
        s(getString(com.uptodown.R.string.msg_app_not_found));
    }

    @Override // W4.r
    public void f(C1498h appInfo) {
        AbstractC3159y.i(appInfo, "appInfo");
        Intent intent = new Intent(this, (Class<?>) TvAppDetailActivity.class);
        intent.putExtra("appInfo", appInfo);
        startActivity(intent, UptodownApp.f28003B.a(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        AbstractC3159y.h(fragments, "supportFragmentManager.fragments");
        if (AbstractC1246t.y0(fragments) instanceof C2784b) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // h5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        setContentView(com.uptodown.R.layout.tv_activity_main);
        if (bundle == null) {
            y(new i5.r());
            getSupportFragmentManager().beginTransaction().replace(com.uptodown.R.id.fragmentContainer, x()).commit();
        }
        BackgroundManager backgroundManager = BackgroundManager.getInstance(this);
        Drawable drawable = ContextCompat.getDrawable(this, com.uptodown.R.drawable.tv_default_background);
        if (backgroundManager != null) {
            backgroundManager.setDrawable(drawable);
        }
        Intent intent = getIntent();
        if (intent != null && !z(intent) && (data = intent.getData()) != null) {
            String j8 = new f().j(data, this);
            if (j8 != null && (w.f7281b.a(j8) || n.r(j8, ".apk", false, 2, null))) {
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                intent2.setData(data);
                startActivity(intent2);
                return;
            }
            new j(this, new C3323k().l(data), this, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h5.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        u();
    }

    public final Fragment x() {
        Fragment fragment = this.f29836e;
        if (fragment != null) {
            return fragment;
        }
        AbstractC3159y.y("tvMainFragment");
        return null;
    }

    public final void y(Fragment fragment) {
        AbstractC3159y.i(fragment, "<set-?>");
        this.f29836e = fragment;
    }
}
