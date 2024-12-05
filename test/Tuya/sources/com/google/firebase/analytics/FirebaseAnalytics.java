package com.google.firebase.analytics;

import R.AbstractC1319p;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.work.WorkRequest;
import com.google.android.gms.internal.measurement.X0;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import m0.v;
import r0.l;

/* loaded from: classes3.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f17179b;

    /* renamed from: a, reason: collision with root package name */
    private final X0 f17180a;

    public FirebaseAnalytics(X0 x02) {
        AbstractC1319p.l(x02);
        this.f17180a = x02;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f17179b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f17179b == null) {
                        f17179b = new FirebaseAnalytics(X0.r(context, null, null, null, null));
                    }
                } finally {
                }
            }
        }
        return f17179b;
    }

    @Nullable
    @Keep
    public static v getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        X0 r8 = X0.r(context, null, null, null, bundle);
        if (r8 == null) {
            return null;
        }
        return new a(r8);
    }

    public void a(String str, Bundle bundle) {
        this.f17180a.F(str, bundle);
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            return (String) l.b(c.p().getId(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e8) {
            throw new IllegalStateException(e8);
        } catch (ExecutionException e9) {
            throw new IllegalStateException(e9.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @MainThread
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f17180a.d(activity, str, str2);
    }
}
