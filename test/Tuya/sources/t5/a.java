package T5;

import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public abstract class a extends S5.a {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0221a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0221a f11045a = new C0221a();

        /* renamed from: b, reason: collision with root package name */
        public static final Integer f11046b;

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
                f11046b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            f11046b = num2;
        }

        private C0221a() {
        }
    }

    private final boolean c(int i8) {
        Integer num = C0221a.f11046b;
        if (num != null && num.intValue() < i8) {
            return false;
        }
        return true;
    }

    @Override // S5.a
    public void a(Throwable cause, Throwable exception) {
        AbstractC3159y.i(cause, "cause");
        AbstractC3159y.i(exception, "exception");
        if (c(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
