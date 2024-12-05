package s0;

import R.AbstractC1305b;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import r0.C3679j;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3711a {

    /* renamed from: a, reason: collision with root package name */
    private static final long f37720a = TimeUnit.MINUTES.toMillis(10);

    /* renamed from: b, reason: collision with root package name */
    static final long f37721b = SystemClock.elapsedRealtime();

    public static Status a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
    }

    public static void b(Status status, Object obj, C3679j c3679j) {
        if (status.L()) {
            c3679j.c(obj);
        } else {
            c3679j.b(AbstractC1305b.a(status));
        }
    }
}
