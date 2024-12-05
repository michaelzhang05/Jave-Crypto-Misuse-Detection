package H3;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final List f3498a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3499b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f3500a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f3501b;

        public a(String paymentMethodId, Throwable exception) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            AbstractC3159y.i(exception, "exception");
            this.f3500a = paymentMethodId;
            this.f3501b = exception;
        }

        public final Throwable a() {
            return this.f3501b;
        }

        public final String b() {
            return this.f3500a;
        }
    }

    public d(List failures) {
        AbstractC3159y.i(failures, "failures");
        this.f3498a = failures;
        List<a> list = failures;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        for (a aVar : list) {
            String b8 = aVar.b();
            String message = aVar.a().getMessage();
            if (message == null) {
                message = "Unknown reason";
            }
            arrayList.add("\n - (paymentMethodId: " + b8 + ", reason: " + message + ")");
        }
        this.f3499b = "Failed to detach the following duplicates:" + arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f3499b;
    }
}
