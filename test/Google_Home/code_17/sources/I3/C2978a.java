package i3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2978a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0766a f32872b = new C0766a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f32873a;

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0766a {
        private C0766a() {
        }

        public final C2978a a(Context context) {
            AbstractC3255y.i(context, "context");
            String packageName = context.getPackageName();
            AbstractC3255y.h(packageName, "getPackageName(...)");
            return new C2978a(packageName);
        }

        public /* synthetic */ C0766a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C2978a(String packageName) {
        AbstractC3255y.i(packageName, "packageName");
        this.f32873a = packageName;
    }

    public final String a() {
        return "stripesdk://payment_return_url/" + this.f32873a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C2978a) && AbstractC3255y.d(this.f32873a, ((C2978a) obj).f32873a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f32873a.hashCode();
    }

    public String toString() {
        return "DefaultReturnUrl(packageName=" + this.f32873a + ")";
    }
}
