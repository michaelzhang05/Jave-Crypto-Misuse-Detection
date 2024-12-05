package v5;

import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: v5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3831a extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final ChoiceError f38875a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3831a(ChoiceError error) {
        super(error.getMessage());
        AbstractC3159y.i(error, "error");
        this.f38875a = error;
    }
}
