package r0;

import Q.AbstractC1386b;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import q0.C3826j;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3893a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f38455a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b, reason: collision with root package name */
    static final long f38456b = SystemClock.elapsedRealtime();

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Status status, Object obj, C3826j c3826j) {
        if (status.H()) {
            c3826j.c(obj);
        } else {
            c3826j.b(AbstractC1386b.a(status));
        }
    }
}
