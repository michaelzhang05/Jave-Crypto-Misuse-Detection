package Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: Q.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1398n {

    /* renamed from: Q.n$a */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f9052a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f9053b;

        /* synthetic */ a(Object obj, Z z8) {
            AbstractC1400p.l(obj);
            this.f9053b = obj;
            this.f9052a = new ArrayList();
        }

        public a a(String str, Object obj) {
            AbstractC1400p.l(str);
            this.f9052a.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f9053b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f9052a.size();
            for (int i8 = 0; i8 < size; i8++) {
                sb.append((String) this.f9052a.get(i8));
                if (i8 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
