package L6;

import I6.s;
import I6.u;
import I6.x;
import I6.z;
import androidx.browser.trusted.sharing.ShareTarget;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final u f6278a;

    public a(u uVar) {
        this.f6278a = uVar;
    }

    @Override // I6.s
    public z a(s.a aVar) {
        M6.g gVar = (M6.g) aVar;
        x request = gVar.request();
        g g8 = gVar.g();
        return gVar.f(request, g8, g8.h(this.f6278a, aVar, !request.g().equals(ShareTarget.METHOD_GET)), g8.c());
    }
}
