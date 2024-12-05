package v1;

import android.os.Bundle;
import t1.a;

/* loaded from: classes.dex */
public class u implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final u f9649b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9650a;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f9651a;

        /* synthetic */ a(w wVar) {
        }

        public u a() {
            return new u(this.f9651a, null);
        }
    }

    /* synthetic */ u(String str, x xVar) {
        this.f9650a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f9650a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u) {
            return m.a(this.f9650a, ((u) obj).f9650a);
        }
        return false;
    }

    public final int hashCode() {
        return m.b(this.f9650a);
    }
}
