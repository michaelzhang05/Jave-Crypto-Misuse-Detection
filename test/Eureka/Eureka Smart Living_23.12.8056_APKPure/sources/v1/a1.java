package v1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f9501f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f9502a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9503b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f9504c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9505d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9506e;

    public a1(String str, String str2, int i6, boolean z5) {
        n.d(str);
        this.f9502a = str;
        n.d(str2);
        this.f9503b = str2;
        this.f9504c = null;
        this.f9505d = i6;
        this.f9506e = z5;
    }

    public final int a() {
        return this.f9505d;
    }

    public final ComponentName b() {
        return this.f9504c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f9502a == null) {
            return new Intent().setComponent(this.f9504c);
        }
        if (this.f9506e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f9502a);
            try {
                bundle = context.getContentResolver().call(f9501f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e6) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e6.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f9502a)));
            }
        }
        return r2 != null ? r2 : new Intent(this.f9502a).setPackage(this.f9503b);
    }

    public final String d() {
        return this.f9503b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj;
        return m.a(this.f9502a, a1Var.f9502a) && m.a(this.f9503b, a1Var.f9503b) && m.a(this.f9504c, a1Var.f9504c) && this.f9505d == a1Var.f9505d && this.f9506e == a1Var.f9506e;
    }

    public final int hashCode() {
        return m.b(this.f9502a, this.f9503b, this.f9504c, Integer.valueOf(this.f9505d), Boolean.valueOf(this.f9506e));
    }

    public final String toString() {
        String str = this.f9502a;
        if (str != null) {
            return str;
        }
        n.h(this.f9504c);
        return this.f9504c.flattenToString();
    }
}
