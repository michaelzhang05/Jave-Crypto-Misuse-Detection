package D5;

import L5.I;
import android.graphics.Bitmap;
import i6.AbstractC2827j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public final class h extends AbstractC3160z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1859a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(1);
        this.f1859a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        AbstractC2827j.b(null, new g((Bitmap) obj, this.f1859a, null), 1, null);
        return I.f6487a;
    }
}
