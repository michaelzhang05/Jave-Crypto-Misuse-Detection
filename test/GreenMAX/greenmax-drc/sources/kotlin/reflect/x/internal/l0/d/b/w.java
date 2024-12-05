package kotlin.reflect.x.internal.l0.d.b;

import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;

/* compiled from: PackagePartProvider.kt */
/* loaded from: classes2.dex */
public interface w {

    /* compiled from: PackagePartProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a implements w {
        public static final a a = new a();

        private a() {
        }

        @Override // kotlin.reflect.x.internal.l0.d.b.w
        public List<String> a(String str) {
            List<String> i2;
            l.f(str, "packageFqName");
            i2 = t.i();
            return i2;
        }
    }

    List<String> a(String str);
}
