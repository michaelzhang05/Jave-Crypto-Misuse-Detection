package Q;

import O.a;
import android.os.Bundle;

/* renamed from: Q.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1406w implements a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C1406w f9086b = a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f9087a;

    /* renamed from: Q.w$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f9088a;

        /* synthetic */ a(AbstractC1408y abstractC1408y) {
        }

        public C1406w a() {
            return new C1406w(this.f9088a, null);
        }
    }

    /* synthetic */ C1406w(String str, AbstractC1409z abstractC1409z) {
        this.f9087a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f9087a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1406w)) {
            return false;
        }
        return AbstractC1398n.a(this.f9087a, ((C1406w) obj).f9087a);
    }

    public final int hashCode() {
        return AbstractC1398n.b(this.f9087a);
    }
}
