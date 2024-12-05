package F5;

import F5.d;
import g6.m;
import j6.n;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2804a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final String a(String value, int i8) {
            AbstractC3255y.i(value, "value");
            if (i8 == value.length()) {
                int length = value.length() / 2;
                d.a aVar = d.f2803a;
                int a8 = aVar.a(n.T0(value, m.s(0, length)), length) + 65;
                int a9 = aVar.a(n.T0(value, m.s(length, value.length())), length) + 65;
                StringBuilder sb = new StringBuilder();
                sb.append((char) a8);
                sb.append((char) a9);
                return sb.toString();
            }
            a aVar2 = e.f2804a;
            throw new D5.e(AbstractC3255y.q("h.e", ": invalid bit length for language"));
        }
    }
}
