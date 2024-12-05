package t0;

import Q.AbstractC1398n;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;

/* renamed from: t0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4022a {

    /* renamed from: a, reason: collision with root package name */
    private final Object f39534a;

    /* renamed from: b, reason: collision with root package name */
    private final Status f39535b;

    public C4022a(Object obj, Status status) {
        this.f39534a = obj;
        this.f39535b = status;
    }

    public Object a() {
        return this.f39534a;
    }

    public Status b() {
        return this.f39535b;
    }

    public String toString() {
        return AbstractC1398n.c(this).a(NotificationCompat.CATEGORY_STATUS, this.f39535b).a("result", this.f39534a).toString();
    }

    public C4022a(Status status) {
        this(null, status);
    }
}
