package d1;

import android.util.Base64;
import d1.d;

/* loaded from: classes.dex */
public abstract class o {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(b1.d dVar);
    }

    public static a a() {
        return new d.b().d(b1.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract b1.d d();

    public boolean e() {
        return c() != null;
    }

    public o f(b1.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = b();
        objArr[1] = d();
        objArr[2] = c() == null ? "" : Base64.encodeToString(c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
