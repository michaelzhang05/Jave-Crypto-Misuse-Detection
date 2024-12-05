package F0;

import B0.a;
import G0.h;
import android.os.Bundle;
import java.util.Locale;

/* loaded from: classes3.dex */
class e implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private H0.b f2681a;

    /* renamed from: b, reason: collision with root package name */
    private H0.b f2682b;

    private static void b(H0.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.j(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        H0.b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f2681a;
        } else {
            bVar = this.f2682b;
        }
        b(bVar, str, bundle);
    }

    @Override // B0.a.b
    public void a(int i8, Bundle bundle) {
        String string;
        h.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i8), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(H0.b bVar) {
        this.f2682b = bVar;
    }

    public void e(H0.b bVar) {
        this.f2681a = bVar;
    }
}
