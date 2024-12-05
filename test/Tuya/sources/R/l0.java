package R;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f8575f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f8576a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8577b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f8578c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8579d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8580e;

    public l0(String str, String str2, int i8, boolean z8) {
        AbstractC1319p.f(str);
        this.f8576a = str;
        AbstractC1319p.f(str2);
        this.f8577b = str2;
        this.f8578c = null;
        this.f8579d = 4225;
        this.f8580e = z8;
    }

    public final ComponentName a() {
        return this.f8578c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f8576a != null) {
            Intent intent = null;
            if (this.f8580e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f8576a);
                try {
                    bundle = context.getContentResolver().call(f8575f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e8) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f8576a)));
                }
            }
            if (intent == null) {
                return new Intent(this.f8576a).setPackage(this.f8577b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f8578c);
    }

    public final String c() {
        return this.f8577b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (AbstractC1317n.a(this.f8576a, l0Var.f8576a) && AbstractC1317n.a(this.f8577b, l0Var.f8577b) && AbstractC1317n.a(this.f8578c, l0Var.f8578c) && this.f8580e == l0Var.f8580e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1317n.b(this.f8576a, this.f8577b, this.f8578c, 4225, Boolean.valueOf(this.f8580e));
    }

    public final String toString() {
        String str = this.f8576a;
        if (str == null) {
            AbstractC1319p.l(this.f8578c);
            return this.f8578c.flattenToString();
        }
        return str;
    }
}
