package N;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7138a;

    /* renamed from: b, reason: collision with root package name */
    private int f7139b;

    /* renamed from: c, reason: collision with root package name */
    private int f7140c = 0;

    public x(Context context) {
        this.f7138a = context;
    }

    public final synchronized int a() {
        PackageInfo packageInfo;
        if (this.f7139b == 0) {
            try {
                packageInfo = Y.e.a(this.f7138a).e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e8) {
                String valueOf = String.valueOf(e8);
                StringBuilder sb = new StringBuilder(valueOf.length() + 23);
                sb.append("Failed to find package ");
                sb.append(valueOf);
                Log.w("Metadata", sb.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f7139b = packageInfo.versionCode;
            }
        }
        return this.f7139b;
    }

    public final synchronized int b() {
        int i8 = this.f7140c;
        if (i8 != 0) {
            return i8;
        }
        PackageManager packageManager = this.f7138a.getPackageManager();
        if (Y.e.a(this.f7138a).b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i9 = 1;
        if (!W.k.h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f7140c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f7140c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (W.k.h()) {
            this.f7140c = 2;
            i9 = 2;
        } else {
            this.f7140c = 1;
        }
        return i9;
    }
}
