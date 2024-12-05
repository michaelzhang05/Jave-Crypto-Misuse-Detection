package t1;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: a, reason: collision with root package name */
    protected final Status f9281a;

    public b(Status status) {
        super(status.b() + ": " + (status.c() != null ? status.c() : ""));
        this.f9281a = status;
    }

    public Status a() {
        return this.f9281a;
    }
}
