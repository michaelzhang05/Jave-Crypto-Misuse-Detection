package com.flurry.sdk;

import com.flurry.sdk.n2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class z4 implements f7<e> {
    @Override // com.flurry.sdk.f7
    public final /* synthetic */ void a(e eVar) {
        e eVar2 = eVar;
        if (eVar2 == null) {
            d1.c(2, "SessionInfoFrame", "Session info data is null, do not send the frame.");
        } else {
            n0.a();
            int i2 = n2.a.AGENT_REPORT_TYPE_MAIN_DEVICE.f10058j;
            n nVar = eVar2.f9826d;
            if (nVar != null && nVar.a) {
                i2 = n2.a.AGENT_REPORT_TYPE_INSTANT_APP.f10058j;
            }
            m2.a().b(new m6(new n6(eVar2.a, i2, eVar2.f9824b, eVar2.f9825c)));
        }
        d1.c(4, "SessionInfoObserver", "SessionInfoData".concat(String.valueOf(eVar2)));
    }
}
