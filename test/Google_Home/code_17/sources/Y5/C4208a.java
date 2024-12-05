package y5;

import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: y5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4208a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ChoiceError f41006a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4208a(ChoiceError error) {
        super(error.getMessage());
        AbstractC3255y.i(error, "error");
        this.f41006a = error;
    }
}
