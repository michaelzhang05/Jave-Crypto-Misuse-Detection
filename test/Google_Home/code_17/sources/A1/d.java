package A1;

import E1.f;
import E1.h;
import H1.g;
import android.content.Context;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private boolean f100a;

    private void c(Context context) {
        g.d(context, "Application Context cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Context context) {
        c(context);
        if (!d()) {
            b(true);
            h.d().b(context);
            E1.b.k().b(context);
            H1.a.b(context);
            H1.c.d(context);
            H1.e.c(context);
            f.c().b(context);
            E1.a.a().b(context);
        }
    }

    void b(boolean z8) {
        this.f100a = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.f100a;
    }
}
