package C5;

import com.inmobi.cmp.core.model.Vector;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f1292a = new a();

    /* loaded from: classes5.dex */
    public static final class a {
        public final Vector a(String value, int i8) {
            AbstractC3159y.i(value, "value");
            if (value.length() == i8) {
                Vector vector = new Vector(null, 1, null);
                if (1 <= i8) {
                    int i9 = 1;
                    while (true) {
                        int i10 = i9 + 1;
                        String value2 = String.valueOf(value.charAt(i9 - 1));
                        AbstractC3159y.i(value2, "value");
                        if (AbstractC3159y.d(value2, "1")) {
                            vector.set(i9);
                        }
                        if (i9 == i8) {
                            break;
                        }
                        i9 = i10;
                    }
                }
                vector.setBitLength(value.length());
                return vector;
            }
            a aVar = c.f1292a;
            throw new A5.e(AbstractC3159y.q("h.c", ": bitfield encoding length mismatch"));
        }
    }
}
