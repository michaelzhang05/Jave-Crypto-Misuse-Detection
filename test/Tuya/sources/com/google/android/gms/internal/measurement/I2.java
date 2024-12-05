package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class I2 implements F2 {

    /* renamed from: c, reason: collision with root package name */
    private static I2 f15348c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15349a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f15350b;

    private I2() {
        this.f15349a = null;
        this.f15350b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static I2 b(Context context) {
        I2 i22;
        I2 i23;
        synchronized (I2.class) {
            try {
                if (f15348c == null) {
                    if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        i23 = new I2(context);
                    } else {
                        i23 = new I2();
                    }
                    f15348c = i23;
                }
                i22 = f15348c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i22;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void e() {
        Context context;
        synchronized (I2.class) {
            try {
                I2 i22 = f15348c;
                if (i22 != null && (context = i22.f15349a) != null && i22.f15350b != null) {
                    context.getContentResolver().unregisterContentObserver(f15348c.f15350b);
                }
                f15348c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.F2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String a(final String str) {
        Context context = this.f15349a;
        if (context != null && !AbstractC2134x2.a(context)) {
            try {
                return (String) D2.a(new E2() { // from class: com.google.android.gms.internal.measurement.G2
                    @Override // com.google.android.gms.internal.measurement.E2
                    public final Object a() {
                        return I2.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e8) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e8);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String d(String str) {
        return AbstractC2118v2.a(this.f15349a.getContentResolver(), str, null);
    }

    private I2(Context context) {
        this.f15349a = context;
        H2 h22 = new H2(this, null);
        this.f15350b = h22;
        context.getContentResolver().registerContentObserver(AbstractC2118v2.f15921a, true, h22);
    }
}
