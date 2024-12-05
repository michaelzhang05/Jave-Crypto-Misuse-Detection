package K3;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final List f5101a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5102b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f5103a;

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f5104b;

        public a(String paymentMethodId, Throwable exception) {
            AbstractC3255y.i(paymentMethodId, "paymentMethodId");
            AbstractC3255y.i(exception, "exception");
            this.f5103a = paymentMethodId;
            this.f5104b = exception;
        }

        public final Throwable a() {
            return this.f5104b;
        }

        public final String b() {
            return this.f5103a;
        }
    }

    public d(List failures) {
        AbstractC3255y.i(failures, "failures");
        this.f5101a = failures;
        List<a> list = failures;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        for (a aVar : list) {
            String b8 = aVar.b();
            String message = aVar.a().getMessage();
            if (message == null) {
                message = "Unknown reason";
            }
            arrayList.add("\n - (paymentMethodId: " + b8 + ", reason: " + message + ")");
        }
        this.f5102b = "Failed to detach the following duplicates:" + arrayList;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f5102b;
    }
}
