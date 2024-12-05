package H2;

import com.stripe.android.customersheet.c;
import k4.InterfaceC3221a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
final class b implements InterfaceC3221a {

    /* renamed from: a, reason: collision with root package name */
    private final Function1 f3520a;

    public b(Function1 viewActionHandler) {
        AbstractC3255y.i(viewActionHandler, "viewActionHandler");
        this.f3520a = viewActionHandler;
    }

    @Override // k4.InterfaceC3221a
    public void a() {
        this.f3520a.invoke(c.e.f24614a);
    }
}
