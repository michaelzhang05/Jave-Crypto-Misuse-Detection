package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import s1.f;
import v1.n;

/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    protected int f4540a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i6, boolean z5) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i6);
        intent.putExtra("notify_manager", z5);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            f.k().l(this, ((Integer) n.h(num)).intValue(), 2, this);
            this.f4540a = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f4540a = 1;
        } catch (ActivityNotFoundException e6) {
            if (extras.getBoolean("notify_manager", true)) {
                com.google.android.gms.common.api.internal.b.x(this).F(new s1.a(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String obj = pendingIntent.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(obj);
                sb.append(".");
                String sb2 = sb.toString();
                if (Build.FINGERPRINT.contains("generic")) {
                    sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", sb2, e6);
            }
            this.f4540a = 1;
            finish();
        } catch (IntentSender.SendIntentException e7) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e7);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i6, int i7, Intent intent) {
        super.onActivityResult(i6, i7, intent);
        if (i6 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f4540a = 0;
            setResult(i7, intent);
            if (booleanExtra) {
                com.google.android.gms.common.api.internal.b x5 = com.google.android.gms.common.api.internal.b.x(this);
                if (i7 == -1) {
                    x5.a();
                } else if (i7 == 0) {
                    x5.F(new s1.a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i6 == 2) {
            this.f4540a = 0;
            setResult(i7, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f4540a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f4540a = bundle.getInt("resolution");
        }
        if (this.f4540a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f4540a);
        super.onSaveInstanceState(bundle);
    }
}
