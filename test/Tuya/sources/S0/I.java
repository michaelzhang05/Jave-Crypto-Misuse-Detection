package s0;

import P.a;
import P.f;
import R.C1307d;
import android.content.Context;
import android.os.Looper;
import j0.C3045v;
import s0.AbstractC3731v;

/* loaded from: classes3.dex */
final class I extends a.AbstractC0166a {
    @Override // P.a.AbstractC0166a
    public final /* bridge */ /* synthetic */ a.f a(Context context, Looper looper, C1307d c1307d, Object obj, f.a aVar, f.b bVar) {
        AbstractC3731v.a aVar2 = (AbstractC3731v.a) obj;
        if (aVar2 == null) {
            aVar2 = new AbstractC3731v.a();
        }
        return new C3045v(context, looper, c1307d, aVar, bVar, aVar2.f37817a, aVar2.f37818b, aVar2.f37820d);
    }
}
