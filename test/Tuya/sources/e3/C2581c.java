package e3;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: e3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2581c implements InterfaceC2585g {

    /* renamed from: a, reason: collision with root package name */
    private final C2586h f30231a;

    public C2581c(C2586h fraudDetectionDataRequestParamsFactory) {
        AbstractC3159y.i(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.f30231a = fraudDetectionDataRequestParamsFactory;
    }

    @Override // e3.InterfaceC2585g
    public C2584f a(C2582d c2582d) {
        String str;
        Map b8 = this.f30231a.b(c2582d);
        if (c2582d != null) {
            str = c2582d.b();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new C2584f(b8, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2581c(Context context) {
        this(new C2586h(context));
        AbstractC3159y.i(context, "context");
    }
}
