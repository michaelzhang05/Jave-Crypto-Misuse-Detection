package u0;

import R.AbstractC1317n;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;

/* renamed from: u0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3799a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38485a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f38486b;

    public C3799a(Object obj, Status status) {
        this.f38485a = obj;
        this.f38486b = status;
    }

    public Object a() {
        return this.f38485a;
    }

    public Status b() {
        return this.f38486b;
    }

    public String toString() {
        return AbstractC1317n.c(this).a(NotificationCompat.CATEGORY_STATUS, this.f38486b).a("result", this.f38485a).toString();
    }

    public C3799a(Status status) {
        this(null, status);
    }
}
