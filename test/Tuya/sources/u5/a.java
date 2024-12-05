package U5;

import b6.AbstractC1885c;
import c6.C1934a;

/* loaded from: classes5.dex */
public class a extends T5.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0231a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0231a f11752a = new C0231a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f11753b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                f11753b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f11753b = num2;
        }

        private C0231a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0231a.f11753b;
        if (num != null && num.intValue() < i8) {
            return false;
        }
        return true;
    }

    @Override // S5.a
    public AbstractC1885c b() {
        if (c(34)) {
            return new C1934a();
        }
        return super.b();
    }
}
