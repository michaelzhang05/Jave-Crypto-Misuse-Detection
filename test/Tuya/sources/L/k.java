package L;

import P.a;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class k extends n {
    /* JADX INFO: Access modifiers changed from: package-private */
    public k(P.f fVar) {
        super(fVar);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC1938b
    protected final /* bridge */ /* synthetic */ void k(a.b bVar) {
        i iVar = (i) bVar;
        ((u) iVar.D()).m0(new j(this), iVar.m0());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ P.j c(Status status) {
        return status;
    }
}
