package Q;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes3.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f9037f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f9038a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9039b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f9040c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9041d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9042e;

    public l0(String str, String str2, int i8, boolean z8) {
        AbstractC1400p.f(str);
        this.f9038a = str;
        AbstractC1400p.f(str2);
        this.f9039b = str2;
        this.f9040c = null;
        this.f9041d = 4225;
        this.f9042e = z8;
    }

    public final ComponentName a() {
        return this.f9040c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f9038a != null) {
            Intent intent = null;
            if (this.f9042e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f9038a);
                try {
                    bundle = context.getContentResolver().call(f9037f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e8) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e8.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f9038a)));
                }
            }
            if (intent == null) {
                return new Intent(this.f9038a).setPackage(this.f9039b);
            }
            return intent;
        }
        return new Intent().setComponent(this.f9040c);
    }

    public final String c() {
        return this.f9039b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        if (AbstractC1398n.a(this.f9038a, l0Var.f9038a) && AbstractC1398n.a(this.f9039b, l0Var.f9039b) && AbstractC1398n.a(this.f9040c, l0Var.f9040c) && this.f9042e == l0Var.f9042e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1398n.b(this.f9038a, this.f9039b, this.f9040c, 4225, Boolean.valueOf(this.f9042e));
    }

    public final String toString() {
        String str = this.f9038a;
        if (str == null) {
            AbstractC1400p.l(this.f9040c);
            return this.f9040c.flattenToString();
        }
        return str;
    }
}
