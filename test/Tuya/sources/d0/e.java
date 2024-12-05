package D0;

import android.os.Bundle;
import java.util.Locale;
import z0.InterfaceC4011a;

/* loaded from: classes3.dex */
class e implements InterfaceC4011a.b {

    /* renamed from: a, reason: collision with root package name */
    private F0.b f1374a;

    /* renamed from: b, reason: collision with root package name */
    private F0.b f1375b;

    private static void b(F0.b bVar, String str, Bundle bundle) {
        if (bVar == null) {
            return;
        }
        bVar.k(str, bundle);
    }

    private void c(String str, Bundle bundle) {
        F0.b bVar;
        if ("clx".equals(bundle.getString("_o"))) {
            bVar = this.f1374a;
        } else {
            bVar = this.f1375b;
        }
        b(bVar, str, bundle);
    }

    @Override // z0.InterfaceC4011a.b
    public void a(int i8, Bundle bundle) {
        String string;
        E0.f.f().i(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i8), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            c(string, bundle2);
        }
    }

    public void d(F0.b bVar) {
        this.f1375b = bVar;
    }

    public void e(F0.b bVar) {
        this.f1374a = bVar;
    }
}
