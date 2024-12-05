package b3;

import android.os.Parcelable;
import b3.C1864I;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: b3.J, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1865J implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final C1864I.c f14368a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f14369b;

    public AbstractC1865J(C1864I.c tokenType, Set attribution) {
        AbstractC3159y.i(tokenType, "tokenType");
        AbstractC3159y.i(attribution, "attribution");
        this.f14368a = tokenType;
        this.f14369b = attribution;
    }

    public final Set b() {
        return this.f14369b;
    }
}
