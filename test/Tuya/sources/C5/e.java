package C5;

import C5.d;
import d6.m;
import g6.n;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1294a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final String a(String value, int i8) {
            AbstractC3159y.i(value, "value");
            if (i8 == value.length()) {
                int length = value.length() / 2;
                d.a aVar = d.f1293a;
                int a8 = aVar.a(n.T0(value, m.s(0, length)), length) + 65;
                int a9 = aVar.a(n.T0(value, m.s(length, value.length())), length) + 65;
                StringBuilder sb = new StringBuilder();
                sb.append((char) a8);
                sb.append((char) a9);
                return sb.toString();
            }
            a aVar2 = e.f1294a;
            throw new A5.e(AbstractC3159y.q("h.e", ": invalid bit length for language"));
        }
    }
}
