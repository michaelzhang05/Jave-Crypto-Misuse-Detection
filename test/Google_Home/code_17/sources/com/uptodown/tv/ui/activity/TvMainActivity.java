package com.uptodown.tv.ui.activity;

import H4.i;
import P5.AbstractC1378t;
import Q4.f;
import Q4.w;
import V4.j;
import Z4.r;
import a5.C1641h;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.leanback.app.BackgroundManager;
import androidx.lifecycle.LifecycleOwnerKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.core.activities.InstallerActivity;
import com.uptodown.tv.preferences.TvPrivacyPreferences;
import com.uptodown.tv.ui.activity.TvMainActivity;
import j6.n;
import java.io.File;
import java.util.List;
import k5.b;
import kotlin.jvm.internal.AbstractC3255y;
import l5.C3319b;
import o5.C3667g;
import o5.C3671k;

/* loaded from: classes5.dex */
public final class TvMainActivity extends b implements r {

    /* renamed from: d, reason: collision with root package name */
    private AlertDialog f30866d;

    /* renamed from: e, reason: collision with root package name */
    public Fragment f30867e;

    /* renamed from: f, reason: collision with root package name */
    private final ActivityResultLauncher f30868f;

    public TvMainActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: k5.d
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                TvMainActivity.z(TvMainActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f30868f = registerForActivityResult;
    }

    private final boolean B(Intent intent) {
        if ((intent.getFlags() & 1048576) == 1048576) {
            return true;
        }
        return false;
    }

    private final void t(String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(str);
        builder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() { // from class: k5.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i8) {
                TvMainActivity.u(dialogInterface, i8);
            }
        });
        builder.setCancelable(true);
        AlertDialog create = builder.create();
        if (!isFinishing()) {
            create.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    private final void v() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = this.f30866d;
        if (alertDialog2 != null) {
            alertDialog2.dismiss();
        }
        SettingsPreferences.a aVar = SettingsPreferences.f30353b;
        if (aVar.W(this) && !aVar.k0(this)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setMessage(getString(com.uptodown.R.string.tracking_disabled_warning_gdpr));
            builder.setPositiveButton(com.uptodown.R.string.gdpr_set_up, new DialogInterface.OnClickListener() { // from class: k5.e
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMainActivity.w(TvMainActivity.this, dialogInterface, i8);
                }
            });
            builder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: k5.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i8) {
                    TvMainActivity.x(dialogInterface, i8);
                }
            });
            builder.setCancelable(true);
            this.f30866d = builder.create();
            if (!isFinishing() && (alertDialog = this.f30866d) != null) {
                alertDialog.show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(TvMainActivity this$0, DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(this$0, "this$0");
        dialogInterface.dismiss();
        this$0.startActivity(new Intent(this$0, (Class<?>) TvPrivacyPreferences.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(DialogInterface dialogInterface, int i8) {
        AbstractC3255y.i(dialogInterface, "dialogInterface");
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(TvMainActivity this$0, ActivityResult activityResult) {
        String str;
        Bundle extras;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 10) {
            Intent data = activityResult.getData();
            if (data != null && (extras = data.getExtras()) != null) {
                str = extras.getString("realPath");
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                new i(this$0).c(new File(str), null, new C3667g().x(this$0));
            }
        }
    }

    public final void A(Fragment fragment) {
        AbstractC3255y.i(fragment, "<set-?>");
        this.f30867e = fragment;
    }

    @Override // Z4.r
    public void c(int i8) {
        t(getString(com.uptodown.R.string.msg_app_not_found));
    }

    @Override // Z4.r
    public void e(C1641h appInfo) {
        AbstractC3255y.i(appInfo, "appInfo");
        Intent intent = new Intent(this, (Class<?>) TvAppDetailActivity.class);
        intent.putExtra("appInfo", appInfo);
        startActivity(intent, UptodownApp.f29058B.a(this));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        List<Fragment> fragments = getSupportFragmentManager().getFragments();
        AbstractC3255y.h(fragments, "supportFragmentManager.fragments");
        if (AbstractC1378t.y0(fragments) instanceof C3319b) {
            finish();
        } else {
            super.onBackPressed();
        }
    }

    @Override // k5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Uri data;
        super.onCreate(bundle);
        setContentView(com.uptodown.R.layout.tv_activity_main);
        if (bundle == null) {
            A(new l5.r());
            getSupportFragmentManager().beginTransaction().replace(com.uptodown.R.id.fragmentContainer, y()).commit();
        }
        BackgroundManager backgroundManager = BackgroundManager.getInstance(this);
        Drawable drawable = ContextCompat.getDrawable(this, com.uptodown.R.drawable.tv_default_background);
        if (backgroundManager != null) {
            backgroundManager.setDrawable(drawable);
        }
        Intent intent = getIntent();
        if (intent != null && !B(intent) && (data = intent.getData()) != null) {
            String j8 = new f().j(data, this);
            if (j8 != null && (w.f9241b.a(j8) || n.r(j8, ".apk", false, 2, null))) {
                Intent intent2 = new Intent(getApplicationContext(), (Class<?>) InstallerActivity.class);
                intent2.setData(data);
                this.f30868f.launch(intent2);
                return;
            }
            new j(this, new C3671k().l(data), this, LifecycleOwnerKt.getLifecycleScope(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // k5.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        v();
    }

    public final Fragment y() {
        Fragment fragment = this.f30867e;
        if (fragment != null) {
            return fragment;
        }
        AbstractC3255y.y("tvMainFragment");
        return null;
    }
}
