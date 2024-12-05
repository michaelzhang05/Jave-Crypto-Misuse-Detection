package com.google.firebase.analytics;

import Q.AbstractC1400p;
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
import com.google.android.gms.internal.measurement.C2077b1;
import com.google.firebase.installations.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import l0.InterfaceC3290y;
import q0.AbstractC3828l;

/* loaded from: classes.dex */
public final class FirebaseAnalytics {

    /* renamed from: b, reason: collision with root package name */
    private static volatile FirebaseAnalytics f18216b;

    /* renamed from: a, reason: collision with root package name */
    private final C2077b1 f18217a;

    private FirebaseAnalytics(C2077b1 c2077b1) {
        AbstractC1400p.l(c2077b1);
        this.f18217a = c2077b1;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (f18216b == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (f18216b == null) {
                        f18216b = new FirebaseAnalytics(C2077b1.e(context));
                    }
                } finally {
                }
            }
        }
        return f18216b;
    }

    @Nullable
    @Keep
    public static InterfaceC3290y getScionFrontendApiImplementation(Context context, @Nullable Bundle bundle) {
        C2077b1 f8 = C2077b1.f(context, null, null, null, bundle);
        if (f8 == null) {
            return null;
        }
        return new a(f8);
    }

    public final void a(String str, Bundle bundle) {
        this.f18217a.q(str, bundle);
    }

    @NonNull
    @Keep
    public final String getFirebaseInstanceId() {
        try {
            return (String) AbstractC3828l.b(c.p().getId(), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, TimeUnit.MILLISECONDS);
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
    public final void setCurrentScreen(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f18217a.j(activity, str, str2);
    }
}
