package v1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class m {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f9622a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f9623b;

        /* synthetic */ a(Object obj, o0 o0Var) {
            n.h(obj);
            this.f9623b = obj;
            this.f9622a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List list = this.f9622a;
            n.h(str);
            list.add(str + "=" + String.valueOf(obj));
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f9623b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f9622a.size();
            for (int i6 = 0; i6 < size; i6++) {
                sb.append((String) this.f9622a.get(i6));
                if (i6 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
