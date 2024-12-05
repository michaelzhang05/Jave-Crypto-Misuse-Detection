package W5;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public abstract class a extends V5.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0246a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0246a f12702a = new C0246a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f12703b;

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
                f12703b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f12703b = num2;
        }

        private C0246a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0246a.f12703b;
        if (num != null && num.intValue() < i8) {
            return false;
        }
        return true;
    }

    @Override // V5.a
    public void a(Throwable cause, Throwable exception) {
        AbstractC3255y.i(cause, "cause");
        AbstractC3255y.i(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
