package f3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2660a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0740a f31009b = new C0740a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f31010a;

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0740a {
        private C0740a() {
        }

        public final C2660a a(Context context) {
            AbstractC3159y.i(context, "context");
            String packageName = context.getPackageName();
            AbstractC3159y.h(packageName, "getPackageName(...)");
            return new C2660a(packageName);
        }

        public /* synthetic */ C0740a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C2660a(String packageName) {
        AbstractC3159y.i(packageName, "packageName");
        this.f31010a = packageName;
    }

    public final String a() {
        return "stripesdk://payment_return_url/" + this.f31010a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2660a) && AbstractC3159y.d(this.f31010a, ((C2660a) obj).f31010a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31010a.hashCode();
    }

    public String toString() {
        return "DefaultReturnUrl(packageName=" + this.f31010a + ")";
    }
}
