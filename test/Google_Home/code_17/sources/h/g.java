package H;

import O.a;
import Q.AbstractC1398n;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class g implements a.d {

    /* renamed from: d, reason: collision with root package name */
    public static final g f3458d = new g(new f());

    /* renamed from: a, reason: collision with root package name */
    private final String f3459a = null;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3460b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3461c;

    public g(f fVar) {
        this.f3460b = fVar.f3456a.booleanValue();
        this.f3461c = fVar.f3457b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ String b(g gVar) {
        String str = gVar.f3459a;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f3460b);
        bundle.putString("log_session_id", this.f3461c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        String str = gVar.f3459a;
        if (AbstractC1398n.a(null, null) && this.f3460b == gVar.f3460b && AbstractC1398n.a(this.f3461c, gVar.f3461c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC1398n.b(null, Boolean.valueOf(this.f3460b), this.f3461c);
    }
}
