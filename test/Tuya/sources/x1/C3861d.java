package x1;

import B1.f;
import B1.h;
import E1.g;
import android.content.Context;

/* renamed from: x1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3861d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f39105a;

    private void c(Context context) {
        g.b(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        c(context);
        if (!d()) {
            b(true);
            h.d().b(context);
            B1.b.k().b(context);
            E1.a.b(context);
            E1.c.d(context);
            E1.e.c(context);
            f.c().b(context);
            B1.a.a().b(context);
        }
    }

    void b(boolean z8) {
        this.f39105a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f39105a;
    }
}
