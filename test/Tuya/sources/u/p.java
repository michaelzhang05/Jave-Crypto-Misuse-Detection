package u;

import android.util.Base64;
import s.EnumC3702d;
import u.d;

/* loaded from: classes3.dex */
public abstract class p {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC3702d enumC3702d);
    }

    public static a a() {
        return new d.b().d(EnumC3702d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC3702d d();

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public p f(EnumC3702d enumC3702d) {
        return a().b(b()).d(enumC3702d).c(c()).a();
    }

    public final String toString() {
        String encodeToString;
        String b8 = b();
        EnumC3702d d8 = d();
        if (c() == null) {
            encodeToString = "";
        } else {
            encodeToString = Base64.encodeToString(c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", b8, d8, encodeToString);
    }
}
