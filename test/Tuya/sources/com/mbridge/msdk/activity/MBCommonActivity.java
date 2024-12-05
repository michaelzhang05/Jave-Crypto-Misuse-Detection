package com.mbridge.msdk.activity;

import android.os.Build;
import android.os.Bundle;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.webview.BrowserView;

/* loaded from: classes4.dex */
public class MBCommonActivity extends DomainMBCommonActivity {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f17867d = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f17868b = false;

    @Override // android.app.Activity
    public void finish() {
        BrowserView browserView = this.browserView;
        if (browserView != null) {
            browserView.setListener(null);
            this.browserView.destroy();
        }
        BrowserView remove = com.mbridge.msdk.foundation.webview.b.f20201a.remove(this.f17858a);
        if (remove != null) {
            remove.setListener(null);
            remove.destroy();
        }
        this.f17868b = true;
        super.finish();
    }

    @Override // com.mbridge.msdk.activity.DomainMBCommonActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        super.onCreate(bundle);
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (!this.f17868b) {
            BrowserView browserView = this.browserView;
            if (browserView != null) {
                browserView.setListener(null);
                this.browserView.destroy();
            }
            BrowserView remove = com.mbridge.msdk.foundation.webview.b.f20201a.remove(this.f17858a);
            if (remove != null) {
                remove.setListener(null);
                remove.destroy();
            }
        }
    }

    public void testfun() {
        ad.b("ASDFA", "DSFASDFADSFADSFADS");
    }
}
