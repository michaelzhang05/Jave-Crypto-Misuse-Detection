package C5;

import com.inmobi.cmp.model.ChoiceError;
import g6.AbstractC2725a;
import kotlin.jvm.internal.AbstractC3159y;
import v5.C3832b;
import v5.EnumC3833c;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0025a f1289a = new C0025a();

    /* renamed from: C5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0025a {
        public final long a(String value, int i8) {
            long parseLong;
            AbstractC3159y.i(value, "value");
            if (i8 == value.length()) {
                AbstractC3159y.i(value, "value");
                if (i8 != value.length()) {
                    C3832b.b(C3832b.f38876a, ChoiceError.ENCODE_INVALID_BIT_LENGTH, null, null, EnumC3833c.CONSOLE, null, 22);
                    parseLong = -1;
                } else {
                    parseLong = Long.parseLong(value, AbstractC2725a.a(2));
                }
                return parseLong * 100;
            }
            C0025a c0025a = a.f1289a;
            throw new A5.e(AbstractC3159y.q("h.a", ": invalid bit length"));
        }
    }
}
