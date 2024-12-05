package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.internal.x;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;

/* loaded from: classes.dex */
public class FacebookActivity extends androidx.fragment.app.c {

    /* renamed from: f, reason: collision with root package name */
    public static String f8981f = "PassThrough";

    /* renamed from: g, reason: collision with root package name */
    private static String f8982g = "SingleFragment";

    /* renamed from: h, reason: collision with root package name */
    private static final String f8983h = FacebookActivity.class.getName();

    /* renamed from: i, reason: collision with root package name */
    private Fragment f8984i;

    private void c() {
        setResult(0, com.facebook.internal.s.m(getIntent(), null, com.facebook.internal.s.q(com.facebook.internal.s.u(getIntent()))));
        finish();
    }

    public Fragment a() {
        return this.f8984i;
    }

    protected Fragment b() {
        Intent intent = getIntent();
        androidx.fragment.app.h supportFragmentManager = getSupportFragmentManager();
        Fragment e2 = supportFragmentManager.e(f8982g);
        if (e2 != null) {
            return e2;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            com.facebook.internal.g gVar = new com.facebook.internal.g();
            gVar.setRetainInstance(true);
            gVar.show(supportFragmentManager, f8982g);
            return gVar;
        }
        if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.setRetainInstance(true);
            deviceShareDialogFragment.m((ShareContent) intent.getParcelableExtra("content"));
            deviceShareDialogFragment.show(supportFragmentManager, f8982g);
            return deviceShareDialogFragment;
        }
        com.facebook.login.e eVar = new com.facebook.login.e();
        eVar.setRetainInstance(true);
        supportFragmentManager.a().c(com.facebook.common.b.f9058c, eVar, f8982g).h();
        return eVar;
    }

    @Override // androidx.fragment.app.c, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Fragment fragment = this.f8984i;
        if (fragment != null) {
            fragment.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.fragment.app.c, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!f.w()) {
            x.V(f8983h, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
            f.C(getApplicationContext());
        }
        setContentView(com.facebook.common.c.a);
        if (f8981f.equals(intent.getAction())) {
            c();
        } else {
            this.f8984i = b();
        }
    }
}
