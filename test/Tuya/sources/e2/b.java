package E2;

import com.stripe.android.customersheet.c;
import h4.InterfaceC2754a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
final class b implements InterfaceC2754a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f1970a;

    public b(Function1 viewActionHandler) {
        AbstractC3159y.i(viewActionHandler, "viewActionHandler");
        this.f1970a = viewActionHandler;
    }

    @Override // h4.InterfaceC2754a
    public void a() {
        this.f1970a.invoke(c.e.f23559a);
    }
}
