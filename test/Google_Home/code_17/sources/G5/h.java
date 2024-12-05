package G5;

import O5.I;
import android.graphics.Bitmap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3362j;

/* loaded from: classes5.dex */
public final class h extends AbstractC3256z implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3401a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar) {
        super(1);
        this.f3401a = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        AbstractC3362j.b(null, new g((Bitmap) obj, this.f3401a, null), 1, null);
        return I.f8278a;
    }
}
