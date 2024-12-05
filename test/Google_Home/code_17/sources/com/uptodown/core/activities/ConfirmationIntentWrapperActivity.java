package com.uptodown.core.activities;

import H4.j;
import Q4.h;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.InterfaceC3389x;

/* loaded from: classes5.dex */
public final class ConfirmationIntentWrapperActivity extends AppCompatActivity {

    /* renamed from: c, reason: collision with root package name */
    public static final a f30512c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f30513a;

    /* renamed from: b, reason: collision with root package name */
    private final ActivityResultLauncher f30514b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public ConfirmationIntentWrapperActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: I4.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ConfirmationIntentWrapperActivity.o(ConfirmationIntentWrapperActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…ue\n        finish()\n    }");
        this.f30514b = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(ConfirmationIntentWrapperActivity this$0, ActivityResult activityResult) {
        boolean z8;
        AbstractC3255y.i(this$0, "this$0");
        if (this$0.getPackageManager().getPackageInstaller().getSessionInfo(j.f3824g.k()) != null && r6.getProgress() >= 0.81d) {
            z8 = true;
        } else {
            z8 = false;
        }
        InterfaceC3389x b8 = h.f9175d.b();
        if (b8 != null) {
            b8.u(Boolean.valueOf(z8));
        }
        this$0.f30513a = true;
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
        AbstractC3255y.h(intent, "intent");
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra2 = intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent", Intent.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("com.uptodown.sapk.confirmation_intent");
        }
        try {
            this.f30514b.launch((Intent) parcelableExtra);
        } catch (Exception e8) {
            e8.printStackTrace();
            p("installer_error");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (!this.f30513a) {
            p("installer_error_aborted");
            j.f3824g.e();
        }
        super.onDestroy();
    }
}
