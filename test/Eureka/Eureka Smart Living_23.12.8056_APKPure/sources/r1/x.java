package r1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9106a;

    /* renamed from: b, reason: collision with root package name */
    private int f9107b;

    /* renamed from: c, reason: collision with root package name */
    private int f9108c = 0;

    public x(Context context) {
        this.f9106a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f9107b == 0) {
            try {
                packageInfo = b2.d.a(this.f9106a).d("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e6) {
                String valueOf = String.valueOf(e6);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f9107b = packageInfo.versionCode;
            }
        }
        return this.f9107b;
    }

    public final synchronized int b() {
        int i6 = this.f9108c;
        if (i6 != 0) {
            return i6;
        }
        PackageManager packageManager = this.f9106a.getPackageManager();
        if (b2.d.a(this.f9106a).a("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i7 = 1;
        if (!z1.i.g()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f9108c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f9108c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (z1.i.g()) {
            this.f9108c = 2;
            i7 = 2;
        } else {
            this.f9108c = 1;
        }
        return i7;
    }
}
