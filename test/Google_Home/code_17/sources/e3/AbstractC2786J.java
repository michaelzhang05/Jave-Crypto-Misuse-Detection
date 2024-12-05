package e3;

import android.os.Parcelable;
import e3.C2785I;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: e3.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2786J implements InterfaceC2784H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C2785I.c f31374a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f31375b;

    public AbstractC2786J(C2785I.c tokenType, Set attribution) {
        AbstractC3255y.i(tokenType, "tokenType");
        AbstractC3255y.i(attribution, "attribution");
        this.f31374a = tokenType;
        this.f31375b = attribution;
    }

    public final Set a() {
        return this.f31375b;
    }
}
