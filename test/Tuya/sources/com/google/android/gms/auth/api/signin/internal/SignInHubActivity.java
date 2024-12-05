package com.google.android.gms.auth.api.signin.internal;

import L.p;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

@KeepName
/* loaded from: classes3.dex */
public class SignInHubActivity extends FragmentActivity {

    /* renamed from: f */
    private static boolean f15076f = false;

    /* renamed from: a */
    private boolean f15077a = false;

    /* renamed from: b */
    private SignInConfiguration f15078b;

    /* renamed from: c */
    private boolean f15079c;

    /* renamed from: d */
    private int f15080d;

    /* renamed from: e */
    private Intent f15081e;

    private final void p() {
        getSupportLoaderManager().initLoader(0, null, new a(this, null));
        f15076f = false;
    }

    private final void q(int i8) {
        Status status = new Status(i8);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f15076f = false;
    }

    private final void r(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f15078b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f15077a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            q(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i8, int i9, Intent intent) {
        if (this.f15077a) {
            return;
        }
        setResult(0);
        if (i8 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.s() != null) {
                GoogleSignInAccount s8 = signInAccount.s();
                p a8 = p.a(this);
                GoogleSignInOptions s9 = this.f15078b.s();
                s8.getClass();
                a8.c(s9, s8);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", s8);
                this.f15079c = true;
                this.f15080d = i9;
                this.f15081e = intent;
                p();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                q(intExtra);
                return;
            }
        }
        q(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            q(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f15078b = signInConfiguration;
        if (bundle == null) {
            if (f15076f) {
                setResult(0);
                q(12502);
                return;
            } else {
                f15076f = true;
                r(action);
                return;
            }
        }
        boolean z8 = bundle.getBoolean("signingInGoogleApiClients");
        this.f15079c = z8;
        if (z8) {
            this.f15080d = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            intent2.getClass();
            this.f15081e = intent2;
            p();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f15076f = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f15079c);
        if (this.f15079c) {
            bundle.putInt("signInResultCode", this.f15080d);
            bundle.putParcelable("signInResultData", this.f15081e);
        }
    }
}
