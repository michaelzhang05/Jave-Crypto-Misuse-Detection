package com.uptodown.core.activities;

import E4.j;
import N4.h;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import com.uptodown.core.activities.ConfirmationIntentWrapperActivity;
import i6.InterfaceC2854x;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class ConfirmationIntentWrapperActivity extends AppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final a f29481c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f29482a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f29483b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public ConfirmationIntentWrapperActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: F4.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConfirmationIntentWrapperActivity.o(ConfirmationIntentWrapperActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3159y.h(registerForActivityResult, "registerForActivityResul…ue\n        finish()\n    }");
        this.f29483b = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ConfirmationIntentWrapperActivity this$0, ActivityResult activityResult) {
        boolean z8;
        AbstractC3159y.i(this$0, "this$0");
        if (this$0.getPackageManager().getPackageInstaller().getSessionInfo(j.f2274g.k()) != null && r6.getProgress() >= 0.81d) {
            z8 = true;
        } else {
            z8 = false;
        }
        InterfaceC2854x b8 = h.f7215d.b();
        if (b8 != null) {
            b8.x(Boolean.valueOf(z8));
        }
        this$0.f29482a = true;
        this$0.finish();
    }

    private final void p(String str) {
        Intent intent = new Intent("com.uptodown.core.custom_action_installation_status");
        intent.putExtra("com.uptodown.core.installation_status", 2);
        intent.putExtra("com.uptodown.core.error", str);
        sendBroadcast(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        super.onCreate(bundle);
        Intent intent = getIntent();
        AbstractC3159y.h(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra2 = intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent", Intent.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent");
        }
        try {
            this.f29483b.launch((Intent) parcelableExtra);
        } catch (Exception e8) {
            e8.printStackTrace();
            p("installer_error");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!this.f29482a) {
            p("installer_error_aborted");
            j.f2274g.e();
        }
        super.onDestroy();
    }
}
