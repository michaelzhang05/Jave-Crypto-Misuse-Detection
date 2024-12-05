package X5;

import e6.AbstractC2806c;
import f6.C2844a;

/* loaded from: classes5.dex */
public class a extends W5.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0257a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0257a f13422a = new C0257a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f13423b;

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
                f13423b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f13423b = num2;
        }

        private C0257a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0257a.f13423b;
        if (num != null && num.intValue() < i8) {
            return false;
        }
        return true;
    }

    @Override // V5.a
    public AbstractC2806c b() {
        if (c(34)) {
            return new C2844a();
        }
        return super.b();
    }
}
