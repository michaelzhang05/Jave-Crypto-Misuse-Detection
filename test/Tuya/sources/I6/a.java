package I6;

import F6.s;
import F6.u;
import F6.x;
import F6.z;
import androidx.browser.trusted.sharing.ShareTarget;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final u f4283a;

    public a(u uVar) {
        this.f4283a = uVar;
    }

    @Override // F6.s
    public z a(s.a aVar) {
        J6.g gVar = (J6.g) aVar;
        x request = gVar.request();
        g g8 = gVar.g();
        return gVar.f(request, g8, g8.h(this.f4283a, aVar, !request.g().equals(ShareTarget.METHOD_GET)), g8.c());
    }
}
