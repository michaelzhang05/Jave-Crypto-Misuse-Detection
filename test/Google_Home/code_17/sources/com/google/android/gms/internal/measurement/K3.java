package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.PermissionChecker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class K3 implements F3 {

    /* renamed from: c, reason: collision with root package name */
    private static K3 f16174c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f16175a;

    /* renamed from: b, reason: collision with root package name */
    private final ContentObserver f16176b;

    private K3() {
        this.f16175a = null;
        this.f16176b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static K3 a(Context context) {
        K3 k32;
        K3 k33;
        synchronized (K3.class) {
            try {
                if (f16174c == null) {
                    if (PermissionChecker.checkSelfPermission(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        k33 = new K3(context);
                    } else {
                        k33 = new K3();
                    }
                    f16174c = k33;
                }
                k32 = f16174c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k32;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b() {
        Context context;
        synchronized (K3.class) {
            try {
                K3 k32 = f16174c;
                if (k32 != null && (context = k32.f16175a) != null && k32.f16176b != null) {
                    context.getContentResolver().unregisterContentObserver(f16174c.f16176b);
                }
                f16174c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.measurement.F3
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String c(final String str) {
        Context context = this.f16175a;
        if (context != null && !B3.b(context)) {
            try {
                return (String) I3.a(new H3() { // from class: com.google.android.gms.internal.measurement.J3
                    @Override // com.google.android.gms.internal.measurement.H3
                    public final Object w() {
                        return K3.this.d(str);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e8) {
                Log.e("GservicesLoader", "Unable to read GServices for: " + str, e8);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String d(String str) {
        return AbstractC2187m3.a(this.f16175a.getContentResolver(), str, null);
    }

    private K3(Context context) {
        this.f16175a = context;
        M3 m32 = new M3(this, null);
        this.f16176b = m32;
        context.getContentResolver().registerContentObserver(AbstractC2214p3.f16763a, true, m32);
    }
}
