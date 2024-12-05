package com.mbridge.msdk.activity;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public abstract class MBBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private Display f17862a;

    /* renamed from: b, reason: collision with root package name */
    private OrientationEventListener f17863b;

    /* renamed from: c, reason: collision with root package name */
    private int f17864c = -1;

    static /* synthetic */ void e(MBBaseActivity mBBaseActivity) {
        OrientationEventListener orientationEventListener = new OrientationEventListener(mBBaseActivity, 1) { // from class: com.mbridge.msdk.activity.MBBaseActivity.2
            @Override // android.view.OrientationEventListener
            public final void onOrientationChanged(int i8) {
                int i9;
                if (MBBaseActivity.this.f17862a != null) {
                    i9 = MBBaseActivity.this.f17862a.getRotation();
                } else {
                    i9 = 0;
                }
                if (i9 == 1 && MBBaseActivity.this.f17864c != 1) {
                    MBBaseActivity.this.f17864c = 1;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Left");
                    return;
                }
                if (i9 == 3 && MBBaseActivity.this.f17864c != 2) {
                    MBBaseActivity.this.f17864c = 2;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Right");
                } else if (i9 == 0 && MBBaseActivity.this.f17864c != 3) {
                    MBBaseActivity.this.f17864c = 3;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Top");
                } else if (i9 == 2 && MBBaseActivity.this.f17864c != 4) {
                    MBBaseActivity.this.f17864c = 4;
                    MBBaseActivity.this.getNotchParams();
                    ad.b("MBBaseActivity", "Orientation Bottom");
                }
            }
        };
        mBBaseActivity.f17863b = orientationEventListener;
        if (orientationEventListener.canDetectOrientation()) {
            mBBaseActivity.f17863b.enable();
        } else {
            mBBaseActivity.f17863b.disable();
            mBBaseActivity.f17863b = null;
        }
    }

    public void getNotchParams() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.mbridge.msdk.activity.MBBaseActivity.1
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
            
                r1 = r2.getDisplayCutout();
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 237
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.activity.MBBaseActivity.AnonymousClass1.run():void");
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            a();
            b();
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
        } catch (Exception e8) {
            ad.b("MBBaseActivity", e8.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.f17863b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.f17863b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.d.b.f19164c) {
            return;
        }
        getNotchParams();
        a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        a();
    }

    public abstract void setTopControllerPadding(int i8, int i9, int i10, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: private */
    public int b() {
        Display display;
        if (this.f17862a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                display = getDisplay();
                this.f17862a = display;
            } else {
                this.f17862a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display2 = this.f17862a;
        if (display2 != null) {
            return display2.getRotation();
        }
        return -1;
    }

    private void a() {
        try {
            getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            getWindow().getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
        } catch (Throwable th) {
            ad.b("MBBaseActivity", th.getMessage());
        }
    }
}
