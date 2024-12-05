package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzp;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public final class GoogleServices {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static GoogleServices f10598b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10599c;

    /* renamed from: d, reason: collision with root package name */
    private final Status f10600d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10601e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10602f;

    @VisibleForTesting
    @KeepForSdk
    GoogleServices(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", "integer", resources.getResourcePackageName(R.string.a));
        boolean z = true;
        if (identifier != 0) {
            boolean z2 = resources.getInteger(identifier) != 0;
            this.f10602f = !z2;
            z = z2;
        } else {
            this.f10602f = false;
        }
        this.f10601e = z;
        String a2 = zzp.a(context);
        a2 = a2 == null ? new StringResourceValueReader(context).a("google_app_id") : a2;
        if (TextUtils.isEmpty(a2)) {
            this.f10600d = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.f10599c = null;
        } else {
            this.f10599c = a2;
            this.f10600d = Status.f10556f;
        }
    }

    @KeepForSdk
    private static GoogleServices a(String str) {
        GoogleServices googleServices;
        synchronized (a) {
            googleServices = f10598b;
            if (googleServices == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                sb.append("Initialize must be called before ");
                sb.append(str);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
        return googleServices;
    }

    @KeepForSdk
    public static String b() {
        return a("getGoogleAppId").f10599c;
    }

    @KeepForSdk
    public static Status c(Context context) {
        Status status;
        Preconditions.k(context, "Context must not be null.");
        synchronized (a) {
            if (f10598b == null) {
                f10598b = new GoogleServices(context);
            }
            status = f10598b.f10600d;
        }
        return status;
    }
}
