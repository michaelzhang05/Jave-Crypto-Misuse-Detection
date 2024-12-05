package v1;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public abstract class b {
    public static t1.b a(Status status) {
        return status.d() ? new t1.f(status) : new t1.b(status);
    }
}
