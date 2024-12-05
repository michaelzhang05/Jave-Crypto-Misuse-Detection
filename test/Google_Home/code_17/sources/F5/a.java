package F5;

import com.inmobi.cmp.model.ChoiceError;
import j6.AbstractC3202a;
import kotlin.jvm.internal.AbstractC3255y;
import y5.C4209b;
import y5.EnumC4210c;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0049a f2799a = new C0049a();

    /* renamed from: F5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0049a {
        public final long a(String value, int i8) {
            long parseLong;
            AbstractC3255y.i(value, "value");
            if (i8 == value.length()) {
                AbstractC3255y.i(value, "value");
                if (i8 != value.length()) {
                    C4209b.b(C4209b.f41007a, ChoiceError.ENCODE_INVALID_BIT_LENGTH, null, null, EnumC4210c.CONSOLE, null, 22);
                    parseLong = -1;
                } else {
                    parseLong = Long.parseLong(value, AbstractC3202a.a(2));
                }
                return parseLong * 100;
            }
            C0049a c0049a = a.f2799a;
            throw new D5.e(AbstractC3255y.q("h.a", ": invalid bit length"));
        }
    }
}
