package h3;

import android.content.Context;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: h3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2901c implements InterfaceC2905g {

    /* renamed from: a, reason: collision with root package name */
    private final C2906h f32152a;

    public C2901c(C2906h fraudDetectionDataRequestParamsFactory) {
        AbstractC3255y.i(fraudDetectionDataRequestParamsFactory, "fraudDetectionDataRequestParamsFactory");
        this.f32152a = fraudDetectionDataRequestParamsFactory;
    }

    @Override // h3.InterfaceC2905g
    public C2904f a(C2902d c2902d) {
        String str;
        Map b8 = this.f32152a.b(c2902d);
        if (c2902d != null) {
            str = c2902d.a();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        return new C2904f(b8, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2901c(Context context) {
        this(new C2906h(context));
        AbstractC3255y.i(context, "context");
    }
}
