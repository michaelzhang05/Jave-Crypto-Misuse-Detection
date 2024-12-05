package P;

import R.AbstractC1319p;
import com.google.android.gms.common.api.Status;

/* loaded from: classes3.dex */
public abstract class h {
    public static g a(j jVar, f fVar) {
        AbstractC1319p.m(jVar, "Result must not be null");
        AbstractC1319p.b(!jVar.getStatus().L(), "Status code must not be SUCCESS");
        m mVar = new m(fVar, jVar);
        mVar.f(jVar);
        return mVar;
    }

    public static g b(Status status, f fVar) {
        AbstractC1319p.m(status, "Result must not be null");
        Q.l lVar = new Q.l(fVar);
        lVar.f(status);
        return lVar;
    }
}
